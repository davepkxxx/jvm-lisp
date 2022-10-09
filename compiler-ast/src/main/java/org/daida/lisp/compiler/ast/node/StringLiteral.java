package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record StringLiteral(JvmLispParser.StringLiteralContext context) implements ValueLiteral {
}
