// Generated from E:/workspace/jvm-lisp/compiler-ast/src/main/resources\JvmLispParser.g4 by ANTLR 4.10.1
package org.daida.lisp.compiler.ast.parse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JvmLispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JvmLispParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JvmLispParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(JvmLispParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#ctorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtorDecl(JvmLispParser.CtorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(JvmLispParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#importDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDecl(JvmLispParser.ImportDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(JvmLispParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#packageDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDecl(JvmLispParser.PackageDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#paramDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDecl(JvmLispParser.ParamDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#typeDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDecl(JvmLispParser.TypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(JvmLispParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(JvmLispParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#ctorSlot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtorSlot(JvmLispParser.CtorSlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#fieldSlot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldSlot(JvmLispParser.FieldSlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#methodSlot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSlot(JvmLispParser.MethodSlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#paramSlot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamSlot(JvmLispParser.ParamSlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#typeSlot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSlot(JvmLispParser.TypeSlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#varSlot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSlot(JvmLispParser.VarSlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#abstractModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractModifier(JvmLispParser.AbstractModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#finalModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalModifier(JvmLispParser.FinalModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#privateModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivateModifier(JvmLispParser.PrivateModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#protectedModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtectedModifier(JvmLispParser.ProtectedModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#publicModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicModifier(JvmLispParser.PublicModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#staticModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticModifier(JvmLispParser.StaticModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#retType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetType(JvmLispParser.RetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#typeExtends}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExtends(JvmLispParser.TypeExtendsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#typeImpl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImpl(JvmLispParser.TypeImplContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#varInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInit(JvmLispParser.VarInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(JvmLispParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(JvmLispParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JvmLispParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#valueLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueLiteral(JvmLispParser.ValueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(JvmLispParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#digitsLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitsLiteral(JvmLispParser.DigitsLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#falseLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(JvmLispParser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(JvmLispParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(JvmLispParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#trueLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(JvmLispParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(JvmLispParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JvmLispParser#qname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQname(JvmLispParser.QnameContext ctx);
}