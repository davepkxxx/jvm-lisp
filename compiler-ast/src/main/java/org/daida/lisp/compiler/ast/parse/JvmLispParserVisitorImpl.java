package org.daida.lisp.compiler.ast.parse;

import org.daida.lisp.compiler.ast.node.*;

public class JvmLispParserVisitorImpl extends JvmLispParserBaseVisitor<SyntaxNode> {
    @Override
    public CompilationUnit visitCompilationUnit(JvmLispParser.CompilationUnitContext ctx) {
        return new CompilationUnit(
                ctx,
                ctx.packageDecl() == null ? null : this.visitPackageDecl(ctx.packageDecl()),
                ctx.importDecl() == null ? null : this.visitImportDecl(ctx.importDecl()),
                ctx.typeDecl().stream().map(this::visitTypeDecl).toList());
    }

    @Override
    public ClassDeclaration visitClassDecl(JvmLispParser.ClassDeclContext ctx) {
        return new ClassDeclaration(
                ctx,
                this.visitId(ctx.id()),
                ctx.typeSlot().stream().map(this::visitTypeSlot).toList(),
                ctx.classMember().stream().map(this::visitClassMember).toList());
    }

    @Override
    public ConstructorDeclaration visitCtorDecl(JvmLispParser.CtorDeclContext ctx) {
        return new ConstructorDeclaration(
                ctx,
                ctx.ctorSlot().stream().map(this::visitCtorSlot).toList(),
                ctx.paramDecl().stream().map(this::visitParamDecl).toList(),
                ctx.stmt().stream().map(this::visitStmt).toList());
    }

    @Override
    public FieldDeclaration visitFieldDecl(JvmLispParser.FieldDeclContext ctx) {
        return new FieldDeclaration(
                ctx,
                this.visitId(ctx.id()),
                ctx.fieldSlot().stream().map(this::visitFieldSlot).toList());
    }

    @Override
    public ImportDeclaration visitImportDecl(JvmLispParser.ImportDeclContext ctx) {
        return new ImportDeclaration(ctx, ctx.qname().stream().map(this::visitQname).toList());
    }

    @Override
    public MethodDeclaration visitMethodDecl(JvmLispParser.MethodDeclContext ctx) {
        return new MethodDeclaration(
                ctx,
                this.visitId(ctx.id()),
                ctx.methodSlot().stream().map(this::visitMethodSlot).toList(),
                ctx.paramDecl().stream().map(this::visitParamDecl).toList(),
                ctx.stmt().stream().map(this::visitStmt).toList());
    }

    @Override
    public PackageDeclaration visitPackageDecl(JvmLispParser.PackageDeclContext ctx) {
        return new PackageDeclaration(ctx, this.visitQname(ctx.qname()));
    }

    @Override
    public ParameterDeclaration visitParamDecl(JvmLispParser.ParamDeclContext ctx) {
        return new ParameterDeclaration(
                ctx,
                this.visitId(ctx.id()),
                ctx.paramSlot().stream().map(this::visitParamSlot).toList());
    }

    @Override
    public TypeDeclaration visitTypeDecl(JvmLispParser.TypeDeclContext ctx) {
        if (ctx.classDecl() != null) {
            return this.visitClassDecl(ctx.classDecl());
        } else {
            return null;
        }
    }

    @Override
    public VariableDeclaration visitVarDecl(JvmLispParser.VarDeclContext ctx) {
        return new VariableDeclaration(
                ctx,
                this.visitId(ctx.id()),
                ctx.varSlot().stream().map(this::visitVarSlot).toList());
    }

    @Override
    public ClassMember visitClassMember(JvmLispParser.ClassMemberContext ctx) {
        if (ctx.ctorDecl() != null) {
            return this.visitCtorDecl(ctx.ctorDecl());
        } else if (ctx.fieldDecl() != null) {
            return this.visitFieldDecl(ctx.fieldDecl());
        } else if (ctx.methodDecl() != null) {
            return this.visitMethodDecl(ctx.methodDecl());
        } else if (ctx.typeDecl() != null) {
            return this.visitTypeDecl(ctx.typeDecl());
        } else {
            return null;
        }
    }

