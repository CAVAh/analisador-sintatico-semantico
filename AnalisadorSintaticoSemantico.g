grammar AnalisadorSintaticoSemantico;

options {
    language=Java;
}

@header {
	import java.util.HashMap;
	import java.util.Map;
}

@members {
	Map<String, Double> vars = new HashMap<>();
	String simbol = "";
	String simbolTemp = "";	
	String rel_op = "";	
	Double res_ae = 1.0;
}

program	: statement+
	;

statement
	:	attribution
		SEMICOLON {
			System.out.println("Ponto e virgula");
		}
	|	condition {
			res_ae = 1.0;
		}
	| 	iteration
	;

attribution returns [ double v ] // OK
	: VAR {
		simbol = $VAR.text;
		System.out.println("Variavel " + simbol);
	} 
	ASSIGNMENT_OP
	{
		System.out.println("Operador de atribuicao :=");
	}
	e = aritmetic_expression {
		$v = $e.v; 
		if(res_ae == 1) { 
			System.out.println("Resultado: " + simbol + " = "  + $v); 
			vars.put(simbol, $v);
			System.out.println(vars.toString());
		}
	}
;

aritmetic_expression returns [ double v ]
	: (
		CONST {
			$v = Double.parseDouble($CONST.text);
			System.out.println("Constante " + $v);
		} 
		| VAR {
			simbolTemp = $VAR.text;
			
			if(vars.get(simbolTemp) != null) {
				$v = vars.get(simbolTemp);
				System.out.println("Variavel " + simbolTemp + " EXISTE com valor: " + $v);
			} else {
				System.out.println("ERRO: Variavel " + simbolTemp + " NÃO EXISTE com valor: " + $v);
			}
		}
	)
	(
		'*' e = aritmetic_expression {
			System.out.println("Operador * V: " + $v + " -- e.v = " + $e.v);
			$v *= $e.v;
		}
		|'/' e = aritmetic_expression {
			System.out.println("Operador / V: " + $v + " -- e.v = " + $e.v);
			
			if($e.v == 0) {
				System.out.println("ERRO: Divisão por 0.");
			} else {
				$v /= $e.v;
			}
		}
		|'+' e = aritmetic_expression {
			System.out.println("Operador + V: " + $v + " -- e.v = " + $e.v);
			$v += $e.v;
		}
		|'-' e = aritmetic_expression {
			System.out.println("Operador - V: " + $v + " -- e.v = " + $e.v);
			$v -= $e.v;
		}
	)?
	|	'(' e = aritmetic_expression {$v = $e.v;} ')'
	;

condition
	: IF {
		System.out.println("Comando if");
	} 
	e = relational_expression {
		res_ae = $e.v;
		System.out.println("RE = " + res_ae);
	}
	THEN {
		System.out.println("Comando THEN");
	}
	program {
		System.out.println("res_aeANT = " + res_ae);	
		if(res_ae == 1) {
			res_ae = 0.0;
		} else {
			res_ae = 1.0;
		}		
		System.out.println("res_aeDEP = " + res_ae);	
	}
	(
		ELSE {
			System.out.println("Comando ELSE");
		} 
		program
	)? {
		res_ae = 1.0;
	}
;

iteration // OK
	: WHILE {
		System.out.println("Comando WHILE");
	}
	e = relational_expression {
		res_ae = $e.v;
	}
	DO {
		System.out.println("Comando DO");
	}
	program {
		res_ae = 1.0;
	}
;

relational_expression returns [ double v ] // OK
	: 
	e = aritmetic_expression {
		$v = $e.v; 
		System.out.println("Resultado: AE1 = "  + $v); 
		res_ae = $v;
	}
	RELATIONAL_OP {
		rel_op = $RELATIONAL_OP.text;
		System.out.println("Operador relacional " + rel_op);
	}
	e = aritmetic_expression {
		$v = $e.v; 
		System.out.println("Resultado: AE2 = "  + $v);
		
		if(rel_op.equals("=") && res_ae == $v) {
			System.out.println("Resultado: AE é = ");
			$v = 1;
		} else if(rel_op.equals("<>") && res_ae != $v) {
			System.out.println("Resultado: AE é <> ");
			$v = 1;
		} else if(rel_op.equals("<") && res_ae < $v) {
			System.out.println("Resultado: AE é <");
			$v = 1;
		} else if(rel_op.equals(">") && res_ae > $v) {
			System.out.println("Resultado: AE é >");
			$v = 1;
		} else if(rel_op.equals("<") && res_ae <= $v) {
			System.out.println("Resultado: AE é <=");
			$v = 1;
		} else if(rel_op.equals(">=") && res_ae >= $v) {
			System.out.println("Resultado: AE é >=");
			$v = 1;
		} else {
			$v = 0;
		}		
	}
	;

IF	: 'if'
	;
	
THEN 	: 'then'
	;
	
ELSE	: 'else'
	;
	
WHILE	: 'while'
	;
	
DO	: 'do'
	;
	
RELATIONAL_OP
	: '=' 
	| '<>' 
	| '<' 
	| '>' 
	| '<=' 
	| '>='
	;
	
ASSIGNMENT_OP
	:	':='
	;
	
SEMICOLON
	: ';'
	;
	
CONST 	: ('0'..'9')+
	;
	
/*FLOAT	:   
	CONST* '.' CONST*
	;*/
	
VAR  	: ('a'..'z'|'A'..'Z')+
	;
	
WS  	: (' '
        | '\t'
        | '\r'
        | '\n'
        ) { skip(); }
;

COMMENT
    	:   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    	|   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;
