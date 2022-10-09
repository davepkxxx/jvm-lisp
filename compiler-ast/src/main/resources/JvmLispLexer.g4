lexer grammar JvmLispLexer;

BRACK_L:            '[';
BRACK_R:            ']';
DOT:                '.';
PAREN_L:            '(';
PAREN_R:            ')';

FALSE:              'false';
IMPORT:             'import';
PACKAGE:            'package';
PRIVATE:            'private';
PROTECTED:          'protected';
PUBLIC:             'public';
SUPER:              'super';
THIS:               'this';
TRUE:               'true';
VAR:                'var';

DEF_CLASS:          'def-class';
DEF_ENUM:           'def-enum';
DEF_FIELD:          'def-field';
DEF_INTERFACE:      'def-interface';
DEF_METHOD:         'def-method';
DEF_NEW:            'def-new';
DEF_RECORD:         'def-record';

ACCESS:             ':access';
ABSTRACT:           ':abstract';
EXTENDS:            ':extends';
FINAL:              ':final';
IMPLEMENTS:         ':implements';
INITIAL:            ':initial';
RETURN_TYPE:        ':return-type';
STATIC:             ':static';
TYPE:               ':type';

Id:                 [a-zA-Z_] [a-zA-Z0-9_]*;
Qname:              Id ('.' Id)*;

Char:               '\'' (~['\r\n])? '\'';
Digits:             [0-9]+;
Numeric:            Digits '.' Digits;
String:             '"' (~["\r\n])* '"';

WS:                 [ \t\r\n\u000C]+    -> channel(HIDDEN);