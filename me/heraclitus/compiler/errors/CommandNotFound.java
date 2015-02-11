package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.CommandToken;

@SuppressWarnings("serial")
public class CommandNotFound extends Exception {

	public CommandNotFound(CommandToken ct) {
		super("Error Command Not Found: Symbol '" + ct.getSource() + "' (at row " + ct.getRow() + ", col " + ct.getCol() + ")" + 
				"\n\tSymbol is not a known command");
	}
}
