// Generated from Language.g4 by ANTLR 4.4
package Mini_Pascal.pascalito;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, PROGRAM=3, CHAR=4, IF=5, ELSE=6, INT=7, BOOLEAN=8, REPEAT=9, 
		FOR=10, UNTIL=11, AND=12, OR=13, NOT=14, VAR=15, READ=16, WRITE=17, PLUS=18, 
		MINUS=19, MULTI=20, DIV=21, GT=22, LT=23, GEQ=24, LEQ=25, EQ=26, ASSIGN=27, 
		LBRA=28, RBRA=29, LPAR=30, RPAR=31, PUNTOCOMA=32, ID=33, NUMBER=34, WS=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'world'", "'hello'", "'program'", "'char'", "'if'", "'else'", 
		"'int'", "'boolean'", "'repeat'", "'for'", "'until'", "'and'", "'or'", 
		"'not'", "'var'", "'read'", "'write'", "'+'", "'-'", "'*'", "'/'", "'>'", 
		"'<'", "'>='", "'<='", "'='", "':='", "'{'", "'}'", "'('", "')'", "';'", 
		"ID", "NUMBER", "WS"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_sentence = 2, RULE_var_decl = 3, 
		RULE_var_assign = 4, RULE_wriite = 5;
	public static final String[] ruleNames = {
		"start", "program", "sentence", "var_decl", "var_assign", "wriite"
	};

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(T__0);
			setState(13); match(T__1);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode PROGRAM() { return getToken(LanguageParser.PROGRAM, 0); }
		public TerminalNode LBRA() { return getToken(LanguageParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(LanguageParser.RBRA, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); match(PROGRAM);
			setState(16); match(ID);
			setState(17); match(LBRA);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(18); sentence();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24); match(RBRA);
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

	public static class SentenceContext extends ParserRuleContext {
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public WriiteContext wriite() {
			return getRuleContext(WriiteContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			setState(29);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); var_assign();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(28); wriite();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(LanguageParser.PUNTOCOMA, 0); }
		public TerminalNode VAR() { return getToken(LanguageParser.VAR, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(VAR);
			setState(32); match(ID);
			setState(33); match(PUNTOCOMA);
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

	public static class Var_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LanguageParser.ASSIGN, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(LanguageParser.PUNTOCOMA, 0); }
		public TerminalNode NUMBER() { return getToken(LanguageParser.NUMBER, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(ID);
			setState(36); match(ASSIGN);
			setState(37); match(NUMBER);
			setState(38); match(PUNTOCOMA);
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

	public static class WriiteContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(LanguageParser.PUNTOCOMA, 0); }
		public TerminalNode WRITE() { return getToken(LanguageParser.WRITE, 0); }
		public TerminalNode NUMBER() { return getToken(LanguageParser.NUMBER, 0); }
		public WriiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wriite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterWriite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitWriite(this);
		}
	}

	public final WriiteContext wriite() throws RecognitionException {
		WriiteContext _localctx = new WriiteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wriite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(WRITE);
			setState(41); match(NUMBER);
			setState(42); match(PUNTOCOMA);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%/\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\26\n"+
		"\3\f\3\16\3\31\13\3\3\3\3\3\3\4\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2+\2\16\3\2\2\2"+
		"\4\21\3\2\2\2\6\37\3\2\2\2\b!\3\2\2\2\n%\3\2\2\2\f*\3\2\2\2\16\17\7\4"+
		"\2\2\17\20\7\3\2\2\20\3\3\2\2\2\21\22\7\5\2\2\22\23\7#\2\2\23\27\7\36"+
		"\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\37\2\2\33\5\3\2\2\2\34 \5\b\5"+
		"\2\35 \5\n\6\2\36 \5\f\7\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 "+
		"\7\3\2\2\2!\"\7\21\2\2\"#\7#\2\2#$\7\"\2\2$\t\3\2\2\2%&\7#\2\2&\'\7\35"+
		"\2\2\'(\7$\2\2()\7\"\2\2)\13\3\2\2\2*+\7\23\2\2+,\7$\2\2,-\7\"\2\2-\r"+
		"\3\2\2\2\4\27\37";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}