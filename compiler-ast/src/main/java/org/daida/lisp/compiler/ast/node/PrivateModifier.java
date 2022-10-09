package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record PrivateModifier(JvmLispParser.PrivateModifierContext context)
        implements ConstructorSlot, FieldSlot, MethodSlot, ClassSlot {
}
