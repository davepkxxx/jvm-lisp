package org.daida.lisp.compiler.ast.node;

import org.daida.lisp.compiler.ast.parse.JvmLispParser;

import java.util.List;

public record ParameterDeclaration(JvmLispParser.ParamDeclContext context,
                                   Identity name,
                                   List<ParameterSlot> slots) implements Declaration {
}
