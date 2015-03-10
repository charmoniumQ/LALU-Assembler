package me.heraclitus.compiler.backend;

import org.antlr.v4.runtime.*;

import java.util.List;

public class ErrorMessages {
    public static String recognitionException(RecognitionException e) {
        Token offendingToken = e.getOffendingToken();
        String bad = offendingToken.getText();
        Parser parser = (Parser) e.getRecognizer();
        // The following gets the 'hierarchy' of rules with the 0th element being the failed rule
        List<String> stack = parser.getRuleInvocationStack(e.getCtx());
        String brokenRule = stack.size() > 0 ? stack.get(0): "Unknown";
        String message = "Unknown";

        if (brokenRule.equals("source") || brokenRule.equals("codebyte") || brokenRule.equals("eof")) {
            message = String.format("Unable to interpret \"%s\" as a command", bad);
        } else if (brokenRule.equals("literal")) {
            message = String.format("Invalid literal \"%s\". Must be binary, decimal, or hexidecimal", bad);
        } else {
            // unknown parser error
            String next = e.getExpectedTokens().toString(e.getRecognizer().getVocabulary());
            message = String.format("No error message for this yet\nContact the maintainer and present your source code, assembler version, and the following message:");
        }

        String errorLine = ((CommonTokenStream) e.getRecognizer().getInputStream())
                .getTokenSource().getInputStream().toString().split("\n")[offendingToken.getLine() - 1];

        return prettyFormat(message, brokenRule, offendingToken, errorLine);
    }

    public static String undefinedSymbol(PostProcessError e) {
        ParserRuleContext ctx = e.getCtx();
        Token offendingToken = ctx.getStart();
        String message = e.getMessage();
        String brokenRule = String.format(e.getRule());

        // In this case, I don't really have the source code line that failed
        // So put the token text that failed in the position it would be if it was in the source
        StringBuilder partialLine = new StringBuilder();
        for (int i = 0; i < offendingToken.getCharPositionInLine(); ++i) {
            partialLine.append(".");
        }
        partialLine.append(offendingToken.getText());

        return prettyFormat(message, brokenRule, ctx.getStart(), partialLine.toString());
    }

    private static String prettyFormat(String message, String brokenRule, Token offendingToken, String errorLine) {
        int line = offendingToken.getLine();
        int col = offendingToken.getCharPositionInLine();
        String fileName = offendingToken.getInputStream().getSourceName();
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();

        StringBuilder underline = new StringBuilder("");
        for (int i = 0; i < col; i++) {
            underline.append(" ");
        }
        if (start >= 0 && stop >= 0) {
            for (int i = start; i <= stop; i++) {
                underline.append("^");
            }
        }

        String generalMessage = "Error: %s\nRule: %s\nFile: %s, Line: %d, Col: %d\nSource:\n%s\n%s\n";
        return String.format(generalMessage, message, brokenRule, fileName, line, col, errorLine, underline);
    }
}
