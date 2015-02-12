package me.heraclitus.compiler.backend;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class Prepocessor {
	public List<Token> preprocess(String source) {
		source = strip(source);
		List<Token> tokens = new ArrayList<Token>();
		for (String token : source.split(" ")) {
			if (token.matches("\\p{Digit}+")) {
				tokens.add(new Address(token, 1, 1));
			}
			if (token.matches("\\p{Lower}+")) {
				tokens.add(new CommandToken(token, 1, 1));
			}
			if (token.matches("@\\p{Lower}+")) {
				tokens.add(new Label(token, 1, 1));
			}
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