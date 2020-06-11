// $ANTLR 3.5.1 D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g 2020-06-11 04:48:22

	import java.util.HashMap;
	import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class AnalisadorSintaticoSemanticoParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT_OP", "CONST", "DO", 
		"ELSE", "IF", "RELATIONAL_OP", "SEMICOLON", "THEN", "VAR", "WHILE", "WS", 
		"'('", "')'", "'*'", "'+'", "'-'", "'/'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "aritmetic_expression", "attribution", "relational_expression", 
		"program", "iteration", "statement", "condition"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public AnalisadorSintaticoSemanticoParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public AnalisadorSintaticoSemanticoParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public AnalisadorSintaticoSemanticoParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return AnalisadorSintaticoSemanticoParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g"; }


		Map<String, Double> vars = new HashMap<>();
		String simbol = "";
		String simbolTemp = "";	
		String rel_op = "";	
		Double res_ae = 1.0;



	// $ANTLR start "program"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:20:1: program : ( statement )+ ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:20:9: ( ( statement )+ )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:20:11: ( statement )+
			{
			dbg.location(20,11);
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:20:11: ( statement )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				switch ( input.LA(1) ) {
				case VAR:
					{
					alt1=1;
					}
					break;
				case IF:
					{
					alt1=1;
					}
					break;
				case WHILE:
					{
					alt1=1;
					}
					break;
				}
				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:20:11: statement
					{
					dbg.location(20,11);
					pushFollow(FOLLOW_statement_in_program36);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(21, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:23:1: statement : ( attribution SEMICOLON | condition | iteration );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:24:2: ( attribution SEMICOLON | condition | iteration )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			switch ( input.LA(1) ) {
			case VAR:
				{
				alt2=1;
				}
				break;
			case IF:
				{
				alt2=2;
				}
				break;
			case WHILE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:24:4: attribution SEMICOLON
					{
					dbg.location(24,4);
					pushFollow(FOLLOW_attribution_in_statement48);
					attribution();
					state._fsp--;
					dbg.location(25,3);
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement52); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:26:4: condition
					{
					dbg.location(26,4);
					pushFollow(FOLLOW_condition_in_statement57);
					condition();
					state._fsp--;
					dbg.location(26,14);

								res_ae = 1.0;
							
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:29:5: iteration
					{
					dbg.location(29,5);
					pushFollow(FOLLOW_iteration_in_statement65);
					iteration();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "attribution"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:32:1: attribution returns [ double v ] : VAR ASSIGNMENT_OP e= aritmetic_expression ;
	public final double attribution() throws RecognitionException {
		double v = 0.0;


		Token VAR1=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "attribution");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:33:2: ( VAR ASSIGNMENT_OP e= aritmetic_expression )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:33:4: VAR ASSIGNMENT_OP e= aritmetic_expression
			{
			dbg.location(33,4);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_attribution80); dbg.location(33,8);

					simbol = (VAR1!=null?VAR1.getText():null);
				dbg.location(36,2);
			match(input,ASSIGNMENT_OP,FOLLOW_ASSIGNMENT_OP_in_attribution86); dbg.location(37,4);
			pushFollow(FOLLOW_aritmetic_expression_in_attribution93);
			e=aritmetic_expression();
			state._fsp--;
			dbg.location(37,27);

					v = e; 
					if(res_ae == 1) { 
						System.out.println(simbol + " = "  + v); 
						vars.put(simbol, v);
						//System.out.println(vars.toString());
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(45, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "attribution");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "attribution"



	// $ANTLR start "aritmetic_expression"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:47:1: aritmetic_expression returns [ double v ] : ( ( CONST | VAR ) ( '*' e= aritmetic_expression | '/' e= aritmetic_expression | '+' e= aritmetic_expression | '-' e= aritmetic_expression )? | '(' e= aritmetic_expression ')' );
	public final double aritmetic_expression() throws RecognitionException {
		double v = 0.0;


		Token CONST2=null;
		Token VAR3=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "aritmetic_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:48:2: ( ( CONST | VAR ) ( '*' e= aritmetic_expression | '/' e= aritmetic_expression | '+' e= aritmetic_expression | '-' e= aritmetic_expression )? | '(' e= aritmetic_expression ')' )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==CONST||LA5_0==VAR) ) {
				alt5=1;
			}
			else if ( (LA5_0==15) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:48:4: ( CONST | VAR ) ( '*' e= aritmetic_expression | '/' e= aritmetic_expression | '+' e= aritmetic_expression | '-' e= aritmetic_expression )?
					{
					dbg.location(48,4);
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:48:4: ( CONST | VAR )
					int alt3=2;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					int LA3_0 = input.LA(1);
					if ( (LA3_0==CONST) ) {
						alt3=1;
					}
					else if ( (LA3_0==VAR) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(3);}

					switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:49:3: CONST
							{
							dbg.location(49,3);
							CONST2=(Token)match(input,CONST,FOLLOW_CONST_in_aritmetic_expression113); dbg.location(49,9);

										v = Double.parseDouble((CONST2!=null?CONST2.getText():null));
									
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:52:5: VAR
							{
							dbg.location(52,5);
							VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_aritmetic_expression122); dbg.location(52,9);

										simbolTemp = (VAR3!=null?VAR3.getText():null);
										
										if(vars.get(simbolTemp) != null) {
											v = vars.get(simbolTemp);
										} else {
											System.out.println("ERRO: Variavel " + simbolTemp + " NÃO EXISTE.");
										}
									
							}
							break;

					}
					} finally {dbg.exitSubRule(3);}
					dbg.location(62,2);
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:62:2: ( '*' e= aritmetic_expression | '/' e= aritmetic_expression | '+' e= aritmetic_expression | '-' e= aritmetic_expression )?
					int alt4=5;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					switch ( input.LA(1) ) {
						case 17:
							{
							alt4=1;
							}
							break;
						case 20:
							{
							alt4=2;
							}
							break;
						case 18:
							{
							alt4=3;
							}
							break;
						case 19:
							{
							alt4=4;
							}
							break;
					}
					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:63:3: '*' e= aritmetic_expression
							{
							dbg.location(63,3);
							match(input,17,FOLLOW_17_in_aritmetic_expression134); dbg.location(63,9);
							pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression140);
							e=aritmetic_expression();
							state._fsp--;
							dbg.location(63,32);

										v *= e;
									
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:66:4: '/' e= aritmetic_expression
							{
							dbg.location(66,4);
							match(input,20,FOLLOW_20_in_aritmetic_expression147); dbg.location(66,10);
							pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression153);
							e=aritmetic_expression();
							state._fsp--;
							dbg.location(66,33);

										if(e == 0) {
											System.out.println("ERRO: Divisão por 0.");
										} else {
											v /= e;
										}
									
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:73:4: '+' e= aritmetic_expression
							{
							dbg.location(73,4);
							match(input,18,FOLLOW_18_in_aritmetic_expression160); dbg.location(73,10);
							pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression166);
							e=aritmetic_expression();
							state._fsp--;
							dbg.location(73,33);

										v += e;
									
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:76:4: '-' e= aritmetic_expression
							{
							dbg.location(76,4);
							match(input,19,FOLLOW_19_in_aritmetic_expression173); dbg.location(76,10);
							pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression179);
							e=aritmetic_expression();
							state._fsp--;
							dbg.location(76,33);

										v -= e;
									
							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:80:4: '(' e= aritmetic_expression ')'
					{
					dbg.location(80,4);
					match(input,15,FOLLOW_15_in_aritmetic_expression190); dbg.location(80,10);
					pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression196);
					e=aritmetic_expression();
					state._fsp--;
					dbg.location(80,33);
					v = e;dbg.location(80,46);
					match(input,16,FOLLOW_16_in_aritmetic_expression200); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(81, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "aritmetic_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "aritmetic_expression"



	// $ANTLR start "condition"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:83:1: condition : IF e= relational_expression THEN program ( ELSE program )? ;
	public final void condition() throws RecognitionException {
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "condition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:84:2: ( IF e= relational_expression THEN program ( ELSE program )? )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:84:4: IF e= relational_expression THEN program ( ELSE program )?
			{
			dbg.location(84,4);
			match(input,IF,FOLLOW_IF_in_condition211); dbg.location(85,4);
			pushFollow(FOLLOW_relational_expression_in_condition218);
			e=relational_expression();
			state._fsp--;
			dbg.location(85,28);

					res_ae = e;
				dbg.location(88,2);
			match(input,THEN,FOLLOW_THEN_in_condition223); dbg.location(89,2);
			pushFollow(FOLLOW_program_in_condition227);
			program();
			state._fsp--;
			dbg.location(89,10);

					if(res_ae == 1) {
						res_ae = 0.0;
					} else {
						res_ae = 1.0;
					}
				dbg.location(96,2);
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:96:2: ( ELSE program )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==ELSE) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:97:3: ELSE program
					{
					dbg.location(97,3);
					match(input,ELSE,FOLLOW_ELSE_in_condition237); dbg.location(98,3);
					pushFollow(FOLLOW_program_in_condition241);
					program();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(99,5);

					res_ae = 1.0;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(102, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "condition"



	// $ANTLR start "iteration"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:104:1: iteration : WHILE e= relational_expression DO program ;
	public final void iteration() throws RecognitionException {
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "iteration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(104, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:105:2: ( WHILE e= relational_expression DO program )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:105:4: WHILE e= relational_expression DO program
			{
			dbg.location(105,4);
			match(input,WHILE,FOLLOW_WHILE_in_iteration257); dbg.location(106,4);
			pushFollow(FOLLOW_relational_expression_in_iteration265);
			e=relational_expression();
			state._fsp--;
			dbg.location(106,28);

					res_ae = e;
				dbg.location(109,2);
			match(input,DO,FOLLOW_DO_in_iteration270); dbg.location(110,2);
			pushFollow(FOLLOW_program_in_iteration274);
			program();
			state._fsp--;
			dbg.location(110,10);

					res_ae = 1.0;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(113, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteration"



	// $ANTLR start "relational_expression"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:115:1: relational_expression returns [ double v ] : e= aritmetic_expression RELATIONAL_OP e= aritmetic_expression ;
	public final double relational_expression() throws RecognitionException {
		double v = 0.0;


		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "relational_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:116:2: (e= aritmetic_expression RELATIONAL_OP e= aritmetic_expression )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico.g:117:2: e= aritmetic_expression RELATIONAL_OP e= aritmetic_expression
			{
			dbg.location(117,4);
			pushFollow(FOLLOW_aritmetic_expression_in_relational_expression296);
			e=aritmetic_expression();
			state._fsp--;
			dbg.location(117,27);

					res_ae = e;
				dbg.location(120,2);
			match(input,RELATIONAL_OP,FOLLOW_RELATIONAL_OP_in_relational_expression301); dbg.location(121,4);
			pushFollow(FOLLOW_aritmetic_expression_in_relational_expression309);
			e=aritmetic_expression();
			state._fsp--;
			dbg.location(121,27);

					v = e; 
					
					if(rel_op.equals("=") && res_ae == v) {
						v = 1;
					} else if(rel_op.equals("<>") && res_ae != v) {
						v = 1;
					} else if(rel_op.equals("<") && res_ae < v) {
						v = 1;
					} else if(rel_op.equals(">") && res_ae > v) {
						v = 1;
					} else if(rel_op.equals("<") && res_ae <= v) {
						v = 1;
					} else if(rel_op.equals(">=") && res_ae >= v) {
						v = 1;
					} else {
						v = 0;
					}		
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(140, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relational_expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return v;
	}
	// $ANTLR end "relational_expression"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program36 = new BitSet(new long[]{0x0000000000003102L});
	public static final BitSet FOLLOW_attribution_in_statement48 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_statement57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_in_statement65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_attribution80 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGNMENT_OP_in_attribution86 = new BitSet(new long[]{0x0000000000009020L});
	public static final BitSet FOLLOW_aritmetic_expression_in_attribution93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_aritmetic_expression113 = new BitSet(new long[]{0x00000000001E0002L});
	public static final BitSet FOLLOW_VAR_in_aritmetic_expression122 = new BitSet(new long[]{0x00000000001E0002L});
	public static final BitSet FOLLOW_17_in_aritmetic_expression134 = new BitSet(new long[]{0x0000000000009020L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_aritmetic_expression147 = new BitSet(new long[]{0x0000000000009020L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_aritmetic_expression160 = new BitSet(new long[]{0x0000000000009020L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_aritmetic_expression173 = new BitSet(new long[]{0x0000000000009020L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_aritmetic_expression190 = new BitSet(new long[]{0x0000000000009020L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression196 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_aritmetic_expression200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_condition211 = new BitSet(new long[]{0x0000000000009020L});
	public static final BitSet FOLLOW_relational_expression_in_condition218 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_THEN_in_condition223 = new BitSet(new long[]{0x0000000000003100L});
	public static final BitSet FOLLOW_program_in_condition227 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ELSE_in_condition237 = new BitSet(new long[]{0x0000000000003100L});
	public static final BitSet FOLLOW_program_in_condition241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_iteration257 = new BitSet(new long[]{0x0000000000009020L});
	public static final BitSet FOLLOW_relational_expression_in_iteration265 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_DO_in_iteration270 = new BitSet(new long[]{0x0000000000003100L});
	public static final BitSet FOLLOW_program_in_iteration274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aritmetic_expression_in_relational_expression296 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RELATIONAL_OP_in_relational_expression301 = new BitSet(new long[]{0x0000000000009020L});
	public static final BitSet FOLLOW_aritmetic_expression_in_relational_expression309 = new BitSet(new long[]{0x0000000000000002L});
}
