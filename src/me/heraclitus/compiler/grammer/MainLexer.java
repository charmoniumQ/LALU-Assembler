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
		LITERAL_ADDRESS_4=17, LITERAL_BYTE_8=18, WS=19, COMMENT=20, LINE_COMMENT=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "POINTER", "LABEL", "LITERAL_ADDRESS_5", 
		"LITERAL_ADDRESS_4", "LITERAL_BYTE_8", "BIT", "LETTER", "WS", "COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'0b'", "'add'", "'sub'", "'xchg'", "'loada'", "'nop'", "'ld'", 
		"'st'", "'jmp'", "'djmp'", "'jmpn'", "'djmpn'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "POINTER", "LABEL", "LITERAL_ADDRESS_5", "LITERAL_ADDRESS_4", 
		"LITERAL_BYTE_8", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\6\17j\n\17\r\17\16\17k\3\20\3\20\6\20p\n\20\r"+
		"\20\16\20q\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26"+
		"\u008d\n\26\r\26\16\26\u008e\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0097"+
		"\n\27\f\27\16\27\u009a\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\7\30\u00a5\n\30\f\30\16\30\u00a8\13\30\3\30\3\30\3\30\3\30\4\u0098"+
		"\u00a6\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\2)\2+\25-\26/\27\3\2\6\3\2\62\63\4\2C\\"+
		"c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2+\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\66\3\2\2\2\t:\3\2\2\2"+
		"\13>\3\2\2\2\rC\3\2\2\2\17I\3\2\2\2\21M\3\2\2\2\23P\3\2\2\2\25S\3\2\2"+
		"\2\27W\3\2\2\2\31\\\3\2\2\2\33a\3\2\2\2\35g\3\2\2\2\37m\3\2\2\2!s\3\2"+
		"\2\2#y\3\2\2\2%~\3\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008c\3\2\2\2"+
		"-\u0092\3\2\2\2/\u00a0\3\2\2\2\61\62\7?\2\2\62\4\3\2\2\2\63\64\7\62\2"+
		"\2\64\65\7d\2\2\65\6\3\2\2\2\66\67\7c\2\2\678\7f\2\289\7f\2\29\b\3\2\2"+
		"\2:;\7u\2\2;<\7w\2\2<=\7d\2\2=\n\3\2\2\2>?\7z\2\2?@\7e\2\2@A\7j\2\2AB"+
		"\7i\2\2B\f\3\2\2\2CD\7n\2\2DE\7q\2\2EF\7c\2\2FG\7f\2\2GH\7c\2\2H\16\3"+
		"\2\2\2IJ\7p\2\2JK\7q\2\2KL\7r\2\2L\20\3\2\2\2MN\7n\2\2NO\7f\2\2O\22\3"+
		"\2\2\2PQ\7u\2\2QR\7v\2\2R\24\3\2\2\2ST\7l\2\2TU\7o\2\2UV\7r\2\2V\26\3"+
		"\2\2\2WX\7f\2\2XY\7l\2\2YZ\7o\2\2Z[\7r\2\2[\30\3\2\2\2\\]\7l\2\2]^\7o"+
		"\2\2^_\7r\2\2_`\7p\2\2`\32\3\2\2\2ab\7f\2\2bc\7l\2\2cd\7o\2\2de\7r\2\2"+
		"ef\7p\2\2f\34\3\2\2\2gi\7,\2\2hj\5)\25\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2l\36\3\2\2\2mo\7B\2\2np\5)\25\2on\3\2\2\2pq\3\2\2\2qo\3\2\2"+
		"\2qr\3\2\2\2r \3\2\2\2st\5\'\24\2tu\5\'\24\2uv\5\'\24\2vw\5\'\24\2wx\5"+
		"\'\24\2x\"\3\2\2\2yz\5\'\24\2z{\5\'\24\2{|\5\'\24\2|}\5\'\24\2}$\3\2\2"+
		"\2~\177\5\'\24\2\177\u0080\5\'\24\2\u0080\u0081\5\'\24\2\u0081\u0082\5"+
		"\'\24\2\u0082\u0083\5\'\24\2\u0083\u0084\5\'\24\2\u0084\u0085\5\'\24\2"+
		"\u0085\u0086\5\'\24\2\u0086&\3\2\2\2\u0087\u0088\t\2\2\2\u0088(\3\2\2"+
		"\2\u0089\u008a\t\3\2\2\u008a*\3\2\2\2\u008b\u008d\t\4\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\b\26\2\2\u0091,\3\2\2\2\u0092\u0093\7\61\2"+
		"\2\u0093\u0094\7,\2\2\u0094\u0098\3\2\2\2\u0095\u0097\13\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7,\2\2\u009c\u009d\7\61"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\27\2\2\u009f.\3\2\2\2\u00a0\u00a1"+
		"\7\61\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13\2\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\t\5\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\b\30\2\2\u00ac\60\3\2\2\2\b\2kq\u008e\u0098"+
		"\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}