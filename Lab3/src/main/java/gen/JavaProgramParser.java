// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, KEYWORD_package=11, KEYWORD_import=12, KEYWORD_switch=13, KEYWORD_case=14, 
		KEYWORD_default=15, KEYWORD_STRUCTURE=16, KEYWORD_STRUCTURE_CONTINUE=17, 
		KEYWORD=18, STRING=19, NUMBER=20, ID=21, AngleL=22, AngleR=23, Question=24, 
		Colon=25, Star=26, UNARY_OPERATOR=27, OPERATOR=28, Comma=29, WS=30;
	public static final int
		RULE_program = 0, RULE_package = 1, RULE_imports = 2, RULE_imprt = 3, 
		RULE_innerStructureSeq = 4, RULE_innerStructure = 5, RULE_innerDeclare = 6, 
		RULE_declareBegin = 7, RULE_declarePrefix = 8, RULE_declareInScopeBody = 9, 
		RULE_declareEnd = 10, RULE_innerBody = 11, RULE_innerCode = 12, RULE_line = 13, 
		RULE_keyStructure = 14, RULE_keyDeclare = 15, RULE_keyContinueDeclare = 16, 
		RULE_keyDeclareScope = 17, RULE_keyDeclareInScope = 18, RULE_keyLineEnd = 19, 
		RULE_switchStructure = 20, RULE_switchDeclare = 21, RULE_switchBody = 22, 
		RULE_switchCode = 23, RULE_case = 24, RULE_default = 25, RULE_funcDeclareArgs = 26, 
		RULE_funcDeclareArg = 27, RULE_argTypeToken = 28, RULE_valueDeclare = 29, 
		RULE_value = 30, RULE_valueUnary = 31, RULE_valueUnaryKeyWord = 32, RULE_valueUnaryGet = 33, 
		RULE_valueUnaryMain = 34, RULE_funcToken = 35, RULE_funcCallArgs = 36, 
		RULE_typeToken = 37, RULE_varToken = 38, RULE_generic = 39, RULE_genericIn = 40, 
		RULE_keyWordAndTokens = 41, RULE_typeTokensComma = 42, RULE_keyWord = 43, 
		RULE_unaryOperator = 44, RULE_operator = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "package", "imports", "imprt", "innerStructureSeq", "innerStructure", 
			"innerDeclare", "declareBegin", "declarePrefix", "declareInScopeBody", 
			"declareEnd", "innerBody", "innerCode", "line", "keyStructure", "keyDeclare", 
			"keyContinueDeclare", "keyDeclareScope", "keyDeclareInScope", "keyLineEnd", 
			"switchStructure", "switchDeclare", "switchBody", "switchCode", "case", 
			"default", "funcDeclareArgs", "funcDeclareArg", "argTypeToken", "valueDeclare", 
			"value", "valueUnary", "valueUnaryKeyWord", "valueUnaryGet", "valueUnaryMain", 
			"funcToken", "funcCallArgs", "typeToken", "varToken", "generic", "genericIn", 
			"keyWordAndTokens", "typeTokensComma", "keyWord", "unaryOperator", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "'{'", "'}'", "'while'", "'...'", "'['", 
			"']'", "'package'", "'import'", "'switch'", "'case'", "'default'", null, 
			null, null, null, null, null, "'<'", "'>'", "'?'", "':'", "'*'", null, 
			null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "KEYWORD_package", 
			"KEYWORD_import", "KEYWORD_switch", "KEYWORD_case", "KEYWORD_default", 
			"KEYWORD_STRUCTURE", "KEYWORD_STRUCTURE_CONTINUE", "KEYWORD", "STRING", 
			"NUMBER", "ID", "AngleL", "AngleR", "Question", "Colon", "Star", "UNARY_OPERATOR", 
			"OPERATOR", "Comma", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public InnerStructureSeqContext innerStructureSeq() {
			return getRuleContext(InnerStructureSeqContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaProgramParser.EOF, 0); }
		public PackageContext package_() {
			return getRuleContext(PackageContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_package) {
				{
				setState(92);
				package_();
				}
			}

			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_import) {
				{
				setState(95);
				imports();
				}
			}

			setState(98);
			innerStructureSeq();
			setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageContext extends ParserRuleContext {
		public TerminalNode KEYWORD_package() { return getToken(JavaProgramParser.KEYWORD_package, 0); }
		public TypeTokenContext typeToken() {
			return getRuleContext(TypeTokenContext.class,0);
		}
		public PackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(KEYWORD_package);
			setState(102);
			typeToken();
			setState(103);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public List<ImprtContext> imprt() {
			return getRuleContexts(ImprtContext.class);
		}
		public ImprtContext imprt(int i) {
			return getRuleContext(ImprtContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				imprt();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD_import );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprtContext extends ParserRuleContext {
		public TerminalNode KEYWORD_import() { return getToken(JavaProgramParser.KEYWORD_import, 0); }
		public TypeTokenContext typeToken() {
			return getRuleContext(TypeTokenContext.class,0);
		}
		public TerminalNode Star() { return getToken(JavaProgramParser.Star, 0); }
		public ImprtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterImprt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitImprt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitImprt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprtContext imprt() throws RecognitionException {
		ImprtContext _localctx = new ImprtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_imprt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(KEYWORD_import);
			setState(111);
			typeToken();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(112);
				match(T__1);
				setState(113);
				match(Star);
				}
			}

			setState(116);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerStructureSeqContext extends ParserRuleContext {
		public List<InnerStructureContext> innerStructure() {
			return getRuleContexts(InnerStructureContext.class);
		}
		public InnerStructureContext innerStructure(int i) {
			return getRuleContext(InnerStructureContext.class,i);
		}
		public InnerStructureSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStructureSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterInnerStructureSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitInnerStructureSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitInnerStructureSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStructureSeqContext innerStructureSeq() throws RecognitionException {
		InnerStructureSeqContext _localctx = new InnerStructureSeqContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_innerStructureSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				innerStructure();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 6553600L) != 0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerStructureContext extends ParserRuleContext {
		public InnerDeclareContext innerDeclare() {
			return getRuleContext(InnerDeclareContext.class,0);
		}
		public InnerBodyContext innerBody() {
			return getRuleContext(InnerBodyContext.class,0);
		}
		public InnerStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterInnerStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitInnerStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitInnerStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerStructureContext innerStructure() throws RecognitionException {
		InnerStructureContext _localctx = new InnerStructureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_innerStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			innerDeclare();
			setState(124);
			innerBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerDeclareContext extends ParserRuleContext {
		public DeclareBeginContext declareBegin() {
			return getRuleContext(DeclareBeginContext.class,0);
		}
		public DeclareEndContext declareEnd() {
			return getRuleContext(DeclareEndContext.class,0);
		}
		public InnerDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterInnerDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitInnerDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitInnerDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerDeclareContext innerDeclare() throws RecognitionException {
		InnerDeclareContext _localctx = new InnerDeclareContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_innerDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			declareBegin();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD) {
				{
				setState(127);
				declareEnd();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareBeginContext extends ParserRuleContext {
		public DeclarePrefixContext declarePrefix() {
			return getRuleContext(DeclarePrefixContext.class,0);
		}
		public DeclareInScopeBodyContext declareInScopeBody() {
			return getRuleContext(DeclareInScopeBodyContext.class,0);
		}
		public DeclareBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterDeclareBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitDeclareBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitDeclareBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareBeginContext declareBegin() throws RecognitionException {
		DeclareBeginContext _localctx = new DeclareBeginContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			declarePrefix();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(131);
				match(T__2);
				setState(132);
				declareInScopeBody();
				setState(133);
				match(T__3);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarePrefixContext extends ParserRuleContext {
		public List<KeyWordContext> keyWord() {
			return getRuleContexts(KeyWordContext.class);
		}
		public KeyWordContext keyWord(int i) {
			return getRuleContext(KeyWordContext.class,i);
		}
		public List<TypeTokenContext> typeToken() {
			return getRuleContexts(TypeTokenContext.class);
		}
		public TypeTokenContext typeToken(int i) {
			return getRuleContext(TypeTokenContext.class,i);
		}
		public List<GenericContext> generic() {
			return getRuleContexts(GenericContext.class);
		}
		public GenericContext generic(int i) {
			return getRuleContext(GenericContext.class,i);
		}
		public DeclarePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterDeclarePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitDeclarePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitDeclarePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarePrefixContext declarePrefix() throws RecognitionException {
		DeclarePrefixContext _localctx = new DeclarePrefixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarePrefix);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(140);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KEYWORD:
						{
						setState(137);
						keyWord();
						}
						break;
					case ID:
						{
						setState(138);
						typeToken();
						}
						break;
					case AngleL:
						{
						setState(139);
						generic();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareInScopeBodyContext extends ParserRuleContext {
		public FuncDeclareArgsContext funcDeclareArgs() {
			return getRuleContext(FuncDeclareArgsContext.class,0);
		}
		public DeclareInScopeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareInScopeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterDeclareInScopeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitDeclareInScopeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitDeclareInScopeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareInScopeBodyContext declareInScopeBody() throws RecognitionException {
		DeclareInScopeBodyContext _localctx = new DeclareInScopeBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declareInScopeBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			funcDeclareArgs();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareEndContext extends ParserRuleContext {
		public List<KeyWordAndTokensContext> keyWordAndTokens() {
			return getRuleContexts(KeyWordAndTokensContext.class);
		}
		public KeyWordAndTokensContext keyWordAndTokens(int i) {
			return getRuleContext(KeyWordAndTokensContext.class,i);
		}
		public DeclareEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterDeclareEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitDeclareEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitDeclareEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareEndContext declareEnd() throws RecognitionException {
		DeclareEndContext _localctx = new DeclareEndContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declareEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				keyWordAndTokens();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD );
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerBodyContext extends ParserRuleContext {
		public InnerCodeContext innerCode() {
			return getRuleContext(InnerCodeContext.class,0);
		}
		public InnerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterInnerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitInnerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitInnerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerBodyContext innerBody() throws RecognitionException {
		InnerBodyContext _localctx = new InnerBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_innerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__4);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 536682506L) != 0) {
				{
				setState(152);
				innerCode();
				}
			}

			setState(155);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerCodeContext extends ParserRuleContext {
		public InnerStructureSeqContext innerStructureSeq() {
			return getRuleContext(InnerStructureSeqContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<KeyStructureContext> keyStructure() {
			return getRuleContexts(KeyStructureContext.class);
		}
		public KeyStructureContext keyStructure(int i) {
			return getRuleContext(KeyStructureContext.class,i);
		}
		public List<SwitchStructureContext> switchStructure() {
			return getRuleContexts(SwitchStructureContext.class);
		}
		public SwitchStructureContext switchStructure(int i) {
			return getRuleContext(SwitchStructureContext.class,i);
		}
		public InnerCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterInnerCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitInnerCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitInnerCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCodeContext innerCode() throws RecognitionException {
		InnerCodeContext _localctx = new InnerCodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_innerCode);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				innerStructureSeq();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(161);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__2:
					case KEYWORD:
					case STRING:
					case NUMBER:
					case ID:
					case AngleL:
					case AngleR:
					case Question:
					case Colon:
					case Star:
					case UNARY_OPERATOR:
					case OPERATOR:
						{
						setState(158);
						line();
						}
						break;
					case KEYWORD_STRUCTURE:
						{
						setState(159);
						keyStructure();
						}
						break;
					case KEYWORD_switch:
						{
						setState(160);
						switchStructure();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 536682506L) != 0 );
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public KeyWordContext keyWord() {
			return getRuleContext(KeyWordContext.class,0);
		}
		public ValueDeclareContext valueDeclare() {
			return getRuleContext(ValueDeclareContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(167);
				keyWord();
				}
				break;
			case 2:
				{
				setState(168);
				valueDeclare();
				}
				break;
			}
			setState(171);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyStructureContext extends ParserRuleContext {
		public KeyDeclareContext keyDeclare() {
			return getRuleContext(KeyDeclareContext.class,0);
		}
		public List<InnerBodyContext> innerBody() {
			return getRuleContexts(InnerBodyContext.class);
		}
		public InnerBodyContext innerBody(int i) {
			return getRuleContext(InnerBodyContext.class,i);
		}
		public List<KeyContinueDeclareContext> keyContinueDeclare() {
			return getRuleContexts(KeyContinueDeclareContext.class);
		}
		public KeyContinueDeclareContext keyContinueDeclare(int i) {
			return getRuleContext(KeyContinueDeclareContext.class,i);
		}
		public KeyLineEndContext keyLineEnd() {
			return getRuleContext(KeyLineEndContext.class,0);
		}
		public KeyStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterKeyStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitKeyStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitKeyStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyStructureContext keyStructure() throws RecognitionException {
		KeyStructureContext _localctx = new KeyStructureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_keyStructure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			keyDeclare();
			setState(174);
			innerBody();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_STRUCTURE_CONTINUE) {
				{
				{
				setState(175);
				keyContinueDeclare();
				setState(176);
				innerBody();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(183);
				keyLineEnd();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyDeclareContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORD_STRUCTURE() { return getTokens(JavaProgramParser.KEYWORD_STRUCTURE); }
		public TerminalNode KEYWORD_STRUCTURE(int i) {
			return getToken(JavaProgramParser.KEYWORD_STRUCTURE, i);
		}
		public KeyDeclareScopeContext keyDeclareScope() {
			return getRuleContext(KeyDeclareScopeContext.class,0);
		}
		public KeyDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterKeyDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitKeyDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitKeyDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyDeclareContext keyDeclare() throws RecognitionException {
		KeyDeclareContext _localctx = new KeyDeclareContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_keyDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				match(KEYWORD_STRUCTURE);
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD_STRUCTURE );
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(191);
				keyDeclareScope();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyContinueDeclareContext extends ParserRuleContext {
		public TerminalNode KEYWORD_STRUCTURE_CONTINUE() { return getToken(JavaProgramParser.KEYWORD_STRUCTURE_CONTINUE, 0); }
		public List<TerminalNode> KEYWORD_STRUCTURE() { return getTokens(JavaProgramParser.KEYWORD_STRUCTURE); }
		public TerminalNode KEYWORD_STRUCTURE(int i) {
			return getToken(JavaProgramParser.KEYWORD_STRUCTURE, i);
		}
		public KeyDeclareScopeContext keyDeclareScope() {
			return getRuleContext(KeyDeclareScopeContext.class,0);
		}
		public KeyContinueDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyContinueDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterKeyContinueDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitKeyContinueDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitKeyContinueDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContinueDeclareContext keyContinueDeclare() throws RecognitionException {
		KeyContinueDeclareContext _localctx = new KeyContinueDeclareContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_keyContinueDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(KEYWORD_STRUCTURE_CONTINUE);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_STRUCTURE) {
				{
				{
				setState(195);
				match(KEYWORD_STRUCTURE);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(201);
				keyDeclareScope();
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyDeclareScopeContext extends ParserRuleContext {
		public KeyDeclareInScopeContext keyDeclareInScope() {
			return getRuleContext(KeyDeclareInScopeContext.class,0);
		}
		public KeyDeclareScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyDeclareScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterKeyDeclareScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitKeyDeclareScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitKeyDeclareScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyDeclareScopeContext keyDeclareScope() throws RecognitionException {
		KeyDeclareScopeContext _localctx = new KeyDeclareScopeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_keyDeclareScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			match(T__2);
			setState(205);
			keyDeclareInScope();
			setState(206);
			match(T__3);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyDeclareInScopeContext extends ParserRuleContext {
		public List<ValueDeclareContext> valueDeclare() {
			return getRuleContexts(ValueDeclareContext.class);
		}
		public ValueDeclareContext valueDeclare(int i) {
			return getRuleContext(ValueDeclareContext.class,i);
		}
		public KeyDeclareInScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyDeclareInScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterKeyDeclareInScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitKeyDeclareInScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitKeyDeclareInScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyDeclareInScopeContext keyDeclareInScope() throws RecognitionException {
		KeyDeclareInScopeContext _localctx = new KeyDeclareInScopeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_keyDeclareInScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			valueDeclare();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(209);
				match(T__0);
				setState(210);
				valueDeclare();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyLineEndContext extends ParserRuleContext {
		public KeyLineEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyLineEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterKeyLineEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitKeyLineEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitKeyLineEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyLineEndContext keyLineEnd() throws RecognitionException {
		KeyLineEndContext _localctx = new KeyLineEndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_keyLineEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__6);
			setState(217);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStructureContext extends ParserRuleContext {
		public TerminalNode KEYWORD_switch() { return getToken(JavaProgramParser.KEYWORD_switch, 0); }
		public SwitchDeclareContext switchDeclare() {
			return getRuleContext(SwitchDeclareContext.class,0);
		}
		public SwitchBodyContext switchBody() {
			return getRuleContext(SwitchBodyContext.class,0);
		}
		public SwitchStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterSwitchStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitSwitchStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitSwitchStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStructureContext switchStructure() throws RecognitionException {
		SwitchStructureContext _localctx = new SwitchStructureContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switchStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(KEYWORD_switch);
			setState(220);
			switchDeclare();
			setState(221);
			switchBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchDeclareContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SwitchDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterSwitchDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitSwitchDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitSwitchDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchDeclareContext switchDeclare() throws RecognitionException {
		SwitchDeclareContext _localctx = new SwitchDeclareContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switchDeclare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__2);
			setState(224);
			value();
			setState(225);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBodyContext extends ParserRuleContext {
		public SwitchCodeContext switchCode() {
			return getRuleContext(SwitchCodeContext.class,0);
		}
		public SwitchBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterSwitchBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitSwitchBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitSwitchBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBodyContext switchBody() throws RecognitionException {
		SwitchBodyContext _localctx = new SwitchBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switchBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__4);
			setState(228);
			switchCode();
			setState(229);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCodeContext extends ParserRuleContext {
		public List<CaseContext> case_() {
			return getRuleContexts(CaseContext.class);
		}
		public CaseContext case_(int i) {
			return getRuleContext(CaseContext.class,i);
		}
		public DefaultContext default_() {
			return getRuleContext(DefaultContext.class,0);
		}
		public SwitchCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterSwitchCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitSwitchCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitSwitchCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCodeContext switchCode() throws RecognitionException {
		SwitchCodeContext _localctx = new SwitchCodeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switchCode);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					case_();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_default) {
				{
				setState(237);
				default_();
				}
			}

			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_case) {
				{
				{
				setState(240);
				case_();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends ParserRuleContext {
		public TerminalNode KEYWORD_case() { return getToken(JavaProgramParser.KEYWORD_case, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JavaProgramParser.Colon, 0); }
		public InnerCodeContext innerCode() {
			return getRuleContext(InnerCodeContext.class,0);
		}
		public CaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContext case_() throws RecognitionException {
		CaseContext _localctx = new CaseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(KEYWORD_case);
			setState(247);
			value();
			setState(248);
			match(Colon);
			setState(249);
			innerCode();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultContext extends ParserRuleContext {
		public TerminalNode KEYWORD_default() { return getToken(JavaProgramParser.KEYWORD_default, 0); }
		public TerminalNode Colon() { return getToken(JavaProgramParser.Colon, 0); }
		public InnerCodeContext innerCode() {
			return getRuleContext(InnerCodeContext.class,0);
		}
		public DefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultContext default_() throws RecognitionException {
		DefaultContext _localctx = new DefaultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(KEYWORD_default);
			setState(252);
			match(Colon);
			setState(253);
			innerCode();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclareArgsContext extends ParserRuleContext {
		public List<FuncDeclareArgContext> funcDeclareArg() {
			return getRuleContexts(FuncDeclareArgContext.class);
		}
		public FuncDeclareArgContext funcDeclareArg(int i) {
			return getRuleContext(FuncDeclareArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaProgramParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaProgramParser.Comma, i);
		}
		public FuncDeclareArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclareArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterFuncDeclareArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitFuncDeclareArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitFuncDeclareArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclareArgsContext funcDeclareArgs() throws RecognitionException {
		FuncDeclareArgsContext _localctx = new FuncDeclareArgsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcDeclareArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD || _la==ID) {
				{
				setState(255);
				funcDeclareArg();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(256);
					match(Comma);
					setState(257);
					funcDeclareArg();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclareArgContext extends ParserRuleContext {
		public ArgTypeTokenContext argTypeToken() {
			return getRuleContext(ArgTypeTokenContext.class,0);
		}
		public VarTokenContext varToken() {
			return getRuleContext(VarTokenContext.class,0);
		}
		public List<KeyWordContext> keyWord() {
			return getRuleContexts(KeyWordContext.class);
		}
		public KeyWordContext keyWord(int i) {
			return getRuleContext(KeyWordContext.class,i);
		}
		public FuncDeclareArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclareArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterFuncDeclareArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitFuncDeclareArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitFuncDeclareArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclareArgContext funcDeclareArg() throws RecognitionException {
		FuncDeclareArgContext _localctx = new FuncDeclareArgContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funcDeclareArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD) {
				{
				{
				setState(265);
				keyWord();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			argTypeToken();
			setState(272);
			varToken();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgTypeTokenContext extends ParserRuleContext {
		public TypeTokenContext typeToken() {
			return getRuleContext(TypeTokenContext.class,0);
		}
		public ArgTypeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argTypeToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterArgTypeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitArgTypeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitArgTypeToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgTypeTokenContext argTypeToken() throws RecognitionException {
		ArgTypeTokenContext _localctx = new ArgTypeTokenContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argTypeToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			typeToken();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(275);
				match(T__7);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueDeclareContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaProgramParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaProgramParser.Comma, i);
		}
		public ValueDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDeclare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterValueDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitValueDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitValueDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDeclareContext valueDeclare() throws RecognitionException {
		ValueDeclareContext _localctx = new ValueDeclareContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valueDeclare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			value();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 536608776L) != 0) {
				{
				setState(279);
				value();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(280);
					match(Comma);
					setState(281);
					value();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<ValueUnaryContext> valueUnary() {
			return getRuleContexts(ValueUnaryContext.class);
		}
		public ValueUnaryContext valueUnary(int i) {
			return getRuleContext(ValueUnaryContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 398458880L) != 0) {
				{
				{
				setState(289);
				operator();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			valueUnary();
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(296);
						operator();
						}
						}
						setState(299); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 398458880L) != 0 );
					setState(301);
					valueUnary();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					operator();
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueUnaryContext extends ParserRuleContext {
		public ValueUnaryKeyWordContext valueUnaryKeyWord() {
			return getRuleContext(ValueUnaryKeyWordContext.class,0);
		}
		public List<UnaryOperatorContext> unaryOperator() {
			return getRuleContexts(UnaryOperatorContext.class);
		}
		public UnaryOperatorContext unaryOperator(int i) {
			return getRuleContext(UnaryOperatorContext.class,i);
		}
		public ValueUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterValueUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitValueUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitValueUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueUnaryContext valueUnary() throws RecognitionException {
		ValueUnaryContext _localctx = new ValueUnaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_valueUnary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNARY_OPERATOR) {
				{
				{
				setState(314);
				unaryOperator();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			valueUnaryKeyWord();
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					unaryOperator();
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueUnaryKeyWordContext extends ParserRuleContext {
		public ValueUnaryGetContext valueUnaryGet() {
			return getRuleContext(ValueUnaryGetContext.class,0);
		}
		public List<KeyWordContext> keyWord() {
			return getRuleContexts(KeyWordContext.class);
		}
		public KeyWordContext keyWord(int i) {
			return getRuleContext(KeyWordContext.class,i);
		}
		public ValueUnaryKeyWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueUnaryKeyWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterValueUnaryKeyWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitValueUnaryKeyWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitValueUnaryKeyWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueUnaryKeyWordContext valueUnaryKeyWord() throws RecognitionException {
		ValueUnaryKeyWordContext _localctx = new ValueUnaryKeyWordContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_valueUnaryKeyWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD) {
				{
				{
				setState(327);
				keyWord();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			valueUnaryGet();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueUnaryGetContext extends ParserRuleContext {
		public ValueUnaryMainContext valueUnaryMain() {
			return getRuleContext(ValueUnaryMainContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ValueUnaryContext> valueUnary() {
			return getRuleContexts(ValueUnaryContext.class);
		}
		public ValueUnaryContext valueUnary(int i) {
			return getRuleContext(ValueUnaryContext.class,i);
		}
		public ValueUnaryGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueUnaryGet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterValueUnaryGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitValueUnaryGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitValueUnaryGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueUnaryGetContext valueUnaryGet() throws RecognitionException {
		ValueUnaryGetContext _localctx = new ValueUnaryGetContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_valueUnaryGet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			valueUnaryMain();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(336);
				match(T__8);
				setState(337);
				value();
				setState(338);
				match(T__9);
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					match(T__1);
					setState(346);
					valueUnary();
					}
					} 
				}
				setState(351);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueUnaryMainContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(JavaProgramParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(JavaProgramParser.STRING, 0); }
		public FuncTokenContext funcToken() {
			return getRuleContext(FuncTokenContext.class,0);
		}
		public ValueUnaryMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueUnaryMain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterValueUnaryMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitValueUnaryMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitValueUnaryMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueUnaryMainContext valueUnaryMain() throws RecognitionException {
		ValueUnaryMainContext _localctx = new ValueUnaryMainContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_valueUnaryMain);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__2);
				setState(353);
				value();
				setState(354);
				match(T__3);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				funcToken();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncTokenContext extends ParserRuleContext {
		public TypeTokenContext typeToken() {
			return getRuleContext(TypeTokenContext.class,0);
		}
		public FuncCallArgsContext funcCallArgs() {
			return getRuleContext(FuncCallArgsContext.class,0);
		}
		public FuncTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterFuncToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitFuncToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitFuncToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncTokenContext funcToken() throws RecognitionException {
		FuncTokenContext _localctx = new FuncTokenContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_funcToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			typeToken();
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(362);
				funcCallArgs();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallArgsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaProgramParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaProgramParser.Comma, i);
		}
		public FuncCallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterFuncCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitFuncCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitFuncCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallArgsContext funcCallArgs() throws RecognitionException {
		FuncCallArgsContext _localctx = new FuncCallArgsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_funcCallArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__2);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 536608776L) != 0) {
				{
				setState(366);
				value();
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(367);
					match(Comma);
					setState(368);
					value();
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(376);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeTokenContext extends ParserRuleContext {
		public VarTokenContext varToken() {
			return getRuleContext(VarTokenContext.class,0);
		}
		public GenericContext generic() {
			return getRuleContext(GenericContext.class,0);
		}
		public TypeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterTypeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitTypeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitTypeToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTokenContext typeToken() throws RecognitionException {
		TypeTokenContext _localctx = new TypeTokenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeToken);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			varToken();
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(379);
				generic();
				}
				break;
			}
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					match(T__8);
					setState(383);
					match(T__9);
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarTokenContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaProgramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaProgramParser.ID, i);
		}
		public VarTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterVarToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitVarToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitVarToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTokenContext varToken() throws RecognitionException {
		VarTokenContext _localctx = new VarTokenContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_varToken);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(ID);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					match(T__1);
					setState(391);
					match(ID);
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericContext extends ParserRuleContext {
		public TerminalNode AngleL() { return getToken(JavaProgramParser.AngleL, 0); }
		public TerminalNode AngleR() { return getToken(JavaProgramParser.AngleR, 0); }
		public List<GenericInContext> genericIn() {
			return getRuleContexts(GenericInContext.class);
		}
		public GenericInContext genericIn(int i) {
			return getRuleContext(GenericInContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaProgramParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaProgramParser.Comma, i);
		}
		public GenericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitGeneric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericContext generic() throws RecognitionException {
		GenericContext _localctx = new GenericContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_generic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(AngleL);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==Question) {
				{
				setState(398);
				genericIn();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(399);
					match(Comma);
					setState(400);
					genericIn();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(408);
			match(AngleR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericInContext extends ParserRuleContext {
		public TypeTokenContext typeToken() {
			return getRuleContext(TypeTokenContext.class,0);
		}
		public TerminalNode Question() { return getToken(JavaProgramParser.Question, 0); }
		public List<KeyWordAndTokensContext> keyWordAndTokens() {
			return getRuleContexts(KeyWordAndTokensContext.class);
		}
		public KeyWordAndTokensContext keyWordAndTokens(int i) {
			return getRuleContext(KeyWordAndTokensContext.class,i);
		}
		public GenericInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterGenericIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitGenericIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitGenericIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInContext genericIn() throws RecognitionException {
		GenericInContext _localctx = new GenericInContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_genericIn);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				typeToken();
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(Question);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KEYWORD) {
					{
					{
					setState(412);
					keyWordAndTokens();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyWordAndTokensContext extends ParserRuleContext {
		public KeyWordContext keyWord() {
			return getRuleContext(KeyWordContext.class,0);
		}
		public TypeTokensCommaContext typeTokensComma() {
			return getRuleContext(TypeTokensCommaContext.class,0);
		}
		public KeyWordAndTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyWordAndTokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterKeyWordAndTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitKeyWordAndTokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitKeyWordAndTokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyWordAndTokensContext keyWordAndTokens() throws RecognitionException {
		KeyWordAndTokensContext _localctx = new KeyWordAndTokensContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_keyWordAndTokens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			keyWord();
			setState(421);
			typeTokensComma();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeTokensCommaContext extends ParserRuleContext {
		public List<TypeTokenContext> typeToken() {
			return getRuleContexts(TypeTokenContext.class);
		}
		public TypeTokenContext typeToken(int i) {
			return getRuleContext(TypeTokenContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaProgramParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaProgramParser.Comma, i);
		}
		public TypeTokensCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeTokensComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterTypeTokensComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitTypeTokensComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitTypeTokensComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTokensCommaContext typeTokensComma() throws RecognitionException {
		TypeTokensCommaContext _localctx = new TypeTokensCommaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeTokensComma);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			typeToken();
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					match(Comma);
					setState(425);
					typeToken();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyWordContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(JavaProgramParser.KEYWORD, 0); }
		public KeyWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterKeyWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitKeyWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitKeyWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyWordContext keyWord() throws RecognitionException {
		KeyWordContext _localctx = new KeyWordContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_keyWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(KEYWORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode UNARY_OPERATOR() { return getToken(JavaProgramParser.UNARY_OPERATOR, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(UNARY_OPERATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(JavaProgramParser.OPERATOR, 0); }
		public TerminalNode AngleL() { return getToken(JavaProgramParser.AngleL, 0); }
		public TerminalNode AngleR() { return getToken(JavaProgramParser.AngleR, 0); }
		public TerminalNode Question() { return getToken(JavaProgramParser.Question, 0); }
		public TerminalNode Colon() { return getToken(JavaProgramParser.Colon, 0); }
		public TerminalNode Star() { return getToken(JavaProgramParser.Star, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaProgramListener ) ((JavaProgramListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaProgramVisitor ) return ((JavaProgramVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 398458880L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\u0004\u0001\u001e\u01b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0001\u0000\u0003\u0000^\b\u0000\u0001\u0000\u0003\u0000"+
		"a\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002k\b\u0002\u000b\u0002"+
		"\f\u0002l\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"s\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004x\b\u0004\u000b"+
		"\u0004\f\u0004y\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0081\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0088\b\u0007\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u008d\b\b\u000b\b\f\b\u008e\u0001\t\u0001\t\u0001\n\u0004\n\u0094\b"+
		"\n\u000b\n\f\n\u0095\u0001\u000b\u0001\u000b\u0003\u000b\u009a\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00a2"+
		"\b\f\u000b\f\f\f\u00a3\u0003\f\u00a6\b\f\u0001\r\u0001\r\u0003\r\u00aa"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00b3\b\u000e\n\u000e\f\u000e\u00b6\t\u000e\u0001\u000e"+
		"\u0003\u000e\u00b9\b\u000e\u0001\u000f\u0004\u000f\u00bc\b\u000f\u000b"+
		"\u000f\f\u000f\u00bd\u0001\u000f\u0003\u000f\u00c1\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00c5\b\u0010\n\u0010\f\u0010\u00c8\t\u0010\u0001"+
		"\u0010\u0003\u0010\u00cb\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00d4\b\u0012\n"+
		"\u0012\f\u0012\u00d7\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0005\u0017\u00e9\b\u0017\n\u0017\f\u0017\u00ec\t\u0017\u0001\u0017"+
		"\u0003\u0017\u00ef\b\u0017\u0001\u0017\u0005\u0017\u00f2\b\u0017\n\u0017"+
		"\f\u0017\u00f5\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0103\b\u001a\n\u001a\f\u001a\u0106"+
		"\t\u001a\u0003\u001a\u0108\b\u001a\u0001\u001b\u0005\u001b\u010b\b\u001b"+
		"\n\u001b\f\u001b\u010e\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0115\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u011b\b\u001d\n\u001d\f\u001d\u011e\t\u001d"+
		"\u0003\u001d\u0120\b\u001d\u0001\u001e\u0005\u001e\u0123\b\u001e\n\u001e"+
		"\f\u001e\u0126\t\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u012a\b\u001e"+
		"\u000b\u001e\f\u001e\u012b\u0001\u001e\u0001\u001e\u0005\u001e\u0130\b"+
		"\u001e\n\u001e\f\u001e\u0133\t\u001e\u0001\u001e\u0005\u001e\u0136\b\u001e"+
		"\n\u001e\f\u001e\u0139\t\u001e\u0001\u001f\u0005\u001f\u013c\b\u001f\n"+
		"\u001f\f\u001f\u013f\t\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0143"+
		"\b\u001f\n\u001f\f\u001f\u0146\t\u001f\u0001 \u0005 \u0149\b \n \f \u014c"+
		"\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0155\b!\n"+
		"!\f!\u0158\t!\u0001!\u0001!\u0005!\u015c\b!\n!\f!\u015f\t!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0168\b\"\u0001#\u0001"+
		"#\u0003#\u016c\b#\u0001$\u0001$\u0001$\u0001$\u0005$\u0172\b$\n$\f$\u0175"+
		"\t$\u0003$\u0177\b$\u0001$\u0001$\u0001%\u0001%\u0003%\u017d\b%\u0001"+
		"%\u0001%\u0005%\u0181\b%\n%\f%\u0184\t%\u0001&\u0001&\u0001&\u0005&\u0189"+
		"\b&\n&\f&\u018c\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0192\b\'\n"+
		"\'\f\'\u0195\t\'\u0003\'\u0197\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0005(\u019e\b(\n(\f(\u01a1\t(\u0003(\u01a3\b(\u0001)\u0001)\u0001)"+
		"\u0001*\u0001*\u0001*\u0005*\u01ab\b*\n*\f*\u01ae\t*\u0001+\u0001+\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0000\u0000.\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\u0000\u0001\u0002\u0000\u0016\u001a\u001c\u001c\u01c0"+
		"\u0000]\u0001\u0000\u0000\u0000\u0002e\u0001\u0000\u0000\u0000\u0004j"+
		"\u0001\u0000\u0000\u0000\u0006n\u0001\u0000\u0000\u0000\bw\u0001\u0000"+
		"\u0000\u0000\n{\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000\u000e"+
		"\u0082\u0001\u0000\u0000\u0000\u0010\u008c\u0001\u0000\u0000\u0000\u0012"+
		"\u0090\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016"+
		"\u0097\u0001\u0000\u0000\u0000\u0018\u00a5\u0001\u0000\u0000\u0000\u001a"+
		"\u00a9\u0001\u0000\u0000\u0000\u001c\u00ad\u0001\u0000\u0000\u0000\u001e"+
		"\u00bb\u0001\u0000\u0000\u0000 \u00c2\u0001\u0000\u0000\u0000\"\u00cc"+
		"\u0001\u0000\u0000\u0000$\u00d0\u0001\u0000\u0000\u0000&\u00d8\u0001\u0000"+
		"\u0000\u0000(\u00db\u0001\u0000\u0000\u0000*\u00df\u0001\u0000\u0000\u0000"+
		",\u00e3\u0001\u0000\u0000\u0000.\u00ea\u0001\u0000\u0000\u00000\u00f6"+
		"\u0001\u0000\u0000\u00002\u00fb\u0001\u0000\u0000\u00004\u0107\u0001\u0000"+
		"\u0000\u00006\u010c\u0001\u0000\u0000\u00008\u0112\u0001\u0000\u0000\u0000"+
		":\u0116\u0001\u0000\u0000\u0000<\u0124\u0001\u0000\u0000\u0000>\u013d"+
		"\u0001\u0000\u0000\u0000@\u014a\u0001\u0000\u0000\u0000B\u014f\u0001\u0000"+
		"\u0000\u0000D\u0167\u0001\u0000\u0000\u0000F\u0169\u0001\u0000\u0000\u0000"+
		"H\u016d\u0001\u0000\u0000\u0000J\u017a\u0001\u0000\u0000\u0000L\u0185"+
		"\u0001\u0000\u0000\u0000N\u018d\u0001\u0000\u0000\u0000P\u01a2\u0001\u0000"+
		"\u0000\u0000R\u01a4\u0001\u0000\u0000\u0000T\u01a7\u0001\u0000\u0000\u0000"+
		"V\u01af\u0001\u0000\u0000\u0000X\u01b1\u0001\u0000\u0000\u0000Z\u01b3"+
		"\u0001\u0000\u0000\u0000\\^\u0003\u0002\u0001\u0000]\\\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_a\u0003\u0004"+
		"\u0002\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0003\b\u0004\u0000cd\u0005\u0000\u0000\u0001d\u0001"+
		"\u0001\u0000\u0000\u0000ef\u0005\u000b\u0000\u0000fg\u0003J%\u0000gh\u0005"+
		"\u0001\u0000\u0000h\u0003\u0001\u0000\u0000\u0000ik\u0003\u0006\u0003"+
		"\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0005\u0001\u0000\u0000\u0000"+
		"no\u0005\f\u0000\u0000or\u0003J%\u0000pq\u0005\u0002\u0000\u0000qs\u0005"+
		"\u001a\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0005\u0001\u0000\u0000u\u0007\u0001\u0000"+
		"\u0000\u0000vx\u0003\n\u0005\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\t\u0001"+
		"\u0000\u0000\u0000{|\u0003\f\u0006\u0000|}\u0003\u0016\u000b\u0000}\u000b"+
		"\u0001\u0000\u0000\u0000~\u0080\u0003\u000e\u0007\u0000\u007f\u0081\u0003"+
		"\u0014\n\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082\u0087\u0003\u0010\b"+
		"\u0000\u0083\u0084\u0005\u0003\u0000\u0000\u0084\u0085\u0003\u0012\t\u0000"+
		"\u0085\u0086\u0005\u0004\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000"+
		"\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u008d\u0003V+\u0000\u008a\u008d"+
		"\u0003J%\u0000\u008b\u008d\u0003N\'\u0000\u008c\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0011\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u00034\u001a\u0000\u0091\u0013\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0003R)\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0005\u0005\u0000\u0000\u0098\u009a\u0003\u0018\f\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005\u0006\u0000\u0000\u009c\u0017\u0001"+
		"\u0000\u0000\u0000\u009d\u00a6\u0003\b\u0004\u0000\u009e\u00a2\u0003\u001a"+
		"\r\u0000\u009f\u00a2\u0003\u001c\u000e\u0000\u00a0\u00a2\u0003(\u0014"+
		"\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u009d\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a6\u0019\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0003V+\u0000\u00a8\u00aa\u0003:\u001d\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0001\u0000\u0000\u00ac\u001b\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0003\u001e\u000f\u0000\u00ae\u00b4\u0003\u0016\u000b\u0000\u00af"+
		"\u00b0\u0003 \u0010\u0000\u00b0\u00b1\u0003\u0016\u000b\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003&\u0013\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u001d\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bc\u0005\u0010\u0000\u0000\u00bb\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0003\"\u0011\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u001f\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c6\u0005\u0011\u0000\u0000\u00c3\u00c5\u0005\u0010"+
		"\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cb\u0003\"\u0011\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb!\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd\u00ce\u0003$\u0012\u0000\u00ce"+
		"\u00cf\u0005\u0004\u0000\u0000\u00cf#\u0001\u0000\u0000\u0000\u00d0\u00d5"+
		"\u0003:\u001d\u0000\u00d1\u00d2\u0005\u0001\u0000\u0000\u00d2\u00d4\u0003"+
		":\u001d\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6%\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0007\u0000\u0000\u00d9\u00da\u0005\u0001\u0000"+
		"\u0000\u00da\'\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\r\u0000\u0000"+
		"\u00dc\u00dd\u0003*\u0015\u0000\u00dd\u00de\u0003,\u0016\u0000\u00de)"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0003\u0000\u0000\u00e0\u00e1"+
		"\u0003<\u001e\u0000\u00e1\u00e2\u0005\u0004\u0000\u0000\u00e2+\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0005\u0005\u0000\u0000\u00e4\u00e5\u0003.\u0017"+
		"\u0000\u00e5\u00e6\u0005\u0006\u0000\u0000\u00e6-\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e9\u00030\u0018\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ef\u00032\u0019\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u00030\u0018\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4/\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u000e"+
		"\u0000\u0000\u00f7\u00f8\u0003<\u001e\u0000\u00f8\u00f9\u0005\u0019\u0000"+
		"\u0000\u00f9\u00fa\u0003\u0018\f\u0000\u00fa1\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005\u000f\u0000\u0000\u00fc\u00fd\u0005\u0019\u0000\u0000"+
		"\u00fd\u00fe\u0003\u0018\f\u0000\u00fe3\u0001\u0000\u0000\u0000\u00ff"+
		"\u0104\u00036\u001b\u0000\u0100\u0101\u0005\u001d\u0000\u0000\u0101\u0103"+
		"\u00036\u001b\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106\u0001"+
		"\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0107\u00ff\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u01085\u0001\u0000\u0000\u0000\u0109\u010b\u0003V+"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000"+
		"\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u00038\u001c\u0000\u0110\u0111\u0003L&\u0000\u0111"+
		"7\u0001\u0000\u0000\u0000\u0112\u0114\u0003J%\u0000\u0113\u0115\u0005"+
		"\b\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u01159\u0001\u0000\u0000\u0000\u0116\u011f\u0003<\u001e\u0000"+
		"\u0117\u011c\u0003<\u001e\u0000\u0118\u0119\u0005\u001d\u0000\u0000\u0119"+
		"\u011b\u0003<\u001e\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011e"+
		"\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c"+
		"\u0001\u0000\u0000\u0000\u011f\u0117\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120;\u0001\u0000\u0000\u0000\u0121\u0123\u0003"+
		"Z-\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000"+
		"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0127\u0131\u0003>\u001f\u0000\u0128\u012a\u0003Z-\u0000\u0129"+
		"\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0003>\u001f\u0000\u012e\u0130"+
		"\u0001\u0000\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u0130\u0133"+
		"\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0001\u0000\u0000\u0000\u0132\u0137\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0134\u0136\u0003Z-\u0000\u0135\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138=\u0001\u0000\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013c\u0003X,\u0000\u013b"+
		"\u013a\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d"+
		"\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e"+
		"\u0140\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140"+
		"\u0144\u0003@ \u0000\u0141\u0143\u0003X,\u0000\u0142\u0141\u0001\u0000"+
		"\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145?\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0149\u0003V+\u0000\u0148"+
		"\u0147\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b"+
		"\u014d\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0003B!\u0000\u014eA\u0001\u0000\u0000\u0000\u014f\u0156\u0003"+
		"D\"\u0000\u0150\u0151\u0005\t\u0000\u0000\u0151\u0152\u0003<\u001e\u0000"+
		"\u0152\u0153\u0005\n\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154"+
		"\u0150\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156"+
		"\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"\u015d\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005\u0002\u0000\u0000\u015a\u015c\u0003>\u001f\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015eC\u0001"+
		"\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"\u0003\u0000\u0000\u0161\u0162\u0003<\u001e\u0000\u0162\u0163\u0005\u0004"+
		"\u0000\u0000\u0163\u0168\u0001\u0000\u0000\u0000\u0164\u0168\u0005\u0014"+
		"\u0000\u0000\u0165\u0168\u0005\u0013\u0000\u0000\u0166\u0168\u0003F#\u0000"+
		"\u0167\u0160\u0001\u0000\u0000\u0000\u0167\u0164\u0001\u0000\u0000\u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000"+
		"\u0168E\u0001\u0000\u0000\u0000\u0169\u016b\u0003J%\u0000\u016a\u016c"+
		"\u0003H$\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016cG\u0001\u0000\u0000\u0000\u016d\u0176\u0005\u0003\u0000"+
		"\u0000\u016e\u0173\u0003<\u001e\u0000\u016f\u0170\u0005\u001d\u0000\u0000"+
		"\u0170\u0172\u0003<\u001e\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0176\u016e\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178"+
		"\u0179\u0005\u0004\u0000\u0000\u0179I\u0001\u0000\u0000\u0000\u017a\u017c"+
		"\u0003L&\u0000\u017b\u017d\u0003N\'\u0000\u017c\u017b\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0182\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0005\t\u0000\u0000\u017f\u0181\u0005\n\u0000\u0000"+
		"\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000"+
		"\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183K\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185"+
		"\u018a\u0005\u0015\u0000\u0000\u0186\u0187\u0005\u0002\u0000\u0000\u0187"+
		"\u0189\u0005\u0015\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189"+
		"\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018bM\u0001\u0000\u0000\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018d\u0196\u0005\u0016\u0000\u0000\u018e\u0193"+
		"\u0003P(\u0000\u018f\u0190\u0005\u001d\u0000\u0000\u0190\u0192\u0003P"+
		"(\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000"+
		"\u0000\u0196\u018e\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0005\u0017\u0000"+
		"\u0000\u0199O\u0001\u0000\u0000\u0000\u019a\u01a3\u0003J%\u0000\u019b"+
		"\u019f\u0005\u0018\u0000\u0000\u019c\u019e\u0003R)\u0000\u019d\u019c\u0001"+
		"\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001"+
		"\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u019a\u0001"+
		"\u0000\u0000\u0000\u01a2\u019b\u0001\u0000\u0000\u0000\u01a3Q\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0003V+\u0000\u01a5\u01a6\u0003T*\u0000\u01a6"+
		"S\u0001\u0000\u0000\u0000\u01a7\u01ac\u0003J%\u0000\u01a8\u01a9\u0005"+
		"\u001d\u0000\u0000\u01a9\u01ab\u0003J%\u0000\u01aa\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01adU\u0001\u0000\u0000\u0000"+
		"\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\u0012\u0000\u0000"+
		"\u01b0W\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\u001b\u0000\u0000\u01b2"+
		"Y\u0001\u0000\u0000\u0000\u01b3\u01b4\u0007\u0000\u0000\u0000\u01b4[\u0001"+
		"\u0000\u0000\u00004]`lry\u0080\u0087\u008c\u008e\u0095\u0099\u00a1\u00a3"+
		"\u00a5\u00a9\u00b4\u00b8\u00bd\u00c0\u00c6\u00ca\u00d5\u00ea\u00ee\u00f3"+
		"\u0104\u0107\u010c\u0114\u011c\u011f\u0124\u012b\u0131\u0137\u013d\u0144"+
		"\u014a\u0156\u015d\u0167\u016b\u0173\u0176\u017c\u0182\u018a\u0193\u0196"+
		"\u019f\u01a2\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}