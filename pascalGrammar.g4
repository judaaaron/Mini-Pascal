grammar pascalGrammar;

start:PROGRAM ID PUNTOCOMA bloqueVariables BEGIN statements* END;

//gramaticas

bloqueVariables: VAR declaracion*;

declaracion: ID COMA declaracion 
            |ID DOSPUNTOS tipo PUNTOCOMA
            ;

statements: asignacion
            |bloqueIf
            |bloqueFor
            |leerVariable
            |escribirVariable
            |bloqueWhile
            |bloqueRepeat
            
            ;

asignacion: ID ASSIGN NUMBER PUNTOCOMA
            |ID ASSIGN expr PUNTOCOMA
            ;

bloqueIf: IF condiciones THEN statements* bloqueElse;

bloqueElse: ELSE statements*
     | ELSE bloqueIf
     |
     ;


bloqueFor: FOR ID ASSIGN NUMBER TO NUMBER DO statements*;

bloqueWhile: WHILE condiciones DO BEGIN statements* END PUNTOCOMA;

bloqueRepeat: REPEAT statements* UNTIL condiciones PUNTOCOMA;

leerVariable: READ LPAR ID RPAR PUNTOCOMA;

escribirVariable: WRITE LPAR ID RPAR PUNTOCOMA
                  |WRITE LPAR STRING COMA ID RPAR PUNTOCOMA
                  |WRITE LPAR STRING RPAR PUNTOCOMA
                  ;


condiciones: ID OPERADORES ID
            |NUMBER OPERADORES NUMBER
            |ID OPERADORES NUMBER
            |NUMBER OPERADORES ID
;

expr:   expr OPERACIONESMUL expr
    |   expr OPERACIONESSUMAS expr
    |   NUMBER
    |   ID
    |   '(' expr ')'
    ;          

            
tipo: INT|CHAR;


//tokens

// palabras reservadas
PROGRAM: 'program';
CHAR: 'char';
IF: 'if';
ELSE: 'else';
INT: 'integer';
BOOLEAN: 'boolean';
REPEAT: 'repeat';
FOR: 'for';            
UNTIL: 'until';
AND: 'and';
OR: 'or';
NOT: 'not';
VAR: 'Var';
READ: 'read';
WRITE: 'write'|'writeln';
BEGIN: 'Begin'|'begin';
END: 'End'|'end';
WHILE: 'while';
THEN: 'then';
DO: 'do';
TO: 'to';
OPERACIONESSUMAS: '+'|'-';
OPERACIONESMUL: '*' | '/';
USES: 'uses';

// simbolos
OPERADORES: '>' | '<' |'>=' |'<=' |'='|'<>';
ASSIGN: ':=';
LBRA: '{';
RBRA: '}';
LPAR: '(';
RPAR: ')';
PUNTOCOMA: ';';
COMA: ',';
DOSPUNTOS: ':';

//otros
ID: [a-zA-Z_][a-zA-Z0-9]*;
NUMBER: [0-9]+;
WS: [ \t\n\r]+ -> skip;
STRING: '"' .*? '"';
COMMENT: LBRA .*? RBRA -> skip;

// errores
ErrorCharacter : . {system.out.println("Error: caracter no reconocido");} ;

