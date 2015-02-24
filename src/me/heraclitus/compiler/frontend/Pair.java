package me.heraclitus.compiler.frontend;

class Pair<X, Y> {
	public Pair(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public X getFirst() {
		return x;
	}

	public Y getSecond() {
		return y;
	}

	X x;
	Y y;
}
