package me.heraclitus.compiler.backend;

import me.heraclitus.compiler.grammer.MainBaseListener;
import me.heraclitus.compiler.grammer.MainBaseVisitor;
import me.heraclitus.compiler.grammer.MainLexer;
import me.heraclitus.compiler.grammer.MainParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by sam on 3/5/15.
 */
public class Compiler2 extends MainBaseVisitor<String> {
    public static void main(String[] args) throws IOException {
        Compiler2 test = new Compiler2();
        test.run("");
    }
    
    public void run(String inputString) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("test.asm");
        //ANTLRInputStream input = new ANTLRInputStream(inputString);
        MainLexer lexer = new MainLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MainParser parser = new MainParser(tokens);
        VerboseListener errors = new VerboseListener();
        ParseTree tree = parser.source();
        output = this.visit(tree);
        errorLog = errors.getErrors();
        System.out.println(output);
        System.out.println(errorLog);
    }

    @Override public String visitSource(MainParser.SourceContext ctx) {
        StringBuilder program = new StringBuilder("v2.0 raw\n");

        for (ParseTree child : ctx.children) {
            String currentByte = visit(child);
            if (! currentByte.isEmpty()) { // empty string doesn't effect program output
                // TODO: check to see if currentByte matches regex "[01]{8}"
                int value = Integer.parseInt(currentByte, 2);
                program.append(toBase(value, 16, 2) + " ");
                bytes++;
            } else {

            }
        }
        return program.toString();
    }

    @Override public String visitAssignLabel(MainParser.AssignLabelContext ctx) {
        String labelName = ctx.labelName.getText().substring(1);
        labels.put(labelName, toBase(bytes, 2, 5));
        return ""; // empty string doesn't effect program output
    }

    @Override public String visitAssignPointer(MainParser.AssignPointerContext ctx) {
        String pointerName = ctx.pointerName.getText().substring(1);
        String pointerAddr = ctx.literal.getText();
        pointers.put(pointerName, pointerAddr);
        return ""; // empty string doesn't effect program output
    }

    @Override public String visitCodebyteLiteral(MainParser.CodebyteLiteralContext ctx) {
        return ctx.literal_byte_8().getText();
    }

    @Override public String visitCodebyteNullary(MainParser.CodebyteNullaryContext ctx) {
        String code = ctx.command.code;
        return code;
    }

    @Override public String visitCodebyteUnary4(MainParser.CodebyteUnary4Context ctx) {
        String code = ctx.command.code;
        String address = visit(ctx.address);
        return address + code;
    }

    @Override public String visitCodebyteUnary3(MainParser.CodebyteUnary3Context ctx) {
        String code = ctx.command.code;
        String address = visit(ctx.address);
        return address + code;
    }

    @Override public String visitAddressLiteral4(MainParser.AddressLiteral4Context ctx) {
        return ctx.getText();
    }

    @Override public String visitAddressPointer(MainParser.AddressPointerContext ctx) {
        String pointerName = ctx.pointerName.getText().substring(1);
        if (pointers.containsKey(pointerName)) {
            String pointerValue = pointers.get(pointerName);
            return pointerValue;
        } else {
            return "";
            // TODO: throw an error
        }
    }

    @Override public String visitAddressLiteral5(MainParser.AddressLiteral5Context ctx) {
        return ctx.getText();
    }

    @Override public String visitAddressLabel(MainParser.AddressLabelContext ctx) {
        String labelName = ctx.labelName.getText().substring(1);
        if (labels.containsKey(labelName)) {
            String labelValue = labels.get(labelName);
            return labelValue;
        } else {
            return "";
            // TODO: throw an error
        }
    }

    @Override public String visitEof(MainParser.EofContext ctx) {
        return "";
    }

    public static String toBase(int num, int base, int width) {
        if (num < Math.pow(base, width)) {
            return (String.format(String.format("%%%ds", width), Integer.toString(num, base)).replace(' ', '0'));
        } else {
            return "";
            // TODO: throw an error
        }
    }

    Map<String, String> labels = new HashMap<String, String>();
    Map<String, String> pointers = new HashMap<String, String>();
    int bytes = 0;
    String output = "";
    String errorLog = "";
}
