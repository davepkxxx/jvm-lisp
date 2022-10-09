package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

import java.util.List;

public record ClassDeclaration(JvmLispParser.ClassDeclContext context,
                               Identity name,
                               List<ClassSlot> slots,
                               List<ClassMember> members) implements TypeDeclaration {
}
