package me.heraclitus.compiler.backend;
import java.util.List;
import java.util.Map;

import me.heraclitus.compiler.errors.CommandExpected;
import me.heraclitus.compiler.errors.CommandNotFound;
import me.heraclitus.compiler.errors.IncorrectArguments;




public class Compiler {
	public String compile(List<Symbol> symbols) throws CommandNotFound, IncorrectArguments, CommandExpected {

		return null;
	}

	public Map<String, CommandSpec> getCommandSet() {
		return commandSet;
	}

	public void setCommandSet(Map<String, CommandSpec> commandSet) {
		this.commandSet = commandSet;
	}
	
	Map<String, CommandSpec> commandSet;
	/*
	 * Set of commands for the program to 
	 */
}
