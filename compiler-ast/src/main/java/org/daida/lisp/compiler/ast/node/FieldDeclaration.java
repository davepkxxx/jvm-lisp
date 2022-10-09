package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

import java.util.List;

public record FieldDeclaration(JvmLispParser.FieldDeclContext context,
                               Identity name,
                               List<FieldSlot> slots) implements Declaration, ClassMember {
}
