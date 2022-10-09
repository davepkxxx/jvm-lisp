package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record PackageDeclaration(JvmLispParser.PackageDeclContext context, QualifiedName name) implements Declaration {
}
