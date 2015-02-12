package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.CommandSpec;
import me.heraclitus.compiler.backend.CommandToken;
import me.heraclitus.compiler.backend.Symbol;

@SuppressWarnings("serial")
public class AddressExpected extends Exception {

	public AddressExpected(Symbol sy, CommandSpec cs, CommandToken ct) {
		super("Error Address Expected:");
		if (sy == null) {
			message = "Address Expected:\n\tEnd of file is reached but an address is expected to complete Command '" + ct.getSource() + "' (at row " + ct.getRow() + ", col " + ct.getCol() + ")";
		} else {
			message = "Address Expected in place of '" + sy.getSource() + "':" + 
					"\n\tAn address was expected to complete '" + ct.getSource() + "'";
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
