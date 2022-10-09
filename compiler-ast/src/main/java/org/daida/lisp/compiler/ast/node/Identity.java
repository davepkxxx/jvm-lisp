package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record Identity(JvmLispParser.IdContext context) implements SyntaxNode {
}
