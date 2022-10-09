package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

public record AbstractModifier(JvmLispParser.AbstractModifierContext context) implements MethodSlot, ClassSlot {
}
