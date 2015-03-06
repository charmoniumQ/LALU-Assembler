package me.heraclitus.compiler.backend;

import me.heraclitus.compiler.grammer.MainLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;

/**
 * Created by sam on 3/5/15.
 */
class BailMainLexer extends MainLexer {
    public BailMainLexer(CharStream input) { super(input); }
    public void recover(LexerNoViableAltException e) {
        throw new RuntimeException(e); // Bail out
    }
}
