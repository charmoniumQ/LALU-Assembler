package me.heraclitus.compiler.backend;

public class CommandSpec {
	public CommandSpec(String code, boolean args) {
		this.code = code;
		this.args = args;
	}
	
	public String toString() {
		return "Command(" + code + ", " + args + ")";
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean getArgs() {
		return args;
	}

	public void setArgs(boolean args) {
		this.args = args;
	}

	String code;
	boolean args;
}
