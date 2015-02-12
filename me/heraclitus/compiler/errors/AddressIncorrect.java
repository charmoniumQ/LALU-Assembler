package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.Address;

@SuppressWarnings("serial")
public class AddressIncorrect extends Exception {
	public AddressIncorrect(Address ad) {
		super("Address not formated correctly:\n\t'"+
	ad.getSource() + "' should be a 4-bit long binary number");
	}
}
