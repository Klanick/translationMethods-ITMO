// Generated from java-escape by ANTLR 4.11.1
package code.recognizer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GeneratorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, Regexp=14, CodeInsert=15, NonTermID=16, 
		TokenID=17, TransID=18, INDEX=19, WS=20, Unknown=21;
	public static final int
		RULE_generator = 0, RULE_importLine = 1, RULE_importSource = 2, RULE_grammarLine = 3, 
		RULE_lineRule = 4, RULE_nonTermDef = 5, RULE_argType = 6, RULE_resType = 7, 
		RULE_nonTermRules = 8, RULE_nonTermRule = 9, RULE_nonTermRuleElement = 10, 
		RULE_transCall = 11, RULE_argSeq = 12, RULE_resSeq = 13, RULE_seqInScope = 14, 
		RULE_elemInScope = 15, RULE_anyScope = 16, RULE_tokenDef = 17, RULE_tokenMode = 18, 
		RULE_transDef = 19, RULE_argIdSeq = 20, RULE_resIdSeq = 21, RULE_idSeqInScope = 22, 
		RULE_importKeyword = 23, RULE_grammarKeyword = 24, RULE_command = 25, 
		RULE_skipCommand = 26, RULE_hideCommand = 27, RULE_id = 28;
	private static String[] makeRuleNames() {
		return new String[] {
                "code/generator", "importLine", "importSource", "grammarLine", "lineRule",
			"nonTermDef", "argType", "resType", "nonTermRules", "nonTermRule", "nonTermRuleElement", 
			"transCall", "argSeq", "resSeq", "seqInScope", "elemInScope", "anyScope", 
			"tokenDef", "tokenMode", "transDef", "argIdSeq", "resIdSeq", "idSeqInScope", 
			"importKeyword", "grammarKeyword", "command", "skipCommand", "hideCommand", 
			"id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'#'", "'@'", "':'", "'('", "','", "')'", "'->'", 
			"'import'", "'grammar'", "'skip'", "'hide'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Regexp", "CodeInsert", "NonTermID", "TokenID", "TransID", 
			"INDEX", "WS", "Unknown"
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

	public GeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorContext extends ParserRuleContext {
		public GrammarLineContext grammarLine() {
			return getRuleContext(GrammarLineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GeneratorParser.EOF, 0); }
		public List<ImportLineContext> importLine() {
			return getRuleContexts(ImportLineContext.class);
		}
		public ImportLineContext importLine(int i) {
			return getRuleContext(ImportLineContext.class,i);
		}
		public List<LineRuleContext> lineRule() {
			return getRuleContexts(LineRuleContext.class);
		}
		public LineRuleContext lineRule(int i) {
			return getRuleContext(LineRuleContext.class,i);
		}
		public GeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterGenerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitGenerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneratorContext generator() throws RecognitionException {
		GeneratorContext _localctx = new GeneratorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_generator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(58);
				importLine();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			grammarLine();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0) {
				{
				{
				setState(65);
				lineRule();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
	public static class ImportLineContext extends ParserRuleContext {
		public ImportKeywordContext importKeyword() {
			return getRuleContext(ImportKeywordContext.class,0);
		}
		public ImportSourceContext importSource() {
			return getRuleContext(ImportSourceContext.class,0);
		}
		public ImportLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterImportLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitImportLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitImportLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportLineContext importLine() throws RecognitionException {
		ImportLineContext _localctx = new ImportLineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			importKeyword();
			setState(74);
			importSource();
			setState(75);
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
	public static class ImportSourceContext extends ParserRuleContext {
		public List<TerminalNode> NonTermID() { return getTokens(GeneratorParser.NonTermID); }
		public TerminalNode NonTermID(int i) {
			return getToken(GeneratorParser.NonTermID, i);
		}
		public List<TerminalNode> TokenID() { return getTokens(GeneratorParser.TokenID); }
		public TerminalNode TokenID(int i) {
			return getToken(GeneratorParser.TokenID, i);
		}
		public ImportSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterImportSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitImportSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitImportSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSourceContext importSource() throws RecognitionException {
		ImportSourceContext _localctx = new ImportSourceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 196612L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 196612L) != 0 );
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
	public static class GrammarLineContext extends ParserRuleContext {
		public GrammarKeywordContext grammarKeyword() {
			return getRuleContext(GrammarKeywordContext.class,0);
		}
		public TerminalNode TokenID() { return getToken(GeneratorParser.TokenID, 0); }
		public TerminalNode CodeInsert() { return getToken(GeneratorParser.CodeInsert, 0); }
		public GrammarLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterGrammarLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitGrammarLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitGrammarLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarLineContext grammarLine() throws RecognitionException {
		GrammarLineContext _localctx = new GrammarLineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_grammarLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			grammarKeyword();
			setState(83);
			match(TokenID);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CodeInsert) {
				{
				setState(84);
				match(CodeInsert);
				}
			}

			setState(87);
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
	public static class LineRuleContext extends ParserRuleContext {
		public NonTermDefContext nonTermDef() {
			return getRuleContext(NonTermDefContext.class,0);
		}
		public TokenDefContext tokenDef() {
			return getRuleContext(TokenDefContext.class,0);
		}
		public TransDefContext transDef() {
			return getRuleContext(TransDefContext.class,0);
		}
		public LineRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterLineRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitLineRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitLineRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineRuleContext lineRule() throws RecognitionException {
		LineRuleContext _localctx = new LineRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lineRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonTermID:
				{
				setState(89);
				nonTermDef();
				}
				break;
			case TokenID:
				{
				setState(90);
				tokenDef();
				}
				break;
			case TransID:
				{
				setState(91);
				transDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(94);
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
	public static class NonTermDefContext extends ParserRuleContext {
		public TerminalNode NonTermID() { return getToken(GeneratorParser.NonTermID, 0); }
		public NonTermRulesContext nonTermRules() {
			return getRuleContext(NonTermRulesContext.class,0);
		}
		public ArgTypeContext argType() {
			return getRuleContext(ArgTypeContext.class,0);
		}
		public ResTypeContext resType() {
			return getRuleContext(ResTypeContext.class,0);
		}
		public NonTermDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTermDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterNonTermDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitNonTermDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitNonTermDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTermDefContext nonTermDef() throws RecognitionException {
		NonTermDefContext _localctx = new NonTermDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nonTermDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(NonTermID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(97);
				argType();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(100);
				resType();
				}
			}

			setState(103);
			nonTermRules();
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
	public static class ArgTypeContext extends ParserRuleContext {
		public AnyScopeContext anyScope() {
			return getRuleContext(AnyScopeContext.class,0);
		}
		public ArgTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterArgType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitArgType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitArgType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgTypeContext argType() throws RecognitionException {
		ArgTypeContext _localctx = new ArgTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__2);
			setState(106);
			anyScope();
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
	public static class ResTypeContext extends ParserRuleContext {
		public AnyScopeContext anyScope() {
			return getRuleContext(AnyScopeContext.class,0);
		}
		public ResTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterResType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitResType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitResType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResTypeContext resType() throws RecognitionException {
		ResTypeContext _localctx = new ResTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_resType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__3);
			setState(109);
			anyScope();
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
	public static class NonTermRulesContext extends ParserRuleContext {
		public List<NonTermRuleContext> nonTermRule() {
			return getRuleContexts(NonTermRuleContext.class);
		}
		public NonTermRuleContext nonTermRule(int i) {
			return getRuleContext(NonTermRuleContext.class,i);
		}
		public NonTermRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTermRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterNonTermRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitNonTermRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitNonTermRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTermRulesContext nonTermRules() throws RecognitionException {
		NonTermRulesContext _localctx = new NonTermRulesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonTermRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(111);
				match(T__4);
				setState(112);
				nonTermRule();
				}
				}
				setState(117);
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
	public static class NonTermRuleContext extends ParserRuleContext {
		public List<NonTermRuleElementContext> nonTermRuleElement() {
			return getRuleContexts(NonTermRuleElementContext.class);
		}
		public NonTermRuleElementContext nonTermRuleElement(int i) {
			return getRuleContext(NonTermRuleElementContext.class,i);
		}
		public NonTermRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTermRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterNonTermRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitNonTermRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitNonTermRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTermRuleContext nonTermRule() throws RecognitionException {
		NonTermRuleContext _localctx = new NonTermRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nonTermRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0) {
				{
				{
				setState(118);
				nonTermRuleElement();
				}
				}
				setState(123);
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
	public static class NonTermRuleElementContext extends ParserRuleContext {
		public TerminalNode NonTermID() { return getToken(GeneratorParser.NonTermID, 0); }
		public TerminalNode TokenID() { return getToken(GeneratorParser.TokenID, 0); }
		public TransCallContext transCall() {
			return getRuleContext(TransCallContext.class,0);
		}
		public TerminalNode CodeInsert() { return getToken(GeneratorParser.CodeInsert, 0); }
		public NonTermRuleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTermRuleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterNonTermRuleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitNonTermRuleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitNonTermRuleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTermRuleElementContext nonTermRuleElement() throws RecognitionException {
		NonTermRuleElementContext _localctx = new NonTermRuleElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nonTermRuleElement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonTermID:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(NonTermID);
				}
				break;
			case TokenID:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(TokenID);
				}
				break;
			case TransID:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				transCall();
				}
				break;
			case CodeInsert:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(CodeInsert);
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
	public static class TransCallContext extends ParserRuleContext {
		public TerminalNode TransID() { return getToken(GeneratorParser.TransID, 0); }
		public ArgSeqContext argSeq() {
			return getRuleContext(ArgSeqContext.class,0);
		}
		public ResSeqContext resSeq() {
			return getRuleContext(ResSeqContext.class,0);
		}
		public TransCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterTransCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitTransCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitTransCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransCallContext transCall() throws RecognitionException {
		TransCallContext _localctx = new TransCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_transCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TransID);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(131);
				argSeq();
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(134);
				resSeq();
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
	public static class ArgSeqContext extends ParserRuleContext {
		public SeqInScopeContext seqInScope() {
			return getRuleContext(SeqInScopeContext.class,0);
		}
		public ArgSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterArgSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitArgSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitArgSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgSeqContext argSeq() throws RecognitionException {
		ArgSeqContext _localctx = new ArgSeqContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argSeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__2);
			setState(138);
			seqInScope();
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
	public static class ResSeqContext extends ParserRuleContext {
		public SeqInScopeContext seqInScope() {
			return getRuleContext(SeqInScopeContext.class,0);
		}
		public ResSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterResSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitResSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitResSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResSeqContext resSeq() throws RecognitionException {
		ResSeqContext _localctx = new ResSeqContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_resSeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__3);
			setState(141);
			seqInScope();
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
	public static class SeqInScopeContext extends ParserRuleContext {
		public List<ElemInScopeContext> elemInScope() {
			return getRuleContexts(ElemInScopeContext.class);
		}
		public ElemInScopeContext elemInScope(int i) {
			return getRuleContext(ElemInScopeContext.class,i);
		}
		public SeqInScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqInScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterSeqInScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitSeqInScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitSeqInScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqInScopeContext seqInScope() throws RecognitionException {
		SeqInScopeContext _localctx = new SeqInScopeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_seqInScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__5);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4193918L) != 0) {
				{
				setState(144);
				elemInScope();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(145);
					match(T__6);
					setState(146);
					elemInScope();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(154);
			match(T__7);
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
	public static class ElemInScopeContext extends ParserRuleContext {
		public List<AnyScopeContext> anyScope() {
			return getRuleContexts(AnyScopeContext.class);
		}
		public AnyScopeContext anyScope(int i) {
			return getRuleContext(AnyScopeContext.class,i);
		}
		public ElemInScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemInScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterElemInScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitElemInScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitElemInScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemInScopeContext elemInScope() throws RecognitionException {
		ElemInScopeContext _localctx = new ElemInScopeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elemInScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case Regexp:
				case CodeInsert:
				case NonTermID:
				case TokenID:
				case TransID:
				case INDEX:
				case WS:
				case Unknown:
					{
					setState(156);
					_la = _input.LA(1);
					if ( _la <= 0 || (((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__5:
					{
					setState(157);
					anyScope();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 4193918L) != 0 );
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
	public static class AnyScopeContext extends ParserRuleContext {
		public List<AnyScopeContext> anyScope() {
			return getRuleContexts(AnyScopeContext.class);
		}
		public AnyScopeContext anyScope(int i) {
			return getRuleContext(AnyScopeContext.class,i);
		}
		public AnyScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterAnyScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitAnyScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitAnyScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyScopeContext anyScope() throws RecognitionException {
		AnyScopeContext _localctx = new AnyScopeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_anyScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__5);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4194046L) != 0) {
				{
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__6:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case Regexp:
				case CodeInsert:
				case NonTermID:
				case TokenID:
				case TransID:
				case INDEX:
				case WS:
				case Unknown:
					{
					setState(163);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__5 || _la==T__7) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case T__5:
					{
					setState(164);
					anyScope();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(T__7);
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
	public static class TokenDefContext extends ParserRuleContext {
		public TerminalNode TokenID() { return getToken(GeneratorParser.TokenID, 0); }
		public TerminalNode Regexp() { return getToken(GeneratorParser.Regexp, 0); }
		public TokenModeContext tokenMode() {
			return getRuleContext(TokenModeContext.class,0);
		}
		public TokenDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterTokenDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitTokenDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitTokenDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenDefContext tokenDef() throws RecognitionException {
		TokenDefContext _localctx = new TokenDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tokenDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(TokenID);
			setState(173);
			match(T__4);
			setState(174);
			match(Regexp);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(175);
				tokenMode();
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
	public static class TokenModeContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TokenModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterTokenMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitTokenMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitTokenMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenModeContext tokenMode() throws RecognitionException {
		TokenModeContext _localctx = new TokenModeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tokenMode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__8);
			setState(179);
			command();
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
	public static class TransDefContext extends ParserRuleContext {
		public TerminalNode TransID() { return getToken(GeneratorParser.TransID, 0); }
		public TerminalNode CodeInsert() { return getToken(GeneratorParser.CodeInsert, 0); }
		public ArgIdSeqContext argIdSeq() {
			return getRuleContext(ArgIdSeqContext.class,0);
		}
		public ResIdSeqContext resIdSeq() {
			return getRuleContext(ResIdSeqContext.class,0);
		}
		public TransDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterTransDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitTransDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitTransDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransDefContext transDef() throws RecognitionException {
		TransDefContext _localctx = new TransDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_transDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(TransID);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(182);
				argIdSeq();
				}
			}

			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(185);
				resIdSeq();
				}
			}

			setState(188);
			match(T__4);
			setState(189);
			match(CodeInsert);
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
	public static class ArgIdSeqContext extends ParserRuleContext {
		public IdSeqInScopeContext idSeqInScope() {
			return getRuleContext(IdSeqInScopeContext.class,0);
		}
		public ArgIdSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argIdSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterArgIdSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitArgIdSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitArgIdSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgIdSeqContext argIdSeq() throws RecognitionException {
		ArgIdSeqContext _localctx = new ArgIdSeqContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argIdSeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__2);
			setState(192);
			idSeqInScope();
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
	public static class ResIdSeqContext extends ParserRuleContext {
		public IdSeqInScopeContext idSeqInScope() {
			return getRuleContext(IdSeqInScopeContext.class,0);
		}
		public ResIdSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resIdSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterResIdSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitResIdSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitResIdSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResIdSeqContext resIdSeq() throws RecognitionException {
		ResIdSeqContext _localctx = new ResIdSeqContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_resIdSeq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__3);
			setState(195);
			idSeqInScope();
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
	public static class IdSeqInScopeContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public IdSeqInScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSeqInScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterIdSeqInScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitIdSeqInScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitIdSeqInScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdSeqInScopeContext idSeqInScope() throws RecognitionException {
		IdSeqInScopeContext _localctx = new IdSeqInScopeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_idSeqInScope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__5);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NonTermID || _la==TokenID) {
				{
				setState(198);
				id();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(199);
					match(T__6);
					setState(200);
					id();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(208);
			match(T__7);
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
	public static class ImportKeywordContext extends ParserRuleContext {
		public ImportKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterImportKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitImportKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitImportKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportKeywordContext importKeyword() throws RecognitionException {
		ImportKeywordContext _localctx = new ImportKeywordContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_importKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__9);
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
	public static class GrammarKeywordContext extends ParserRuleContext {
		public GrammarKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterGrammarKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitGrammarKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitGrammarKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarKeywordContext grammarKeyword() throws RecognitionException {
		GrammarKeywordContext _localctx = new GrammarKeywordContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_grammarKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__10);
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
	public static class CommandContext extends ParserRuleContext {
		public SkipCommandContext skipCommand() {
			return getRuleContext(SkipCommandContext.class,0);
		}
		public HideCommandContext hideCommand() {
			return getRuleContext(HideCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_command);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				skipCommand();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				hideCommand();
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
	public static class SkipCommandContext extends ParserRuleContext {
		public SkipCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterSkipCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitSkipCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitSkipCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipCommandContext skipCommand() throws RecognitionException {
		SkipCommandContext _localctx = new SkipCommandContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_skipCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__11);
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
	public static class HideCommandContext extends ParserRuleContext {
		public HideCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hideCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterHideCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitHideCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitHideCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HideCommandContext hideCommand() throws RecognitionException {
		HideCommandContext _localctx = new HideCommandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_hideCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__12);
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode NonTermID() { return getToken(GeneratorParser.NonTermID, 0); }
		public TerminalNode TokenID() { return getToken(GeneratorParser.TokenID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GeneratorVisitor ) return ((GeneratorVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==NonTermID || _la==TokenID) ) {
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
		"\u0004\u0001\u0015\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000"+
		"\f\u0000?\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000C\b\u0000\n\u0000"+
		"\f\u0000F\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0004\u0002O\b\u0002\u000b\u0002\f\u0002"+
		"P\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005c\b\u0005"+
		"\u0001\u0005\u0003\u0005f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\br\b\b\n\b\f\bu\t\b\u0001\t\u0005\tx\b\t\n\t\f\t{\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u0081\b\n\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0085\b\u000b\u0001\u000b\u0003\u000b\u0088\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0094\b\u000e\n\u000e\f\u000e\u0097\t\u000e\u0003"+
		"\u000e\u0099\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u009f\b\u000f\u000b\u000f\f\u000f\u00a0\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u00a6\b\u0010\n\u0010\f\u0010\u00a9\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00b1\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00b8\b\u0013\u0001\u0013\u0003\u0013\u00bb\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00ca\b\u0016\n\u0016\f\u0016\u00cd\t\u0016\u0003"+
		"\u0016\u00cf\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u00d9\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0004\u0002\u0000"+
		"\u0002\u0002\u0010\u0011\u0001\u0000\u0006\b\u0002\u0000\u0006\u0006\b"+
		"\b\u0001\u0000\u0010\u0011\u00de\u0000=\u0001\u0000\u0000\u0000\u0002"+
		"I\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006R\u0001"+
		"\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000"+
		"\fi\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010s\u0001"+
		"\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014\u0080\u0001\u0000"+
		"\u0000\u0000\u0016\u0082\u0001\u0000\u0000\u0000\u0018\u0089\u0001\u0000"+
		"\u0000\u0000\u001a\u008c\u0001\u0000\u0000\u0000\u001c\u008f\u0001\u0000"+
		"\u0000\u0000\u001e\u009e\u0001\u0000\u0000\u0000 \u00a2\u0001\u0000\u0000"+
		"\u0000\"\u00ac\u0001\u0000\u0000\u0000$\u00b2\u0001\u0000\u0000\u0000"+
		"&\u00b5\u0001\u0000\u0000\u0000(\u00bf\u0001\u0000\u0000\u0000*\u00c2"+
		"\u0001\u0000\u0000\u0000,\u00c5\u0001\u0000\u0000\u0000.\u00d2\u0001\u0000"+
		"\u0000\u00000\u00d4\u0001\u0000\u0000\u00002\u00d8\u0001\u0000\u0000\u0000"+
		"4\u00da\u0001\u0000\u0000\u00006\u00dc\u0001\u0000\u0000\u00008\u00de"+
		"\u0001\u0000\u0000\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@D\u0003"+
		"\u0006\u0003\u0000AC\u0003\b\u0004\u0000BA\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\u0000\u0000"+
		"\u0001H\u0001\u0001\u0000\u0000\u0000IJ\u0003.\u0017\u0000JK\u0003\u0004"+
		"\u0002\u0000KL\u0005\u0001\u0000\u0000L\u0003\u0001\u0000\u0000\u0000"+
		"MO\u0007\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0005\u0001"+
		"\u0000\u0000\u0000RS\u00030\u0018\u0000SU\u0005\u0011\u0000\u0000TV\u0005"+
		"\u000f\u0000\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WX\u0005\u0001\u0000\u0000X\u0007\u0001\u0000"+
		"\u0000\u0000Y]\u0003\n\u0005\u0000Z]\u0003\"\u0011\u0000[]\u0003&\u0013"+
		"\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\u0001\u0000\u0000"+
		"_\t\u0001\u0000\u0000\u0000`b\u0005\u0010\u0000\u0000ac\u0003\f\u0006"+
		"\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000df\u0003\u000e\u0007\u0000ed\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0003\u0010\b\u0000h\u000b"+
		"\u0001\u0000\u0000\u0000ij\u0005\u0003\u0000\u0000jk\u0003 \u0010\u0000"+
		"k\r\u0001\u0000\u0000\u0000lm\u0005\u0004\u0000\u0000mn\u0003 \u0010\u0000"+
		"n\u000f\u0001\u0000\u0000\u0000op\u0005\u0005\u0000\u0000pr\u0003\u0012"+
		"\t\u0000qo\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000t\u0011\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vx\u0003\u0014\n\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z\u0013\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|\u0081"+
		"\u0005\u0010\u0000\u0000}\u0081\u0005\u0011\u0000\u0000~\u0081\u0003\u0016"+
		"\u000b\u0000\u007f\u0081\u0005\u000f\u0000\u0000\u0080|\u0001\u0000\u0000"+
		"\u0000\u0080}\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0015\u0001\u0000\u0000\u0000\u0082"+
		"\u0084\u0005\u0012\u0000\u0000\u0083\u0085\u0003\u0018\f\u0000\u0084\u0083"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u001a\r\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0017\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0003"+
		"\u001c\u000e\u0000\u008b\u0019\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u0004\u0000\u0000\u008d\u008e\u0003\u001c\u000e\u0000\u008e\u001b\u0001"+
		"\u0000\u0000\u0000\u008f\u0098\u0005\u0006\u0000\u0000\u0090\u0095\u0003"+
		"\u001e\u000f\u0000\u0091\u0092\u0005\u0007\u0000\u0000\u0092\u0094\u0003"+
		"\u001e\u000f\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u0090\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\b\u0000\u0000\u009b\u001d\u0001\u0000\u0000\u0000\u009c\u009f\b\u0001"+
		"\u0000\u0000\u009d\u009f\u0003 \u0010\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u001f\u0001\u0000\u0000\u0000\u00a2\u00a7\u0005\u0006\u0000"+
		"\u0000\u00a3\u00a6\b\u0002\u0000\u0000\u00a4\u00a6\u0003 \u0010\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab"+
		"!\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0011\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0005\u0000\u0000\u00ae\u00b0\u0005\u000e\u0000\u0000\u00af\u00b1"+
		"\u0003$\u0012\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1#\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\t"+
		"\u0000\u0000\u00b3\u00b4\u00032\u0019\u0000\u00b4%\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b7\u0005\u0012\u0000\u0000\u00b6\u00b8\u0003(\u0014\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003*\u0015\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0005\u0000\u0000\u00bd\u00be"+
		"\u0005\u000f\u0000\u0000\u00be\'\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0003\u0000\u0000\u00c0\u00c1\u0003,\u0016\u0000\u00c1)\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0004\u0000\u0000\u00c3\u00c4\u0003,\u0016\u0000"+
		"\u00c4+\u0001\u0000\u0000\u0000\u00c5\u00ce\u0005\u0006\u0000\u0000\u00c6"+
		"\u00cb\u00038\u001c\u0000\u00c7\u00c8\u0005\u0007\u0000\u0000\u00c8\u00ca"+
		"\u00038\u001c\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00ce\u00c6\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\b\u0000\u0000\u00d1-\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\n\u0000"+
		"\u0000\u00d3/\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u000b\u0000\u0000"+
		"\u00d51\u0001\u0000\u0000\u0000\u00d6\u00d9\u00034\u001a\u0000\u00d7\u00d9"+
		"\u00036\u001b\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d93\u0001\u0000\u0000\u0000\u00da\u00db\u0005\f"+
		"\u0000\u0000\u00db5\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\r\u0000"+
		"\u0000\u00dd7\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0003\u0000\u0000"+
		"\u00df9\u0001\u0000\u0000\u0000\u0018=DPU\\besy\u0080\u0084\u0087\u0095"+
		"\u0098\u009e\u00a0\u00a5\u00a7\u00b0\u00b7\u00ba\u00cb\u00ce\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}