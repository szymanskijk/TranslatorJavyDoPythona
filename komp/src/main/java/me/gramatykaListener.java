// Generated from me/gramatyka.g4 by ANTLR 4.7
package me;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatykaParser}.
 */
public interface gramatykaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gramatykaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gramatykaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(gramatykaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(gramatykaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#semicol}.
	 * @param ctx the parse tree
	 */
	void enterSemicol(gramatykaParser.SemicolContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#semicol}.
	 * @param ctx the parse tree
	 */
	void exitSemicol(gramatykaParser.SemicolContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(gramatykaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(gramatykaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#packag_ex}.
	 * @param ctx the parse tree
	 */
	void enterPackag_ex(gramatykaParser.Packag_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#packag_ex}.
	 * @param ctx the parse tree
	 */
	void exitPackag_ex(gramatykaParser.Packag_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#import_ex}.
	 * @param ctx the parse tree
	 */
	void enterImport_ex(gramatykaParser.Import_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#import_ex}.
	 * @param ctx the parse tree
	 */
	void exitImport_ex(gramatykaParser.Import_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#break_ex}.
	 * @param ctx the parse tree
	 */
	void enterBreak_ex(gramatykaParser.Break_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#break_ex}.
	 * @param ctx the parse tree
	 */
	void exitBreak_ex(gramatykaParser.Break_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(gramatykaParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(gramatykaParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#comperator}.
	 * @param ctx the parse tree
	 */
	void enterComperator(gramatykaParser.ComperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#comperator}.
	 * @param ctx the parse tree
	 */
	void exitComperator(gramatykaParser.ComperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void enterAnd_operator(gramatykaParser.And_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void exitAnd_operator(gramatykaParser.And_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void enterOr_operator(gramatykaParser.Or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void exitOr_operator(gramatykaParser.Or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operator(gramatykaParser.Logic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operator(gramatykaParser.Logic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(gramatykaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(gramatykaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(gramatykaParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(gramatykaParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(gramatykaParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(gramatykaParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#logic_operation_n}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operation_n(gramatykaParser.Logic_operation_nContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#logic_operation_n}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operation_n(gramatykaParser.Logic_operation_nContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#logic_operation}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operation(gramatykaParser.Logic_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#logic_operation}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operation(gramatykaParser.Logic_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(gramatykaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(gramatykaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#assign2}.
	 * @param ctx the parse tree
	 */
	void enterAssign2(gramatykaParser.Assign2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#assign2}.
	 * @param ctx the parse tree
	 */
	void exitAssign2(gramatykaParser.Assign2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#forassign}.
	 * @param ctx the parse tree
	 */
	void enterForassign(gramatykaParser.ForassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#forassign}.
	 * @param ctx the parse tree
	 */
	void exitForassign(gramatykaParser.ForassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#new_if}.
	 * @param ctx the parse tree
	 */
	void enterNew_if(gramatykaParser.New_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#new_if}.
	 * @param ctx the parse tree
	 */
	void exitNew_if(gramatykaParser.New_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(gramatykaParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(gramatykaParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#else_ex}.
	 * @param ctx the parse tree
	 */
	void enterElse_ex(gramatykaParser.Else_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#else_ex}.
	 * @param ctx the parse tree
	 */
	void exitElse_ex(gramatykaParser.Else_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(gramatykaParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(gramatykaParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(gramatykaParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(gramatykaParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#inclement}.
	 * @param ctx the parse tree
	 */
	void enterInclement(gramatykaParser.InclementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#inclement}.
	 * @param ctx the parse tree
	 */
	void exitInclement(gramatykaParser.InclementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#for_ex}.
	 * @param ctx the parse tree
	 */
	void enterFor_ex(gramatykaParser.For_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#for_ex}.
	 * @param ctx the parse tree
	 */
	void exitFor_ex(gramatykaParser.For_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#return_ex}.
	 * @param ctx the parse tree
	 */
	void enterReturn_ex(gramatykaParser.Return_exContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#return_ex}.
	 * @param ctx the parse tree
	 */
	void exitReturn_ex(gramatykaParser.Return_exContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gramatykaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gramatykaParser.ProgramContext ctx);
}