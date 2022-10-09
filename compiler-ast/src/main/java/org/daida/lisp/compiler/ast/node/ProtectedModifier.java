package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record ProtectedModifier(JvmLispParser.ProtectedModifierContext context)
        implements ConstructorSlot, FieldSlot, MethodSlot, ClassSlot {
}
