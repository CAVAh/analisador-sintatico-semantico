// $ANTLR 3.5.1 D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g 2020-06-22 22:27:29

	import java.util.HashMap;
	import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class AnalisadorSintaticoSemantico_ComComentariosParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT_OP", "COMMENT", "CONST", 
		"DO", "ELSE", "IF", "RELATIONAL_OP", "SEMICOLON", "THEN", "VAR", "WHILE", 
		"WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "program", "attribution", "aritmetic_expression", "iteration", 
		"statement", "condition", "relational_expression"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public AnalisadorSintaticoSemantico_ComComentariosParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public AnalisadorSintaticoSemantico_ComComentariosParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public AnalisadorSintaticoSemantico_ComComentariosParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return AnalisadorSintaticoSemantico_ComComentariosParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g"; }


		Map<String, Double> vars = new HashMap<>();
		String simbol = "";
		String simbolTemp = "";	
		String rel_op = "";	
		Double res_ae = 1.0;



	// $ANTLR start "program"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:20:1: program : ( statement )+ ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:20:9: ( ( statement )+ )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:20:11: ( statement )+
			{
			dbg.location(20,11);
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:20:11: ( statement )+
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

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:20:11: statement
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
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:23:1: statement : ( attribution SEMICOLON | condition | iteration );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:24:2: ( attribution SEMICOLON | condition | iteration )
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

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:24:4: attribution SEMICOLON
					{
					dbg.location(24,4);
					pushFollow(FOLLOW_attribution_in_statement48);
					attribution();
					state._fsp--;
					dbg.location(25,3);
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement52); dbg.location(25,13);

								System.out.println("Ponto e virgula");
							
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:28:4: condition
					{
					dbg.location(28,4);
					pushFollow(FOLLOW_condition_in_statement59);
					condition();
					state._fsp--;
					dbg.location(28,14);

								res_ae = 1.0;
							
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:31:5: iteration
					{
					dbg.location(31,5);
					pushFollow(FOLLOW_iteration_in_statement67);
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
		dbg.location(32, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "attribution"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:34:1: attribution returns [ double v ] : VAR ASSIGNMENT_OP e= aritmetic_expression ;
	public final double attribution() throws RecognitionException {
		double v = 0.0;


		Token VAR1=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "attribution");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:35:2: ( VAR ASSIGNMENT_OP e= aritmetic_expression )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:35:4: VAR ASSIGNMENT_OP e= aritmetic_expression
			{
			dbg.location(35,4);
			VAR1=(Token)match(input,VAR,FOLLOW_VAR_in_attribution83); dbg.location(35,8);

					simbol = (VAR1!=null?VAR1.getText():null);
					System.out.println("Variavel " + simbol);
				dbg.location(39,2);
			match(input,ASSIGNMENT_OP,FOLLOW_ASSIGNMENT_OP_in_attribution89); dbg.location(40,2);

					System.out.println("Operador de atribuicao :=");
				dbg.location(43,4);
			pushFollow(FOLLOW_aritmetic_expression_in_attribution99);
			e=aritmetic_expression();
			state._fsp--;
			dbg.location(43,27);

					v = e; 
					if(res_ae == 1) { 
						System.out.println("Resultado: " + simbol + " = "  + v); 
						vars.put(simbol, v);
						System.out.println(vars.toString());
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
		dbg.location(51, 0);

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
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:53:1: aritmetic_expression returns [ double v ] : ( ( CONST | VAR ) ( '*' e= aritmetic_expression | '/' e= aritmetic_expression | '+' e= aritmetic_expression | '-' e= aritmetic_expression )? | '(' e= aritmetic_expression ')' );
	public final double aritmetic_expression() throws RecognitionException {
		double v = 0.0;


		Token CONST2=null;
		Token VAR3=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "aritmetic_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:54:2: ( ( CONST | VAR ) ( '*' e= aritmetic_expression | '/' e= aritmetic_expression | '+' e= aritmetic_expression | '-' e= aritmetic_expression )? | '(' e= aritmetic_expression ')' )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==CONST||LA5_0==VAR) ) {
				alt5=1;
			}
			else if ( (LA5_0==16) ) {
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

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:54:4: ( CONST | VAR ) ( '*' e= aritmetic_expression | '/' e= aritmetic_expression | '+' e= aritmetic_expression | '-' e= aritmetic_expression )?
					{
					dbg.location(54,4);
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:54:4: ( CONST | VAR )
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

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:55:3: CONST
							{
							dbg.location(55,3);
							CONST2=(Token)match(input,CONST,FOLLOW_CONST_in_aritmetic_expression119); dbg.location(55,9);

										v = Double.parseDouble((CONST2!=null?CONST2.getText():null));
										System.out.println("Constante " + v);
									
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:59:5: VAR
							{
							dbg.location(59,5);
							VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_aritmetic_expression128); dbg.location(59,9);

										simbolTemp = (VAR3!=null?VAR3.getText():null);
										
										if(vars.get(simbolTemp) != null) {
											v = vars.get(simbolTemp);
											System.out.println("Variavel " + simbolTemp + " EXISTE com valor: " + v);
										} else {
											System.out.println("ERRO: Variavel " + simbolTemp + " NÃO EXISTE com valor: " + v);
										}
									
							}
							break;

					}
					} finally {dbg.exitSubRule(3);}
					dbg.location(70,2);
					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:70:2: ( '*' e= aritmetic_expression | '/' e= aritmetic_expression | '+' e= aritmetic_expression | '-' e= aritmetic_expression )?
					int alt4=5;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					switch ( input.LA(1) ) {
						case 18:
							{
							alt4=1;
							}
							break;
						case 21:
							{
							alt4=2;
							}
							break;
						case 19:
							{
							alt4=3;
							}
							break;
						case 20:
							{
							alt4=4;
							}
							break;
					}
					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:71:3: '*' e= aritmetic_expression
							{
							dbg.location(71,3);
							match(input,18,FOLLOW_18_in_aritmetic_expression140); dbg.location(71,9);
							pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression146);
							e=aritmetic_expression();
							state._fsp--;
							dbg.location(71,32);

										System.out.println("Operador * V: " + v + " -- e.v = " + e);
										v *= e;
									
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:75:4: '/' e= aritmetic_expression
							{
							dbg.location(75,4);
							match(input,21,FOLLOW_21_in_aritmetic_expression153); dbg.location(75,10);
							pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression159);
							e=aritmetic_expression();
							state._fsp--;
							dbg.location(75,33);

										System.out.println("Operador / V: " + v + " -- e.v = " + e);
										
										if(e == 0) {
											System.out.println("ERRO: Divisão por 0.");
										} else {
											v /= e;
										}
									
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:84:4: '+' e= aritmetic_expression
							{
							dbg.location(84,4);
							match(input,19,FOLLOW_19_in_aritmetic_expression166); dbg.location(84,10);
							pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression172);
							e=aritmetic_expression();
							state._fsp--;
							dbg.location(84,33);

										System.out.println("Operador + V: " + v + " -- e.v = " + e);
										v += e;
									
							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:88:4: '-' e= aritmetic_expression
							{
							dbg.location(88,4);
							match(input,20,FOLLOW_20_in_aritmetic_expression179); dbg.location(88,10);
							pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression185);
							e=aritmetic_expression();
							state._fsp--;
							dbg.location(88,33);

										System.out.println("Operador - V: " + v + " -- e.v = " + e);
										v -= e;
									
							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:93:4: '(' e= aritmetic_expression ')'
					{
					dbg.location(93,4);
					match(input,16,FOLLOW_16_in_aritmetic_expression196); dbg.location(93,10);
					pushFollow(FOLLOW_aritmetic_expression_in_aritmetic_expression202);
					e=aritmetic_expression();
					state._fsp--;
					dbg.location(93,33);
					v = e;dbg.location(93,46);
					match(input,17,FOLLOW_17_in_aritmetic_expression206); 
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
		dbg.location(94, 1);

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
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:96:1: condition : IF e= relational_expression THEN program ( ELSE program )? ;
	public final void condition() throws RecognitionException {
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "condition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:97:2: ( IF e= relational_expression THEN program ( ELSE program )? )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:97:4: IF e= relational_expression THEN program ( ELSE program )?
			{
			dbg.location(97,4);
			match(input,IF,FOLLOW_IF_in_condition217); dbg.location(97,7);

					System.out.println("Comando if");
				dbg.location(100,4);
			pushFollow(FOLLOW_relational_expression_in_condition227);
			e=relational_expression();
			state._fsp--;
			dbg.location(100,28);

					res_ae = e;
					System.out.println("RE = " + res_ae);
				dbg.location(104,2);
			match(input,THEN,FOLLOW_THEN_in_condition232); dbg.location(104,7);

					System.out.println("Comando THEN");
				dbg.location(107,2);
			pushFollow(FOLLOW_program_in_condition237);
			program();
			state._fsp--;
			dbg.location(107,10);

					System.out.println("res_aeANT = " + res_ae);	
					if(res_ae == 1) {
						res_ae = 0.0;
					} else {
						res_ae = 1.0;
					}		
					System.out.println("res_aeDEP = " + res_ae);	
				dbg.location(116,2);
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:116:2: ( ELSE program )?
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

					// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:117:3: ELSE program
					{
					dbg.location(117,3);
					match(input,ELSE,FOLLOW_ELSE_in_condition246); dbg.location(117,8);

								System.out.println("Comando ELSE");
							dbg.location(120,3);
					pushFollow(FOLLOW_program_in_condition253);
					program();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(121,5);

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
		dbg.location(124, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "condition"



	// $ANTLR start "iteration"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:126:1: iteration : WHILE e= relational_expression DO program ;
	public final void iteration() throws RecognitionException {
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "iteration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:127:2: ( WHILE e= relational_expression DO program )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:127:4: WHILE e= relational_expression DO program
			{
			dbg.location(127,4);
			match(input,WHILE,FOLLOW_WHILE_in_iteration270); dbg.location(127,10);

					System.out.println("Comando WHILE");
				dbg.location(130,4);
			pushFollow(FOLLOW_relational_expression_in_iteration279);
			e=relational_expression();
			state._fsp--;
			dbg.location(130,28);

					res_ae = e;
				dbg.location(133,2);
			match(input,DO,FOLLOW_DO_in_iteration284); dbg.location(133,5);

					System.out.println("Comando DO");
				dbg.location(136,2);
			pushFollow(FOLLOW_program_in_iteration289);
			program();
			state._fsp--;
			dbg.location(136,10);

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
		dbg.location(139, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "iteration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "iteration"



	// $ANTLR start "relational_expression"
	// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:141:1: relational_expression returns [ double v ] : e= aritmetic_expression RELATIONAL_OP e= aritmetic_expression ;
	public final double relational_expression() throws RecognitionException {
		double v = 0.0;


		Token RELATIONAL_OP4=null;
		double e =0.0;

		try { dbg.enterRule(getGrammarFileName(), "relational_expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(141, 0);

		try {
			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:142:2: (e= aritmetic_expression RELATIONAL_OP e= aritmetic_expression )
			dbg.enterAlt(1);

			// D:\\Documentos\\code\\analisador-sintatico-semantico\\AnalisadorSintaticoSemantico_ComComentarios.g:143:2: e= aritmetic_expression RELATIONAL_OP e= aritmetic_expression
			{
			dbg.location(143,4);
			pushFollow(FOLLOW_aritmetic_expression_in_relational_expression312);
			e=aritmetic_expression();
			state._fsp--;
			dbg.location(143,27);

					v = e; 
					System.out.println("Resultado: AE1 = "  + v); 
					res_ae = v;
				dbg.location(148,2);
			RELATIONAL_OP4=(Token)match(input,RELATIONAL_OP,FOLLOW_RELATIONAL_OP_in_relational_expression317); dbg.location(148,16);

					rel_op = (RELATIONAL_OP4!=null?RELATIONAL_OP4.getText():null);
					System.out.println("Operador relacional " + rel_op);
				dbg.location(152,4);
			pushFollow(FOLLOW_aritmetic_expression_in_relational_expression326);
			e=aritmetic_expression();
			state._fsp--;
			dbg.location(152,27);

					v = e; 
					System.out.println("Resultado: AE2 = "  + v);
					
					if(rel_op.equals("=") && res_ae == v) {
						System.out.println("Resultado: AE é = ");
						v = 1;
					} else if(rel_op.equals("<>") && res_ae != v) {
						System.out.println("Resultado: AE é <> ");
						v = 1;
					} else if(rel_op.equals("<") && res_ae < v) {
						System.out.println("Resultado: AE é <");
						v = 1;
					} else if(rel_op.equals(">") && res_ae > v) {
						System.out.println("Resultado: AE é >");
						v = 1;
					} else if(rel_op.equals("<") && res_ae <= v) {
						System.out.println("Resultado: AE é <=");
						v = 1;
					} else if(rel_op.equals(">=") && res_ae >= v) {
						System.out.println("Resultado: AE é >=");
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
		dbg.location(178, 1);

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



	public static final BitSet FOLLOW_statement_in_program36 = new BitSet(new long[]{0x0000000000006202L});
	public static final BitSet FOLLOW_attribution_in_statement48 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_statement59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_in_statement67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_attribution83 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGNMENT_OP_in_attribution89 = new BitSet(new long[]{0x0000000000012040L});
	public static final BitSet FOLLOW_aritmetic_expression_in_attribution99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_aritmetic_expression119 = new BitSet(new long[]{0x00000000003C0002L});
	public static final BitSet FOLLOW_VAR_in_aritmetic_expression128 = new BitSet(new long[]{0x00000000003C0002L});
	public static final BitSet FOLLOW_18_in_aritmetic_expression140 = new BitSet(new long[]{0x0000000000012040L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_aritmetic_expression153 = new BitSet(new long[]{0x0000000000012040L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_aritmetic_expression166 = new BitSet(new long[]{0x0000000000012040L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_aritmetic_expression179 = new BitSet(new long[]{0x0000000000012040L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_aritmetic_expression196 = new BitSet(new long[]{0x0000000000012040L});
	public static final BitSet FOLLOW_aritmetic_expression_in_aritmetic_expression202 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_aritmetic_expression206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_condition217 = new BitSet(new long[]{0x0000000000012040L});
	public static final BitSet FOLLOW_relational_expression_in_condition227 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_THEN_in_condition232 = new BitSet(new long[]{0x0000000000006200L});
	public static final BitSet FOLLOW_program_in_condition237 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_ELSE_in_condition246 = new BitSet(new long[]{0x0000000000006200L});
	public static final BitSet FOLLOW_program_in_condition253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_iteration270 = new BitSet(new long[]{0x0000000000012040L});
	public static final BitSet FOLLOW_relational_expression_in_iteration279 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DO_in_iteration284 = new BitSet(new long[]{0x0000000000006200L});
	public static final BitSet FOLLOW_program_in_iteration289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aritmetic_expression_in_relational_expression312 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_RELATIONAL_OP_in_relational_expression317 = new BitSet(new long[]{0x0000000000012040L});
	public static final BitSet FOLLOW_aritmetic_expression_in_relational_expression326 = new BitSet(new long[]{0x0000000000000002L});
}
