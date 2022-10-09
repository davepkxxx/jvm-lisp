package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record CharLiteral(JvmLispParser.CharLiteralContext context) implements ValueLiteral {
}
