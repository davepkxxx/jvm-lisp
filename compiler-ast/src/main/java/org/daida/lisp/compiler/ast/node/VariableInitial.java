package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record VariableInitial(JvmLispParser.VarInitContext context, Expression value) implements FieldSlot, VariableSlot {
}
