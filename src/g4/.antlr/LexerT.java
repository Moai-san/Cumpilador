// Generated from c:\Users\nlago\Documents\GitHub\Cumpilador\src\g4\LexerT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, PRINT=2, READ=3, CHAR=4, INT=5, REAL=6, VOID=7, BOOLEAN=8, MAT_SIMBOLS=9, 
		PLUS=10, MINUS=11, MULT=12, DIV=13, POW=14, ASSIGN=15, OP_SIMBOLS=16, 
		AND=17, OR=18, NOT=19, EQUAL=20, NOT_EQUAL=21, GREATER=22, LESSER=23, 
		GREATER_OR_EQUAL=24, LESSER_OR_EQUAL=25, BRACE_OPEN=26, BRACE_CLOSE=27, 
		BRACKET_OPEN=28, BRACKET_CLOSE=29, PAR_OPEN=30, PAR_CLOSE=31, SEMICOLON=32, 
		COMMA=33, IF=34, ELSE=35, DO=36, WHILE=37, FOR=38, NULL=39, RETURN=40, 
		CONSTANT=41, VAL_BOOLEAN=42, PI=43, FACT=44, MOD=45, SIN=46, COS=47, NAME_VAR=48, 
		NUMBER=49, WORDS=50, WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "PRINT", "READ", "CHAR", "INT", "REAL", "VOID", "BOOLEAN", "MAT_SIMBOLS", 
			"PLUS", "MINUS", "MULT", "DIV", "POW", "ASSIGN", "OP_SIMBOLS", "AND", 
			"OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER", "LESSER", "GREATER_OR_EQUAL", 
			"LESSER_OR_EQUAL", "BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "COMMA", "IF", "ELSE", "DO", "WHILE", 
			"FOR", "NULL", "RETURN", "CONSTANT", "VAL_BOOLEAN", "PI", "FACT", "MOD", 
			"SIN", "COS", "NAME_VAR", "NUMBER", "WORDS", "LOWER_CHAR", "UPPER_CHAR", 
			"DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'nyetak'", "'maca'", "'watak'", "'babak'", "'nyata'", 
			"'void'", "'bool'", null, "'+'", "'-'", "'*'", "'/'", "'^'", "'='", null, 
			"'&'", "'|'", "'!'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'{'", 
			"'}'", "'['", "']'", "'('", "')'", "';'", "','", "'yen'", "'liyane'", 
			"'nggawe'", "'nalika'", "'kangoo'", "'NULL'", "'bali'", "'pancet'", null, 
			"'3,14159265358'", "'FACT'", "'MOD'", "'SIN'", "'COS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "PRINT", "READ", "CHAR", "INT", "REAL", "VOID", "BOOLEAN", 
			"MAT_SIMBOLS", "PLUS", "MINUS", "MULT", "DIV", "POW", "ASSIGN", "OP_SIMBOLS", 
			"AND", "OR", "NOT", "EQUAL", "NOT_EQUAL", "GREATER", "LESSER", "GREATER_OR_EQUAL", 
			"LESSER_OR_EQUAL", "BRACE_OPEN", "BRACE_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", 
			"PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "COMMA", "IF", "ELSE", "DO", "WHILE", 
			"FOR", "NULL", "RETURN", "CONSTANT", "VAL_BOOLEAN", "PI", "FACT", "MOD", 
			"SIN", "COS", "NAME_VAR", "NUMBER", "WORDS", "WS"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u016d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00b8\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u011b\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\7\61\u0141\n\61\f\61\16\61\u0144\13\61\3\62"+
		"\5\62\u0147\n\62\3\62\6\62\u014a\n\62\r\62\16\62\u014b\3\62\3\62\6\62"+
		"\u0150\n\62\r\62\16\62\u0151\5\62\u0154\n\62\3\63\3\63\3\63\3\63\7\63"+
		"\u015a\n\63\f\63\16\63\u015d\13\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\6\67\u0168\n\67\r\67\16\67\u0169\3\67\3\67\2\28\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\2k\2m\65\3\2\b\4\2//aa"+
		"\4\2$$^^\3\2c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\2\u0180\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5t\3\2\2\2\7{\3\2\2\2\t\u0080\3\2"+
		"\2\2\13\u0086\3\2\2\2\r\u008c\3\2\2\2\17\u0092\3\2\2\2\21\u0097\3\2\2"+
		"\2\23\u00a1\3\2\2\2\25\u00a3\3\2\2\2\27\u00a5\3\2\2\2\31\u00a7\3\2\2\2"+
		"\33\u00a9\3\2\2\2\35\u00ab\3\2\2\2\37\u00ad\3\2\2\2!\u00b7\3\2\2\2#\u00b9"+
		"\3\2\2\2%\u00bb\3\2\2\2\'\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c2\3\2\2\2"+
		"-\u00c5\3\2\2\2/\u00c7\3\2\2\2\61\u00c9\3\2\2\2\63\u00cc\3\2\2\2\65\u00cf"+
		"\3\2\2\2\67\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d5\3\2\2\2=\u00d7\3\2\2\2"+
		"?\u00d9\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E\u00df\3\2\2\2G\u00e3\3"+
		"\2\2\2I\u00ea\3\2\2\2K\u00f1\3\2\2\2M\u00f8\3\2\2\2O\u00ff\3\2\2\2Q\u0104"+
		"\3\2\2\2S\u0109\3\2\2\2U\u011a\3\2\2\2W\u011c\3\2\2\2Y\u012a\3\2\2\2["+
		"\u012f\3\2\2\2]\u0133\3\2\2\2_\u0137\3\2\2\2a\u013b\3\2\2\2c\u0146\3\2"+
		"\2\2e\u0155\3\2\2\2g\u0160\3\2\2\2i\u0162\3\2\2\2k\u0164\3\2\2\2m\u0167"+
		"\3\2\2\2op\7o\2\2pq\7c\2\2qr\7k\2\2rs\7p\2\2s\4\3\2\2\2tu\7p\2\2uv\7{"+
		"\2\2vw\7g\2\2wx\7v\2\2xy\7c\2\2yz\7m\2\2z\6\3\2\2\2{|\7o\2\2|}\7c\2\2"+
		"}~\7e\2\2~\177\7c\2\2\177\b\3\2\2\2\u0080\u0081\7y\2\2\u0081\u0082\7c"+
		"\2\2\u0082\u0083\7v\2\2\u0083\u0084\7c\2\2\u0084\u0085\7m\2\2\u0085\n"+
		"\3\2\2\2\u0086\u0087\7d\2\2\u0087\u0088\7c\2\2\u0088\u0089\7d\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7m\2\2\u008b\f\3\2\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7{\2\2\u008e\u008f\7c\2\2\u008f\u0090\7v\2\2\u0090\u0091\7c\2\2"+
		"\u0091\16\3\2\2\2\u0092\u0093\7x\2\2\u0093\u0094\7q\2\2\u0094\u0095\7"+
		"k\2\2\u0095\u0096\7f\2\2\u0096\20\3\2\2\2\u0097\u0098\7d\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7q\2\2\u009a\u009b\7n\2\2\u009b\22\3\2\2\2\u009c\u00a2"+
		"\5\25\13\2\u009d\u00a2\5\27\f\2\u009e\u00a2\5\31\r\2\u009f\u00a2\5\33"+
		"\16\2\u00a0\u00a2\5\35\17\2\u00a1\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1"+
		"\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\24\3\2\2"+
		"\2\u00a3\u00a4\7-\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\30\3\2"+
		"\2\2\u00a7\u00a8\7,\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\34"+
		"\3\2\2\2\u00ab\u00ac\7`\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae"+
		" \3\2\2\2\u00af\u00b8\5#\22\2\u00b0\u00b8\5%\23\2\u00b1\u00b8\5-\27\2"+
		"\u00b2\u00b8\5/\30\2\u00b3\u00b8\5\61\31\2\u00b4\u00b8\5\63\32\2\u00b5"+
		"\u00b8\5)\25\2\u00b6\u00b8\5+\26\2\u00b7\u00af\3\2\2\2\u00b7\u00b0\3\2"+
		"\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\"\3\2\2\2"+
		"\u00b9\u00ba\7(\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7~\2\2\u00bc&\3\2\2\2\u00bd"+
		"\u00be\7#\2\2\u00be(\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c1\7?\2\2\u00c1"+
		"*\3\2\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4\7?\2\2\u00c4,\3\2\2\2\u00c5\u00c6"+
		"\7@\2\2\u00c6.\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8\60\3\2\2\2\u00c9\u00ca"+
		"\7@\2\2\u00ca\u00cb\7?\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7}\2\2\u00d0\66\3\2\2\2\u00d1\u00d2"+
		"\7\177\2\2\u00d28\3\2\2\2\u00d3\u00d4\7]\2\2\u00d4:\3\2\2\2\u00d5\u00d6"+
		"\7_\2\2\u00d6<\3\2\2\2\u00d7\u00d8\7*\2\2\u00d8>\3\2\2\2\u00d9\u00da\7"+
		"+\2\2\u00da@\3\2\2\2\u00db\u00dc\7=\2\2\u00dcB\3\2\2\2\u00dd\u00de\7."+
		"\2\2\u00deD\3\2\2\2\u00df\u00e0\7{\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7p\2\2\u00e2F\3\2\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6"+
		"\7{\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7g\2\2\u00e9"+
		"H\3\2\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed\7i\2\2\u00ed"+
		"\u00ee\7c\2\2\u00ee\u00ef\7y\2\2\u00ef\u00f0\7g\2\2\u00f0J\3\2\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7k\2\2"+
		"\u00f5\u00f6\7m\2\2\u00f6\u00f7\7c\2\2\u00f7L\3\2\2\2\u00f8\u00f9\7m\2"+
		"\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd"+
		"\7q\2\2\u00fd\u00fe\7q\2\2\u00feN\3\2\2\2\u00ff\u0100\7P\2\2\u0100\u0101"+
		"\7W\2\2\u0101\u0102\7N\2\2\u0102\u0103\7N\2\2\u0103P\3\2\2\2\u0104\u0105"+
		"\7d\2\2\u0105\u0106\7c\2\2\u0106\u0107\7n\2\2\u0107\u0108\7k\2\2\u0108"+
		"R\3\2\2\2\u0109\u010a\7r\2\2\u010a\u010b\7c\2\2\u010b\u010c\7p\2\2\u010c"+
		"\u010d\7e\2\2\u010d\u010e\7g\2\2\u010e\u010f\7v\2\2\u010fT\3\2\2\2\u0110"+
		"\u0111\7d\2\2\u0111\u0112\7g\2\2\u0112\u0113\7p\2\2\u0113\u0114\7g\2\2"+
		"\u0114\u011b\7t\2\2\u0115\u0116\7r\2\2\u0116\u0117\7c\2\2\u0117\u0118"+
		"\7n\2\2\u0118\u0119\7u\2\2\u0119\u011b\7w\2\2\u011a\u0110\3\2\2\2\u011a"+
		"\u0115\3\2\2\2\u011bV\3\2\2\2\u011c\u011d\7\65\2\2\u011d\u011e\7.\2\2"+
		"\u011e\u011f\7\63\2\2\u011f\u0120\7\66\2\2\u0120\u0121\7\63\2\2\u0121"+
		"\u0122\7\67\2\2\u0122\u0123\7;\2\2\u0123\u0124\7\64\2\2\u0124\u0125\7"+
		"8\2\2\u0125\u0126\7\67\2\2\u0126\u0127\7\65\2\2\u0127\u0128\7\67\2\2\u0128"+
		"\u0129\7:\2\2\u0129X\3\2\2\2\u012a\u012b\7H\2\2\u012b\u012c\7C\2\2\u012c"+
		"\u012d\7E\2\2\u012d\u012e\7V\2\2\u012eZ\3\2\2\2\u012f\u0130\7O\2\2\u0130"+
		"\u0131\7Q\2\2\u0131\u0132\7F\2\2\u0132\\\3\2\2\2\u0133\u0134\7U\2\2\u0134"+
		"\u0135\7K\2\2\u0135\u0136\7P\2\2\u0136^\3\2\2\2\u0137\u0138\7E\2\2\u0138"+
		"\u0139\7Q\2\2\u0139\u013a\7U\2\2\u013a`\3\2\2\2\u013b\u0142\5g\64\2\u013c"+
		"\u0141\5g\64\2\u013d\u0141\5i\65\2\u013e\u0141\5k\66\2\u013f\u0141\t\2"+
		"\2\2\u0140\u013c\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143b\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\7/\2\2\u0146\u0145"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a\5k\66\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u0153\3\2\2\2\u014d\u014f\7\60\2\2\u014e\u0150\5k\66\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0154\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"d\3\2\2\2\u0155\u015b\7$\2\2\u0156\u015a\n\3\2\2\u0157\u0158\7^\2\2\u0158"+
		"\u015a\13\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015d\3"+
		"\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\7$\2\2\u015ff\3\2\2\2\u0160\u0161\t\4\2\2\u0161"+
		"h\3\2\2\2\u0162\u0163\t\5\2\2\u0163j\3\2\2\2\u0164\u0165\t\6\2\2\u0165"+
		"l\3\2\2\2\u0166\u0168\t\7\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2"+
		"\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c"+
		"\b\67\2\2\u016cn\3\2\2\2\17\2\u00a1\u00b7\u011a\u0140\u0142\u0146\u014b"+
		"\u0151\u0153\u0159\u015b\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}