package me.heraclitus.compiler.backend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.heraclitus.compiler.errors.AddressExpected;
import me.heraclitus.compiler.errors.AddressIncorrect;
import me.heraclitus.compiler.errors.CommandExpected;
import me.heraclitus.compiler.errors.CommandNotFound;
import me.heraclitus.compiler.errors.LabelUndefined;

public class Compiler {
	public Compiler() {
		commandSet = new HashMap<String, CommandSpec>();
	}

	public String compile(List<Token> symbols) throws CommandNotFound,
			AddressExpected, CommandExpected, AddressIncorrect, LabelUndefined {
		int i = 0;
		StringBuilder output = new StringBuilder("v2.0 raw\n");
		Map<String, String> labels = new HashMap<String, String>();

		while (i < symbols.size()) {
			Token sy = symbols.get(i);
			if (sy instanceof Label) {
				String addressStr = String.format("%4s", Integer.toBinaryString(getBytes())).replace(' ', '0');
				// TODO: this
				labels.put(sy.getSource(), addressStr);
				i += 1;
			} else if (sy instanceof CommandToken) {
				CommandToken ct = (CommandToken) sy;
				if (!commandSet.containsKey(ct.getSource())) {
					throw new CommandNotFound(ct);
				}
				CommandSpec cs = commandSet.get(ct.getSource());

				if (cs.getArgs()) {
					if (!(i + 1 < symbols.size())) {
						throw new AddressExpected(null, cs, ct);
					}
					if (symbols.get(i + 1) instanceof Address) {
						Address ad = (Address) symbols.get(i + 1);
						if (!(ad.getSource().matches("^[01]{4}$"))) {
							throw new AddressIncorrect(ad);
						}
						output.append(toByte(ad.getSource() + cs.getCode()));
						bytes += 1;
						i += 2;
					} else {
                        if (symbols.get(i + 1) instanceof Label) {
                            Label la = (Label) symbols.get(i + 1);
                            if (!labels.containsKey(la.getSource())) {
                                throw new LabelUndefined(la);
                            }
    						output.append(toByte(labels.get(la.getSource()) + cs.getCode()));
                            i += 2;
                            bytes += 1;
                        } else {
                            throw new AddressExpected(symbols.get(i + 1), cs, ct);
                        }
                    }
				} else {
					output.append(toByte("0000" + cs.getCode()));
					bytes += 1;
					i += 1;
				}
			} else {
				throw new CommandExpected(sy);
			}
			if (getBytes() % 8 == 0) {
				output.append("\n");
			} else {
				output.append(" ");
			}
		}
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
