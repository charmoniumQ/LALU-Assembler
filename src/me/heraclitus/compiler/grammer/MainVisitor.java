// Generated from grammer/Main.g4 by ANTLR 4.5

    package me.heraclitus.compiler.grammer;
 
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MainParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(MainParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#nobyte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNobyte(MainParser.NobyteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodebyte(MainParser.CodebyteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#nullary_command_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullary_command_4(MainParser.Nullary_command_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#unary_command_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_command_4(MainParser.Unary_command_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#unary_command_3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_command_3(MainParser.Unary_command_3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#address_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_4(MainParser.Address_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#address_5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress_5(MainParser.Address_5Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(MainParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(MainParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#literal_byte_8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_byte_8(MainParser.Literal_byte_8Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#literal_address_5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_address_5(MainParser.Literal_address_5Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#literal_address_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_address_4(MainParser.Literal_address_4Context ctx);
}