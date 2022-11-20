// Generated from c:\JavaLib\Mini-Pascal\test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, CHAR=2, IF=3, ELSE=4, INT=5, BOOLEAN=6, REPEAT=7, FOR=8, UNTIL=9, 
		AND=10, OR=11, NOT=12, VAR=13, READ=14, WRITE=15, WRITELN=16, BEGIN=17, 
		END=18, WHILE=19, THEN=20, DO=21, TO=22, OPERACIONESSUMAS=23, OPERACIONESMUL=24, 
		USES=25, OPERADORES=26, ASSIGN=27, LBRA=28, RBRA=29, LPAR=30, RPAR=31, 
		PUNTOCOMA=32, COMA=33, DOSPUNTOS=34, ID=35, NUMBER=36, WS=37, STRING=38, 
		COMMENT=39, ErrorCharacter=40;
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
			"'write'", "'writeln'", null, null, "'while'", "'then'", "'do'", "'to'", 
			null, null, "'uses'", null, "':='", "'{'", "'}'", "'('", "')'", "';'", 
			"','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "CHAR", "IF", "ELSE", "INT", "BOOLEAN", "REPEAT", "FOR", 
			"UNTIL", "AND", "OR", "NOT", "VAR", "READ", "WRITE", "WRITELN", "BEGIN", 
			"END", "WHILE", "THEN", "DO", "TO", "OPERACIONESSUMAS", "OPERACIONESMUL", 
			"USES", "OPERADORES", "ASSIGN", "LBRA", "RBRA", "LPAR", "RPAR", "PUNTOCOMA", 
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
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(testParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(testParser.PUNTOCOMA, 0); }
		public BloqueVariablesContext bloqueVariables() {
			return getRuleContext(BloqueVariablesContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(testParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(testParser.END, 0); }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << FOR) | (1L << READ) | (1L << WRITE) | (1L << WRITELN) | (1L << WHILE) | (1L << ID))) != 0)) {
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

	public static class BloqueVariablesContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(testParser.VAR, 0); }
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode COMA() { return getToken(testParser.COMA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(testParser.DOSPUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(testParser.PUNTOCOMA, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
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
			case WRITELN:
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(testParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(testParser.NUMBER, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(testParser.PUNTOCOMA, 0); }
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

	public static class BloqueIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(testParser.IF, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode THEN() { return getToken(testParser.THEN, 0); }
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

	public static class BloqueElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(testParser.ELSE, 0); }
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

	public static class BloqueForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(testParser.FOR, 0); }
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(testParser.ASSIGN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(testParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(testParser.NUMBER, i);
		}
		public TerminalNode TO() { return getToken(testParser.TO, 0); }
		public TerminalNode DO() { return getToken(testParser.DO, 0); }
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

	public static class BloqueWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(testParser.WHILE, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode DO() { return getToken(testParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(testParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(testParser.END, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(testParser.PUNTOCOMA, 0); }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << FOR) | (1L << READ) | (1L << WRITE) | (1L << WRITELN) | (1L << WHILE) | (1L << ID))) != 0)) {
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

	public static class BloqueRepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(testParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(testParser.UNTIL, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(testParser.PUNTOCOMA, 0); }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << REPEAT) | (1L << FOR) | (1L << READ) | (1L << WRITE) | (1L << WRITELN) | (1L << WHILE) | (1L << ID))) != 0)) {
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

	public static class LeerVariableContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(testParser.READ, 0); }
		public TerminalNode LPAR() { return getToken(testParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(testParser.RPAR, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(testParser.PUNTOCOMA, 0); }
		public LeerVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerVariable; }
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

	public static class EscribirVariableContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(testParser.WRITE, 0); }
		public TerminalNode LPAR() { return getToken(testParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(testParser.RPAR, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(testParser.PUNTOCOMA, 0); }
		public TerminalNode STRING() { return getToken(testParser.STRING, 0); }
		public TerminalNode COMA() { return getToken(testParser.COMA, 0); }
		public TerminalNode WRITELN() { return getToken(testParser.WRITELN, 0); }
		public EscribirVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribirVariable; }
	}

	public final EscribirVariableContext escribirVariable() throws RecognitionException {
		EscribirVariableContext _localctx = new EscribirVariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_escribirVariable);
		try {
			setState(180);
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(WRITELN);
				setState(164);
				match(LPAR);
				setState(165);
				match(ID);
				setState(166);
				match(RPAR);
				setState(167);
				match(PUNTOCOMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(WRITELN);
				setState(169);
				match(LPAR);
				setState(170);
				match(STRING);
				setState(171);
				match(COMA);
				setState(172);
				match(ID);
				setState(173);
				match(RPAR);
				setState(174);
				match(PUNTOCOMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(WRITELN);
				setState(176);
				match(LPAR);
				setState(177);
				match(STRING);
				setState(178);
				match(RPAR);
				setState(179);
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
		public List<TerminalNode> ID() { return getTokens(testParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(testParser.ID, i);
		}
		public TerminalNode OPERADORES() { return getToken(testParser.OPERADORES, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(testParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(testParser.NUMBER, i);
		}
		public CondicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condiciones; }
	}

	public final CondicionesContext condiciones() throws RecognitionException {
		CondicionesContext _localctx = new CondicionesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condiciones);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(ID);
				setState(184);
				match(OPERADORES);
				setState(185);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(NUMBER);
				setState(187);
				match(OPERADORES);
				setState(188);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(ID);
				setState(190);
				match(OPERADORES);
				setState(191);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(NUMBER);
				setState(193);
				match(OPERADORES);
				setState(194);
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
		public TerminalNode NUMBER() { return getToken(testParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(testParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(testParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(testParser.RPAR, 0); }
		public TerminalNode OPERACIONESMUL() { return getToken(testParser.OPERACIONESMUL, 0); }
		public TerminalNode OPERACIONESSUMAS() { return getToken(testParser.OPERACIONESSUMAS, 0); }
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(198);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(199);
				match(ID);
				}
				break;
			case LPAR:
				{
				setState(200);
				match(LPAR);
				setState(201);
				expr(0);
				setState(202);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(207);
						match(OPERACIONESMUL);
						setState(208);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(210);
						match(OPERACIONESSUMAS);
						setState(211);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(216);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(testParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(testParser.CHAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5F\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7\3\7\3\7\3"+
		"\7\7\7W\n\7\f\7\16\7Z\13\7\3\7\3\7\3\b\3\b\7\b`\n\b\f\b\16\bc\13\b\3\b"+
		"\3\b\3\b\5\bh\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tr\n\t\f\t\16\tu\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\n\3\n\3\n\3\13\3\13"+
		"\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00b7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00cf\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d7\n\17\f\17\16"+
		"\17\u00da\13\17\3\20\3\20\3\20\2\3\34\21\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36\2\3\4\2\4\4\7\7\2\u00ec\2 \3\2\2\2\4-\3\2\2\2\6<\3\2\2\2\bE"+
		"\3\2\2\2\nP\3\2\2\2\fR\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22v\3\2\2\2\24"+
		"\u0083\3\2\2\2\26\u008e\3\2\2\2\30\u00b6\3\2\2\2\32\u00c5\3\2\2\2\34\u00ce"+
		"\3\2\2\2\36\u00db\3\2\2\2 !\7\3\2\2!\"\7%\2\2\"#\7\"\2\2#$\5\4\3\2$(\7"+
		"\23\2\2%\'\5\b\5\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2"+
		"*(\3\2\2\2+,\7\24\2\2,\3\3\2\2\2-\61\7\17\2\2.\60\5\6\4\2/.\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64\65"+
		"\7%\2\2\65\66\7#\2\2\66=\5\6\4\2\678\7%\2\289\7$\2\29:\5\36\20\2:;\7\""+
		"\2\2;=\3\2\2\2<\64\3\2\2\2<\67\3\2\2\2=\7\3\2\2\2>F\5\n\6\2?F\5\f\7\2"+
		"@F\5\20\t\2AF\5\26\f\2BF\5\30\r\2CF\5\22\n\2DF\5\24\13\2E>\3\2\2\2E?\3"+
		"\2\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GH"+
		"\7%\2\2HI\7\35\2\2IJ\7&\2\2JQ\7\"\2\2KL\7%\2\2LM\7\35\2\2MN\5\34\17\2"+
		"NO\7\"\2\2OQ\3\2\2\2PG\3\2\2\2PK\3\2\2\2Q\13\3\2\2\2RS\7\5\2\2ST\5\32"+
		"\16\2TX\7\26\2\2UW\5\b\5\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3"+
		"\2\2\2ZX\3\2\2\2[\\\5\16\b\2\\\r\3\2\2\2]a\7\6\2\2^`\5\b\5\2_^\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bh\3\2\2\2ca\3\2\2\2de\7\6\2\2eh\5\f\7\2"+
		"fh\3\2\2\2g]\3\2\2\2gd\3\2\2\2gf\3\2\2\2h\17\3\2\2\2ij\7\n\2\2jk\7%\2"+
		"\2kl\7\35\2\2lm\7&\2\2mn\7\30\2\2no\7&\2\2os\7\27\2\2pr\5\b\5\2qp\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\21\3\2\2\2us\3\2\2\2vw\7\25\2\2wx"+
		"\5\32\16\2xy\7\27\2\2y}\7\23\2\2z|\5\b\5\2{z\3\2\2\2|\177\3\2\2\2}{\3"+
		"\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\24\2\2\u0081"+
		"\u0082\7\"\2\2\u0082\23\3\2\2\2\u0083\u0087\7\t\2\2\u0084\u0086\5\b\5"+
		"\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\13\2\2"+
		"\u008b\u008c\5\32\16\2\u008c\u008d\7\"\2\2\u008d\25\3\2\2\2\u008e\u008f"+
		"\7\20\2\2\u008f\u0090\7 \2\2\u0090\u0091\7%\2\2\u0091\u0092\7!\2\2\u0092"+
		"\u0093\7\"\2\2\u0093\27\3\2\2\2\u0094\u0095\7\21\2\2\u0095\u0096\7 \2"+
		"\2\u0096\u0097\7%\2\2\u0097\u0098\7!\2\2\u0098\u00b7\7\"\2\2\u0099\u009a"+
		"\7\21\2\2\u009a\u009b\7 \2\2\u009b\u009c\7(\2\2\u009c\u009d\7#\2\2\u009d"+
		"\u009e\7%\2\2\u009e\u009f\7!\2\2\u009f\u00b7\7\"\2\2\u00a0\u00a1\7\21"+
		"\2\2\u00a1\u00a2\7 \2\2\u00a2\u00a3\7(\2\2\u00a3\u00a4\7!\2\2\u00a4\u00b7"+
		"\7\"\2\2\u00a5\u00a6\7\22\2\2\u00a6\u00a7\7 \2\2\u00a7\u00a8\7%\2\2\u00a8"+
		"\u00a9\7!\2\2\u00a9\u00b7\7\"\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ac\7 "+
		"\2\2\u00ac\u00ad\7(\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7%\2\2\u00af\u00b0"+
		"\7!\2\2\u00b0\u00b7\7\"\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\7 \2\2\u00b3"+
		"\u00b4\7(\2\2\u00b4\u00b5\7!\2\2\u00b5\u00b7\7\"\2\2\u00b6\u0094\3\2\2"+
		"\2\u00b6\u0099\3\2\2\2\u00b6\u00a0\3\2\2\2\u00b6\u00a5\3\2\2\2\u00b6\u00aa"+
		"\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00c6\3\2\2\2\u00b9"+
		"\u00ba\7%\2\2\u00ba\u00bb\7\34\2\2\u00bb\u00c6\7%\2\2\u00bc\u00bd\7&\2"+
		"\2\u00bd\u00be\7\34\2\2\u00be\u00c6\7&\2\2\u00bf\u00c0\7%\2\2\u00c0\u00c1"+
		"\7\34\2\2\u00c1\u00c6\7&\2\2\u00c2\u00c3\7&\2\2\u00c3\u00c4\7\34\2\2\u00c4"+
		"\u00c6\7%\2\2\u00c5\u00b8\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00bc\3\2"+
		"\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\33\3\2\2\2\u00c7\u00c8"+
		"\b\17\1\2\u00c8\u00cf\7&\2\2\u00c9\u00cf\7%\2\2\u00ca\u00cb\7 \2\2\u00cb"+
		"\u00cc\5\34\17\2\u00cc\u00cd\7!\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c7\3"+
		"\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00d8\3\2\2\2\u00d0"+
		"\u00d1\f\7\2\2\u00d1\u00d2\7\32\2\2\u00d2\u00d7\5\34\17\b\u00d3\u00d4"+
		"\f\6\2\2\u00d4\u00d5\7\31\2\2\u00d5\u00d7\5\34\17\7\u00d6\u00d0\3\2\2"+
		"\2\u00d6\u00d3\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\t\2\2\2\u00dc"+
		"\37\3\2\2\2\22(\61<EPXags}\u0087\u00b6\u00c5\u00ce\u00d6\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}