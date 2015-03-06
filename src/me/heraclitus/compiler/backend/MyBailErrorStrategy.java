package me.heraclitus.compiler.backend;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class MyBailErrorStrategy extends DefaultErrorStrategy {
    @Override public void recover(Parser recognizer, RecognitionException e) {
        for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
            context.exception = e;
        }

        throw new ParseCancellationException(e);
    }

    @Override public Token recoverInline(Parser recognizer) throws RecognitionException {
        org.antlr.v4.runtime.InputMismatchException e = new org.antlr.v4.runtime.InputMismatchException(recognizer);
        for (ParserRuleContext context = recognizer.getContext(); context != null; context = context.getParent()) {
            context.exception = e;
        }
        throw new ParseCancellationException(e);
    }

    @Override public void sync(Parser recognizer) { }
}
