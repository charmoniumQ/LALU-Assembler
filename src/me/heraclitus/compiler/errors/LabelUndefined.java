package me.heraclitus.compiler.errors;

import me.heraclitus.compiler.backend.Label;

@SuppressWarnings("serial")
public class LabelUndefined extends Exception {
	public LabelUndefined(Label la) {
		super("Label '" + la.getSource() + "' is undefined");
	}
}
