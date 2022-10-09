package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record True(JvmLispParser.TrueLiteralContext context) implements ValueLiteral {
}
