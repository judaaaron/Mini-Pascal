// Generated from Language.g4 by ANTLR 4.4
package Mini_Pascal.pascalito;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, PROGRAM=3, CHAR=4, IF=5, ELSE=6, INT=7, BOOLEAN=8, REPEAT=9, 
		FOR=10, UNTIL=11, AND=12, OR=13, NOT=14, VAR=15, READ=16, WRITE=17, PLUS=18, 
		MINUS=19, MULTI=20, DIV=21, GT=22, LT=23, GEQ=24, LEQ=25, EQ=26, ASSIGN=27, 
		LBRA=28, RBRA=29, LPAR=30, RPAR=31, PUNTOCOMA=32, ID=33, NUMBER=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "PROGRAM", "CHAR", "IF", "ELSE", "INT", "BOOLEAN", "REPEAT", 
		"FOR", "UNTIL", "AND", "OR", "NOT", "VAR", "READ", "WRITE", "PLUS", "MINUS", 
		"MULTI", "DIV", "GT", "LT", "GEQ", "LEQ", "EQ", "ASSIGN", "LBRA", "RBRA", 
		"LPAR", "RPAR", "PUNTOCOMA", "ID", "NUMBER", "WS"
	};


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\7\"\u00c5\n\"\f\"\16\"\u00c8\13\"\3#\7#\u00cb\n#\f#\16#\u00ce"+
		"\13#\3$\6$\u00d1\n$\r$\16$\u00d2\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\5\2C\\"+
		"aac|\5\2\62;C\\c|\3\2\62;\4\2\13\f\17\17\u00d8\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5O\3\2\2\2"+
		"\7U\3\2\2\2\t]\3\2\2\2\13b\3\2\2\2\re\3\2\2\2\17j\3\2\2\2\21n\3\2\2\2"+
		"\23v\3\2\2\2\25}\3\2\2\2\27\u0081\3\2\2\2\31\u0087\3\2\2\2\33\u008b\3"+
		"\2\2\2\35\u008e\3\2\2\2\37\u0092\3\2\2\2!\u0096\3\2\2\2#\u009b\3\2\2\2"+
		"%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a5\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3"+
		"\2\2\2/\u00ab\3\2\2\2\61\u00ad\3\2\2\2\63\u00b0\3\2\2\2\65\u00b3\3\2\2"+
		"\2\67\u00b5\3\2\2\29\u00b8\3\2\2\2;\u00ba\3\2\2\2=\u00bc\3\2\2\2?\u00be"+
		"\3\2\2\2A\u00c0\3\2\2\2C\u00c2\3\2\2\2E\u00cc\3\2\2\2G\u00d0\3\2\2\2I"+
		"J\7y\2\2JK\7q\2\2KL\7t\2\2LM\7n\2\2MN\7f\2\2N\4\3\2\2\2OP\7j\2\2PQ\7g"+
		"\2\2QR\7n\2\2RS\7n\2\2ST\7q\2\2T\6\3\2\2\2UV\7r\2\2VW\7t\2\2WX\7q\2\2"+
		"XY\7i\2\2YZ\7t\2\2Z[\7c\2\2[\\\7o\2\2\\\b\3\2\2\2]^\7e\2\2^_\7j\2\2_`"+
		"\7c\2\2`a\7t\2\2a\n\3\2\2\2bc\7k\2\2cd\7h\2\2d\f\3\2\2\2ef\7g\2\2fg\7"+
		"n\2\2gh\7u\2\2hi\7g\2\2i\16\3\2\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2m\20\3\2"+
		"\2\2no\7d\2\2op\7q\2\2pq\7q\2\2qr\7n\2\2rs\7g\2\2st\7c\2\2tu\7p\2\2u\22"+
		"\3\2\2\2vw\7t\2\2wx\7g\2\2xy\7r\2\2yz\7g\2\2z{\7c\2\2{|\7v\2\2|\24\3\2"+
		"\2\2}~\7h\2\2~\177\7q\2\2\177\u0080\7t\2\2\u0080\26\3\2\2\2\u0081\u0082"+
		"\7w\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7n\2\2\u0086\30\3\2\2\2\u0087\u0088\7c\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7f\2\2\u008a\32\3\2\2\2\u008b\u008c\7q\2\2\u008c\u008d\7t\2\2\u008d"+
		"\34\3\2\2\2\u008e\u008f\7p\2\2\u008f\u0090\7q\2\2\u0090\u0091\7v\2\2\u0091"+
		"\36\3\2\2\2\u0092\u0093\7x\2\2\u0093\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095"+
		" \3\2\2\2\u0096\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7f\2\2\u009a\"\3\2\2\2\u009b\u009c\7y\2\2\u009c\u009d\7t\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7g\2\2\u00a0$\3\2\2\2\u00a1"+
		"\u00a2\7-\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4(\3\2\2\2\u00a5\u00a6"+
		"\7,\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8,\3\2\2\2\u00a9\u00aa"+
		"\7@\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\60\3\2\2\2\u00ad\u00ae"+
		"\7@\2\2\u00ae\u00af\7?\2\2\u00af\62\3\2\2\2\u00b0\u00b1\7>\2\2\u00b1\u00b2"+
		"\7?\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\66\3\2\2\2\u00b5\u00b6"+
		"\7<\2\2\u00b6\u00b7\7?\2\2\u00b78\3\2\2\2\u00b8\u00b9\7}\2\2\u00b9:\3"+
		"\2\2\2\u00ba\u00bb\7\177\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd>"+
		"\3\2\2\2\u00be\u00bf\7+\2\2\u00bf@\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1B\3"+
		"\2\2\2\u00c2\u00c6\t\2\2\2\u00c3\u00c5\t\3\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7D\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00cb\t\4\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cdF\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d1\t\5\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\b$\2\2\u00d5H\3\2\2\2\6\2\u00c6\u00cc\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}