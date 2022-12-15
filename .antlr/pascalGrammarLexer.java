// Generated from c:\JavaLib\Mini-Pascal\pascalGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, CHAR=2, IF=3, ELSE=4, INT=5, BOOLEAN=6, REPEAT=7, FOR=8, UNTIL=9, 
		AND=10, OR=11, NOT=12, VAR=13, READ=14, WRITE=15, BEGIN=16, END=17, WHILE=18, 
		THEN=19, DO=20, TO=21, OPERACIONESSUMAS=22, OPERACIONESMUL=23, USES=24, 
		TRUE=25, FALSE=26, OPERADORES=27, ASSIGN=28, LBRA=29, RBRA=30, LPAR=31, 
		RPAR=32, PUNTOCOMA=33, COMA=34, DOSPUNTOS=35, ID=36, NUMBER=37, WS=38, 
		STRING=39, COMMENT=40, ErrorCharacter=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "CHAR", "IF", "ELSE", "INT", "BOOLEAN", "REPEAT", "FOR", "UNTIL", 
			"AND", "OR", "NOT", "VAR", "READ", "WRITE", "BEGIN", "END", "WHILE", 
			"THEN", "DO", "TO", "OPERACIONESSUMAS", "OPERACIONESMUL", "USES", "TRUE", 
			"FALSE", "OPERADORES", "ASSIGN", "LBRA", "RBRA", "LPAR", "RPAR", "PUNTOCOMA", 
			"COMA", "DOSPUNTOS", "ID", "NUMBER", "WS", "STRING", "COMMENT", "ErrorCharacter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'char'", "'if'", "'else'", "'integer'", "'boolean'", 
			"'repeat'", "'for'", "'until'", "'and'", "'or'", "'not'", "'Var'", "'read'", 
			null, null, null, "'while'", "'then'", "'do'", "'to'", null, null, "'uses'", 
			null, null, null, "':='", "'{'", "'}'", "'('", "')'", "';'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "CHAR", "IF", "ELSE", "INT", "BOOLEAN", "REPEAT", "FOR", 
			"UNTIL", "AND", "OR", "NOT", "VAR", "READ", "WRITE", "BEGIN", "END", 
			"WHILE", "THEN", "DO", "TO", "OPERACIONESSUMAS", "OPERACIONESMUL", "USES", 
			"TRUE", "FALSE", "OPERADORES", "ASSIGN", "LBRA", "RBRA", "LPAR", "RPAR", 
			"PUNTOCOMA", "COMA", "DOSPUNTOS", "ID", "NUMBER", "WS", "STRING", "COMMENT", 
			"ErrorCharacter"
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


	public pascalGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pascalGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 40:
			ErrorCharacter_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ErrorCharacter_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("Error: caracter no reconocido");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0136\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00ac\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00b8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c0\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u00e4\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u00f0\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u00fa\n\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\7%\u010f\n%\f%\16%\u0112\13%\3&\6&\u0115"+
		"\n&\r&\16&\u0116\3\'\6\'\u011a\n\'\r\'\16\'\u011b\3\'\3\'\3(\3(\7(\u0122"+
		"\n(\f(\16(\u0125\13(\3(\3(\3)\3)\7)\u012b\n)\f)\16)\u012e\13)\3)\3)\3"+
		")\3)\3*\3*\3*\4\u0123\u012c\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\t\4\2--//"+
		"\4\2,,\61\61\4\2>>@@\5\2C\\aac|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\""+
		"\"\2\u0143\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\3U\3\2\2\2\5]\3\2\2\2\7b\3\2\2\2\te\3\2\2\2\13j\3\2\2\2\rr\3"+
		"\2\2\2\17z\3\2\2\2\21\u0081\3\2\2\2\23\u0085\3\2\2\2\25\u008b\3\2\2\2"+
		"\27\u008f\3\2\2\2\31\u0092\3\2\2\2\33\u0096\3\2\2\2\35\u009a\3\2\2\2\37"+
		"\u00ab\3\2\2\2!\u00b7\3\2\2\2#\u00bf\3\2\2\2%\u00c1\3\2\2\2\'\u00c7\3"+
		"\2\2\2)\u00cc\3\2\2\2+\u00cf\3\2\2\2-\u00d2\3\2\2\2/\u00d4\3\2\2\2\61"+
		"\u00d6\3\2\2\2\63\u00e3\3\2\2\2\65\u00ef\3\2\2\2\67\u00f9\3\2\2\29\u00fb"+
		"\3\2\2\2;\u00fe\3\2\2\2=\u0100\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C"+
		"\u0106\3\2\2\2E\u0108\3\2\2\2G\u010a\3\2\2\2I\u010c\3\2\2\2K\u0114\3\2"+
		"\2\2M\u0119\3\2\2\2O\u011f\3\2\2\2Q\u0128\3\2\2\2S\u0133\3\2\2\2UV\7r"+
		"\2\2VW\7t\2\2WX\7q\2\2XY\7i\2\2YZ\7t\2\2Z[\7c\2\2[\\\7o\2\2\\\4\3\2\2"+
		"\2]^\7e\2\2^_\7j\2\2_`\7c\2\2`a\7t\2\2a\6\3\2\2\2bc\7k\2\2cd\7h\2\2d\b"+
		"\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\n\3\2\2\2jk\7k\2\2kl\7p"+
		"\2\2lm\7v\2\2mn\7g\2\2no\7i\2\2op\7g\2\2pq\7t\2\2q\f\3\2\2\2rs\7d\2\2"+
		"st\7q\2\2tu\7q\2\2uv\7n\2\2vw\7g\2\2wx\7c\2\2xy\7p\2\2y\16\3\2\2\2z{\7"+
		"t\2\2{|\7g\2\2|}\7r\2\2}~\7g\2\2~\177\7c\2\2\177\u0080\7v\2\2\u0080\20"+
		"\3\2\2\2\u0081\u0082\7h\2\2\u0082\u0083\7q\2\2\u0083\u0084\7t\2\2\u0084"+
		"\22\3\2\2\2\u0085\u0086\7w\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7n\2\2\u008a\24\3\2\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e\26\3\2\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7t\2\2\u0091\30\3\2\2\2\u0092\u0093\7p\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7v\2\2\u0095\32\3\2\2\2\u0096\u0097\7X\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7t\2\2\u0099\34\3\2\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7c\2\2\u009d\u009e\7f\2\2\u009e\36\3\2\2\2\u009f\u00a0\7y\2\2\u00a0"+
		"\u00a1\7t\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7v\2\2\u00a3\u00ac\7g\2\2"+
		"\u00a4\u00a5\7y\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ac\7p\2\2\u00ab"+
		"\u009f\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ac \3\2\2\2\u00ad\u00ae\7D\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b8\7p\2\2"+
		"\u00b2\u00b3\7d\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b8\7p\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8"+
		"\"\3\2\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb\7p\2\2\u00bb\u00c0\7f\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7p\2\2\u00be\u00c0\7f\2\2\u00bf\u00b9\3\2\2"+
		"\2\u00bf\u00bc\3\2\2\2\u00c0$\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7"+
		"j\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7g\2\2\u00c6&"+
		"\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7p\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"*\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7q\2\2\u00d1,\3\2\2\2\u00d2\u00d3"+
		"\t\2\2\2\u00d3.\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5\60\3\2\2\2\u00d6\u00d7"+
		"\7w\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7u\2\2\u00da"+
		"\62\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7w\2\2\u00de"+
		"\u00e4\7g\2\2\u00df\u00e0\7V\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7w\2\2"+
		"\u00e2\u00e4\7g\2\2\u00e3\u00db\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\64\3"+
		"\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7n\2\2\u00e8"+
		"\u00e9\7u\2\2\u00e9\u00f0\7g\2\2\u00ea\u00eb\7H\2\2\u00eb\u00ec\7c\2\2"+
		"\u00ec\u00ed\7n\2\2\u00ed\u00ee\7u\2\2\u00ee\u00f0\7g\2\2\u00ef\u00e5"+
		"\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\66\3\2\2\2\u00f1\u00fa\t\4\2\2\u00f2"+
		"\u00f3\7@\2\2\u00f3\u00fa\7?\2\2\u00f4\u00f5\7>\2\2\u00f5\u00fa\7?\2\2"+
		"\u00f6\u00fa\7?\2\2\u00f7\u00f8\7>\2\2\u00f8\u00fa\7@\2\2\u00f9\u00f1"+
		"\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa8\3\2\2\2\u00fb\u00fc\7<\2\2\u00fc\u00fd\7?\2\2\u00fd"+
		":\3\2\2\2\u00fe\u00ff\7}\2\2\u00ff<\3\2\2\2\u0100\u0101\7\177\2\2\u0101"+
		">\3\2\2\2\u0102\u0103\7*\2\2\u0103@\3\2\2\2\u0104\u0105\7+\2\2\u0105B"+
		"\3\2\2\2\u0106\u0107\7=\2\2\u0107D\3\2\2\2\u0108\u0109\7.\2\2\u0109F\3"+
		"\2\2\2\u010a\u010b\7<\2\2\u010bH\3\2\2\2\u010c\u0110\t\5\2\2\u010d\u010f"+
		"\t\6\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111J\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\t\7\2\2"+
		"\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117L\3\2\2\2\u0118\u011a\t\b\2\2\u0119\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\b\'\2\2\u011eN\3\2\2\2\u011f\u0123\7$\2\2\u0120\u0122"+
		"\13\2\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0124\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127"+
		"\7$\2\2\u0127P\3\2\2\2\u0128\u012c\5;\36\2\u0129\u012b\13\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012d\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\5=\37\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\b)\2\2\u0132R\3\2\2\2\u0133\u0134\13\2\2\2"+
		"\u0134\u0135\b*\3\2\u0135T\3\2\2\2\16\2\u00ab\u00b7\u00bf\u00e3\u00ef"+
		"\u00f9\u0110\u0116\u011b\u0123\u012c\4\b\2\2\3*\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}