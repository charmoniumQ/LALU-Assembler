package me.heraclitus.compiler.backend;

public class CommandSpec {
	public CommandSpec(String source, String code, int args) {
		this.code = code;
		this.args = args;
	}
	
	public String toString() {
		return "Command(" + code + ", " + args + ")";
	}
	
	String code;
	int args;
}