    @Override
    public ConstructorSlot visitCtorSlot(JvmLispParser.CtorSlotContext ctx) {
        if (ctx.privateModifier() != null) {
            return this.visitPrivateModifier(ctx.privateModifier());
        } else if (ctx.protectedModifier() != null) {
            return this.visitProtectedModifier(ctx.protectedModifier());
        } else if (ctx.publicModifier() != null) {
            return this.visitPublicModifier(ctx.publicModifier());
        } else {
            return null;
        }
    }

    @Override
    public FieldSlot visitFieldSlot(JvmLispParser.FieldSlotContext ctx) {
        if (ctx.finalModifier() != null) {
            return this.visitFinalModifier(ctx.finalModifier());
        } else if (ctx.privateModifier() != null) {
            return this.visitPrivateModifier(ctx.privateModifier());
        } else if (ctx.protectedModifier() != null) {
            return this.visitProtectedModifier(ctx.protectedModifier());
        } else if (ctx.publicModifier() != null) {
            return this.visitPublicModifier(ctx.publicModifier());
        } else if (ctx.staticModifier() != null) {
            return this.visitStaticModifier(ctx.staticModifier());
        } else if (ctx.varInit() != null) {
            return this.visitVarInit(ctx.varInit());
        } else if (ctx.varType() != null) {
            return this.visitVarType(ctx.varType());
        } else {
            return null;
        }
    }

    @Override
    public MethodSlot visitMethodSlot(JvmLispParser.MethodSlotContext ctx) {
        if (ctx.abstractModifier() != null) {
            return this.visitAbstractModifier(ctx.abstractModifier());
        } else if (ctx.finalModifier() != null) {
            return this.visitFinalModifier(ctx.finalModifier());
        } else if (ctx.privateModifier() != null) {
            return this.visitPrivateModifier(ctx.privateModifier());
        } else if (ctx.protectedModifier() != null) {
            return this.visitProtectedModifier(ctx.protectedModifier());
        } else if (ctx.publicModifier() != null) {
            return this.visitPublicModifier(ctx.publicModifier());
        } else if (ctx.staticModifier() != null) {
            return this.visitStaticModifier(ctx.staticModifier());
        } else if (ctx.retType() != null) {
            return this.visitRetType(ctx.retType());
        } else {
            return null;
        }
    }

    @Override
    public ParameterSlot visitParamSlot(JvmLispParser.ParamSlotContext ctx) {
        if (ctx.finalModifier() != null) {
            return this.visitFinalModifier(ctx.finalModifier());
        } else if (ctx.varType() != null) {
            return this.visitVarType(ctx.varType());
        } else {
            return null;
        }
    }

    @Override
    public ClassSlot visitTypeSlot(JvmLispParser.TypeSlotContext ctx) {
        if (ctx.abstractModifier() != null) {
            return this.visitAbstractModifier(ctx.abstractModifier());
        } else if (ctx.finalModifier() != null) {
            return this.visitFinalModifier(ctx.finalModifier());
        } else if (ctx.privateModifier() != null) {
            return this.visitPrivateModifier(ctx.privateModifier());
        } else if (ctx.protectedModifier() != null) {
            return this.visitProtectedModifier(ctx.protectedModifier());
        } else if (ctx.publicModifier() != null) {
            return this.visitPublicModifier(ctx.publicModifier());
        } else if (ctx.staticModifier() != null) {
            return this.visitStaticModifier(ctx.staticModifier());
        } else if (ctx.typeExtends() != null) {
            return this.visitTypeExtends(ctx.typeExtends());
        } else if (ctx.typeImpl() != null) {
            return this.visitTypeImpl(ctx.typeImpl());
        } else {
            return null;
        }
    }

    @Override
    public VariableSlot visitVarSlot(JvmLispParser.VarSlotContext ctx) {
        if (ctx.finalModifier() != null) {
            return this.visitFinalModifier(ctx.finalModifier());
        } else if (ctx.varInit() != null) {
            return this.visitVarInit(ctx.varInit());
        } else if (ctx.varType() != null) {
            return this.visitVarType(ctx.varType());
        } else {
            return null;
        }
    }

    @Override
    public AbstractModifier visitAbstractModifier(JvmLispParser.AbstractModifierContext ctx) {
        return new AbstractModifier(ctx);
    }

    @Override
    public FinalModifier visitFinalModifier(JvmLispParser.FinalModifierContext ctx) {
        return new FinalModifier(ctx);
    }

