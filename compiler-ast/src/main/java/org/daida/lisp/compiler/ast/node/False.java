package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record False(JvmLispParser.FalseLiteralContext context) implements ValueLiteral {
}
