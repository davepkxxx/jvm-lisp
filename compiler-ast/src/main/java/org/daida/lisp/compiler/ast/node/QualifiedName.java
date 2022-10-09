package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record QualifiedName(JvmLispParser.QnameContext context) implements Expression {
}
