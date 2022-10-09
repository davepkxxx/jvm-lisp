package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

import java.util.List;

public record CompilationUnit(JvmLispParser.CompilationUnitContext context,
                              PackageDeclaration packageDeclaration,
                              ImportDeclaration importDeclaration,
                              List<TypeDeclaration> typeDeclarations) implements SyntaxNode {
}
