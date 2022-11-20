// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pascalGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, CHAR=2, IF=3, ELSE=4, INT=5, BOOLEAN=6, REPEAT=7, FOR=8, UNTIL=9, 
		AND=10, OR=11, NOT=12, VAR=13, READ=14, WRITE=15, BEGIN=16, END=17, WHILE=18, 
		THEN=19, DO=20, TO=21, OPERACIONESSUMAS=22, OPERACIONESMUL=23, USES=24, 
		OPERADORES=25, ASSIGN=26, LBRA=27, RBRA=28, LPAR=29, RPAR=30, PUNTOCOMA=31, 
		COMA=32, DOSPUNTOS=33, ID=34, NUMBER=35, WS=36, STRING=37, COMMENT=38, 
		ErrorCharacter=39;
	public static final int
		RULE_start = 0, RULE_bloqueVariables = 1, RULE_declaracion = 2, RULE_statements = 3, 
		RULE_asignacion = 4, RULE_bloqueIf = 5, RULE_bloqueElse = 6, RULE_bloqueFor = 7, 
		RULE_bloqueWhile = 8, RULE_bloqueRepeat = 9, RULE_leerVariable = 10, RULE_escribirVariable = 11, 
		RULE_condiciones = 12, RULE_expr = 13, RULE_tipo = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "bloqueVariables", "declaracion", "statements", "asignacion", 
			"bloqueIf", "bloqueElse", "bloqueFor", "bloqueWhile", "bloqueRepeat", 
			"leerVariable", "escribirVariable", "condiciones", "expr", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'char'", "'if'", "'else'", "'integer'", "'boolean'", 
			"'repeat'", "'for'", "'until'", "'and'", "'or'", "'not'", "'Var'", "'read'", 
			null, null, null, "'while'", "'then'", "'do'", "'to'", null, null, "'uses'", 
			null, "':='", "'{'", "'}'", "'('", "')'", "';'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "CHAR", "IF", "ELSE", "INT", "BOOLEAN", "REPEAT", "FOR", 
			"UNTIL", "AND", "OR", "NOT", "VAR", "READ", "WRITE", "BEGIN", "END", 
			"WHILE", "THEN", "DO", "TO", "OPERACIONESSUMAS", "OPERACIONESMUL", "USES", 
			"OPERADORES", "ASSIGN", "LBRA", "RBRA", "LPAR", "RPAR", "PUNTOCOMA", 
			"COMA", "DOSPUNTOS", "ID", "NUMBER", "WS", "STRING", "COMMENT", "ErrorCharacter"
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

	public pascalGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(pascalGrammarParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(pascalGrammarParser.ID, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pascalGrammarParser.PUNTOCOMA, 0); }
		public BloqueVariablesContext bloqueVariables() {
			return getRuleContext(BloqueVariablesContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(pascalGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalGrammarParser.END, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(PROGRAM);
			setState(31);
			match(ID);
			setState(32);
			match(PUNTOCOMA);
			setState(33);
			bloqueVariables();
			setState(34);
			match(BEGIN);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17180180872L) != 0) {
				{
				{
				setState(35);
				statements();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(END);
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
	public static class BloqueVariablesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(pascalGrammarParser.VAR, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public BloqueVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterBloqueVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitBloqueVariables(this);
		}
	}

	public final BloqueVariablesContext bloqueVariables() throws RecognitionException {
		BloqueVariablesContext _localctx = new BloqueVariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloqueVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(VAR);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(44);
				declaracion();
				}
				}
				setState(49);
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
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalGrammarParser.ID, 0); }
		public TerminalNode COMA() { return getToken(pascalGrammarParser.COMA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(pascalGrammarParser.DOSPUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pascalGrammarParser.PUNTOCOMA, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(ID);
				setState(51);
				match(COMA);
				setState(52);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(ID);
				setState(54);
				match(DOSPUNTOS);
				setState(55);
				tipo();
				setState(56);
				match(PUNTOCOMA);
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
	public static class StatementsContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public BloqueIfContext bloqueIf() {
			return getRuleContext(BloqueIfContext.class,0);
		}
		public BloqueForContext bloqueFor() {
			return getRuleContext(BloqueForContext.class,0);
		}
		public LeerVariableContext leerVariable() {
			return getRuleContext(LeerVariableContext.class,0);
		}
		public EscribirVariableContext escribirVariable() {
			return getRuleContext(EscribirVariableContext.class,0);
		}
		public BloqueWhileContext bloqueWhile() {
			return getRuleContext(BloqueWhileContext.class,0);
		}
		public BloqueRepeatContext bloqueRepeat() {
			return getRuleContext(BloqueRepeatContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				bloqueIf();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				bloqueFor();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				leerVariable();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				escribirVariable();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				bloqueWhile();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				bloqueRepeat();
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(pascalGrammarParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(pascalGrammarParser.NUMBER, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pascalGrammarParser.PUNTOCOMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ID);
				setState(70);
				match(ASSIGN);
				setState(71);
				match(NUMBER);
				setState(72);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(ID);
				setState(74);
				match(ASSIGN);
				setState(75);
				expr(0);
				setState(76);
				match(PUNTOCOMA);
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
	public static class BloqueIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pascalGrammarParser.IF, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode THEN() { return getToken(pascalGrammarParser.THEN, 0); }
		public BloqueElseContext bloqueElse() {
			return getRuleContext(BloqueElseContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public BloqueIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterBloqueIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitBloqueIf(this);
		}
	}

	public final BloqueIfContext bloqueIf() throws RecognitionException {
		BloqueIfContext _localctx = new BloqueIfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloqueIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IF);
			setState(81);
			condiciones();
			setState(82);
			match(THEN);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					statements();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(89);
			bloqueElse();
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
	public static class BloqueElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(pascalGrammarParser.ELSE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public BloqueIfContext bloqueIf() {
			return getRuleContext(BloqueIfContext.class,0);
		}
		public BloqueElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterBloqueElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitBloqueElse(this);
		}
	}

	public final BloqueElseContext bloqueElse() throws RecognitionException {
		BloqueElseContext _localctx = new BloqueElseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloqueElse);
		try {
			int _alt;
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ELSE);
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						statements();
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ELSE);
				setState(99);
				bloqueIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class BloqueForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pascalGrammarParser.FOR, 0); }
		public TerminalNode ID() { return getToken(pascalGrammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(pascalGrammarParser.ASSIGN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(pascalGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(pascalGrammarParser.NUMBER, i);
		}
		public TerminalNode TO() { return getToken(pascalGrammarParser.TO, 0); }
		public TerminalNode DO() { return getToken(pascalGrammarParser.DO, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public BloqueForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterBloqueFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitBloqueFor(this);
		}
	}

	public final BloqueForContext bloqueFor() throws RecognitionException {
		BloqueForContext _localctx = new BloqueForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloqueFor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(FOR);
			setState(104);
			match(ID);
			setState(105);
			match(ASSIGN);
			setState(106);
			match(NUMBER);
			setState(107);
			match(TO);
			setState(108);
			match(NUMBER);
			setState(109);
			match(DO);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					statements();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class BloqueWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(pascalGrammarParser.WHILE, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascalGrammarParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(pascalGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalGrammarParser.END, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pascalGrammarParser.PUNTOCOMA, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public BloqueWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterBloqueWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitBloqueWhile(this);
		}
	}

	public final BloqueWhileContext bloqueWhile() throws RecognitionException {
		BloqueWhileContext _localctx = new BloqueWhileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloqueWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(WHILE);
			setState(117);
			condiciones();
			setState(118);
			match(DO);
			setState(119);
			match(BEGIN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17180180872L) != 0) {
				{
				{
				setState(120);
				statements();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(END);
			setState(127);
			match(PUNTOCOMA);
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
	public static class BloqueRepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(pascalGrammarParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(pascalGrammarParser.UNTIL, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pascalGrammarParser.PUNTOCOMA, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public BloqueRepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueRepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterBloqueRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitBloqueRepeat(this);
		}
	}

	public final BloqueRepeatContext bloqueRepeat() throws RecognitionException {
		BloqueRepeatContext _localctx = new BloqueRepeatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloqueRepeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(REPEAT);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17180180872L) != 0) {
				{
				{
				setState(130);
				statements();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(UNTIL);
			setState(137);
			condiciones();
			setState(138);
			match(PUNTOCOMA);
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
	public static class LeerVariableContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(pascalGrammarParser.READ, 0); }
		public TerminalNode LPAR() { return getToken(pascalGrammarParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(pascalGrammarParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(pascalGrammarParser.RPAR, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pascalGrammarParser.PUNTOCOMA, 0); }
		public LeerVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterLeerVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitLeerVariable(this);
		}
	}

	public final LeerVariableContext leerVariable() throws RecognitionException {
		LeerVariableContext _localctx = new LeerVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_leerVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(READ);
			setState(141);
			match(LPAR);
			setState(142);
			match(ID);
			setState(143);
			match(RPAR);
			setState(144);
			match(PUNTOCOMA);
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
	public static class EscribirVariableContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(pascalGrammarParser.WRITE, 0); }
		public TerminalNode LPAR() { return getToken(pascalGrammarParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(pascalGrammarParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(pascalGrammarParser.RPAR, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pascalGrammarParser.PUNTOCOMA, 0); }
		public TerminalNode STRING() { return getToken(pascalGrammarParser.STRING, 0); }
		public TerminalNode COMA() { return getToken(pascalGrammarParser.COMA, 0); }
		public EscribirVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribirVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterEscribirVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitEscribirVariable(this);
		}
	}

	public final EscribirVariableContext escribirVariable() throws RecognitionException {
		EscribirVariableContext _localctx = new EscribirVariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_escribirVariable);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(WRITE);
				setState(147);
				match(LPAR);
				setState(148);
				match(ID);
				setState(149);
				match(RPAR);
				setState(150);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(WRITE);
				setState(152);
				match(LPAR);
				setState(153);
				match(STRING);
				setState(154);
				match(COMA);
				setState(155);
				match(ID);
				setState(156);
				match(RPAR);
				setState(157);
				match(PUNTOCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(WRITE);
				setState(159);
				match(LPAR);
				setState(160);
				match(STRING);
				setState(161);
				match(RPAR);
				setState(162);
				match(PUNTOCOMA);
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
	public static class CondicionesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pascalGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pascalGrammarParser.ID, i);
		}
		public TerminalNode OPERADORES() { return getToken(pascalGrammarParser.OPERADORES, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(pascalGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(pascalGrammarParser.NUMBER, i);
		}
		public CondicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterCondiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitCondiciones(this);
		}
	}

	public final CondicionesContext condiciones() throws RecognitionException {
		CondicionesContext _localctx = new CondicionesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condiciones);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(ID);
				setState(166);
				match(OPERADORES);
				setState(167);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(NUMBER);
				setState(169);
				match(OPERADORES);
				setState(170);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(ID);
				setState(172);
				match(OPERADORES);
				setState(173);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(NUMBER);
				setState(175);
				match(OPERADORES);
				setState(176);
				match(ID);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pascalGrammarParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalGrammarParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(pascalGrammarParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(pascalGrammarParser.RPAR, 0); }
		public TerminalNode OPERACIONESMUL() { return getToken(pascalGrammarParser.OPERACIONESMUL, 0); }
		public TerminalNode OPERACIONESSUMAS() { return getToken(pascalGrammarParser.OPERACIONESSUMAS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(180);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(181);
				match(ID);
				}
				break;
			case LPAR:
				{
				setState(182);
				match(LPAR);
				setState(183);
				expr(0);
				setState(184);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						match(OPERACIONESMUL);
						setState(190);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						match(OPERACIONESSUMAS);
						setState(193);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(pascalGrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(pascalGrammarParser.CHAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalGrammarListener ) ((pascalGrammarListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==CHAR || _la==INT) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u00ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b\u0000"+
		"\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002;\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006^\b\u0006"+
		"\n\u0006\f\u0006a\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"f\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007p\b\u0007\n\u0007\f\u0007"+
		"s\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bz\b\b\n\b\f\b"+
		"}\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u0084\b\t\n\t\f"+
		"\t\u0087\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00a4\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b2"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bb"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c3\b\r"+
		"\n\r\f\r\u00c6\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0001\u001a"+
		"\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u0000\u0001\u0002\u0000\u0002\u0002\u0005\u0005\u00d4\u0000"+
		"\u001e\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004:\u0001"+
		"\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000"+
		"\u0000\nP\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000eg\u0001"+
		"\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000"+
		"\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000\u0016\u00a3\u0001\u0000"+
		"\u0000\u0000\u0018\u00b1\u0001\u0000\u0000\u0000\u001a\u00ba\u0001\u0000"+
		"\u0000\u0000\u001c\u00c7\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001"+
		"\u0000\u0000\u001f \u0005\"\u0000\u0000 !\u0005\u001f\u0000\u0000!\"\u0003"+
		"\u0002\u0001\u0000\"&\u0005\u0010\u0000\u0000#%\u0003\u0006\u0003\u0000"+
		"$#\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)*\u0005\u0011\u0000\u0000*\u0001\u0001\u0000\u0000\u0000"+
		"+/\u0005\r\u0000\u0000,.\u0003\u0004\u0002\u0000-,\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u00000\u0003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005"+
		"\"\u0000\u000034\u0005 \u0000\u00004;\u0003\u0004\u0002\u000056\u0005"+
		"\"\u0000\u000067\u0005!\u0000\u000078\u0003\u001c\u000e\u000089\u0005"+
		"\u001f\u0000\u00009;\u0001\u0000\u0000\u0000:2\u0001\u0000\u0000\u0000"+
		":5\u0001\u0000\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<D\u0003\b\u0004"+
		"\u0000=D\u0003\n\u0005\u0000>D\u0003\u000e\u0007\u0000?D\u0003\u0014\n"+
		"\u0000@D\u0003\u0016\u000b\u0000AD\u0003\u0010\b\u0000BD\u0003\u0012\t"+
		"\u0000C<\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C>\u0001\u0000"+
		"\u0000\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0007\u0001\u0000\u0000"+
		"\u0000EF\u0005\"\u0000\u0000FG\u0005\u001a\u0000\u0000GH\u0005#\u0000"+
		"\u0000HO\u0005\u001f\u0000\u0000IJ\u0005\"\u0000\u0000JK\u0005\u001a\u0000"+
		"\u0000KL\u0003\u001a\r\u0000LM\u0005\u001f\u0000\u0000MO\u0001\u0000\u0000"+
		"\u0000NE\u0001\u0000\u0000\u0000NI\u0001\u0000\u0000\u0000O\t\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0003\u0000\u0000QR\u0003\u0018\f\u0000RV\u0005\u0013"+
		"\u0000\u0000SU\u0003\u0006\u0003\u0000TS\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0003\f\u0006\u0000"+
		"Z\u000b\u0001\u0000\u0000\u0000[_\u0005\u0004\u0000\u0000\\^\u0003\u0006"+
		"\u0003\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`f\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000bc\u0005\u0004\u0000\u0000cf\u0003\n\u0005\u0000"+
		"df\u0001\u0000\u0000\u0000e[\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000gh\u0005\b"+
		"\u0000\u0000hi\u0005\"\u0000\u0000ij\u0005\u001a\u0000\u0000jk\u0005#"+
		"\u0000\u0000kl\u0005\u0015\u0000\u0000lm\u0005#\u0000\u0000mq\u0005\u0014"+
		"\u0000\u0000np\u0003\u0006\u0003\u0000on\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"r\u000f\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0012"+
		"\u0000\u0000uv\u0003\u0018\f\u0000vw\u0005\u0014\u0000\u0000w{\u0005\u0010"+
		"\u0000\u0000xz\u0003\u0006\u0003\u0000yx\u0001\u0000\u0000\u0000z}\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\u0011"+
		"\u0000\u0000\u007f\u0080\u0005\u001f\u0000\u0000\u0080\u0011\u0001\u0000"+
		"\u0000\u0000\u0081\u0085\u0005\u0007\u0000\u0000\u0082\u0084\u0003\u0006"+
		"\u0003\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089\u008a\u0003\u0018\f"+
		"\u0000\u008a\u008b\u0005\u001f\u0000\u0000\u008b\u0013\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u000e\u0000\u0000\u008d\u008e\u0005\u001d\u0000"+
		"\u0000\u008e\u008f\u0005\"\u0000\u0000\u008f\u0090\u0005\u001e\u0000\u0000"+
		"\u0090\u0091\u0005\u001f\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u000f\u0000\u0000\u0093\u0094\u0005\u001d\u0000\u0000"+
		"\u0094\u0095\u0005\"\u0000\u0000\u0095\u0096\u0005\u001e\u0000\u0000\u0096"+
		"\u00a4\u0005\u001f\u0000\u0000\u0097\u0098\u0005\u000f\u0000\u0000\u0098"+
		"\u0099\u0005\u001d\u0000\u0000\u0099\u009a\u0005%\u0000\u0000\u009a\u009b"+
		"\u0005 \u0000\u0000\u009b\u009c\u0005\"\u0000\u0000\u009c\u009d\u0005"+
		"\u001e\u0000\u0000\u009d\u00a4\u0005\u001f\u0000\u0000\u009e\u009f\u0005"+
		"\u000f\u0000\u0000\u009f\u00a0\u0005\u001d\u0000\u0000\u00a0\u00a1\u0005"+
		"%\u0000\u0000\u00a1\u00a2\u0005\u001e\u0000\u0000\u00a2\u00a4\u0005\u001f"+
		"\u0000\u0000\u00a3\u0092\u0001\u0000\u0000\u0000\u00a3\u0097\u0001\u0000"+
		"\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a4\u0017\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\"\u0000\u0000\u00a6\u00a7\u0005\u0019\u0000"+
		"\u0000\u00a7\u00b2\u0005\"\u0000\u0000\u00a8\u00a9\u0005#\u0000\u0000"+
		"\u00a9\u00aa\u0005\u0019\u0000\u0000\u00aa\u00b2\u0005#\u0000\u0000\u00ab"+
		"\u00ac\u0005\"\u0000\u0000\u00ac\u00ad\u0005\u0019\u0000\u0000\u00ad\u00b2"+
		"\u0005#\u0000\u0000\u00ae\u00af\u0005#\u0000\u0000\u00af\u00b0\u0005\u0019"+
		"\u0000\u0000\u00b0\u00b2\u0005\"\u0000\u0000\u00b1\u00a5\u0001\u0000\u0000"+
		"\u0000\u00b1\u00a8\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000"+
		"\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b2\u0019\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0006\r\uffff\uffff\u0000\u00b4\u00bb\u0005#\u0000"+
		"\u0000\u00b5\u00bb\u0005\"\u0000\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000"+
		"\u00b7\u00b8\u0003\u001a\r\u0000\u00b8\u00b9\u0005\u001e\u0000\u0000\u00b9"+
		"\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b3\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b5\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00bb"+
		"\u00c4\u0001\u0000\u0000\u0000\u00bc\u00bd\n\u0005\u0000\u0000\u00bd\u00be"+
		"\u0005\u0017\u0000\u0000\u00be\u00c3\u0003\u001a\r\u0006\u00bf\u00c0\n"+
		"\u0004\u0000\u0000\u00c0\u00c1\u0005\u0016\u0000\u0000\u00c1\u00c3\u0003"+
		"\u001a\r\u0005\u00c2\u00bc\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u001b\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0007\u0000"+
		"\u0000\u0000\u00c8\u001d\u0001\u0000\u0000\u0000\u0010&/:CNV_eq{\u0085"+
		"\u00a3\u00b1\u00ba\u00c2\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}