// $ANTLR 3.5.1 D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g 2020-06-11 04:48:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AnalisadorSintaticoSemanticoLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int ASSIGNMENT_OP=4;
	public static final int CONST=5;
	public static final int DO=6;
	public static final int ELSE=7;
	public static final int IF=8;
	public static final int RELATIONAL_OP=9;
	public static final int SEMICOLON=10;
	public static final int THEN=11;
	public static final int VAR=12;
	public static final int WHILE=13;
	public static final int WS=14;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public AnalisadorSintaticoSemanticoLexer() {} 
	public AnalisadorSintaticoSemanticoLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public AnalisadorSintaticoSemanticoLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:7:7: ( '(' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:7:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:8:7: ( ')' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:8:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:9:7: ( '*' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:9:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:10:7: ( '+' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:10:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:11:7: ( '-' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:11:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:12:7: ( '/' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:12:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:142:4: ( 'if' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:142:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:145:7: ( 'then' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:145:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:148:6: ( 'else' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:148:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:151:7: ( 'while' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:151:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:154:4: ( 'do' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:154:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "RELATIONAL_OP"
	public final void mRELATIONAL_OP() throws RecognitionException {
		try {
			int _type = RELATIONAL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:158:2: ( '=' | '<>' | '<' | '>' | '<=' | '>=' )
			int alt1=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt1=1;
				}
				break;
			case '<':
				{
				switch ( input.LA(2) ) {
				case '>':
					{
					alt1=2;
					}
					break;
				case '=':
					{
					alt1=5;
					}
					break;
				default:
					alt1=3;
				}
				}
				break;
			case '>':
				{
				int LA1_3 = input.LA(2);
				if ( (LA1_3=='=') ) {
					alt1=6;
				}

				else {
					alt1=4;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:158:4: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:159:4: '<>'
					{
					match("<>"); 

					}
					break;
				case 3 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:160:4: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:161:4: '>'
					{
					match('>'); 
					}
					break;
				case 5 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:162:4: '<='
					{
					match("<="); 

					}
					break;
				case 6 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:163:4: '>='
					{
					match(">="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELATIONAL_OP"

	// $ANTLR start "ASSIGNMENT_OP"
	public final void mASSIGNMENT_OP() throws RecognitionException {
		try {
			int _type = ASSIGNMENT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:167:2: ( ':=' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:167:4: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGNMENT_OP"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:171:2: ( ';' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:171:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:174:8: ( ( '0' .. '9' )+ )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:174:10: ( '0' .. '9' )+
			{
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:174:10: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:177:7: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:177:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:177:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:180:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:180:8: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | IF | THEN | ELSE | WHILE | DO | RELATIONAL_OP | ASSIGNMENT_OP | SEMICOLON | CONST | VAR | WS )
		int alt4=17;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case '*':
			{
			alt4=3;
			}
			break;
		case '+':
			{
			alt4=4;
			}
			break;
		case '-':
			{
			alt4=5;
			}
			break;
		case '/':
			{
			alt4=6;
			}
			break;
		case 'i':
			{
			int LA4_7 = input.LA(2);
			if ( (LA4_7=='f') ) {
				int LA4_18 = input.LA(3);
				if ( ((LA4_18 >= 'A' && LA4_18 <= 'Z')||(LA4_18 >= 'a' && LA4_18 <= 'z')) ) {
					alt4=16;
				}

				else {
					alt4=7;
				}

			}

			else {
				alt4=16;
			}

			}
			break;
		case 't':
			{
			int LA4_8 = input.LA(2);
			if ( (LA4_8=='h') ) {
				int LA4_19 = input.LA(3);
				if ( (LA4_19=='e') ) {
					int LA4_24 = input.LA(4);
					if ( (LA4_24=='n') ) {
						int LA4_28 = input.LA(5);
						if ( ((LA4_28 >= 'A' && LA4_28 <= 'Z')||(LA4_28 >= 'a' && LA4_28 <= 'z')) ) {
							alt4=16;
						}

						else {
							alt4=8;
						}

					}

					else {
						alt4=16;
					}

				}

				else {
					alt4=16;
				}

			}

			else {
				alt4=16;
			}

			}
			break;
		case 'e':
			{
			int LA4_9 = input.LA(2);
			if ( (LA4_9=='l') ) {
				int LA4_20 = input.LA(3);
				if ( (LA4_20=='s') ) {
					int LA4_25 = input.LA(4);
					if ( (LA4_25=='e') ) {
						int LA4_29 = input.LA(5);
						if ( ((LA4_29 >= 'A' && LA4_29 <= 'Z')||(LA4_29 >= 'a' && LA4_29 <= 'z')) ) {
							alt4=16;
						}

						else {
							alt4=9;
						}

					}

					else {
						alt4=16;
					}

				}

				else {
					alt4=16;
				}

			}

			else {
				alt4=16;
			}

			}
			break;
		case 'w':
			{
			int LA4_10 = input.LA(2);
			if ( (LA4_10=='h') ) {
				int LA4_21 = input.LA(3);
				if ( (LA4_21=='i') ) {
					int LA4_26 = input.LA(4);
					if ( (LA4_26=='l') ) {
						int LA4_30 = input.LA(5);
						if ( (LA4_30=='e') ) {
							int LA4_33 = input.LA(6);
							if ( ((LA4_33 >= 'A' && LA4_33 <= 'Z')||(LA4_33 >= 'a' && LA4_33 <= 'z')) ) {
								alt4=16;
							}

							else {
								alt4=10;
							}

						}

						else {
							alt4=16;
						}

					}

					else {
						alt4=16;
					}

				}

				else {
					alt4=16;
				}

			}

			else {
				alt4=16;
			}

			}
			break;
		case 'd':
			{
			int LA4_11 = input.LA(2);
			if ( (LA4_11=='o') ) {
				int LA4_22 = input.LA(3);
				if ( ((LA4_22 >= 'A' && LA4_22 <= 'Z')||(LA4_22 >= 'a' && LA4_22 <= 'z')) ) {
					alt4=16;
				}

				else {
					alt4=11;
				}

			}

			else {
				alt4=16;
			}

			}
			break;
		case '<':
		case '=':
		case '>':
			{
			alt4=12;
			}
			break;
		case ':':
			{
			alt4=13;
			}
			break;
		case ';':
			{
			alt4=14;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=15;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=16;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=17;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:16: T__16
				{
				mT__16(); 

				}
				break;
			case 3 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:22: T__17
				{
				mT__17(); 

				}
				break;
			case 4 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:28: T__18
				{
				mT__18(); 

				}
				break;
			case 5 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:34: T__19
				{
				mT__19(); 

				}
				break;
			case 6 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:40: T__20
				{
				mT__20(); 

				}
				break;
			case 7 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:46: IF
				{
				mIF(); 

				}
				break;
			case 8 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:49: THEN
				{
				mTHEN(); 

				}
				break;
			case 9 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:54: ELSE
				{
				mELSE(); 

				}
				break;
			case 10 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:59: WHILE
				{
				mWHILE(); 

				}
				break;
			case 11 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:65: DO
				{
				mDO(); 

				}
				break;
			case 12 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:68: RELATIONAL_OP
				{
				mRELATIONAL_OP(); 

				}
				break;
			case 13 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:82: ASSIGNMENT_OP
				{
				mASSIGNMENT_OP(); 

				}
				break;
			case 14 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:96: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 15 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:106: CONST
				{
				mCONST(); 

				}
				break;
			case 16 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:112: VAR
				{
				mVAR(); 

				}
				break;
			case 17 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:1:116: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
