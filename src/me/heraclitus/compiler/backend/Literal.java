package me.heraclitus.compiler.backend;

import me.heraclitus.compiler.backend.Token;

public class Literal extends Token {
	public Literal(String source, int row, int col) {
		super(source, row, col);
	}
}
