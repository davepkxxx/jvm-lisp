parser grammar JvmLispParser;

options { tokenVocab = JvmLispLexer; }

compilationUnit
    : PAREN_L packageDecl? importDecl? typeDecl* PAREN_R EOF
    ;
// declartions
classDecl
    : PAREN_L DEF_CLASS id typeSlot* PAREN_L classMember* PAREN_R PAREN_R
    ;
ctorDecl
    : PAREN_L DEF_NEW ctorSlot* PAREN_L paramDecl* PAREN_R PAREN_L stmt* PAREN_R PAREN_R
    ;
fieldDecl
    : PAREN_L DEF_FIELD id fieldSlot* PAREN_R
    ;
importDecl
    : PAREN_L IMPORT qname* PAREN_R
    ;
methodDecl
    : PAREN_L DEF_METHOD id methodSlot* PAREN_L paramDecl* PAREN_R (PAREN_L stmt* PAREN_R)? PAREN_R
    ;
packageDecl
    : PAREN_L PACKAGE qname PAREN_R
    ;
paramDecl
    : PAREN_L id paramSlot* PAREN_R
    ;
typeDecl
    : classDecl
    ;
varDecl
    : PAREN_L VAR id varSlot* PAREN_R
    ;
// members and slots
classMember
    : ctorDecl
    | fieldDecl
    | methodDecl
    | typeDecl
    ;
ctorSlot
    : privateModifier
    | protectedModifier
    | publicModifier
    ;
fieldSlot
    : privateModifier
    | protectedModifier
    | publicModifier
    | finalModifier
    | staticModifier
    | varInit
    | varType
    ;
methodSlot
    : privateModifier
    | protectedModifier
    | publicModifier
    | abstractModifier
    | finalModifier
    | staticModifier
    | retType
    ;
paramSlot
    : finalModifier
    | varType
    ;
typeSlot
    : privateModifier
    | protectedModifier
    | publicModifier
    | abstractModifier
    | finalModifier
    | staticModifier
    | typeExtends
    | typeImpl
    ;
varSlot
    : finalModifier
    | varInit
    | varType
    ;
abstractModifier
    : ABSTRACT
    ;
finalModifier
    : FINAL
    ;
privateModifier
    : PRIVATE
    ;
protectedModifier
    : PROTECTED
    ;
publicModifier
    : PUBLIC
    ;
staticModifier
    : STATIC
    ;
retType
    : RETURN_TYPE qname
    ;
typeExtends
    : EXTENDS PAREN_L qname* PAREN_R
    | EXTENDS qname
    ;
typeImpl
    : IMPLEMENTS PAREN_L qname* PAREN_R
    | IMPLEMENTS qname
    ;
varInit
    : INITIAL expr
    ;
varType
    : TYPE qname
    ;
// stmts
stmt
    : valueLiteral
    | varDecl
    ;
// exprs
expr
    : qname
    | valueLiteral
    ;
// literals
valueLiteral
    : charLiteral
    | stringLiteral
    | falseLiteral
    | trueLiteral
    | numericLiteral
    | digitsLiteral
    ;
charLiteral
    : Char
    ;
digitsLiteral
    : Digits
    ;
falseLiteral
    : FALSE
    ;
numericLiteral
    : Numeric
    ;
stringLiteral
    : String
    ;
trueLiteral
    : TRUE
    ;
// ids
id
    : Id
    ;
qname
    : Qname
    ;