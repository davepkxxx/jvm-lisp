package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

import java.util.List;

public record MethodDeclaration(JvmLispParser.MethodDeclContext context,
                                Identity name,
                                List<MethodSlot> slots,
                                List<ParameterDeclaration> parameterDeclarations,
                                List<Statement> statements) implements Declaration, ClassMember {
}
