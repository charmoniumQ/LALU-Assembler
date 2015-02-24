package me.heraclitus.compiler.backend;

public class CommandSpec {
	public CommandSpec(String code, boolean args, boolean extended) {
		this.code = code;
		this.args = args;
		this.extended = extended;
	}
	public CommandSpec(String code, boolean args) {
		this(code, args, false);
	}

	public String toString() {
		return "Command(" + code + ", " + args + ")";
	}

	public String getCode() {
		return code;
	}

	public boolean takesArg() {
		return args;
	}
	
	public boolean isExtended() {
		return extended;
	}

	String code;
	boolean args;
	boolean extended;
}
