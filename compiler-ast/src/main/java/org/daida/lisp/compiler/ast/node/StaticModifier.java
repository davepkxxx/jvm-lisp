package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record StaticModifier(JvmLispParser.StaticModifierContext context) implements FieldSlot, MethodSlot, ClassSlot {
}
