package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.Symbol;

@SuppressWarnings("serial")
public class CommandExpected extends Exception {

	public CommandExpected(Symbol sy) {
		super("Error Command Expected: Symbol '" + sy.getSource() + "' (at row " + sy.getRow() + ", col " + sy.getCol() + ")" +
				"\n\tA command was expected");
	}
}
