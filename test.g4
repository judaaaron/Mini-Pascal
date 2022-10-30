grammar test;
start:   (expr)* ;
expr:   expr ('*'|'/') expr
    |   expr ('+'|'-') expr
    |   INT
    |   '(' expr ')'
    ;
INT     : [0-9]+ ;