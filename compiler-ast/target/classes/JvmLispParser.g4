parser grammar JvmLispParser;

options { tokenVocab = JvmLispLexer; }

compilationUnit
    : packageDecl? importDecl* typeDecl*
    ;
// declartion
classDecl
    : PAREN_L CLASS qname slot* PAREN_R
    ;
importDecl
    : PAREN_L IMPORT qname* PAREN_R
    ;
packageDecl
    : PAREN_L PACKAGE qname* PAREN_R
    ;
typeDecl
    : classDecl
    ;
// ids
id
    : ID
    ;
slot
    : SLOT id
    ;
qname
    : id (DOT id)*
    ;