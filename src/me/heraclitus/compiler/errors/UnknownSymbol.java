package me.heraclitus.compiler.errors;

@SuppressWarnings("serial")
public class UnknownSymbol extends Exception {
	public UnknownSymbol(String token) {
		super("Unable to interpret '" + token + "'\n\tMust be either an 4-bit binary address, 5-bit binary address, command name, or label");
	}
}
