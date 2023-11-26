// Generated from E:/OneDrive/OneDrive - Universitatea Politehnica Bucuresti/Cursuri/Anul 4/Semestrul 1/CPL/Tema1/out/production/Tema1/cool/lexer/CoolLexer.g4 by ANTLR 4.13.1

    package cool.lexer;	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, IF=2, THEN=3, ELSE=4, FI=5, CLASS=6, INHERITS=7, WHILE=8, LOOP=9, 
		POOL=10, NOT=11, ISVOID=12, NEW=13, SELF=14, ATSIGN=15, LET=16, IN=17, 
		CASE=18, OF=19, ESAC=20, BOOL=21, TYPE=22, ID=23, INT=24, FLOAT=25, STRING=26, 
		SEMI=27, DOT=28, COLON=29, COMMA=30, ASSIGN=31, TILDE=32, EQUAL=33, LPAREN=34, 
		RPAREN=35, LBRACE=36, RBRACE=37, PLUS=38, MINUS=39, MULT=40, DIV=41, LT=42, 
		LE=43, ARROW=44, LINE_COMMENT=45, BLOCK_COMMENT=46, UNMATCHED_COMMENT=47, 
		EOF_COMMENT=48, WS=49, INVALID_CHARACTER=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "THEN", "ELSE", "FI", "CLASS", "INHERITS", "WHILE", "LOOP", "POOL", 
			"NOT", "ISVOID", "NEW", "SELF", "ATSIGN", "LET", "IN", "CASE", "OF", 
			"ESAC", "BOOL", "TYPE", "LETTER", "ID", "DIGIT", "INT", "DIGITS", "EXPONENT", 
			"FLOAT", "STRING", "SEMI", "DOT", "COLON", "COMMA", "ASSIGN", "TILDE", 
			"EQUAL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "PLUS", "MINUS", "MULT", 
			"DIV", "LT", "LE", "ARROW", "NEW_LINE", "LINE_COMMENT", "BLOCK_COMMENT", 
			"UNMATCHED_COMMENT", "EOF_COMMENT", "WS", "INVALID_CHARACTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'if'", "'then'", "'else'", "'fi'", "'class'", "'inherits'", 
			"'while'", "'loop'", "'pool'", "'not'", "'isvoid'", "'new'", "'self'", 
			"'@'", "'let'", "'in'", "'case'", "'of'", "'esac'", null, null, null, 
			null, null, null, "';'", "'.'", "':'", "','", "'<-'", "'~'", "'='", "'('", 
			"')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "IF", "THEN", "ELSE", "FI", "CLASS", "INHERITS", "WHILE", 
			"LOOP", "POOL", "NOT", "ISVOID", "NEW", "SELF", "ATSIGN", "LET", "IN", 
			"CASE", "OF", "ESAC", "BOOL", "TYPE", "ID", "INT", "FLOAT", "STRING", 
			"SEMI", "DOT", "COLON", "COMMA", "ASSIGN", "TILDE", "EQUAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "PLUS", "MINUS", "MULT", "DIV", "LT", "LE", 
			"ARROW", "LINE_COMMENT", "BLOCK_COMMENT", "UNMATCHED_COMMENT", "EOF_COMMENT", 
			"WS", "INVALID_CHARACTER"
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

	    
	    private void raiseError(String msg) {
	        setText(msg);
	        setType(ERROR);
	    }


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

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
		case 28:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			UNMATCHED_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			EOF_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			INVALID_CHARACTER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			           String s = getText().substring(1, getText().length()-1);
			            for (int i = 2; i < s.length(); i++) {
			                if ((s.charAt(i) == '\n' && s.charAt(i - 2) != '\\' && s.charAt(i-1) == '\r')){
			                    raiseError("Unterminated string constant");
			                    return;
			                }
			            }
			            if(s.length()>1024){
			                raiseError("String constant too long");
			                return;
			            }
			            if(s.contains("\u0000")==true){
			                raiseError("String contains null character");
			                return;
			            }
			            String newStr = "";
			            for (int i = 0; i < s.length(); i++) {
			                if(s.charAt(i) == '\\')
			                {
			                    if(s.charAt(i+1) == 't')
			                    {
			                        newStr += '\t';
			                        i++;
			                    }
			                    else if(s.charAt(i+1) == 'n')
			                    {
			                        newStr += '\n';
			                        i++;
			                    }
			                    else if(s.charAt(i+1) == 'b')
			                    {
			                        newStr += '\b';
			                        i++;
			                    }
			                    else if(s.charAt(i+1) == 'f')
			                    {
			                        newStr += '\f';
			                        i++;
			                    }
			                    else
			                    {
			                        newStr += s.charAt(i+1);
			                        i++;
			                    }
			                }
			                else
			                {
			                    newStr+=s.charAt(i);
			                }
			            }
			            setText(newStr);
			    
			break;
		case 1:
			 raiseError("Unterminated string constant"); 
			break;
		case 2:

			        raiseError("EOF in string constant");
			    
			break;
		}
	}
	private void UNMATCHED_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 raiseError("Unmatched *)"); 
			break;
		}
	}
	private void EOF_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 raiseError("EOF in comment"); 
			break;
		}
	}
	private void INVALID_CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 raiseError("Invalid character: "+getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u00002\u01a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00d0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00f0\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u00f6\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u00fb\b\u0016\n\u0016\f\u0016\u00fe\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u0103\b\u0018\u000b\u0018"+
		"\f\u0018\u0104\u0001\u0019\u0004\u0019\u0108\b\u0019\u000b\u0019\f\u0019"+
		"\u0109\u0001\u001a\u0001\u001a\u0003\u001a\u010e\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0115\b\u001b\u0003"+
		"\u001b\u0117\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u011b\b\u001b"+
		"\u0001\u001b\u0003\u001b\u011e\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0125\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0129\b\u001c\n\u001c\f\u001c\u012c\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0132\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0139\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001/\u0003/\u0163\b/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00010\u00050\u016b\b0\n0\f0\u016e\t0\u00010\u00010\u00030\u0172\b0"+
		"\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00051\u017b\b1\n1\f"+
		"1\u017e\t1\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00052\u0189\b2\n2\f2\u018c\t2\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00013\u00053\u0196\b3\n3\f3\u0199\t3\u00013\u00013\u00013\u0001"+
		"4\u00044\u019f\b4\u000b4\f4\u01a0\u00014\u00014\u00015\u00015\u00015\u0005"+
		"\u012a\u016c\u017c\u018a\u0197\u00006\u0001\u0002\u0003\u0003\u0005\u0004"+
		"\u0007\u0005\t\u0006\u000b\u0007\r\b\u000f\t\u0011\n\u0013\u000b\u0015"+
		"\f\u0017\r\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011!\u0012#\u0013"+
		"%\u0014\'\u0015)\u0016+\u0000-\u0017/\u00001\u00183\u00005\u00007\u0019"+
		"9\u001a;\u001b=\u001c?\u001dA\u001eC\u001fE G!I\"K#M$O%Q&S\'U(W)Y*[+]"+
		",_\u0000a-c.e/g0i1k2\u0001\u0000\b\u0002\u0000AZaz\u0001\u000009\u0002"+
		"\u0000++--\u0001\u0000\\\\\u0002\u0000((**\u0001\u0000)*\u0003\u0000\t"+
		"\n\f\r  \u0003\u0000\t\n\r\r  \u01c2\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001"+
		"\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000"+
		"\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000"+
		"a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001"+
		"\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000"+
		"\u0000\u0000k\u0001\u0000\u0000\u0000\u0001m\u0001\u0000\u0000\u0000\u0003"+
		"p\u0001\u0000\u0000\u0000\u0005u\u0001\u0000\u0000\u0000\u0007z\u0001"+
		"\u0000\u0000\u0000\t}\u0001\u0000\u0000\u0000\u000b\u0083\u0001\u0000"+
		"\u0000\u0000\r\u008c\u0001\u0000\u0000\u0000\u000f\u0092\u0001\u0000\u0000"+
		"\u0000\u0011\u0097\u0001\u0000\u0000\u0000\u0013\u009c\u0001\u0000\u0000"+
		"\u0000\u0015\u00a0\u0001\u0000\u0000\u0000\u0017\u00a7\u0001\u0000\u0000"+
		"\u0000\u0019\u00ab\u0001\u0000\u0000\u0000\u001b\u00b0\u0001\u0000\u0000"+
		"\u0000\u001d\u00b2\u0001\u0000\u0000\u0000\u001f\u00b6\u0001\u0000\u0000"+
		"\u0000!\u00b9\u0001\u0000\u0000\u0000#\u00be\u0001\u0000\u0000\u0000%"+
		"\u00c1\u0001\u0000\u0000\u0000\'\u00cf\u0001\u0000\u0000\u0000)\u00ef"+
		"\u0001\u0000\u0000\u0000+\u00f1\u0001\u0000\u0000\u0000-\u00f5\u0001\u0000"+
		"\u0000\u0000/\u00ff\u0001\u0000\u0000\u00001\u0102\u0001\u0000\u0000\u0000"+
		"3\u0107\u0001\u0000\u0000\u00005\u010b\u0001\u0000\u0000\u00007\u011a"+
		"\u0001\u0000\u0000\u00009\u011f\u0001\u0000\u0000\u0000;\u013a\u0001\u0000"+
		"\u0000\u0000=\u013c\u0001\u0000\u0000\u0000?\u013e\u0001\u0000\u0000\u0000"+
		"A\u0140\u0001\u0000\u0000\u0000C\u0142\u0001\u0000\u0000\u0000E\u0145"+
		"\u0001\u0000\u0000\u0000G\u0147\u0001\u0000\u0000\u0000I\u0149\u0001\u0000"+
		"\u0000\u0000K\u014b\u0001\u0000\u0000\u0000M\u014d\u0001\u0000\u0000\u0000"+
		"O\u014f\u0001\u0000\u0000\u0000Q\u0151\u0001\u0000\u0000\u0000S\u0153"+
		"\u0001\u0000\u0000\u0000U\u0155\u0001\u0000\u0000\u0000W\u0157\u0001\u0000"+
		"\u0000\u0000Y\u0159\u0001\u0000\u0000\u0000[\u015b\u0001\u0000\u0000\u0000"+
		"]\u015e\u0001\u0000\u0000\u0000_\u0162\u0001\u0000\u0000\u0000a\u0166"+
		"\u0001\u0000\u0000\u0000c\u0175\u0001\u0000\u0000\u0000e\u0184\u0001\u0000"+
		"\u0000\u0000g\u0190\u0001\u0000\u0000\u0000i\u019e\u0001\u0000\u0000\u0000"+
		"k\u01a4\u0001\u0000\u0000\u0000mn\u0005i\u0000\u0000no\u0005f\u0000\u0000"+
		"o\u0002\u0001\u0000\u0000\u0000pq\u0005t\u0000\u0000qr\u0005h\u0000\u0000"+
		"rs\u0005e\u0000\u0000st\u0005n\u0000\u0000t\u0004\u0001\u0000\u0000\u0000"+
		"uv\u0005e\u0000\u0000vw\u0005l\u0000\u0000wx\u0005s\u0000\u0000xy\u0005"+
		"e\u0000\u0000y\u0006\u0001\u0000\u0000\u0000z{\u0005f\u0000\u0000{|\u0005"+
		"i\u0000\u0000|\b\u0001\u0000\u0000\u0000}~\u0005c\u0000\u0000~\u007f\u0005"+
		"l\u0000\u0000\u007f\u0080\u0005a\u0000\u0000\u0080\u0081\u0005s\u0000"+
		"\u0000\u0081\u0082\u0005s\u0000\u0000\u0082\n\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005i\u0000\u0000\u0084\u0085\u0005n\u0000\u0000\u0085\u0086"+
		"\u0005h\u0000\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0088\u0005r"+
		"\u0000\u0000\u0088\u0089\u0005i\u0000\u0000\u0089\u008a\u0005t\u0000\u0000"+
		"\u008a\u008b\u0005s\u0000\u0000\u008b\f\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005w\u0000\u0000\u008d\u008e\u0005h\u0000\u0000\u008e\u008f\u0005"+
		"i\u0000\u0000\u008f\u0090\u0005l\u0000\u0000\u0090\u0091\u0005e\u0000"+
		"\u0000\u0091\u000e\u0001\u0000\u0000\u0000\u0092\u0093\u0005l\u0000\u0000"+
		"\u0093\u0094\u0005o\u0000\u0000\u0094\u0095\u0005o\u0000\u0000\u0095\u0096"+
		"\u0005p\u0000\u0000\u0096\u0010\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"p\u0000\u0000\u0098\u0099\u0005o\u0000\u0000\u0099\u009a\u0005o\u0000"+
		"\u0000\u009a\u009b\u0005l\u0000\u0000\u009b\u0012\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005n\u0000\u0000\u009d\u009e\u0005o\u0000\u0000\u009e\u009f"+
		"\u0005t\u0000\u0000\u009f\u0014\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"i\u0000\u0000\u00a1\u00a2\u0005s\u0000\u0000\u00a2\u00a3\u0005v\u0000"+
		"\u0000\u00a3\u00a4\u0005o\u0000\u0000\u00a4\u00a5\u0005i\u0000\u0000\u00a5"+
		"\u00a6\u0005d\u0000\u0000\u00a6\u0016\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005n\u0000\u0000\u00a8\u00a9\u0005e\u0000\u0000\u00a9\u00aa\u0005w"+
		"\u0000\u0000\u00aa\u0018\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005s\u0000"+
		"\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad\u00ae\u0005l\u0000\u0000\u00ae"+
		"\u00af\u0005f\u0000\u0000\u00af\u001a\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005@\u0000\u0000\u00b1\u001c\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"l\u0000\u0000\u00b3\u00b4\u0005e\u0000\u0000\u00b4\u00b5\u0005t\u0000"+
		"\u0000\u00b5\u001e\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005i\u0000\u0000"+
		"\u00b7\u00b8\u0005n\u0000\u0000\u00b8 \u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005c\u0000\u0000\u00ba\u00bb\u0005a\u0000\u0000\u00bb\u00bc\u0005s"+
		"\u0000\u0000\u00bc\u00bd\u0005e\u0000\u0000\u00bd\"\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005o\u0000\u0000\u00bf\u00c0\u0005f\u0000\u0000\u00c0"+
		"$\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005e\u0000\u0000\u00c2\u00c3\u0005"+
		"s\u0000\u0000\u00c3\u00c4\u0005a\u0000\u0000\u00c4\u00c5\u0005c\u0000"+
		"\u0000\u00c5&\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005t\u0000\u0000\u00c7"+
		"\u00c8\u0005r\u0000\u0000\u00c8\u00c9\u0005u\u0000\u0000\u00c9\u00d0\u0005"+
		"e\u0000\u0000\u00ca\u00cb\u0005f\u0000\u0000\u00cb\u00cc\u0005a\u0000"+
		"\u0000\u00cc\u00cd\u0005l\u0000\u0000\u00cd\u00ce\u0005s\u0000\u0000\u00ce"+
		"\u00d0\u0005e\u0000\u0000\u00cf\u00c6\u0001\u0000\u0000\u0000\u00cf\u00ca"+
		"\u0001\u0000\u0000\u0000\u00d0(\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"I\u0000\u0000\u00d2\u00d3\u0005n\u0000\u0000\u00d3\u00f0\u0005t\u0000"+
		"\u0000\u00d4\u00d5\u0005S\u0000\u0000\u00d5\u00d6\u0005t\u0000\u0000\u00d6"+
		"\u00d7\u0005r\u0000\u0000\u00d7\u00d8\u0005i\u0000\u0000\u00d8\u00d9\u0005"+
		"n\u0000\u0000\u00d9\u00f0\u0005g\u0000\u0000\u00da\u00db\u0005O\u0000"+
		"\u0000\u00db\u00dc\u0005b\u0000\u0000\u00dc\u00dd\u0005j\u0000\u0000\u00dd"+
		"\u00de\u0005e\u0000\u0000\u00de\u00df\u0005c\u0000\u0000\u00df\u00f0\u0005"+
		"t\u0000\u0000\u00e0\u00e1\u0005I\u0000\u0000\u00e1\u00f0\u0005O\u0000"+
		"\u0000\u00e2\u00e3\u0005B\u0000\u0000\u00e3\u00e4\u0005o\u0000\u0000\u00e4"+
		"\u00e5\u0005o\u0000\u0000\u00e5\u00f0\u0005l\u0000\u0000\u00e6\u00e7\u0005"+
		"S\u0000\u0000\u00e7\u00e8\u0005E\u0000\u0000\u00e8\u00e9\u0005L\u0000"+
		"\u0000\u00e9\u00ea\u0005F\u0000\u0000\u00ea\u00eb\u0005_\u0000\u0000\u00eb"+
		"\u00ec\u0005T\u0000\u0000\u00ec\u00ed\u0005Y\u0000\u0000\u00ed\u00ee\u0005"+
		"P\u0000\u0000\u00ee\u00f0\u0005E\u0000\u0000\u00ef\u00d1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00d4\u0001\u0000\u0000\u0000\u00ef\u00da\u0001\u0000\u0000"+
		"\u0000\u00ef\u00e0\u0001\u0000\u0000\u0000\u00ef\u00e2\u0001\u0000\u0000"+
		"\u0000\u00ef\u00e6\u0001\u0000\u0000\u0000\u00f0*\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0007\u0000\u0000\u0000\u00f2,\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f6\u0003+\u0015\u0000\u00f4\u00f6\u0005_\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00fc\u0001"+
		"\u0000\u0000\u0000\u00f7\u00fb\u0003+\u0015\u0000\u00f8\u00fb\u0005_\u0000"+
		"\u0000\u00f9\u00fb\u0003/\u0017\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd.\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0001\u0000\u0000\u0100"+
		"0\u0001\u0000\u0000\u0000\u0101\u0103\u0003/\u0017\u0000\u0102\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u01052\u0001\u0000"+
		"\u0000\u0000\u0106\u0108\u0003/\u0017\u0000\u0107\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a4\u0001\u0000\u0000\u0000"+
		"\u010b\u010d\u0005e\u0000\u0000\u010c\u010e\u0007\u0002\u0000\u0000\u010d"+
		"\u010c\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u00033\u0019\u0000\u01106\u0001"+
		"\u0000\u0000\u0000\u0111\u0116\u00033\u0019\u0000\u0112\u0114\u0005.\u0000"+
		"\u0000\u0113\u0115\u00033\u0019\u0000\u0114\u0113\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000"+
		"\u0116\u0112\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u011b\u0001\u0000\u0000\u0000\u0118\u0119\u0005.\u0000\u0000\u0119"+
		"\u011b\u00033\u0019\u0000\u011a\u0111\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011e"+
		"\u00035\u001a\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e8\u0001\u0000\u0000\u0000\u011f\u012a\u0005\""+
		"\u0000\u0000\u0120\u0121\u0005\\\u0000\u0000\u0121\u0129\u0005\"\u0000"+
		"\u0000\u0122\u0124\u0005\\\u0000\u0000\u0123\u0125\u0005\r\u0000\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0129\u0005\n\u0000\u0000\u0127"+
		"\u0129\t\u0000\u0000\u0000\u0128\u0120\u0001\u0000\u0000\u0000\u0128\u0122"+
		"\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012b\u0138\u0001\u0000\u0000\u0000\u012c\u012a"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0005\"\u0000\u0000\u012e\u0139\u0006"+
		"\u001c\u0000\u0000\u012f\u0131\b\u0003\u0000\u0000\u0130\u0132\u0005\r"+
		"\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0005\n\u0000"+
		"\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0139\u0006\u001c\u0001"+
		"\u0000\u0136\u0137\u0005\u0000\u0000\u0001\u0137\u0139\u0006\u001c\u0002"+
		"\u0000\u0138\u012d\u0001\u0000\u0000\u0000\u0138\u012f\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139:\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0005;\u0000\u0000\u013b<\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0005.\u0000\u0000\u013d>\u0001\u0000\u0000\u0000\u013e\u013f\u0005:"+
		"\u0000\u0000\u013f@\u0001\u0000\u0000\u0000\u0140\u0141\u0005,\u0000\u0000"+
		"\u0141B\u0001\u0000\u0000\u0000\u0142\u0143\u0005<\u0000\u0000\u0143\u0144"+
		"\u0005-\u0000\u0000\u0144D\u0001\u0000\u0000\u0000\u0145\u0146\u0005~"+
		"\u0000\u0000\u0146F\u0001\u0000\u0000\u0000\u0147\u0148\u0005=\u0000\u0000"+
		"\u0148H\u0001\u0000\u0000\u0000\u0149\u014a\u0005(\u0000\u0000\u014aJ"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0005)\u0000\u0000\u014cL\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005{\u0000\u0000\u014eN\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0005}\u0000\u0000\u0150P\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0005+\u0000\u0000\u0152R\u0001\u0000\u0000\u0000\u0153\u0154\u0005-"+
		"\u0000\u0000\u0154T\u0001\u0000\u0000\u0000\u0155\u0156\u0005*\u0000\u0000"+
		"\u0156V\u0001\u0000\u0000\u0000\u0157\u0158\u0005/\u0000\u0000\u0158X"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0005<\u0000\u0000\u015aZ\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0005<\u0000\u0000\u015c\u015d\u0005=\u0000\u0000"+
		"\u015d\\\u0001\u0000\u0000\u0000\u015e\u015f\u0005=\u0000\u0000\u015f"+
		"\u0160\u0005>\u0000\u0000\u0160^\u0001\u0000\u0000\u0000\u0161\u0163\u0005"+
		"\r\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0005\n\u0000"+
		"\u0000\u0165`\u0001\u0000\u0000\u0000\u0166\u0167\u0005-\u0000\u0000\u0167"+
		"\u0168\u0005-\u0000\u0000\u0168\u016c\u0001\u0000\u0000\u0000\u0169\u016b"+
		"\t\u0000\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016e\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016d\u0171\u0001\u0000\u0000\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016f\u0172\u0003_/\u0000\u0170\u0172\u0005\u0000\u0000"+
		"\u0001\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u00060\u0003\u0000"+
		"\u0174b\u0001\u0000\u0000\u0000\u0175\u0176\u0005(\u0000\u0000\u0176\u0177"+
		"\u0005*\u0000\u0000\u0177\u017c\u0001\u0000\u0000\u0000\u0178\u017b\u0003"+
		"c1\u0000\u0179\u017b\t\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000"+
		"\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005*\u0000\u0000\u0180\u0181\u0005)\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u00061\u0003\u0000\u0183d\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0005*\u0000\u0000\u0185\u0186\u0005)\u0000"+
		"\u0000\u0186\u018a\u0001\u0000\u0000\u0000\u0187\u0189\t\u0000\u0000\u0000"+
		"\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000"+
		"\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\b\u0004\u0000\u0000\u018e\u018f\u00062\u0004\u0000\u018f"+
		"f\u0001\u0000\u0000\u0000\u0190\u0191\u0005(\u0000\u0000\u0191\u0192\u0005"+
		"*\u0000\u0000\u0192\u0197\u0001\u0000\u0000\u0000\u0193\u0196\u0003c1"+
		"\u0000\u0194\u0196\b\u0005\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0005\u0000\u0000\u0001\u019b\u019c\u00063\u0005\u0000\u019c"+
		"h\u0001\u0000\u0000\u0000\u019d\u019f\u0007\u0006\u0000\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u00064\u0003\u0000\u01a3j\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\b\u0007\u0000\u0000\u01a5\u01a6\u00065\u0006"+
		"\u0000\u01a6l\u0001\u0000\u0000\u0000\u001b\u0000\u00cf\u00ef\u00f5\u00fa"+
		"\u00fc\u0104\u0109\u010d\u0114\u0116\u011a\u011d\u0124\u0128\u012a\u0131"+
		"\u0138\u0162\u016c\u0171\u017a\u017c\u018a\u0195\u0197\u01a0\u0007\u0001"+
		"\u001c\u0000\u0001\u001c\u0001\u0001\u001c\u0002\u0006\u0000\u0000\u0001"+
		"2\u0003\u00013\u0004\u00015\u0005";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}