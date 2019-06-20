grammar gramatyka;

ANDAND : '&&';
OROR : '||';

LNO:       '(';
PNO:       ')';
LNK:       '{\n';
PNK:       '}';

PRIVATE:    'private ';
PUBLIC:     'public ';
PROTECTED:  'protected ';

EQUAL:     '==';
LOWER:     '<';
GREATER:   '>';
LOWERE:    '<=';
GREATERE:  '>=';

ASSIGN:     '=';
PLUS:       '+';
MINUS:      '-';
MUL:   '*';
DIV:     '/';
INCLEMENT:  '++';

IF:         'if';
ELSEIF:     'elseif';
ELSE:      'else';
WHILE:      'while';
RETURN:    'return';
FOR:    'for';

SEMICOL:    ';\n';
FORSEMICOL: '; ';
DOT:        '.';
COMMA:      ',';
CD:    '"';

INT:    'int';
STRING: 'String';
DOUBLE: 'double';
FLOAT:  'float';
BOOL:   'boolean';
PACKAGE : 'package';
IMPORT : 'import';
BREAK: 'break';

IDENT:            ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
WORD : LOWERCASE LOWERCASE*;
LOWERCASE : [a-z];
DIGIT:     [0-9];
NON_ZERO_DIGIT : [1-9];
NUMBER : NON_ZERO_DIGIT DIGIT*;




//gramatyka
type: INT | STRING | FLOAT | DOUBLE | BOOL;
identifier: IDENT;
semicol: SEMICOL;
number : NUMBER;

packag_ex: PACKAGE operand semicol;
import_ex : IMPORT operand semicol;
break_ex: BREAK semicol;

operator : PLUS | MINUS | DIV | MUL;
comperator : LOWER | LOWERE | GREATER | GREATERE | EQUAL;

and_operator : ANDAND;
or_operator : OROR;
logic_operator : and_operator | or_operator;
string : CD IDENT CD;

operand : number | identifier;

operation : operand (operator)* (operand | operation);

logic_operation_n: LNO logic_operation PNO;
logic_operation : (operand | logic_operation_n) (logic_operator | comperator) (operand | logic_operation | logic_operation_n);

assign : type (identifier | WORD) ASSIGN (operation | operand) semicol;
assign2 : (identifier | WORD) ASSIGN (operation | operand) semicol;
forassign: type identifier ASSIGN operand;

new_if : IF LNO logic_operation PNO LNK (break_ex | operation | return_ex | assign2)* PNK (elseif | else_ex)*;
elseif : ELSEIF LNO logic_operation PNO LNK (break_ex | operation | return_ex | assign2)* PNK;
else_ex : ELSE LNK (break_ex | operation | return_ex | assign2)* PNK;

instructions : instruction*;
instruction : assign | new_if | return_ex | operation | for_ex;

inclement: operand INCLEMENT;
for_ex: FOR LNO forassign FORSEMICOL logic_operation FORSEMICOL (operation | inclement) PNO LNK (break_ex | operation | return_ex | assign2 | new_if)* PNK;

return_ex : RETURN operand semicol;

program: (assign | new_if | for_ex)*;
WS : (' ' | '\t'|'\n')+ -> channel(HIDDEN);





