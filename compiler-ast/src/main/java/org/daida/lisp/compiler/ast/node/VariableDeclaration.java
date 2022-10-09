package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

import java.util.List;

public record VariableDeclaration(JvmLispParser.VarDeclContext context,
                                  Identity name,
                                  List<VariableSlot> slots) implements Declaration, Statement {
}
