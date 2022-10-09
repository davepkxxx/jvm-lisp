package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record PublicModifier(JvmLispParser.PublicModifierContext context)
        implements ConstructorSlot, FieldSlot, MethodSlot, ClassSlot {
}
