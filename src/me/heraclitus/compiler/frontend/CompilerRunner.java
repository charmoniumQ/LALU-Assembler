package me.heraclitus.compiler.frontend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.heraclitus.compiler.backend.CommandSpec;
import me.heraclitus.compiler.backend.Compiler;
import me.heraclitus.compiler.backend.Prepocessor;
import me.heraclitus.compiler.backend.Token;
import me.heraclitus.compiler.errors.AddressExpected;
import me.heraclitus.compiler.errors.AddressFormat;
import me.heraclitus.compiler.errors.CommandExpected;
import me.heraclitus.compiler.errors.CommandNotFound;
import me.heraclitus.compiler.errors.LabelUndefined;
import me.heraclitus.compiler.errors.UnknownSymbol;

public class CompilerRunner {

	public static String run(File inputFile, File outputFile) {
		StringBuilder log = new StringBuilder();
		String inputString;
		try {
			inputString = new String(Files.readAllBytes(inputFile.toPath()));
		} catch (IOException e) {
			log.append("Unable to read file (" + inputFile.getName() + "): " + e.getMessage() + "\n");
			System.err.println(log.toString());
			e.printStackTrace();
			return log.toString();
		}
		log.append("Read from " + inputFile.getName() + "\n");

		Pair<String, Integer> o;
		try {
			o = compile(inputString);
		} catch (CommandNotFound | AddressExpected | CommandExpected | LabelUndefined | AddressFormat | UnknownSymbol e) {
			log.append(e.getMessage());
			System.err.println(log.toString());
			e.printStackTrace();
			return log.toString();
		}
		String outputString = o.getFirst();
		int bytes = o.getSecond();

		if (outputFile != null) {
			PrintStream outputWriter;
			try {
				outputWriter = new PrintStream(outputFile);
			} catch (FileNotFoundException e) {
				log.append("Unable to write file (" + outputFile.getName() + "): " + e.getMessage() + "\n");
				System.err.println(log.toString());
				e.printStackTrace();
				return log.toString();
			}
			log.append("Wrote to " + outputFile.getName() + "\n");
			outputWriter.print(outputString);
			outputWriter.close();
		} else {
			log.append("Wrote to stdout\n");
			System.out.print(outputString);
		}

		log.append("Successfully compiled " + bytes + " bytes\n");
		System.err.println(log.toString());
		return log.toString();
	}

	private static Pair<String, Integer> compile(String inputString) throws CommandNotFound, AddressExpected, CommandExpected, AddressFormat, LabelUndefined, UnknownSymbol {
		Prepocessor pp = new Prepocessor();
		Compiler co = new Compiler();
		Map<String, CommandSpec> dict = new HashMap<String, CommandSpec>();
		dict.put("add", new CommandSpec("0000", false));
		dict.put("sub", new CommandSpec("0001", false));
		dict.put("ld", new CommandSpec("0010", true));
		dict.put("xchg", new CommandSpec("0011", false));
		dict.put("st", new CommandSpec("0100", true));
		dict.put("jmp", new CommandSpec("101", true, true));
		dict.put("jmpn", new CommandSpec("110", true, true));
		dict.put("loada", new CommandSpec("0111", false));
		dict.put("nop", new CommandSpec("1000", false));
		co.setCommandSet(dict);
		List<Token> tokens = pp.preprocess(inputString);
		String outputString = co.compile(tokens);
		Pair<String, Integer> o = new Pair<String, Integer>(outputString, co.getBytes());
		return o;
	}
}
