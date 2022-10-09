package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

import java.util.List;

public record ConstructorDeclaration(JvmLispParser.CtorDeclContext context,
                                     List<ConstructorSlot> slots,
                                     List<ParameterDeclaration> parameterDeclarations,
                                     List<Statement> statements) implements Declaration, ClassMember {
}
