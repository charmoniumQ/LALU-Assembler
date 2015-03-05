package me.heraclitus.compiler.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import me.heraclitus.compiler.errors.UnknownSymbol;

public class Prepocessor {
	public List<Token> preprocess(String source) throws UnknownSymbol {
		source = strip(source);
		List<Token> tokens = new ArrayList<Token>();
		for (String token : source.split(" ")) {
			if (token == null || "".equals(token)) {
				continue;
			}
			if (token.matches("[01]{4}")) {
				tokens.add(new Address(token, 1, 1, false));
				continue;
			}
			if (token.matches("[01]{5}")) {
				tokens.add(new Address(token, 1, 1, true));
				continue;
			}
			if (token.matches("\\p{Lower}+")) {
				tokens.add(new CommandToken(token, 1, 1));
				continue;
			}
			if (token.matches("@\\p{Lower}+")) {
				tokens.add(new Label(token, 1, 1));
				continue;
			}
			if (token.matches("0b[01]{8}")) {
				tokens.add(new Literal(token, 1, 1));
				continue;
			}
			throw new UnknownSymbol(token);
		}
		return tokens;
	}

	private String strip(String source) {
		Pattern whitespace = Pattern.compile("\\p{Space}+", Pattern.MULTILINE);
		Pattern lineComment = Pattern.compile("//.*?$", Pattern.MULTILINE);
		Pattern blockComment = Pattern.compile("/\\*.*?\\*/", Pattern.MULTILINE | Pattern.DOTALL);

		source = blockComment.matcher(source).replaceAll(" ");
		source = lineComment.matcher(source).replaceAll(" ");
		source = whitespace.matcher(source).replaceAll(" ");
		return source;
	}
}