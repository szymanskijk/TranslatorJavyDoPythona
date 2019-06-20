// Generated from me/gramatyka.g4 by ANTLR 4.7
package me;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramatykaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramatykaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gramatykaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(gramatykaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#semicol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicol(gramatykaParser.SemicolContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(gramatykaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#packag_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackag_ex(gramatykaParser.Packag_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#import_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_ex(gramatykaParser.Import_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#break_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_ex(gramatykaParser.Break_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(gramatykaParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#comperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComperator(gramatykaParser.ComperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#and_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_operator(gramatykaParser.And_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#or_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_operator(gramatykaParser.Or_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#logic_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operator(gramatykaParser.Logic_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(gramatykaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(gramatykaParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(gramatykaParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#logic_operation_n}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operation_n(gramatykaParser.Logic_operation_nContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#logic_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operation(gramatykaParser.Logic_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(gramatykaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#assign2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign2(gramatykaParser.Assign2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#forassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForassign(gramatykaParser.ForassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#new_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_if(gramatykaParser.New_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(gramatykaParser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#else_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_ex(gramatykaParser.Else_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(gramatykaParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(gramatykaParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#inclement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclement(gramatykaParser.InclementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#for_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_ex(gramatykaParser.For_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#return_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_ex(gramatykaParser.Return_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatykaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gramatykaParser.ProgramContext ctx);
}