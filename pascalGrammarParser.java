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
		RULE_start = 0, RULE_bloqueVariables = 1, RULE_declaracion = 2, RULE_tipo = 3, 
		RULE_statements = 4, RULE_asignacion = 5, RULE_bloqueIf = 6, RULE_bloqueElse = 7, 
		RULE_bloqueFor = 8, RULE_bloqueWhile = 9, RULE_bloqueRepeat = 10, RULE_leerVariable = 11, 
		RULE_escribirVariable = 12, RULE_condiciones = 13, RULE_expr = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "bloqueVariables", "declaracion", "tipo", "statements", "asignacion", 
			"bloqueIf", "bloqueElse", "bloqueFor", "bloqueWhile", "bloqueRepeat", 
			"leerVariable", "escribirVariable", "condiciones", "expr"
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
		public TerminalNode EOF() { return getToken(pascalGrammarParser.EOF, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
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
			setState(42);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitBloqueVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueVariablesContext bloqueVariables() throws RecognitionException {
		BloqueVariablesContext _localctx = new BloqueVariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloqueVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(VAR);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(45);
				declaracion();
				}
				}
				setState(50);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(ID);
				setState(52);
				match(COMA);
				setState(53);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(ID);
				setState(55);
				match(DOSPUNTOS);
				setState(56);
				tipo();
				setState(57);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(pascalGrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(pascalGrammarParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(pascalGrammarParser.BOOLEAN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 100L) != 0) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				bloqueIf();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				bloqueFor();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				leerVariable();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				escribirVariable();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				bloqueWhile();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(ID);
				setState(73);
				match(ASSIGN);
				setState(74);
				match(NUMBER);
				setState(75);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ID);
				setState(77);
				match(ASSIGN);
				setState(78);
				expr(0);
				setState(79);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitBloqueIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueIfContext bloqueIf() throws RecognitionException {
		BloqueIfContext _localctx = new BloqueIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloqueIf);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IF);
			setState(84);
			condiciones();
			setState(85);
			match(THEN);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					statements();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(92);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitBloqueElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueElseContext bloqueElse() throws RecognitionException {
		BloqueElseContext _localctx = new BloqueElseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloqueElse);
		try {
			int _alt;
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(ELSE);
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						statements();
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(ELSE);
				setState(102);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitBloqueFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueForContext bloqueFor() throws RecognitionException {
		BloqueForContext _localctx = new BloqueForContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloqueFor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(FOR);
			setState(107);
			match(ID);
			setState(108);
			match(ASSIGN);
			setState(109);
			match(NUMBER);
			setState(110);
			match(TO);
			setState(111);
			match(NUMBER);
			setState(112);
			match(DO);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					statements();
					}
					} 
				}
				setState(118);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitBloqueWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueWhileContext bloqueWhile() throws RecognitionException {
		BloqueWhileContext _localctx = new BloqueWhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloqueWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(WHILE);
			setState(120);
			condiciones();
			setState(121);
			match(DO);
			setState(122);
			match(BEGIN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17180180872L) != 0) {
				{
				{
				setState(123);
				statements();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(END);
			setState(130);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitBloqueRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueRepeatContext bloqueRepeat() throws RecognitionException {
		BloqueRepeatContext _localctx = new BloqueRepeatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloqueRepeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(REPEAT);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 17180180872L) != 0) {
				{
				{
				setState(133);
				statements();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(UNTIL);
			setState(140);
			condiciones();
			setState(141);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitLeerVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerVariableContext leerVariable() throws RecognitionException {
		LeerVariableContext _localctx = new LeerVariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_leerVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(READ);
			setState(144);
			match(LPAR);
			setState(145);
			match(ID);
			setState(146);
			match(RPAR);
			setState(147);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitEscribirVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirVariableContext escribirVariable() throws RecognitionException {
		EscribirVariableContext _localctx = new EscribirVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_escribirVariable);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(WRITE);
				setState(150);
				match(LPAR);
				setState(151);
				match(ID);
				setState(152);
				match(RPAR);
				setState(153);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(WRITE);
				setState(155);
				match(LPAR);
				setState(156);
				match(STRING);
				setState(157);
				match(COMA);
				setState(158);
				match(ID);
				setState(159);
				match(RPAR);
				setState(160);
				match(PUNTOCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(WRITE);
				setState(162);
				match(LPAR);
				setState(163);
				match(STRING);
				setState(164);
				match(RPAR);
				setState(165);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitCondiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionesContext condiciones() throws RecognitionException {
		CondicionesContext _localctx = new CondicionesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condiciones);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(ID);
				setState(169);
				match(OPERADORES);
				setState(170);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(NUMBER);
				setState(172);
				match(OPERADORES);
				setState(173);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(ID);
				setState(175);
				match(OPERADORES);
				setState(176);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(NUMBER);
				setState(178);
				match(OPERADORES);
				setState(179);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalGrammarVisitor ) return ((pascalGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(183);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(184);
				match(ID);
				}
				break;
			case LPAR:
				{
				setState(185);
				match(LPAR);
				setState(186);
				expr(0);
				setState(187);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(192);
						match(OPERACIONESMUL);
						setState(193);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(OPERACIONESSUMAS);
						setState(196);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(201);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
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
		"\u0004\u0001\'\u00cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b\u0000"+
		"\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"R\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"X\b\u0006\n\u0006\f\u0006[\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007a\b\u0007\n\u0007\f\u0007d\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007i\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bs\b\b\n\b\f\bv\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t}\b\t\n\t\f\t\u0080\t\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u0087\b\n\n\n\f\n\u008a\t\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a7\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00b5\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00be\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c6\b\u000e"+
		"\n\u000e\f\u000e\u00c9\t\u000e\u0001\u000e\u0000\u0001\u001c\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0001\u0002\u0000\u0002\u0002\u0005\u0006\u00d5\u0000\u001e\u0001"+
		"\u0000\u0000\u0000\u0002,\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000"+
		"\u0000\u0006=\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nQ\u0001"+
		"\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000"+
		"\u0000\u0010j\u0001\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014"+
		"\u0084\u0001\u0000\u0000\u0000\u0016\u008f\u0001\u0000\u0000\u0000\u0018"+
		"\u00a6\u0001\u0000\u0000\u0000\u001a\u00b4\u0001\u0000\u0000\u0000\u001c"+
		"\u00bd\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f"+
		" \u0005\"\u0000\u0000 !\u0005\u001f\u0000\u0000!\"\u0003\u0002\u0001\u0000"+
		"\"&\u0005\u0010\u0000\u0000#%\u0003\b\u0004\u0000$#\u0001\u0000\u0000"+
		"\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005"+
		"\u0011\u0000\u0000*+\u0005\u0000\u0000\u0001+\u0001\u0001\u0000\u0000"+
		"\u0000,0\u0005\r\u0000\u0000-/\u0003\u0004\u0002\u0000.-\u0001\u0000\u0000"+
		"\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u00001\u0003\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"34\u0005\"\u0000\u000045\u0005 \u0000\u00005<\u0003\u0004\u0002\u0000"+
		"67\u0005\"\u0000\u000078\u0005!\u0000\u000089\u0003\u0006\u0003\u0000"+
		"9:\u0005\u001f\u0000\u0000:<\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000"+
		"\u0000;6\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0007"+
		"\u0000\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?G\u0003\n\u0005\u0000"+
		"@G\u0003\f\u0006\u0000AG\u0003\u0010\b\u0000BG\u0003\u0016\u000b\u0000"+
		"CG\u0003\u0018\f\u0000DG\u0003\u0012\t\u0000EG\u0003\u0014\n\u0000F?\u0001"+
		"\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000FA\u0001\u0000\u0000\u0000"+
		"FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FE\u0001\u0000\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0005\""+
		"\u0000\u0000IJ\u0005\u001a\u0000\u0000JK\u0005#\u0000\u0000KR\u0005\u001f"+
		"\u0000\u0000LM\u0005\"\u0000\u0000MN\u0005\u001a\u0000\u0000NO\u0003\u001c"+
		"\u000e\u0000OP\u0005\u001f\u0000\u0000PR\u0001\u0000\u0000\u0000QH\u0001"+
		"\u0000\u0000\u0000QL\u0001\u0000\u0000\u0000R\u000b\u0001\u0000\u0000"+
		"\u0000ST\u0005\u0003\u0000\u0000TU\u0003\u001a\r\u0000UY\u0005\u0013\u0000"+
		"\u0000VX\u0003\b\u0004\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0003\u000e\u0007\u0000]\r\u0001"+
		"\u0000\u0000\u0000^b\u0005\u0004\u0000\u0000_a\u0003\b\u0004\u0000`_\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ci\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0004\u0000\u0000fi\u0003\f\u0006\u0000gi\u0001\u0000\u0000"+
		"\u0000h^\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000i\u000f\u0001\u0000\u0000\u0000jk\u0005\b\u0000\u0000kl\u0005"+
		"\"\u0000\u0000lm\u0005\u001a\u0000\u0000mn\u0005#\u0000\u0000no\u0005"+
		"\u0015\u0000\u0000op\u0005#\u0000\u0000pt\u0005\u0014\u0000\u0000qs\u0003"+
		"\b\u0004\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0011\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000wx\u0005\u0012\u0000\u0000xy\u0003\u001a"+
		"\r\u0000yz\u0005\u0014\u0000\u0000z~\u0005\u0010\u0000\u0000{}\u0003\b"+
		"\u0004\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\u0011\u0000\u0000\u0082\u0083\u0005\u001f\u0000\u0000\u0083\u0013\u0001"+
		"\u0000\u0000\u0000\u0084\u0088\u0005\u0007\u0000\u0000\u0085\u0087\u0003"+
		"\b\u0004\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\t\u0000\u0000\u008c\u008d\u0003\u001a\r"+
		"\u0000\u008d\u008e\u0005\u001f\u0000\u0000\u008e\u0015\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0091\u0005\u001d\u0000"+
		"\u0000\u0091\u0092\u0005\"\u0000\u0000\u0092\u0093\u0005\u001e\u0000\u0000"+
		"\u0093\u0094\u0005\u001f\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u000f\u0000\u0000\u0096\u0097\u0005\u001d\u0000\u0000"+
		"\u0097\u0098\u0005\"\u0000\u0000\u0098\u0099\u0005\u001e\u0000\u0000\u0099"+
		"\u00a7\u0005\u001f\u0000\u0000\u009a\u009b\u0005\u000f\u0000\u0000\u009b"+
		"\u009c\u0005\u001d\u0000\u0000\u009c\u009d\u0005%\u0000\u0000\u009d\u009e"+
		"\u0005 \u0000\u0000\u009e\u009f\u0005\"\u0000\u0000\u009f\u00a0\u0005"+
		"\u001e\u0000\u0000\u00a0\u00a7\u0005\u001f\u0000\u0000\u00a1\u00a2\u0005"+
		"\u000f\u0000\u0000\u00a2\u00a3\u0005\u001d\u0000\u0000\u00a3\u00a4\u0005"+
		"%\u0000\u0000\u00a4\u00a5\u0005\u001e\u0000\u0000\u00a5\u00a7\u0005\u001f"+
		"\u0000\u0000\u00a6\u0095\u0001\u0000\u0000\u0000\u00a6\u009a\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000\u0000\u00a7\u0019\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0005\"\u0000\u0000\u00a9\u00aa\u0005\u0019\u0000"+
		"\u0000\u00aa\u00b5\u0005\"\u0000\u0000\u00ab\u00ac\u0005#\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0019\u0000\u0000\u00ad\u00b5\u0005#\u0000\u0000\u00ae"+
		"\u00af\u0005\"\u0000\u0000\u00af\u00b0\u0005\u0019\u0000\u0000\u00b0\u00b5"+
		"\u0005#\u0000\u0000\u00b1\u00b2\u0005#\u0000\u0000\u00b2\u00b3\u0005\u0019"+
		"\u0000\u0000\u00b3\u00b5\u0005\"\u0000\u0000\u00b4\u00a8\u0001\u0000\u0000"+
		"\u0000\u00b4\u00ab\u0001\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b5\u001b\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0006\u000e\uffff\uffff\u0000\u00b7\u00be\u0005#\u0000"+
		"\u0000\u00b8\u00be\u0005\"\u0000\u0000\u00b9\u00ba\u0005\u001d\u0000\u0000"+
		"\u00ba\u00bb\u0003\u001c\u000e\u0000\u00bb\u00bc\u0005\u001e\u0000\u0000"+
		"\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b6\u0001\u0000\u0000\u0000"+
		"\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000"+
		"\u00be\u00c7\u0001\u0000\u0000\u0000\u00bf\u00c0\n\u0005\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0017\u0000\u0000\u00c1\u00c6\u0003\u001c\u000e\u0006\u00c2"+
		"\u00c3\n\u0004\u0000\u0000\u00c3\u00c4\u0005\u0016\u0000\u0000\u00c4\u00c6"+
		"\u0003\u001c\u000e\u0005\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u001d"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u0010&0;"+
		"FQYbht~\u0088\u00a6\u00b4\u00bd\u00c5\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}