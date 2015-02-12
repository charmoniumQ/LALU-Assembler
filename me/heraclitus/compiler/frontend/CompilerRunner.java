package me.heraclitus.compiler.frontend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.heraclitus.compiler.backend.CommandSpec;
import me.heraclitus.compiler.backend.Compiler;
import me.heraclitus.compiler.backend.Prepocessor;
import me.heraclitus.compiler.backend.Symbol;
import me.heraclitus.compiler.errors.AddressExpected;
import me.heraclitus.compiler.errors.AddressIncorrect;
import me.heraclitus.compiler.errors.CommandExpected;
import me.heraclitus.compiler.errors.CommandNotFound;

public class CompilerRunner {
	public static String run(File inputFile, File outputFile) {
		String inputString;
		try {
			inputString = new String(Files.readAllBytes(inputFile.toPath()));
		} catch (IOException e) {
			String errorLog = "Unable to read file (" + inputFile.getName() + "): " +  e.getMessage();
			System.out.println(errorLog);
			e.printStackTrace();
			return errorLog;
		}
		
		Prepocessor pp = new Prepocessor();
		Compiler co = new Compiler();
		Map<String, CommandSpec> dict = new HashMap<String, CommandSpec>();
		dict.put("add", new CommandSpec("0000", false));
		dict.put("sub", new CommandSpec("0001", false));
		dict.put("ld", new CommandSpec("0010", true));
		co.setCommandSet(dict);
		List<Symbol> tokens = pp.preprocess(inputString);
		String outputString;
		try {
			outputString = co.compile(tokens);
		} catch (CommandNotFound | AddressExpected | CommandExpected
				| AddressIncorrect e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return e.getMessage();
		}
		
		PrintWriter outputWriter;
		try {
			outputWriter = new PrintWriter(outputFile);
		} catch (FileNotFoundException e) {
			String errorLog = "Unable to write file (" + outputFile.getName() + "): " + e.getMessage();
			System.out.println(errorLog);
			e.printStackTrace();
			return errorLog;
		}
		outputWriter.close();
		System.out.println(outputString);
		outputWriter.print(outputString);
		
		String successLog = "Successfully compiled " + co.getBytes() + " bytes";
		System.out.println(successLog);
		return successLog;
	}
}
