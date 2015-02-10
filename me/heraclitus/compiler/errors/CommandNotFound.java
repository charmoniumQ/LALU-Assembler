package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.Symbol;

public class CommandNotFound extends Exception {

	public CommandNotFound(Symbol sy) {
		super("error message about how Symbol sy doesn't match any of the commands I know");
	}

}
