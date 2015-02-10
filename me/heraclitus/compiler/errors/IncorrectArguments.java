package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.CommandSpec;
import me.heraclitus.compiler.backend.Symbol;

public class IncorrectArguments extends Exception {

	public IncorrectArguments(Symbol sy, CommandSpec cs) {
		super("error message about how Symbol sy doesn't have enough arguments for Command cs");
	}

}
