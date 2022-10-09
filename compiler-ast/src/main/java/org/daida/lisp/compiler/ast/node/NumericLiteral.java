package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record NumericLiteral(JvmLispParser.NumericLiteralContext context) implements ValueLiteral {
}
