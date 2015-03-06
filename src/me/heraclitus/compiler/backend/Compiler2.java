package me.heraclitus.compiler.backend;

import me.heraclitus.compiler.Utils;
import me.heraclitus.compiler.grammer.MainBaseVisitor;
import me.heraclitus.compiler.grammer.MainLexer;
import me.heraclitus.compiler.grammer.MainParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;
import java.util.HashMap;

public class Compiler2 extends MainBaseVisitor<String> {

    /*
    This function calls `visit` on its children.
    Eventually the `visit` call bubbles down to a token that can be translated to a String.
    Then it returns that String which bubbles back up to larger tokens, which know how to assemble Strings
     */
    @Override public String visitSource(MainParser.SourceContext ctx) {
        StringBuilder program = new StringBuilder("v2.0 raw\n");

        for (ParseTree child : ctx.children) {
            String currentByte = visit(child);
            if (! currentByte.isEmpty()) { // empty string doesn't effect program output
                if (currentByte.matches("^[01]{8}$")) {
                    int value = Integer.parseInt(currentByte, 2);
                    program.append(toBase(value, 16, 2) + " ");
                    bytes++; // running count of bytes is important for visitAssignLabel
                } else {
                    throw new ParseCancellationException(new InternalError(String.format("Invalid byte produced: %s", currentByte)));
                }
            }
        }
        return program.toString();
    }

    @Override public String visitSetLabel(MainParser.SetLabelContext ctx) {
        String labelName = ctx.label().word().getText();
        labels.put(labelName, toBase(bytes, 2, 5));
        return ""; // empty string doesn't effect program output
    }

    @Override public String visitSetPointer(MainParser.SetPointerContext ctx) {
        String pointerName = ctx.pointer().word().getText();
        String pointerAddr = visit(ctx.literal4());
        pointers.put(pointerName, pointerAddr);
        return ""; // empty string doesn't effect program output
    }

    @Override public String visitCommand8Execute(MainParser.Command8ExecuteContext ctx) {
        return visit(ctx.command8Name());
    }

    @Override public String visitCommand8Name(MainParser.Command8NameContext ctx) {
        return ctx.code;
    }

    @Override public String visitCommand4Execute(MainParser.Command4ExecuteContext ctx) {
        return visit(ctx.address4()) + visit(ctx.command4Name());
    }

    @Override public String visitCommand4Name(MainParser.Command4NameContext ctx) {
        return ctx.code;
    }

    @Override public String visitCommand3Execute(MainParser.Command3ExecuteContext ctx) {
        return visit(ctx.address5()) + visit(ctx.command3Name());
    }

    @Override public String visitCommand3Name(MainParser.Command3NameContext ctx) {
        return ctx.code;
    }

    @Override public String visitGetPointer(MainParser.GetPointerContext ctx) {
        String pointerName = ctx.pointer().word().getText();
        if (pointers.containsKey(pointerName)) {
            String pointerValue = pointers.get(pointerName);
            return pointerValue;
        } else {
            throw new ParseCancellationException(new PostProcessError(
                    String.format("Pointer \"%s\" is undefined", pointerName),
                    "Pointer lookup",
                    ctx));
        }
    }

    @Override public String visitGetLabel(MainParser.GetLabelContext ctx) {
        String labelName = ctx.label().word().getText();
        if (labels.containsKey(labelName)) {
            String labelValue = labels.get(labelName);
            return labelValue;
        } else {
            throw new ParseCancellationException(new PostProcessError(
                    String.format("Label \"%s\" is undefined", labelName),
                    "Label lookup",
                    ctx));
        }
    }

    @Override public String visitLiteral8(MainParser.Literal8Context ctx) {
        return interpretLiteral(ctx.literal(), 8);
    }

    @Override public String visitLiteral4(MainParser.Literal4Context ctx) {
        return interpretLiteral(ctx.literal(), 4);
    }

    @Override public String visitLiteral5(MainParser.Literal5Context ctx) {
        return interpretLiteral(ctx.literal(), 5);
    }

    @Override public String visitEof(MainParser.EofContext ctx) {
        return "";
    }

    private String interpretLiteral(MainParser.LiteralContext ctx, int binaryWidth) {
        int num;
        int base = 0;
        String literal = ctx.getText();
        if (literal.startsWith("0b")) {
            base = 2;
        } else if (literal.startsWith("0x")) {
            base = 16;
        } else if (literal.startsWith("0d")) {
            base = 10;
        } else {
            base = 2;
            literal = "0b" + literal;
        }
        num = Integer.parseInt(literal.substring(2).toUpperCase(), base);

        String output = "";
        try {
            output = toBase(num, 2, binaryWidth);
        } catch (IllegalArgumentException e) {
            throw new ParseCancellationException(new PostProcessError(
                    String.format("The number \"%s\" (base %d) is too big to be a %d-bit binary number", literal, base, binaryWidth),
                    String.format("%d-bit address", binaryWidth),
                    ctx));
        }
        return output;

    }

    public static String toBase(int num, int base, int width) {
        if (num < Math.pow(base, width)) {
            return (String.format(String.format("%%%ds", width), Integer.toString(num, base)).replace(' ', '0'));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String run(String inputString) throws Throwable {
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        MainLexer lexer = new MainLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MainParser parser = new MainParser(tokens);
        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = null;
        String output = "";
        StringBuilder error = new StringBuilder();
        try {
            tree = parser.source();
            output = this.visit(tree);
        } catch (ParseCancellationException pce) {
            Throwable cause = pce.getCause();
            if (cause instanceof RecognitionException) {
                RecognitionException re = (RecognitionException) cause;
                error.append(ErrorMessages.recognitionException(re));
            } else if (cause instanceof PostProcessError) {
                PostProcessError us = (PostProcessError) cause;
                error.append(ErrorMessages.undefinedSymbol(us));
            } else if (cause instanceof InternalError) {
                error.append("Internal error\nContact the maintainer.\nPresent your source code, assembler version, and the following message:\n");
                error.append(cause.getMessage() + "\n");
                // no stack trace necessary, since the location of an error can be found by the message text
            } else {
                error.append( "Unknown error\nContact the maintainer.\nPresent your source code, assembler version, and the following message:\n");
                error.append(Utils.stackTraceString(pce));
                error.append(Utils.stackTraceString(cause));
            }
            Throwable monkeyPoop = new Throwable(error.toString());
            throw monkeyPoop;
        }
        return output;
    }

    public int getBytes() { return bytes; }

    Map<String, String> labels = new HashMap<String, String>();
    Map<String, String> pointers = new HashMap<String, String>();
    int bytes = 0;
    String output = "";
}
