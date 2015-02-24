package me.heraclitus.compiler.backend;

public class Address extends Token {

	public Address(String source, int row, int col, boolean extended) {
		super(source, row, col);
		this.extended = extended;
	}
	
	public boolean isExtended() {
		return extended;
	}

	private boolean extended;
}
