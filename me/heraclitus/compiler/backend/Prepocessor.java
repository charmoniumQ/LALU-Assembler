package me.heraclitus.compiler.backend;
import java.util.List;


public class Prepocessor {
	public List<Symbol> preprocess(String preprocessedSource) {
		/* Now:
		 * parse the source (space separated) into a list of tokens
		 */
		/* Later:
		 * Takes care of all preprocessing including
		 *     stripping whitespace,
		 *     macro substitution,
		 *     include files,
		 *     comments,
		 * and parses the remainder into a list of tokens
		 */
		return null;
	}
}

/*
Whitespace: add 
  0101 
  	 1010;

Line comments: add 0110 1100; // hello
Multi-line comments: add /*
what
ghj
* / 0101 1000;
*/