// Generated from grammer/Main.g4 by ANTLR 4.5

    package me.heraclitus.compiler.grammer;
 
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainParser}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(MainParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(MainParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#nobyte}.
	 * @param ctx the parse tree
	 */
	void enterNobyte(MainParser.NobyteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#nobyte}.
	 * @param ctx the parse tree
	 */
	void exitNobyte(MainParser.NobyteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void enterCodebyte(MainParser.CodebyteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void exitCodebyte(MainParser.CodebyteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#nullary_command_4}.
	 * @param ctx the parse tree
	 */
	void enterNullary_command_4(MainParser.Nullary_command_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#nullary_command_4}.
	 * @param ctx the parse tree
	 */
	void exitNullary_command_4(MainParser.Nullary_command_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#unary_command_4}.
	 * @param ctx the parse tree
	 */
	void enterUnary_command_4(MainParser.Unary_command_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#unary_command_4}.
	 * @param ctx the parse tree
	 */
	void exitUnary_command_4(MainParser.Unary_command_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#unary_command_3}.
	 * @param ctx the parse tree
	 */
	void enterUnary_command_3(MainParser.Unary_command_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#unary_command_3}.
	 * @param ctx the parse tree
	 */
	void exitUnary_command_3(MainParser.Unary_command_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#address_4}.
	 * @param ctx the parse tree
	 */
	void enterAddress_4(MainParser.Address_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#address_4}.
	 * @param ctx the parse tree
	 */
	void exitAddress_4(MainParser.Address_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#address_5}.
	 * @param ctx the parse tree
	 */
	void enterAddress_5(MainParser.Address_5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#address_5}.
	 * @param ctx the parse tree
	 */
	void exitAddress_5(MainParser.Address_5Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(MainParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(MainParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(MainParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(MainParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#literal_byte_8}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_byte_8(MainParser.Literal_byte_8Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#literal_byte_8}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_byte_8(MainParser.Literal_byte_8Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#literal_address_5}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_address_5(MainParser.Literal_address_5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#literal_address_5}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_address_5(MainParser.Literal_address_5Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#literal_address_4}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_address_4(MainParser.Literal_address_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#literal_address_4}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_address_4(MainParser.Literal_address_4Context ctx);
}