// Generated from grammer/Main.g4 by ANTLR 4.5

    package me.heraclitus.compiler.grammer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, POINTER=14, LABEL=15, LITERAL_ADDRESS_5=16, 
		LITERAL_ADDRESS_4=17, LITERAL_BYTE_8=18, WHITESPACE=19, BLOCK_COMMENT=20, 
		LINE_COMMENT=21, OTHER_CHAR=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "POINTER", "LABEL", "LITERAL_ADDRESS_5", 
		"LITERAL_ADDRESS_4", "LITERAL_BYTE_8", "BIT", "LETTER", "WHITESPACE", 
		"BLOCK_COMMENT", "LINE_COMMENT", "OTHER_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'0b'", "'add'", "'sub'", "'xchg'", "'loada'", "'nop'", "'ld'", 
		"'st'", "'jmp'", "'djmp'", "'jmpn'", "'djmpn'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "POINTER", "LABEL", "LITERAL_ADDRESS_5", "LITERAL_ADDRESS_4", 
		"LITERAL_BYTE_8", "WHITESPACE", "BLOCK_COMMENT", "LINE_COMMENT", "OTHER_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\6\17l\n\17\r\17\16\17m\3\20\3\20\6\20"+
		"r\n\20\r\20\16\20s\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\6\26\u008f\n\26\r\26\16\26\u0090\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u0099\n\27\f\27\16\27\u009c\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\7\30\u00a7\n\30\f\30\16\30\u00aa\13\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\4\u009a\u00a8\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\25-\26/\27\61\30"+
		"\3\2\6\3\2\62\63\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00b3\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5"+
		"\65\3\2\2\2\78\3\2\2\2\t<\3\2\2\2\13@\3\2\2\2\rE\3\2\2\2\17K\3\2\2\2\21"+
		"O\3\2\2\2\23R\3\2\2\2\25U\3\2\2\2\27Y\3\2\2\2\31^\3\2\2\2\33c\3\2\2\2"+
		"\35i\3\2\2\2\37o\3\2\2\2!u\3\2\2\2#{\3\2\2\2%\u0080\3\2\2\2\'\u0089\3"+
		"\2\2\2)\u008b\3\2\2\2+\u008e\3\2\2\2-\u0094\3\2\2\2/\u00a2\3\2\2\2\61"+
		"\u00af\3\2\2\2\63\64\7?\2\2\64\4\3\2\2\2\65\66\7\62\2\2\66\67\7d\2\2\67"+
		"\6\3\2\2\289\7c\2\29:\7f\2\2:;\7f\2\2;\b\3\2\2\2<=\7u\2\2=>\7w\2\2>?\7"+
		"d\2\2?\n\3\2\2\2@A\7z\2\2AB\7e\2\2BC\7j\2\2CD\7i\2\2D\f\3\2\2\2EF\7n\2"+
		"\2FG\7q\2\2GH\7c\2\2HI\7f\2\2IJ\7c\2\2J\16\3\2\2\2KL\7p\2\2LM\7q\2\2M"+
		"N\7r\2\2N\20\3\2\2\2OP\7n\2\2PQ\7f\2\2Q\22\3\2\2\2RS\7u\2\2ST\7v\2\2T"+
		"\24\3\2\2\2UV\7l\2\2VW\7o\2\2WX\7r\2\2X\26\3\2\2\2YZ\7f\2\2Z[\7l\2\2["+
		"\\\7o\2\2\\]\7r\2\2]\30\3\2\2\2^_\7l\2\2_`\7o\2\2`a\7r\2\2ab\7p\2\2b\32"+
		"\3\2\2\2cd\7f\2\2de\7l\2\2ef\7o\2\2fg\7r\2\2gh\7p\2\2h\34\3\2\2\2ik\7"+
		",\2\2jl\5)\25\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\36\3\2\2\2oq"+
		"\7B\2\2pr\5)\25\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t \3\2\2\2uv"+
		"\5\'\24\2vw\5\'\24\2wx\5\'\24\2xy\5\'\24\2yz\5\'\24\2z\"\3\2\2\2{|\5\'"+
		"\24\2|}\5\'\24\2}~\5\'\24\2~\177\5\'\24\2\177$\3\2\2\2\u0080\u0081\5\'"+
		"\24\2\u0081\u0082\5\'\24\2\u0082\u0083\5\'\24\2\u0083\u0084\5\'\24\2\u0084"+
		"\u0085\5\'\24\2\u0085\u0086\5\'\24\2\u0086\u0087\5\'\24\2\u0087\u0088"+
		"\5\'\24\2\u0088&\3\2\2\2\u0089\u008a\t\2\2\2\u008a(\3\2\2\2\u008b\u008c"+
		"\t\3\2\2\u008c*\3\2\2\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\b\26\2\2\u0093,\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096"+
		"\7,\2\2\u0096\u009a\3\2\2\2\u0097\u0099\13\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7,\2\2\u009e\u009f\7\61\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\b\27\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7\61\2"+
		"\2\u00a3\u00a4\7\61\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a7\13\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\b\30\2\2\u00ae\60\3\2\2\2\u00af\u00b0\13\2"+
		"\2\2\u00b0\62\3\2\2\2\b\2ms\u0090\u009a\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}