package org.daida.lisp.compiler.ast.node;

import org.antlr.v4.runtime.ParserRuleContext;

public interface SyntaxNode {
    abstract ParserRuleContext context();
}
