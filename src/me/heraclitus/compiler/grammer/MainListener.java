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
	 * Enter a parse tree produced by {@link MainParser#assignLabel}.
	 * @param ctx the parse tree
	 */
	void enterAssignLabel(MainParser.AssignLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assignLabel}.
	 * @param ctx the parse tree
	 */
	void exitAssignLabel(MainParser.AssignLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assignPointer}.
	 * @param ctx the parse tree
	 */
	void enterAssignPointer(MainParser.AssignPointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assignPointer}.
	 * @param ctx the parse tree
	 */
	void exitAssignPointer(MainParser.AssignPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codebyteLiteral}
	 * labeled alternative in {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void enterCodebyteLiteral(MainParser.CodebyteLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codebyteLiteral}
	 * labeled alternative in {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void exitCodebyteLiteral(MainParser.CodebyteLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codebyteNullary}
	 * labeled alternative in {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void enterCodebyteNullary(MainParser.CodebyteNullaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codebyteNullary}
	 * labeled alternative in {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void exitCodebyteNullary(MainParser.CodebyteNullaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codebyteUnary4}
	 * labeled alternative in {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void enterCodebyteUnary4(MainParser.CodebyteUnary4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code codebyteUnary4}
	 * labeled alternative in {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void exitCodebyteUnary4(MainParser.CodebyteUnary4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code codebyteUnary3}
	 * labeled alternative in {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void enterCodebyteUnary3(MainParser.CodebyteUnary3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code codebyteUnary3}
	 * labeled alternative in {@link MainParser#codebyte}.
	 * @param ctx the parse tree
	 */
	void exitCodebyteUnary3(MainParser.CodebyteUnary3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#nullary_command}.
	 * @param ctx the parse tree
	 */
	void enterNullary_command(MainParser.Nullary_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#nullary_command}.
	 * @param ctx the parse tree
	 */
	void exitNullary_command(MainParser.Nullary_commandContext ctx);
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
	 * Enter a parse tree produced by the {@code addressLiteral4}
	 * labeled alternative in {@link MainParser#address_4}.
	 * @param ctx the parse tree
	 */
	void enterAddressLiteral4(MainParser.AddressLiteral4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code addressLiteral4}
	 * labeled alternative in {@link MainParser#address_4}.
	 * @param ctx the parse tree
	 */
	void exitAddressLiteral4(MainParser.AddressLiteral4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code addressPointer}
	 * labeled alternative in {@link MainParser#address_4}.
	 * @param ctx the parse tree
	 */
	void enterAddressPointer(MainParser.AddressPointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addressPointer}
	 * labeled alternative in {@link MainParser#address_4}.
	 * @param ctx the parse tree
	 */
	void exitAddressPointer(MainParser.AddressPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addressLiteral5}
	 * labeled alternative in {@link MainParser#address_5}.
	 * @param ctx the parse tree
	 */
	void enterAddressLiteral5(MainParser.AddressLiteral5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code addressLiteral5}
	 * labeled alternative in {@link MainParser#address_5}.
	 * @param ctx the parse tree
	 */
	void exitAddressLiteral5(MainParser.AddressLiteral5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code addressLabel}
	 * labeled alternative in {@link MainParser#address_5}.
	 * @param ctx the parse tree
	 */
	void enterAddressLabel(MainParser.AddressLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addressLabel}
	 * labeled alternative in {@link MainParser#address_5}.
	 * @param ctx the parse tree
	 */
	void exitAddressLabel(MainParser.AddressLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(MainParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(MainParser.EofContext ctx);
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