grammar Language;

start:'hello' 'world'
;

program: PROGRAM ID LBRA
        sentence*
        RBRA;

sentence: var_decl | var_assign | wriite;

var_decl: VAR ID PUNTOCOMA;
var_assign: ID ASSIGN NUMBER PUNTOCOMA;
wriite: WRITE NUMBER PUNTOCOMA;


PROGRAM: 'program';
CHAR: 'char';
IF: 'if';
ELSE: 'else';
INT: 'int';
BOOLEAN: 'boolean';
REPEAT: 'repeat';
FOR: 'for';            
UNTIL: 'until';
AND: 'and';
OR: 'or';
NOT: 'not';
VAR: 'var';
READ: 'read';
WRITE: 'write';

PLUS: '+';
MINUS: '-';
MULTI: '*';
DIV: '/';

GT:'>';
LT:'<';
GEQ:'>=';
LEQ:'<=';
EQ:'=';
ASSIGN: ':=';

LBRA: '{';
RBRA: '}';

LPAR: '(';
RPAR: ')';

PUNTOCOMA: ';';

ID: [a-zA-Z_][a-zA-Z0-9]*;
NUMBER: [0-9]*;
WS: [\t\n\r]+ -> skip;







