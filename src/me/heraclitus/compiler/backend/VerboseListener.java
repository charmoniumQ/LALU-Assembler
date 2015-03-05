package me.heraclitus.compiler.backend;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

/**
 * Created by sam on 3/5/15.
 */
class VerboseListener extends BaseErrorListener {
    StringBuilder errorLog;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        errorLog.append("rule stack: " + stack + "\nline " + line + ":" + charPositionInLine + " at " + offendingSymbol + ": " + msg + "\n");
    }

    public String getErrors() {
        return errorLog.toString();
    }
}
