package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.Address;
import me.heraclitus.compiler.backend.CommandToken;

@SuppressWarnings("serial")
public class AddressFormat extends Exception {
	public AddressFormat(Address ad, CommandToken ct) {
		super();
		if (ad.isExtended()) {
			message = "4-bit address expected:\n\t" + ad.getSource() + " was supplied but a 4-bit address was expected by command " + ct.getSource();
		} else {
			message = "5-bit address expected:\n\t" + ad.getSource() + " was supplied but a 5-bit address was expected by command " + ct.getSource();
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
}
