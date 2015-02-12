package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.Token;

@SuppressWarnings("serial")
public class CommandExpected extends Exception {

	public CommandExpected(Token sy) {
		super("Command expected in place of '" + sy.getSource() + "'");
	}
}
