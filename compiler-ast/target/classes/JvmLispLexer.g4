lexer grammar JvmLispLexer;

DOT:            'dot';
PAREN_L:        '(';
PAREN_R:        ')';

CLASS:          'class';
IMPORT:         'IMPORT';
PACKAGE:        'package';

ID:             [a-zA-Z_] [a-zA-Z0-9_]*;
SLOT:           ':' ID;

WS:             [ \t\r\n\u000C]+    -> channel(HIDDEN);