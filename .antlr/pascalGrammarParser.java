// Generated from c:\JavaLib\Mini-Pascal\pascalGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "pascalGrammar.g4"; }

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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << FOR) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << ID))) != 0)) {
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(pascalGrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(pascalGrammarParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(pascalGrammarParser.BOOLEAN, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << FOR) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << ID))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << FOR) | (1L << READ) | (1L << WRITE) | (1L << WHILE) | (1L << ID))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\2\3\3\3\3\7\3\61\n\3\f\3\16\3"+
		"\64\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6I\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7"+
		"\3\b\3\b\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\b\3\b\3\t\3\t\7\tc\n\t\f\t"+
		"\16\tf\13\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nu"+
		"\n\n\f\n\16\nx\13\n\3\13\3\13\3\13\3\13\3\13\7\13\177\n\13\f\13\16\13"+
		"\u0082\13\13\3\13\3\13\3\13\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a9\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b7"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c0\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00c8\n\20\f\20\16\20\u00cb\13\20\3\20\2\3\36\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\4\2\4\4\7\b\2\u00d7\2 \3\2"+
		"\2\2\4.\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nH\3\2\2\2\fS\3\2\2\2\16U\3\2\2"+
		"\2\20j\3\2\2\2\22l\3\2\2\2\24y\3\2\2\2\26\u0086\3\2\2\2\30\u0091\3\2\2"+
		"\2\32\u00a8\3\2\2\2\34\u00b6\3\2\2\2\36\u00bf\3\2\2\2 !\7\3\2\2!\"\7$"+
		"\2\2\"#\7!\2\2#$\5\4\3\2$(\7\22\2\2%\'\5\n\6\2&%\3\2\2\2\'*\3\2\2\2(&"+
		"\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\23\2\2,-\7\2\2\3-\3\3\2\2\2"+
		".\62\7\17\2\2/\61\5\6\4\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\66\7$\2\2\66\67\7\"\2\2\67>\5\6"+
		"\4\289\7$\2\29:\7#\2\2:;\5\b\5\2;<\7!\2\2<>\3\2\2\2=\65\3\2\2\2=8\3\2"+
		"\2\2>\7\3\2\2\2?@\t\2\2\2@\t\3\2\2\2AI\5\f\7\2BI\5\16\b\2CI\5\22\n\2D"+
		"I\5\30\r\2EI\5\32\16\2FI\5\24\13\2GI\5\26\f\2HA\3\2\2\2HB\3\2\2\2HC\3"+
		"\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\13\3\2\2\2JK\7$\2\2KL"+
		"\7\34\2\2LM\7%\2\2MT\7!\2\2NO\7$\2\2OP\7\34\2\2PQ\5\36\20\2QR\7!\2\2R"+
		"T\3\2\2\2SJ\3\2\2\2SN\3\2\2\2T\r\3\2\2\2UV\7\5\2\2VW\5\34\17\2W[\7\25"+
		"\2\2XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3"+
		"\2\2\2^_\5\20\t\2_\17\3\2\2\2`d\7\6\2\2ac\5\n\6\2ba\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2ek\3\2\2\2fd\3\2\2\2gh\7\6\2\2hk\5\16\b\2ik\3\2\2"+
		"\2j`\3\2\2\2jg\3\2\2\2ji\3\2\2\2k\21\3\2\2\2lm\7\n\2\2mn\7$\2\2no\7\34"+
		"\2\2op\7%\2\2pq\7\27\2\2qr\7%\2\2rv\7\26\2\2su\5\n\6\2ts\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2w\23\3\2\2\2xv\3\2\2\2yz\7\24\2\2z{\5\34\17\2"+
		"{|\7\26\2\2|\u0080\7\22\2\2}\177\5\n\6\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7\23\2\2\u0084\u0085\7!\2\2\u0085\25\3\2\2\2\u0086\u008a"+
		"\7\t\2\2\u0087\u0089\5\n\6\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\13\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7!\2\2\u0090"+
		"\27\3\2\2\2\u0091\u0092\7\20\2\2\u0092\u0093\7\37\2\2\u0093\u0094\7$\2"+
		"\2\u0094\u0095\7 \2\2\u0095\u0096\7!\2\2\u0096\31\3\2\2\2\u0097\u0098"+
		"\7\21\2\2\u0098\u0099\7\37\2\2\u0099\u009a\7$\2\2\u009a\u009b\7 \2\2\u009b"+
		"\u00a9\7!\2\2\u009c\u009d\7\21\2\2\u009d\u009e\7\37\2\2\u009e\u009f\7"+
		"\'\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7$\2\2\u00a1\u00a2\7 \2\2\u00a2"+
		"\u00a9\7!\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\7"+
		"\'\2\2\u00a6\u00a7\7 \2\2\u00a7\u00a9\7!\2\2\u00a8\u0097\3\2\2\2\u00a8"+
		"\u009c\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00ab\7$\2\2"+
		"\u00ab\u00ac\7\33\2\2\u00ac\u00b7\7$\2\2\u00ad\u00ae\7%\2\2\u00ae\u00af"+
		"\7\33\2\2\u00af\u00b7\7%\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2\7\33\2\2\u00b2"+
		"\u00b7\7%\2\2\u00b3\u00b4\7%\2\2\u00b4\u00b5\7\33\2\2\u00b5\u00b7\7$\2"+
		"\2\u00b6\u00aa\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b3"+
		"\3\2\2\2\u00b7\35\3\2\2\2\u00b8\u00b9\b\20\1\2\u00b9\u00c0\7%\2\2\u00ba"+
		"\u00c0\7$\2\2\u00bb\u00bc\7\37\2\2\u00bc\u00bd\5\36\20\2\u00bd\u00be\7"+
		" \2\2\u00be\u00c0\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf"+
		"\u00bb\3\2\2\2\u00c0\u00c9\3\2\2\2\u00c1\u00c2\f\7\2\2\u00c2\u00c3\7\31"+
		"\2\2\u00c3\u00c8\5\36\20\b\u00c4\u00c5\f\6\2\2\u00c5\u00c6\7\30\2\2\u00c6"+
		"\u00c8\5\36\20\7\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\37\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\22(\62=HS[djv\u0080\u008a\u00a8\u00b6\u00bf\u00c7\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}