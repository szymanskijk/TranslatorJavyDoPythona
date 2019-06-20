package pczka;

import me.*;

import java.util.ArrayList;


public class kompGramatykaVisitor extends gramatykaBaseVisitor<String> {
    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder programBuilder = new StringBuilder();
    StringBuilder typeBuilder = new StringBuilder();
    StringBuilder semicolBuilder = new StringBuilder();
    StringBuilder operationBuilder = new StringBuilder();
    StringBuilder wholeBuilder = new StringBuilder();
    boolean loop = false;


    @Override
    public String visitType(gramatykaParser.TypeContext ctx) {
        typeBuilder.append("");
        return typeBuilder.toString();
    }

    @Override
    public String visitOperator(gramatykaParser.OperatorContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitComperator(gramatykaParser.ComperatorContext ctx) {
        return " "+ctx.getText()+" ";
    }

    @Override
    public String visitAnd_operator(gramatykaParser.And_operatorContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOr_operator(gramatykaParser.Or_operatorContext ctx) {
        return " " + ctx.getText() + " ";
    }

    @Override
    public String visitLogic_operator(gramatykaParser.Logic_operatorContext ctx) {
        return " " + ctx.getText() + " ";
    }

    @Override
    public String visitOperand(gramatykaParser.OperandContext ctx) {
        return ctx.getText();

    }

    @Override
    public String visitString(gramatykaParser.StringContext ctx) {
        return super.visitString(ctx);
    }

    @Override
    public String visitOperation(gramatykaParser.OperationContext ctx) {
        StringBuilder operationBuilder = new StringBuilder();
        if(ctx.operand() != null){
            operationBuilder.append(visitOperand(ctx.operand().get(0)));
            operationBuilder.append(" ");
            if(ctx.operator()!=null) {
                operationBuilder.append(visitOperator(ctx.operator(0)));
            }else{
                operationBuilder.append(" ");
            }
            operationBuilder.append(" ");
            operationBuilder.append(visitOperand(ctx.operand().get(1)));
        }
        return operationBuilder.toString();
    }



    @Override
    public String visitAssign(gramatykaParser.AssignContext ctx) {
//        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(visitType(ctx.type()));
        stringBuilder.append(visitIdentifier(ctx.identifier()));
        stringBuilder.append(" ");
        stringBuilder.append(ctx.ASSIGN().getText());
        stringBuilder.append(" ");
        if(ctx.operand() != null){
            stringBuilder.append(visitOperand(ctx.operand()));
            stringBuilder.append("\n");
        }
        if(ctx.operation() != null){
            stringBuilder.append(visitOperation(ctx.operation()));
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
//        return super.visitAssign(ctx);
    }

    @Override
    public String visitAssign2(gramatykaParser.Assign2Context ctx) {
        StringBuilder assign2Builder = new StringBuilder();

        assign2Builder.append(visitIdentifier(ctx.identifier()));
        assign2Builder.append(" ");
        assign2Builder.append(ctx.ASSIGN().getText());
        assign2Builder.append(" ");
        if (ctx.operand() != null) {
            assign2Builder.append(visitOperand(ctx.operand()));
            assign2Builder.append("\n");
        }
        if (ctx.operation() != null) {
            assign2Builder.append(visitOperation(ctx.operation()));
            assign2Builder.append("\n");

        }
        return assign2Builder.toString();
    }
    @Override
    public String visitSemicol(gramatykaParser.SemicolContext ctx) {
        semicolBuilder.append("");
//        semicolBuilder.append("penerior");
//        return semicolBuilder.toString();
        return semicolBuilder.toString();
    }

    @Override
    public String visitNumber(gramatykaParser.NumberContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLogic_operation(gramatykaParser.Logic_operationContext ctx) {
        StringBuilder logicOperationBuilder = new StringBuilder();

        if(ctx.operand() != null) {
            logicOperationBuilder.append(visitOperand(ctx.operand().get(0)));
            if(ctx.logic_operator() != null) {
                logicOperationBuilder.append(visitLogic_operator(ctx.logic_operator()));
            }
            if(ctx.comperator() != null){
                logicOperationBuilder.append(visitComperator(ctx.comperator()));
            }
            logicOperationBuilder.append(visitOperand(ctx.operand().get(1)));
        }
        return logicOperationBuilder.toString();
    }

    @Override
    public String visitNew_if(gramatykaParser.New_ifContext ctx) {
//        StringBuilder ifBulder = new StringBuilder();
        stringBuilder.append(ctx.IF().getText());
        stringBuilder.append(ctx.LNO().getText());
        stringBuilder.append(visitLogic_operation(ctx.logic_operation()));
        stringBuilder.append(ctx.PNO().getText());
        stringBuilder.append(":\n");

        try {
            int i = 0;
            while (ctx.assign2().get(i) != null) {
                stringBuilder.append("  ");
                stringBuilder.append(visitAssign2(ctx.assign2().get(i)));
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        if (ctx.return_ex() != null) {
            stringBuilder.append("  ");
            stringBuilder.append(visitReturn_ex(ctx.return_ex().get(0)));
        }
        try{
            if (ctx.elseif() != null) {
                stringBuilder.append(visitElseif(ctx.elseif(0)));
            }
        }catch(NullPointerException e){ }
        try{
            if (ctx.else_ex() != null) {
                stringBuilder.append(visitElse_ex(ctx.else_ex(0)));
            }
        }catch(NullPointerException e) {}
//        return stringBuilder.toString();
        return super.visitNew_if(ctx);


    }

    @Override
    public String visitElseif(gramatykaParser.ElseifContext ctx) {
        StringBuilder elseifBulder = new StringBuilder();
        elseifBulder.append(ctx.ELSEIF().getText());
        elseifBulder.append(ctx.LNO().getText());
        elseifBulder.append(visitLogic_operation(ctx.logic_operation()));
        elseifBulder.append(ctx.PNO().getText());
        elseifBulder.append(":\n");
        try{
            int i = 0;
            while(ctx.assign2().get(i) != null){
                elseifBulder.append("  ");
                elseifBulder.append(visitAssign2(ctx.assign2().get(i)));
                i++;
            }
        }catch(IndexOutOfBoundsException e){ }
        if(ctx.return_ex()!=null){
            elseifBulder.append("  ");
            elseifBulder.append(visitReturn_ex(ctx.return_ex().get(0)));
        }
        return elseifBulder.toString();

    }

    @Override
    public String visitElse_ex(gramatykaParser.Else_exContext ctx) {
        StringBuilder elseBulder = new StringBuilder();
        elseBulder.append(ctx.ELSE().getText());
        elseBulder.append(":\n");
        try{
            int i = 0;
            while(ctx.assign2().get(i) != null){
                elseBulder.append("  ");
                elseBulder.append(visitAssign2(ctx.assign2().get(i)));
                i++;
            }
        }catch(IndexOutOfBoundsException e){ }
        if(ctx.return_ex()!=null){
            elseBulder.append("  ");
            elseBulder.append(visitReturn_ex(ctx.return_ex().get(0)));
        }
        if(ctx.break_ex()!=null){
//            elseBulder.append(visitBreak_ex(ctx.break_ex().get(0)));
        }
//        return super.visitElse_ex(ctx);
        return elseBulder.toString();


    }

    @Override
    public String visitInstructions(gramatykaParser.InstructionsContext ctx) {
//        StringBuilder buildInstructions = new StringBuilder();
//        if(ctx.instruction() instanceof gramatykaParser.AssignContext){
//            buildInstructions.append("ss");
//        }
//        buildInstructions.append(ctx.instruction());
//        return buildInstructions.toString();
        return super.visitInstructions(ctx);

    }

    @Override
    public String visitInstruction(gramatykaParser.InstructionContext ctx) {
        return super.visitInstruction(ctx);
    }

    @Override
    public String visitFor_ex(gramatykaParser.For_exContext ctx) {
        stringBuilder.append(ctx.FOR());
        stringBuilder.append(" temp in range(10,30):\n");
//        stringBuilder.append(ctx.new_if());
        if(ctx.new_if() != null){
            stringBuilder.append("  ");
            stringBuilder.append(visitNew_if(ctx.new_if(0)));
        }
        if(ctx.assign2() != null){
            stringBuilder.append("  ");
            stringBuilder.append(visitAssign2(ctx.assign2(0)));
        }
        if(ctx.return_ex() != null){
            stringBuilder.append("  ");

            stringBuilder.append(visitReturn_ex(ctx.return_ex(0)));
        }
        return stringBuilder.toString();
    }

    @Override
    public String visitReturn_ex(gramatykaParser.Return_exContext ctx) {
        StringBuilder buildReturn = new StringBuilder();
        buildReturn.append(ctx.RETURN().getText());
        buildReturn.append(" ");
        buildReturn.append(visitOperand(ctx.operand()));
        buildReturn.append("\n");
        return buildReturn.toString();
    }

    @Override
    public String visitProgram(gramatykaParser.ProgramContext ctx) {
        programBuilder.append("# Generated File\n\n");
        programBuilder.append(visitChildren(ctx));

        return programBuilder.toString();
    }

    @Override
    public String visitIdentifier(gramatykaParser.IdentifierContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLogic_operation_n(gramatykaParser.Logic_operation_nContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitPackag_ex(gramatykaParser.Packag_exContext ctx) {
        stringBuilder.append(ctx.PACKAGE());
//        stringBuilder.append(" ");
        stringBuilder.append(visitOperand(ctx.operand()));
        return stringBuilder.toString();
    }

    @Override
    public String visitImport_ex(gramatykaParser.Import_exContext ctx) {
        stringBuilder.append(ctx.IMPORT());
        stringBuilder.append(" ");
        stringBuilder.append(visitOperand(ctx.operand()));
        return stringBuilder.toString();
    }

    @Override
    public String visitBreak_ex(gramatykaParser.Break_exContext ctx) {
        StringBuilder breakBuilder = new StringBuilder();
        breakBuilder.append(ctx.BREAK());
        return ctx.BREAK().getText();
    }

    @Override
    public String visitInclement(gramatykaParser.InclementContext ctx) {
        return super.visitInclement(ctx);
    }
}
