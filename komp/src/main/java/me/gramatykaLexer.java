// Generated from me/gramatyka.g4 by ANTLR 4.7
package me;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramatykaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ANDAND=1, OROR=2, LNO=3, PNO=4, LNK=5, PNK=6, PRIVATE=7, PUBLIC=8, PROTECTED=9, 
		EQUAL=10, LOWER=11, GREATER=12, LOWERE=13, GREATERE=14, ASSIGN=15, PLUS=16, 
		MINUS=17, MUL=18, DIV=19, INCLEMENT=20, IF=21, ELSEIF=22, ELSE=23, WHILE=24, 
		RETURN=25, FOR=26, SEMICOL=27, FORSEMICOL=28, DOT=29, COMMA=30, CD=31, 
		INT=32, STRING=33, DOUBLE=34, FLOAT=35, BOOL=36, PACKAGE=37, IMPORT=38, 
		BREAK=39, IDENT=40, WORD=41, LOWERCASE=42, DIGIT=43, NON_ZERO_DIGIT=44, 
		NUMBER=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ANDAND", "OROR", "LNO", "PNO", "LNK", "PNK", "PRIVATE", "PUBLIC", "PROTECTED", 
		"EQUAL", "LOWER", "GREATER", "LOWERE", "GREATERE", "ASSIGN", "PLUS", "MINUS", 
		"MUL", "DIV", "INCLEMENT", "IF", "ELSEIF", "ELSE", "WHILE", "RETURN", 
		"FOR", "SEMICOL", "FORSEMICOL", "DOT", "COMMA", "CD", "INT", "STRING", 
		"DOUBLE", "FLOAT", "BOOL", "PACKAGE", "IMPORT", "BREAK", "IDENT", "WORD", 
		"LOWERCASE", "DIGIT", "NON_ZERO_DIGIT", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&&'", "'||'", "'('", "')'", "'{\n'", "'}'", "'private '", "'public '", 
		"'protected '", "'=='", "'<'", "'>'", "'<='", "'>='", "'='", "'+'", "'-'", 
		"'*'", "'/'", "'++'", "'if'", "'elseif'", "'else'", "'while'", "'return'", 
		"'for'", "';\n'", "'; '", "'.'", "','", "'\"'", "'int'", "'String'", "'double'", 
		"'float'", "'boolean'", "'package'", "'import'", "'break'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ANDAND", "OROR", "LNO", "PNO", "LNK", "PNK", "PRIVATE", "PUBLIC", 
		"PROTECTED", "EQUAL", "LOWER", "GREATER", "LOWERE", "GREATERE", "ASSIGN", 
		"PLUS", "MINUS", "MUL", "DIV", "INCLEMENT", "IF", "ELSEIF", "ELSE", "WHILE", 
		"RETURN", "FOR", "SEMICOL", "FORSEMICOL", "DOT", "COMMA", "CD", "INT", 
		"STRING", "DOUBLE", "FLOAT", "BOOL", "PACKAGE", "IMPORT", "BREAK", "IDENT", 
		"WORD", "LOWERCASE", "DIGIT", "NON_ZERO_DIGIT", "NUMBER", "WS"
	};
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


	public gramatykaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatyka.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0127\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3)\3)\7)\u0108\n)\f)\16)\u010b\13)\3*\3*\7*\u010f\n*"+
		"\f*\16*\u0112\13*\3+\3+\3,\3,\3-\3-\3.\3.\7.\u011c\n.\f.\16.\u011f\13"+
		".\3/\6/\u0122\n/\r/\16/\u0123\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2c|\3\2\62;\3\2\63;\4\2\13"+
		"\f\"\"\2\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3"+
		"_\3\2\2\2\5b\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rl\3\2\2\2\17n"+
		"\3\2\2\2\21w\3\2\2\2\23\177\3\2\2\2\25\u008a\3\2\2\2\27\u008d\3\2\2\2"+
		"\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\u0094\3\2\2\2\37\u0097\3\2\2\2!"+
		"\u0099\3\2\2\2#\u009b\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3"+
		"\2\2\2+\u00a4\3\2\2\2-\u00a7\3\2\2\2/\u00ae\3\2\2\2\61\u00b3\3\2\2\2\63"+
		"\u00b9\3\2\2\2\65\u00c0\3\2\2\2\67\u00c4\3\2\2\29\u00c7\3\2\2\2;\u00ca"+
		"\3\2\2\2=\u00cc\3\2\2\2?\u00ce\3\2\2\2A\u00d0\3\2\2\2C\u00d4\3\2\2\2E"+
		"\u00db\3\2\2\2G\u00e2\3\2\2\2I\u00e8\3\2\2\2K\u00f0\3\2\2\2M\u00f8\3\2"+
		"\2\2O\u00ff\3\2\2\2Q\u0105\3\2\2\2S\u010c\3\2\2\2U\u0113\3\2\2\2W\u0115"+
		"\3\2\2\2Y\u0117\3\2\2\2[\u0119\3\2\2\2]\u0121\3\2\2\2_`\7(\2\2`a\7(\2"+
		"\2a\4\3\2\2\2bc\7~\2\2cd\7~\2\2d\6\3\2\2\2ef\7*\2\2f\b\3\2\2\2gh\7+\2"+
		"\2h\n\3\2\2\2ij\7}\2\2jk\7\f\2\2k\f\3\2\2\2lm\7\177\2\2m\16\3\2\2\2no"+
		"\7r\2\2op\7t\2\2pq\7k\2\2qr\7x\2\2rs\7c\2\2st\7v\2\2tu\7g\2\2uv\7\"\2"+
		"\2v\20\3\2\2\2wx\7r\2\2xy\7w\2\2yz\7d\2\2z{\7n\2\2{|\7k\2\2|}\7e\2\2}"+
		"~\7\"\2\2~\22\3\2\2\2\177\u0080\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0083\7v\2\2\u0083\u0084\7g\2\2\u0084\u0085\7e\2\2\u0085"+
		"\u0086\7v\2\2\u0086\u0087\7g\2\2\u0087\u0088\7f\2\2\u0088\u0089\7\"\2"+
		"\2\u0089\24\3\2\2\2\u008a\u008b\7?\2\2\u008b\u008c\7?\2\2\u008c\26\3\2"+
		"\2\2\u008d\u008e\7>\2\2\u008e\30\3\2\2\2\u008f\u0090\7@\2\2\u0090\32\3"+
		"\2\2\2\u0091\u0092\7>\2\2\u0092\u0093\7?\2\2\u0093\34\3\2\2\2\u0094\u0095"+
		"\7@\2\2\u0095\u0096\7?\2\2\u0096\36\3\2\2\2\u0097\u0098\7?\2\2\u0098 "+
		"\3\2\2\2\u0099\u009a\7-\2\2\u009a\"\3\2\2\2\u009b\u009c\7/\2\2\u009c$"+
		"\3\2\2\2\u009d\u009e\7,\2\2\u009e&\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"(\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2\u00a3\7-\2\2\u00a3*\3\2\2\2\u00a4\u00a5"+
		"\7k\2\2\u00a5\u00a6\7h\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7n\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7k\2\2\u00ac"+
		"\u00ad\7h\2\2\u00ad.\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7y\2\2\u00b4"+
		"\u00b5\7j\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8\62\3\2\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7"+
		"v\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7p\2\2\u00bf\64"+
		"\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\66\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5\u00c6\7\f\2\2\u00c68\3\2\2\2\u00c7"+
		"\u00c8\7=\2\2\u00c8\u00c9\7\"\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7\60\2\2"+
		"\u00cb<\3\2\2\2\u00cc\u00cd\7.\2\2\u00cd>\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf"+
		"@\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7v\2\2\u00d3"+
		"B\3\2\2\2\u00d4\u00d5\7U\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7t\2\2\u00d7"+
		"\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7i\2\2\u00daD\3\2\2\2\u00db"+
		"\u00dc\7f\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7d\2\2"+
		"\u00df\u00e0\7n\2\2\u00e0\u00e1\7g\2\2\u00e1F\3\2\2\2\u00e2\u00e3\7h\2"+
		"\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7H\3\2\2\2\u00e8\u00e9\7d\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb"+
		"\7q\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7c\2\2\u00ee"+
		"\u00ef\7p\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7c\2\2\u00f2"+
		"\u00f3\7e\2\2\u00f3\u00f4\7m\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7i\2\2"+
		"\u00f6\u00f7\7g\2\2\u00f7L\3\2\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7o\2"+
		"\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe"+
		"\7v\2\2\u00feN\3\2\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7t\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7c\2\2\u0103\u0104\7m\2\2\u0104P\3\2\2\2\u0105\u0109"+
		"\t\2\2\2\u0106\u0108\t\3\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aR\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\u010c\u0110\5U+\2\u010d\u010f\5U+\2\u010e\u010d\3\2\2\2\u010f\u0112\3"+
		"\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111T\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0113\u0114\t\4\2\2\u0114V\3\2\2\2\u0115\u0116\t\5\2\2\u0116"+
		"X\3\2\2\2\u0117\u0118\t\6\2\2\u0118Z\3\2\2\2\u0119\u011d\5Y-\2\u011a\u011c"+
		"\5W,\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\\\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\t\7\2\2"+
		"\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b/\2\2\u0126^\3\2\2\2\7\2\u0109"+
		"\u0110\u011d\u0123\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}