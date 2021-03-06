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
		SEMICOLON
	|	condition {
			res_ae = 1.0;
		}
	| 	iteration
	;

attribution returns [ double v ]
	: VAR {
		simbol = $VAR.text;
	} 
	ASSIGNMENT_OP
	e = aritmetic_expression {
		$v = $e.v; 
		if(res_ae == 1) { 
			System.out.println(simbol + " = "  + $v); 
			vars.put(simbol, $v);
			//System.out.println(vars.toString());
		}
	}
;

aritmetic_expression returns [ double v ]
	: (
		CONST {
			$v = Double.parseDouble($CONST.text);
		} 
		| VAR {
			simbolTemp = $VAR.text;
			
			if(vars.get(simbolTemp) != null) {
				$v = vars.get(simbolTemp);
			} else {
				System.out.println("ERRO: Vari�vel " + simbolTemp + " n�o existe.");
			}
		}
	)
	(
		'*' e = aritmetic_expression {
			$v *= $e.v;
		}
		|'/' e = aritmetic_expression {
			if($e.v == 0) {
				System.out.println("ERRO: Divis�o por 0.");
			} else {
				$v /= $e.v;
			}
		}
		|'+' e = aritmetic_expression {
			$v += $e.v;
		}
		|'-' e = aritmetic_expression {
			$v -= $e.v;
		}
	)?
	|	'(' e = aritmetic_expression {$v = $e.v;} ')'
	;

condition
	: IF
	e = relational_expression {
		res_ae = $e.v;
	}
	THEN 
	program {
		if(res_ae == 1) {
			res_ae = 0.0;
		} else {
			res_ae = 1.0;
		}
	} 
	(
		ELSE
		program
	)? {
		res_ae = 1.0;
	}
;

iteration
	: WHILE 
	e = relational_expression {
		res_ae = $e.v;
	}
	DO 
	program {
		res_ae = 1.0;
	}
;

relational_expression returns [ double v ]
	: 
	e = aritmetic_expression {
		res_ae = $e.v;
	}
	RELATIONAL_OP 
	e = aritmetic_expression {
		$v = $e.v; 
		
		if(rel_op.equals("=") && res_ae == $v) {
			$v = 1;
		} else if(rel_op.equals("<>") && res_ae != $v) {
			$v = 1;
		} else if(rel_op.equals("<") && res_ae < $v) {
			$v = 1;
		} else if(rel_op.equals(">") && res_ae > $v) {
			$v = 1;
		} else if(rel_op.equals("<") && res_ae <= $v) {
			$v = 1;
		} else if(rel_op.equals(">=") && res_ae >= $v) {
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
	
VAR  	: ('a'..'z'|'A'..'Z')+
	;
	
WS  	: (' '
        | '\t'
        | '\r'
        | '\n'
        ) { skip(); }
;
