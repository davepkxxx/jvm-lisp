package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

import java.util.List;

public record TypeExtends(JvmLispParser.TypeExtendsContext context, List<QualifiedName> names) implements ClassSlot {
}