    @Override
    public PrivateModifier visitPrivateModifier(JvmLispParser.PrivateModifierContext ctx) {
        return new PrivateModifier(ctx);
    }

    @Override
    public ProtectedModifier visitProtectedModifier(JvmLispParser.ProtectedModifierContext ctx) {
        return new ProtectedModifier(ctx);
    }

    @Override
    public PublicModifier visitPublicModifier(JvmLispParser.PublicModifierContext ctx) {
        return new PublicModifier(ctx);
    }

    @Override
    public Type visitRetType(JvmLispParser.RetTypeContext ctx) {
        return new Type(ctx, this.visitQname(ctx.qname()));
    }

    @Override
    public StaticModifier visitStaticModifier(JvmLispParser.StaticModifierContext ctx) {
        return new StaticModifier(ctx);
    }

    @Override
    public VariableInitial visitVarInit(JvmLispParser.VarInitContext ctx) {
        return new VariableInitial(ctx, this.visitExpr(ctx.expr()));
    }

    @Override
    public Type visitVarType(JvmLispParser.VarTypeContext ctx) {
        return new Type(ctx, this.visitQname(ctx.qname()));
    }

    @Override
    public TypeExtends visitTypeExtends(JvmLispParser.TypeExtendsContext ctx) {
        return new TypeExtends(ctx, ctx.qname().stream().map(this::visitQname).toList());
    }

    @Override
    public TypeImplements visitTypeImpl(JvmLispParser.TypeImplContext ctx) {
        return new TypeImplements(ctx, ctx.qname().stream().map(this::visitQname).toList());
    }

    @Override
    public Statement visitStmt(JvmLispParser.StmtContext ctx) {
        if (ctx.valueLiteral() != null) {
            return this.visitValueLiteral(ctx.valueLiteral());
        } else if (ctx.varDecl() != null) {
            return this.visitVarDecl(ctx.varDecl());
        } else {
            return null;
        }
    }

    @Override
    public Expression visitExpr(JvmLispParser.ExprContext ctx) {
        if (ctx.valueLiteral() != null) {
            return this.visitValueLiteral(ctx.valueLiteral());
        } else if (ctx.qname() != null) {
            return this.visitQname(ctx.qname());
        } else {
            return null;
        }
    }

    @Override
    public ValueLiteral visitValueLiteral(JvmLispParser.ValueLiteralContext ctx) {
        if (ctx.charLiteral() != null) {
            return this.visitCharLiteral(ctx.charLiteral());
        } else if (ctx.digitsLiteral() != null) {
            return this.visitDigitsLiteral(ctx.digitsLiteral());
        } else if (ctx.falseLiteral() != null) {
            return this.visitFalseLiteral(ctx.falseLiteral());
        } else if (ctx.numericLiteral() != null) {
            return this.visitNumericLiteral(ctx.numericLiteral());
        } else if (ctx.stringLiteral() != null) {
            return this.visitStringLiteral(ctx.stringLiteral());
        } else if (ctx.trueLiteral() != null) {
            return this.visitTrueLiteral(ctx.trueLiteral());
        } else {
            return null;
        }
    }

    @Override
    public CharLiteral visitCharLiteral(JvmLispParser.CharLiteralContext ctx) {
        return new CharLiteral(ctx);
    }

    @Override
    public DigitsLiteral visitDigitsLiteral(JvmLispParser.DigitsLiteralContext ctx) {
        return new DigitsLiteral(ctx);
    }

    @Override
    public False visitFalseLiteral(JvmLispParser.FalseLiteralContext ctx) {
        return new False(ctx);
    }

    @Override
    public NumericLiteral visitNumericLiteral(JvmLispParser.NumericLiteralContext ctx) {
        return new NumericLiteral(ctx);
    }

    @Override
    public StringLiteral visitStringLiteral(JvmLispParser.StringLiteralContext ctx) {
        return new StringLiteral(ctx);
    }

    @Override
    public True visitTrueLiteral(JvmLispParser.TrueLiteralContext ctx) {
        return new True(ctx);
    }

    @Override
    public Identity visitId(JvmLispParser.IdContext ctx) {
        return new Identity(ctx);
    }

    @Override
    public QualifiedName visitQname(JvmLispParser.QnameContext ctx) {
        return new QualifiedName(ctx);
    }
}
