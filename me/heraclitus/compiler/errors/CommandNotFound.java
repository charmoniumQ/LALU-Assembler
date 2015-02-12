package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.CommandToken;

@SuppressWarnings("serial")
public class CommandNotFound extends Exception {

	public CommandNotFound(CommandToken ct) {
		super("Command '" + ct.getSource() + "' not found" + 
				"\n\tSymbol is not a known command");
	}
}
