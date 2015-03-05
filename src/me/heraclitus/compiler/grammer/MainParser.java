// Generated from grammer/Main.g4 by ANTLR 4.5

    package me.heraclitus.compiler.grammer;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, POINTER=14, LABEL=15, LITERAL_ADDRESS_5=16, 
		LITERAL_ADDRESS_4=17, LITERAL_BYTE_8=18, WS=19, COMMENT=20, LINE_COMMENT=21;
	public static final int
		RULE_source = 0, RULE_nobyte = 1, RULE_codebyte = 2, RULE_nullary_command_4 = 3, 
		RULE_unary_command_4 = 4, RULE_unary_command_3 = 5, RULE_address_4 = 6, 
		RULE_address_5 = 7, RULE_pointer = 8, RULE_label = 9, RULE_literal_byte_8 = 10, 
		RULE_literal_address_5 = 11, RULE_literal_address_4 = 12;
	public static final String[] ruleNames = {
		"source", "nobyte", "codebyte", "nullary_command_4", "unary_command_4", 
		"unary_command_3", "address_4", "address_5", "pointer", "label", "literal_byte_8", 
		"literal_address_5", "literal_address_4"
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

	@Override
	public String getGrammarFileName() { return "Main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MainParser.EOF, 0); }
		public List<CodebyteContext> codebyte() {
			return getRuleContexts(CodebyteContext.class);
		}
		public CodebyteContext codebyte(int i) {
			return getRuleContext(CodebyteContext.class,i);
		}
		public List<NobyteContext> nobyte() {
			return getRuleContexts(NobyteContext.class);
		}
		public NobyteContext nobyte(int i) {
			return getRuleContext(NobyteContext.class,i);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(28);
				switch (_input.LA(1)) {
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
					{
					setState(26);
					codebyte();
					}
					break;
				case POINTER:
				case LABEL:
					{
					setState(27);
					nobyte();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << POINTER) | (1L << LABEL))) != 0) );
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NobyteContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Literal_address_4Context literal_address_4() {
			return getRuleContext(Literal_address_4Context.class,0);
		}
		public NobyteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nobyte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterNobyte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitNobyte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitNobyte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NobyteContext nobyte() throws RecognitionException {
		NobyteContext _localctx = new NobyteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nobyte);
		try {
			setState(39);
			switch (_input.LA(1)) {
			case LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				label();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				pointer();
				setState(36);
				match(T__0);
				setState(37);
				literal_address_4();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodebyteContext extends ParserRuleContext {
		public TerminalNode LITERAL_BYTE_8() { return getToken(MainParser.LITERAL_BYTE_8, 0); }
		public Nullary_command_4Context nullary_command_4() {
			return getRuleContext(Nullary_command_4Context.class,0);
		}
		public Unary_command_4Context unary_command_4() {
			return getRuleContext(Unary_command_4Context.class,0);
		}
		public Address_4Context address_4() {
			return getRuleContext(Address_4Context.class,0);
		}
		public Unary_command_3Context unary_command_3() {
			return getRuleContext(Unary_command_3Context.class,0);
		}
		public Address_5Context address_5() {
			return getRuleContext(Address_5Context.class,0);
		}
		public CodebyteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codebyte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterCodebyte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitCodebyte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitCodebyte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodebyteContext codebyte() throws RecognitionException {
		CodebyteContext _localctx = new CodebyteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_codebyte);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__1);
				setState(42);
				match(LITERAL_BYTE_8);
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				nullary_command_4();
				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				unary_command_4();
				setState(45);
				address_4();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				unary_command_3();
				setState(48);
				address_5();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nullary_command_4Context extends ParserRuleContext {
		public String value;
		public Nullary_command_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullary_command_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterNullary_command_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitNullary_command_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitNullary_command_4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nullary_command_4Context nullary_command_4() throws RecognitionException {
		Nullary_command_4Context _localctx = new Nullary_command_4Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_nullary_command_4);
		try {
			setState(62);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__2);
				((Nullary_command_4Context)_localctx).value =  "00000000";
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__3);
				((Nullary_command_4Context)_localctx).value =  "00000001";
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(T__4);
				((Nullary_command_4Context)_localctx).value =  "00000011";
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(T__5);
				((Nullary_command_4Context)_localctx).value =  "00000111";
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(T__6);
				((Nullary_command_4Context)_localctx).value =  "00001000";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_command_4Context extends ParserRuleContext {
		public String value;
		public Unary_command_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_command_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterUnary_command_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitUnary_command_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitUnary_command_4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_command_4Context unary_command_4() throws RecognitionException {
		Unary_command_4Context _localctx = new Unary_command_4Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_unary_command_4);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__7);
				((Unary_command_4Context)_localctx).value =  "0010";
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__8);
				((Unary_command_4Context)_localctx).value =  "0100";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_command_3Context extends ParserRuleContext {
		public String value;
		public Unary_command_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_command_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterUnary_command_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitUnary_command_3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitUnary_command_3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_command_3Context unary_command_3() throws RecognitionException {
		Unary_command_3Context _localctx = new Unary_command_3Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_unary_command_3);
		try {
			setState(78);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__9);
				((Unary_command_3Context)_localctx).value =  "101";
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__10);
				((Unary_command_3Context)_localctx).value =  "101";
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(T__11);
				((Unary_command_3Context)_localctx).value =  "110";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(T__12);
				((Unary_command_3Context)_localctx).value =  "110";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Address_4Context extends ParserRuleContext {
		public Literal_address_4Context literal_address_4() {
			return getRuleContext(Literal_address_4Context.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Address_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAddress_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAddress_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAddress_4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Address_4Context address_4() throws RecognitionException {
		Address_4Context _localctx = new Address_4Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_address_4);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case LITERAL_ADDRESS_4:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				literal_address_4();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				pointer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Address_5Context extends ParserRuleContext {
		public Literal_address_5Context literal_address_5() {
			return getRuleContext(Literal_address_5Context.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Address_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAddress_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAddress_5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAddress_5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Address_5Context address_5() throws RecognitionException {
		Address_5Context _localctx = new Address_5Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_address_5);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case LITERAL_ADDRESS_5:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				literal_address_5();
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				label();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(MainParser.POINTER, 0); }
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(POINTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(MainParser.LABEL, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LABEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_byte_8Context extends ParserRuleContext {
		public TerminalNode LITERAL_BYTE_8() { return getToken(MainParser.LITERAL_BYTE_8, 0); }
		public Literal_byte_8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_byte_8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLiteral_byte_8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLiteral_byte_8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitLiteral_byte_8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_byte_8Context literal_byte_8() throws RecognitionException {
		Literal_byte_8Context _localctx = new Literal_byte_8Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal_byte_8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LITERAL_BYTE_8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_address_5Context extends ParserRuleContext {
		public TerminalNode LITERAL_ADDRESS_5() { return getToken(MainParser.LITERAL_ADDRESS_5, 0); }
		public Literal_address_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_address_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLiteral_address_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLiteral_address_5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitLiteral_address_5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_address_5Context literal_address_5() throws RecognitionException {
		Literal_address_5Context _localctx = new Literal_address_5Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal_address_5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LITERAL_ADDRESS_5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_address_4Context extends ParserRuleContext {
		public TerminalNode LITERAL_ADDRESS_4() { return getToken(MainParser.LITERAL_ADDRESS_4, 0); }
		public Literal_address_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_address_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterLiteral_address_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitLiteral_address_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitLiteral_address_4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_address_4Context literal_address_4() throws RecognitionException {
		Literal_address_4Context _localctx = new Literal_address_4Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal_address_4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LITERAL_ADDRESS_4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\3\6\5\6G\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\5\bU\n\b\3\t\3\t\5"+
		"\tY\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\2\2g\2\36\3\2\2\2\4)\3\2\2\2\6\64\3\2\2\2"+
		"\b@\3\2\2\2\nF\3\2\2\2\fP\3\2\2\2\16T\3\2\2\2\20X\3\2\2\2\22Z\3\2\2\2"+
		"\24\\\3\2\2\2\26^\3\2\2\2\30`\3\2\2\2\32b\3\2\2\2\34\37\5\6\4\2\35\37"+
		"\5\4\3\2\36\34\3\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2"+
		"!\"\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$*\5\24\13\2%&\5\22\n\2&\'\7\3\2\2\'"+
		"(\5\32\16\2(*\3\2\2\2)$\3\2\2\2)%\3\2\2\2*\5\3\2\2\2+,\7\4\2\2,\65\7\24"+
		"\2\2-\65\5\b\5\2./\5\n\6\2/\60\5\16\b\2\60\65\3\2\2\2\61\62\5\f\7\2\62"+
		"\63\5\20\t\2\63\65\3\2\2\2\64+\3\2\2\2\64-\3\2\2\2\64.\3\2\2\2\64\61\3"+
		"\2\2\2\65\7\3\2\2\2\66\67\7\5\2\2\67A\b\5\1\289\7\6\2\29A\b\5\1\2:;\7"+
		"\7\2\2;A\b\5\1\2<=\7\b\2\2=A\b\5\1\2>?\7\t\2\2?A\b\5\1\2@\66\3\2\2\2@"+
		"8\3\2\2\2@:\3\2\2\2@<\3\2\2\2@>\3\2\2\2A\t\3\2\2\2BC\7\n\2\2CG\b\6\1\2"+
		"DE\7\13\2\2EG\b\6\1\2FB\3\2\2\2FD\3\2\2\2G\13\3\2\2\2HI\7\f\2\2IQ\b\7"+
		"\1\2JK\7\r\2\2KQ\b\7\1\2LM\7\16\2\2MQ\b\7\1\2NO\7\17\2\2OQ\b\7\1\2PH\3"+
		"\2\2\2PJ\3\2\2\2PL\3\2\2\2PN\3\2\2\2Q\r\3\2\2\2RU\5\32\16\2SU\5\22\n\2"+
		"TR\3\2\2\2TS\3\2\2\2U\17\3\2\2\2VY\5\30\r\2WY\5\24\13\2XV\3\2\2\2XW\3"+
		"\2\2\2Y\21\3\2\2\2Z[\7\20\2\2[\23\3\2\2\2\\]\7\21\2\2]\25\3\2\2\2^_\7"+
		"\24\2\2_\27\3\2\2\2`a\7\22\2\2a\31\3\2\2\2bc\7\23\2\2c\33\3\2\2\2\13\36"+
		" )\64@FPTX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}