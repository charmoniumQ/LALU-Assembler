package me.heraclitus.compiler.backend;

public abstract class Token {
	public Token(String source, int row, int col) {
		this.source = source;
		this.row = row;
		this.col = col;
	}

	public String toString() {
		return "Symbol(" + source + ", " + row + ", " + col + ")";
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	String source;
	int row;
	int col;
}
