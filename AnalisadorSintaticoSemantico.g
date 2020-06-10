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
}

program	: // ??
	(
		statement
		SEMICOLON {
			System.out.println("Ponto e virgula");
		}
	)+
	;

statement
	:	attribution
	|	condition
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
		System.out.println("Resultado: " + simbol + " = "  + $v); 
		vars.put(simbol, $v);
		System.out.println(vars.toString());
	}
;

aritmetic_expression returns [ double v ]
	: (
		CONST {
			$v = Integer.parseInt($CONST.text);
			System.out.println("Constante " + $v);
		} 
		| VAR {
			simbol = $VAR.text;
			System.out.println("Variavel " + simbol);
		}
	)
	(
		'*' e = aritmetic_expression {
			System.out.println("Operador *");		
			$v *= $e.v;
		}
		|'/' e = aritmetic_expression {
			System.out.println("Operador /");
			$v /= $e.v;
		}
		|'+' e = aritmetic_expression {
			System.out.println("Operador +");
			$v += $e.v;
		}
		|'-' e = aritmetic_expression {
			System.out.println("Operador -");
			$v -= $e.v;
		}
	)?	
	|	'(' e = aritmetic_expression {$v = $e.v;} ')'
	;

condition
	: IF {
		System.out.println("Comando if");
	} 
	relational_expression 
	THEN {
		System.out.println("Comando THEN");
	} 
	(
		statement
		SEMICOLON
	)+
	(
		ELSE {
			System.out.println("Comando ELSE");
		} 
		(
			statement
			SEMICOLON
		)+
	)?
;

iteration // OK
	: WHILE {
		System.out.println("Comando WHILE");
	}
	relational_expression 
	DO {
		System.out.println("Comando DO");
	}
	(
		statement {
			System.out.println("Statement");
		}
		SEMICOLON {
			System.out.println("Ponto e virgula 2");
		}
	)+
;

relational_expression // OK
	: 
	aritmetic_expression
	RELATIONAL_OP {
		System.out.println("Operador relacional " + $RELATIONAL_OP.text);
	}
	aritmetic_expression
;

/*expr returns [ double v ]:
	INT {
		$v = Double.parseDouble( $INT.text);
	} 
	(
		  '+' e = expr {$v += $e.v;} 
		| '-' e = expr {$v -= $e.v;} 
		| '*' e = expr {$v *= $e.v;} 
		| '/' e = expr {$v /= $e.v;}
	)	
	|	INT {$v = Double.parseDouble( $INT.text);}
    

    |	'(' e = expr {$v = $e.v;} ')'
    ;

    | VAR {simb = $VAR.text; System.out.println("Variavel " + simb + " detectada");} 
    ('*'{System.out.println("Operador * detectado");}|'/'{System.out.println("Operador / detectado");}) aritmetic_expression
    | VAR {simb = $VAR.text; System.out.println("Variavel " + simb + " detectada");} 
    ('+'{System.out.println("Operador + detectado");}|'-'{System.out.println("Operador - detectado");}) aritmetic_expression
    | VAR {simb = $VAR.text; System.out.println("Variavel " + simb + " detectada");}                  
    | CONST {valor = Integer.parseInt( $CONST.text);System.out.println("Constante " + valor + " detectada");}                  
    | '(' {System.out.println("Símbolo ( detectado");}aritmetic_expression ')'{System.out.println("Símbolo ) detectado");}
        
    ;*/


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
