package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.Symbol;

public class CommandExpected extends Exception {

	public CommandExpected(Symbol sy) {
		super("error message about how Symbol sy isn't a command");
	}

}
