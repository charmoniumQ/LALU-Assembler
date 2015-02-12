package me.heraclitus.compiler.backend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.heraclitus.compiler.errors.AddressExpected;
import me.heraclitus.compiler.errors.AddressIncorrect;
import me.heraclitus.compiler.errors.CommandExpected;
import me.heraclitus.compiler.errors.CommandNotFound;

public class Compiler {
	public Compiler() {
		commandSet = new HashMap<String, CommandSpec>();
	}
	
	public String compile(List<Symbol> symbols) throws CommandNotFound,
			AddressExpected, CommandExpected, AddressIncorrect {
		int i = 0;
		StringBuilder output = new StringBuilder();
		while (i < symbols.size()) {
			Symbol sy = symbols.get(i);
			if (!(sy instanceof CommandToken)) {
				throw new CommandExpected(sy);
			}

			CommandToken ct = (CommandToken) sy;
			if (!commandSet.containsKey(ct.getSource())) {
				throw new CommandNotFound(ct);
			}
			CommandSpec cs = commandSet.get(ct.getSource());
			output.append(cs.getCode());

			if (cs.getArgs()) {
				if (!(i + 1 < symbols.size())) {
					throw new AddressExpected(null, cs, ct);
				}
				if (!(symbols.get(i + 1) instanceof Address)) {
					throw new AddressExpected(symbols.get(i + 1), cs, ct);
				}
				Address ad = (Address) symbols.get(i + 1);
				if (!(ad.getSource().matches("^[01]{4}$"))) {
					throw new AddressIncorrect(ad);
				}
				output.append(ad.getSource());
				i += 1;
			} else {
				output.append("0000");
			}
			i += 1;
			
		}
		bytes = output.length() / 8;
		return output.toString();
	}
	
	public int getBytes() {
		return bytes;
	}

	public Map<String, CommandSpec> getCommandSet() {
		return commandSet;
	}

	public void setCommandSet(Map<String, CommandSpec> commandSet) {
		this.commandSet = commandSet;
	}

	Map<String, CommandSpec> commandSet;
	/*
	 * Set of commands for the program to interpret
	 */
	int bytes = 0;
}
