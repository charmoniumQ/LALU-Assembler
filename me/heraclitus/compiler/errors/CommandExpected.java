package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.Symbol;

@SuppressWarnings("serial")
public class CommandExpected extends Exception {

	public CommandExpected(Symbol sy) {
		super("Command expected in place of '" + sy.getSource() + "':" +
				"\n\tA command was expected");
	}
}
