// $ANTLR 3.5.1 D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g 2020-06-22 22:27:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AnalisadorSintaticoSemantico_ComComentariosLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int ASSIGNMENT_OP=4;
	public static final int COMMENT=5;
	public static final int CONST=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int IF=9;
	public static final int RELATIONAL_OP=10;
	public static final int SEMICOLON=11;
	public static final int THEN=12;
	public static final int VAR=13;
	public static final int WHILE=14;
	public static final int WS=15;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public AnalisadorSintaticoSemantico_ComComentariosLexer() {} 
	public AnalisadorSintaticoSemantico_ComComentariosLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public AnalisadorSintaticoSemantico_ComComentariosLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g"; }

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:7:7: ( '(' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:7:9: '('
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:8:7: ( ')' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:8:9: ')'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:9:7: ( '*' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:9:9: '*'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:10:7: ( '+' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:10:9: '+'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:11:7: ( '-' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:11:9: '-'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:12:7: ( '/' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:12:9: '/'
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
	// $ANTLR end "T__21"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:180:4: ( 'if' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:180:6: 'if'
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:183:7: ( 'then' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:183:9: 'then'
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:186:6: ( 'else' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:186:8: 'else'
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:189:7: ( 'while' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:189:9: 'while'
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:192:4: ( 'do' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:192:6: 'do'
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:196:2: ( '=' | '<>' | '<' | '>' | '<=' | '>=' )
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
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:196:4: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:197:4: '<>'
					{
					match("<>"); 

					}
					break;
				case 3 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:198:4: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:199:4: '>'
					{
					match('>'); 
					}
					break;
				case 5 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:200:4: '<='
					{
					match("<="); 

					}
					break;
				case 6 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:201:4: '>='
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:205:2: ( ':=' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:205:4: ':='
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:209:2: ( ';' )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:209:4: ';'
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:212:8: ( ( '0' .. '9' )+ )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:212:10: ( '0' .. '9' )+
			{
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:212:10: ( '0' .. '9' )+
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
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:219:7: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:219:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:219:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:
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
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:222:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:222:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:230:6: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='/') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='/') ) {
					alt7=1;
				}
				else if ( (LA7_1=='*') ) {
					alt7=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:230:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:230:15: (~ ( '\\n' | '\\r' ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
							break loop4;
						}
					}

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:230:29: ( '\\r' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='\r') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:230:29: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:231:10: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:231:15: ( options {greedy=false; } : . )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='*') ) {
							int LA6_1 = input.LA(2);
							if ( (LA6_1=='/') ) {
								alt6=2;
							}
							else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
								alt6=1;
							}

						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:231:43: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop6;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
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
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | IF | THEN | ELSE | WHILE | DO | RELATIONAL_OP | ASSIGNMENT_OP | SEMICOLON | CONST | VAR | WS | COMMENT )
		int alt8=18;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt8=1;
			}
			break;
		case ')':
			{
			alt8=2;
			}
			break;
		case '*':
			{
			alt8=3;
			}
			break;
		case '+':
			{
			alt8=4;
			}
			break;
		case '-':
			{
			alt8=5;
			}
			break;
		case '/':
			{
			int LA8_6 = input.LA(2);
			if ( (LA8_6=='*'||LA8_6=='/') ) {
				alt8=18;
			}

			else {
				alt8=6;
			}

			}
			break;
		case 'i':
			{
			int LA8_7 = input.LA(2);
			if ( (LA8_7=='f') ) {
				int LA8_20 = input.LA(3);
				if ( ((LA8_20 >= 'A' && LA8_20 <= 'Z')||(LA8_20 >= 'a' && LA8_20 <= 'z')) ) {
					alt8=16;
				}

				else {
					alt8=7;
				}

			}

			else {
				alt8=16;
			}

			}
			break;
		case 't':
			{
			int LA8_8 = input.LA(2);
			if ( (LA8_8=='h') ) {
				int LA8_21 = input.LA(3);
				if ( (LA8_21=='e') ) {
					int LA8_26 = input.LA(4);
					if ( (LA8_26=='n') ) {
						int LA8_30 = input.LA(5);
						if ( ((LA8_30 >= 'A' && LA8_30 <= 'Z')||(LA8_30 >= 'a' && LA8_30 <= 'z')) ) {
							alt8=16;
						}

						else {
							alt8=8;
						}

					}

					else {
						alt8=16;
					}

				}

				else {
					alt8=16;
				}

			}

			else {
				alt8=16;
			}

			}
			break;
		case 'e':
			{
			int LA8_9 = input.LA(2);
			if ( (LA8_9=='l') ) {
				int LA8_22 = input.LA(3);
				if ( (LA8_22=='s') ) {
					int LA8_27 = input.LA(4);
					if ( (LA8_27=='e') ) {
						int LA8_31 = input.LA(5);
						if ( ((LA8_31 >= 'A' && LA8_31 <= 'Z')||(LA8_31 >= 'a' && LA8_31 <= 'z')) ) {
							alt8=16;
						}

						else {
							alt8=9;
						}

					}

					else {
						alt8=16;
					}

				}

				else {
					alt8=16;
				}

			}

			else {
				alt8=16;
			}

			}
			break;
		case 'w':
			{
			int LA8_10 = input.LA(2);
			if ( (LA8_10=='h') ) {
				int LA8_23 = input.LA(3);
				if ( (LA8_23=='i') ) {
					int LA8_28 = input.LA(4);
					if ( (LA8_28=='l') ) {
						int LA8_32 = input.LA(5);
						if ( (LA8_32=='e') ) {
							int LA8_35 = input.LA(6);
							if ( ((LA8_35 >= 'A' && LA8_35 <= 'Z')||(LA8_35 >= 'a' && LA8_35 <= 'z')) ) {
								alt8=16;
							}

							else {
								alt8=10;
							}

						}

						else {
							alt8=16;
						}

					}

					else {
						alt8=16;
					}

				}

				else {
					alt8=16;
				}

			}

			else {
				alt8=16;
			}

			}
			break;
		case 'd':
			{
			int LA8_11 = input.LA(2);
			if ( (LA8_11=='o') ) {
				int LA8_24 = input.LA(3);
				if ( ((LA8_24 >= 'A' && LA8_24 <= 'Z')||(LA8_24 >= 'a' && LA8_24 <= 'z')) ) {
					alt8=16;
				}

				else {
					alt8=11;
				}

			}

			else {
				alt8=16;
			}

			}
			break;
		case '<':
		case '=':
		case '>':
			{
			alt8=12;
			}
			break;
		case ':':
			{
			alt8=13;
			}
			break;
		case ';':
			{
			alt8=14;
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
			alt8=15;
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
			alt8=16;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt8=17;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);
			throw nvae;
		}
		switch (alt8) {
			case 1 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:46: IF
				{
				mIF(); 

				}
				break;
			case 8 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:49: THEN
				{
				mTHEN(); 

				}
				break;
			case 9 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:54: ELSE
				{
				mELSE(); 

				}
				break;
			case 10 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:59: WHILE
				{
				mWHILE(); 

				}
				break;
			case 11 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:65: DO
				{
				mDO(); 

				}
				break;
			case 12 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:68: RELATIONAL_OP
				{
				mRELATIONAL_OP(); 

				}
				break;
			case 13 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:82: ASSIGNMENT_OP
				{
				mASSIGNMENT_OP(); 

				}
				break;
			case 14 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:96: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 15 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:106: CONST
				{
				mCONST(); 

				}
				break;
			case 16 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:112: VAR
				{
				mVAR(); 

				}
				break;
			case 17 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:116: WS
				{
				mWS(); 

				}
				break;
			case 18 :
				// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:1:119: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}



}
