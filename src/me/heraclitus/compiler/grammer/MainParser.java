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
		RULE_source = 0, RULE_nobyte = 1, RULE_codebyte = 2, RULE_nullary_command = 3, 
		RULE_unary_command_4 = 4, RULE_unary_command_3 = 5, RULE_address_4 = 6, 
		RULE_address_5 = 7, RULE_eof = 8, RULE_pointer = 9, RULE_label = 10, RULE_literal_byte_8 = 11, 
		RULE_literal_address_5 = 12, RULE_literal_address_4 = 13;
	public static final String[] ruleNames = {
		"source", "nobyte", "codebyte", "nullary_command", "unary_command_4", 
		"unary_command_3", "address_4", "address_5", "eof", "pointer", "label", 
		"literal_byte_8", "literal_address_5", "literal_address_4"
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
		public NobyteContext nb;
		public CodebyteContext cb;
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<NobyteContext> nobyte() {
			return getRuleContexts(NobyteContext.class);
		}
		public NobyteContext nobyte(int i) {
			return getRuleContext(NobyteContext.class,i);
		}
		public List<CodebyteContext> codebyte() {
			return getRuleContexts(CodebyteContext.class);
		}
		public CodebyteContext codebyte(int i) {
			return getRuleContext(CodebyteContext.class,i);
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
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				switch (_input.LA(1)) {
				case POINTER:
				case LABEL:
					{
					setState(28);
					((SourceContext)_localctx).nb = nobyte();
					}
					break;
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
					setState(29);
					((SourceContext)_localctx).cb = codebyte();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << POINTER) | (1L << LABEL))) != 0) );
			setState(36);
			eof();
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
		public NobyteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nobyte; }
	 
		public NobyteContext() { }
		public void copyFrom(NobyteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignLabelContext extends NobyteContext {
		public LabelContext labelName;
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public AssignLabelContext(NobyteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAssignLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAssignLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAssignLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignPointerContext extends NobyteContext {
		public PointerContext pointerName;
		public Literal_address_4Context literal;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public Literal_address_4Context literal_address_4() {
			return getRuleContext(Literal_address_4Context.class,0);
		}
		public AssignPointerContext(NobyteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAssignPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAssignPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAssignPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NobyteContext nobyte() throws RecognitionException {
		NobyteContext _localctx = new NobyteContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nobyte);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case LABEL:
				_localctx = new AssignLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((AssignLabelContext)_localctx).labelName = label();
				}
				break;
			case POINTER:
				_localctx = new AssignPointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((AssignPointerContext)_localctx).pointerName = pointer();
				setState(40);
				match(T__0);
				setState(41);
				((AssignPointerContext)_localctx).literal = literal_address_4();
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
		public CodebyteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codebyte; }
	 
		public CodebyteContext() { }
		public void copyFrom(CodebyteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CodebyteUnary4Context extends CodebyteContext {
		public Unary_command_4Context command;
		public Address_4Context address;
		public Unary_command_4Context unary_command_4() {
			return getRuleContext(Unary_command_4Context.class,0);
		}
		public Address_4Context address_4() {
			return getRuleContext(Address_4Context.class,0);
		}
		public CodebyteUnary4Context(CodebyteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterCodebyteUnary4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitCodebyteUnary4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitCodebyteUnary4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodebyteUnary3Context extends CodebyteContext {
		public Unary_command_3Context command;
		public Address_5Context address;
		public Unary_command_3Context unary_command_3() {
			return getRuleContext(Unary_command_3Context.class,0);
		}
		public Address_5Context address_5() {
			return getRuleContext(Address_5Context.class,0);
		}
		public CodebyteUnary3Context(CodebyteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterCodebyteUnary3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitCodebyteUnary3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitCodebyteUnary3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodebyteNullaryContext extends CodebyteContext {
		public Nullary_commandContext command;
		public Nullary_commandContext nullary_command() {
			return getRuleContext(Nullary_commandContext.class,0);
		}
		public CodebyteNullaryContext(CodebyteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterCodebyteNullary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitCodebyteNullary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitCodebyteNullary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CodebyteLiteralContext extends CodebyteContext {
		public Literal_byte_8Context literal;
		public Literal_byte_8Context literal_byte_8() {
			return getRuleContext(Literal_byte_8Context.class,0);
		}
		public CodebyteLiteralContext(CodebyteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterCodebyteLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitCodebyteLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitCodebyteLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodebyteContext codebyte() throws RecognitionException {
		CodebyteContext _localctx = new CodebyteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_codebyte);
		try {
			setState(54);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new CodebyteLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__1);
				setState(46);
				((CodebyteLiteralContext)_localctx).literal = literal_byte_8();
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				_localctx = new CodebyteNullaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				((CodebyteNullaryContext)_localctx).command = nullary_command();
				}
				break;
			case T__7:
			case T__8:
				_localctx = new CodebyteUnary4Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				((CodebyteUnary4Context)_localctx).command = unary_command_4();
				setState(49);
				((CodebyteUnary4Context)_localctx).address = address_4();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				_localctx = new CodebyteUnary3Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				((CodebyteUnary3Context)_localctx).command = unary_command_3();
				setState(52);
				((CodebyteUnary3Context)_localctx).address = address_5();
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

	public static class Nullary_commandContext extends ParserRuleContext {
		public String code;
		public Nullary_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullary_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterNullary_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitNullary_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitNullary_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nullary_commandContext nullary_command() throws RecognitionException {
		Nullary_commandContext _localctx = new Nullary_commandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nullary_command);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__2);
				((Nullary_commandContext)_localctx).code =  "00000000";
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__3);
				((Nullary_commandContext)_localctx).code =  "00000001";
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(T__4);
				((Nullary_commandContext)_localctx).code =  "00000011";
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(T__5);
				((Nullary_commandContext)_localctx).code =  "00000111";
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(T__6);
				((Nullary_commandContext)_localctx).code =  "00001000";
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
		public String code;
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
			setState(72);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__7);
				((Unary_command_4Context)_localctx).code =  "0010";
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__8);
				((Unary_command_4Context)_localctx).code =  "0100";
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
		public String code;
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
			setState(82);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__9);
				((Unary_command_3Context)_localctx).code =  "101";
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__10);
				((Unary_command_3Context)_localctx).code =  "101";
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(T__11);
				((Unary_command_3Context)_localctx).code =  "110";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(T__12);
				((Unary_command_3Context)_localctx).code =  "110";
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
		public Address_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_4; }
	 
		public Address_4Context() { }
		public void copyFrom(Address_4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddressPointerContext extends Address_4Context {
		public PointerContext pointerName;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public AddressPointerContext(Address_4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAddressPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAddressPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAddressPointer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddressLiteral4Context extends Address_4Context {
		public Literal_address_4Context literal;
		public Literal_address_4Context literal_address_4() {
			return getRuleContext(Literal_address_4Context.class,0);
		}
		public AddressLiteral4Context(Address_4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAddressLiteral4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAddressLiteral4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAddressLiteral4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Address_4Context address_4() throws RecognitionException {
		Address_4Context _localctx = new Address_4Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_address_4);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case LITERAL_ADDRESS_4:
				_localctx = new AddressLiteral4Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((AddressLiteral4Context)_localctx).literal = literal_address_4();
				}
				break;
			case POINTER:
				_localctx = new AddressPointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((AddressPointerContext)_localctx).pointerName = pointer();
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
		public Address_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address_5; }
	 
		public Address_5Context() { }
		public void copyFrom(Address_5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddressLiteral5Context extends Address_5Context {
		public Literal_address_5Context literal;
		public Literal_address_5Context literal_address_5() {
			return getRuleContext(Literal_address_5Context.class,0);
		}
		public AddressLiteral5Context(Address_5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAddressLiteral5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAddressLiteral5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAddressLiteral5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddressLabelContext extends Address_5Context {
		public LabelContext labelName;
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public AddressLabelContext(Address_5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterAddressLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitAddressLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitAddressLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Address_5Context address_5() throws RecognitionException {
		Address_5Context _localctx = new Address_5Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_address_5);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case LITERAL_ADDRESS_5:
				_localctx = new AddressLiteral5Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((AddressLiteral5Context)_localctx).literal = literal_address_5();
				}
				break;
			case LABEL:
				_localctx = new AddressLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				((AddressLabelContext)_localctx).labelName = label();
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

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MainParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainListener ) ((MainListener)listener).exitEof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainVisitor ) return ((MainVisitor<? extends T>)visitor).visitEof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		enterRule(_localctx, 18, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		enterRule(_localctx, 20, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		enterRule(_localctx, 22, RULE_literal_byte_8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 24, RULE_literal_address_5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 26, RULE_literal_address_4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\5\2!\n\2\6\2#\n\2\r\2\16\2"+
		"$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3\6\3\6"+
		"\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7U\n\7\3\b\3\b\5\b"+
		"Y\n\b\3\t\3\t\5\t]\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2l\2\"\3\2\2\2"+
		"\4-\3\2\2\2\68\3\2\2\2\bD\3\2\2\2\nJ\3\2\2\2\fT\3\2\2\2\16X\3\2\2\2\20"+
		"\\\3\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26b\3\2\2\2\30d\3\2\2\2\32f\3\2\2\2"+
		"\34h\3\2\2\2\36!\5\4\3\2\37!\5\6\4\2 \36\3\2\2\2 \37\3\2\2\2!#\3\2\2\2"+
		"\" \3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\5\22\n\2\'\3\3"+
		"\2\2\2(.\5\26\f\2)*\5\24\13\2*+\7\3\2\2+,\5\34\17\2,.\3\2\2\2-(\3\2\2"+
		"\2-)\3\2\2\2.\5\3\2\2\2/\60\7\4\2\2\609\5\30\r\2\619\5\b\5\2\62\63\5\n"+
		"\6\2\63\64\5\16\b\2\649\3\2\2\2\65\66\5\f\7\2\66\67\5\20\t\2\679\3\2\2"+
		"\28/\3\2\2\28\61\3\2\2\28\62\3\2\2\28\65\3\2\2\29\7\3\2\2\2:;\7\5\2\2"+
		";E\b\5\1\2<=\7\6\2\2=E\b\5\1\2>?\7\7\2\2?E\b\5\1\2@A\7\b\2\2AE\b\5\1\2"+
		"BC\7\t\2\2CE\b\5\1\2D:\3\2\2\2D<\3\2\2\2D>\3\2\2\2D@\3\2\2\2DB\3\2\2\2"+
		"E\t\3\2\2\2FG\7\n\2\2GK\b\6\1\2HI\7\13\2\2IK\b\6\1\2JF\3\2\2\2JH\3\2\2"+
		"\2K\13\3\2\2\2LM\7\f\2\2MU\b\7\1\2NO\7\r\2\2OU\b\7\1\2PQ\7\16\2\2QU\b"+
		"\7\1\2RS\7\17\2\2SU\b\7\1\2TL\3\2\2\2TN\3\2\2\2TP\3\2\2\2TR\3\2\2\2U\r"+
		"\3\2\2\2VY\5\34\17\2WY\5\24\13\2XV\3\2\2\2XW\3\2\2\2Y\17\3\2\2\2Z]\5\32"+
		"\16\2[]\5\26\f\2\\Z\3\2\2\2\\[\3\2\2\2]\21\3\2\2\2^_\7\2\2\3_\23\3\2\2"+
		"\2`a\7\20\2\2a\25\3\2\2\2bc\7\21\2\2c\27\3\2\2\2de\7\24\2\2e\31\3\2\2"+
		"\2fg\7\22\2\2g\33\3\2\2\2hi\7\23\2\2i\35\3\2\2\2\13 $-8DJTX\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}