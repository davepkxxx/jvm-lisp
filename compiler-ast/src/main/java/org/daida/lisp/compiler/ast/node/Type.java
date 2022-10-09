package org.daida.lisp.compiler.ast.node;

import org.antlr.v4.runtime.ParserRuleContext;

public record Type(ParserRuleContext context, QualifiedName name) implements FieldSlot, MethodSlot, ParameterSlot, VariableSlot {
}
