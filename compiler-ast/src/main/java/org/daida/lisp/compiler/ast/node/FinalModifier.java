package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record FinalModifier(JvmLispParser.FinalModifierContext context)
        implements FieldSlot, MethodSlot, ParameterSlot, ClassSlot, VariableSlot {
}
