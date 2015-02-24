package me.heraclitus.compiler.backend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.heraclitus.compiler.errors.AddressExpected;
import me.heraclitus.compiler.errors.AddressFormat;
import me.heraclitus.compiler.errors.CommandExpected;
import me.heraclitus.compiler.errors.CommandNotFound;
import me.heraclitus.compiler.errors.LabelUndefined;

public class Compiler {
	public Compiler() {
		commandSet = new HashMap<String, CommandSpec>();
	}

	public String compile(List<Token> symbols) throws CommandNotFound, AddressExpected, CommandExpected, LabelUndefined, AddressFormat {
		int i = 0;
		StringBuilder output = new StringBuilder("v2.0 raw\n");
		Map<String, Address> labels = new HashMap<String, Address>();

		while (i < symbols.size()) {
			Token sy = symbols.get(i);
			if (sy instanceof Label) {
				String addressStr = String.format("%5s", Integer.toBinaryString(getBytes())).replace(' ', '0');
				labels.put(sy.getSource(), new Address(addressStr, 0, 0, true));
				i += 1;
			} else if (sy instanceof CommandToken) {
				CommandToken ct = (CommandToken) sy;
				if (!commandSet.containsKey(ct.getSource())) {
					throw new CommandNotFound(ct);
				}
				CommandSpec cs = commandSet.get(ct.getSource());

				if (cs.takesArg()) {
					if (!(i + 1 < symbols.size())) {
						throw new AddressExpected(null, cs, ct);
					}
					Address ad;
					if (symbols.get(i + 1) instanceof Address) {
						ad = (Address) symbols.get(i + 1);
						bytes += 1;
						i += 2;
					} else if (symbols.get(i + 1) instanceof Label) {
						Label la = (Label) symbols.get(i + 1);
						if (!labels.containsKey(la.getSource())) {
							throw new LabelUndefined(la);
						}
						ad = labels.get(la.getSource());
						i += 2;
						bytes += 1;
					} else {
						throw new AddressExpected(symbols.get(i + 1), cs, ct);
					}
					if (cs.isExtended() != ad.isExtended()) {
						throw new AddressFormat(ad, ct);
					}
					output.append(toByte(ad.getSource() + cs.getCode()) + " ");
				} else {
					output.append(toByte("0000" + cs.getCode()) + " ");
					bytes += 1;
					i += 1;
				}
			} else {
				throw new CommandExpected(sy);
			}
		}
		output.append("\n");
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

	private String toByte(String binary) {
		return String.format("%02x", Integer.parseInt(binary, 2));
	}

	Map<String, CommandSpec> commandSet;
	/*
	 * Set of commands for the program to interpret
	 */
	int bytes = 0;
}
