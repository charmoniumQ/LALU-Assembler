package me.heraclitus.compiler.backend;

import me.heraclitus.compiler.frontend.MainWindow;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;


import java.util.BitSet;
import java.util.Collections;
import java.util.List;

class MyErrorListener extends BaseErrorListener {
    public MyErrorListener() {
        errorLog = "";
    }

    @Override public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int col, String msg, RecognitionException e) {
        List<String> ruleStack = ((Parser) recognizer).getRuleInvocationStack();
        Token offendingToken = (Token) offendingSymbol;
        CommonTokenStream tokens = (CommonTokenStream) recognizer.getInputStream();
        String[] lines = tokens.getTokenSource().getInputStream().toString().split("\n");
        String errorLine = lines[line - 1];

        StringBuilder underline = new StringBuilder("");
        for (int i = 0; i < col; i++) {
            underline.append(" ");
        }
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if (start >= 0 && stop >= 0) {
            for (int i = start; i <= stop; i++) {
                underline.append("^");
            }
        }

        String brokenRule = ruleStack.get(0);
        String description = "expecting a(n) " + brokenRule;

        String generalMessage = "Error: %s\nLine: %d, Col: %d\nSource:\n%s\n%s";
        String specificMessage = String.format(generalMessage, description, line, col, errorLine, underline.toString());
        errorLog = specificMessage;
    }

    public String getErrors() {
        return errorLog;
    }

    String errorLog;
}
