package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record DigitsLiteral(JvmLispParser.DigitsLiteralContext context) implements ValueLiteral {
}
