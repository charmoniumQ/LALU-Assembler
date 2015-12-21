package com.github.charmoniumq.assembler.frontend;

import me.heraclitus.compiler.Utils;
import com.github.charmoniumq.assembler.backend.Compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.Scanner;


public class CompilerRunner {
    public static void run() {
        StringBuilder errorLog = new StringBuilder();
        StringBuilder inputStringBuilder = new StringBuilder();
        Scanner inputScanner = new Scanner(System.in);
        while (inputScanner.hasNextLine()) {
            inputStringBuilder.append(inputScanner.nextLine());
            inputStringBuilder.append("\n");
        }
        errorLog.append("Read from stdin\n");

        Compiler c2 = new Compiler();
        boolean compileSuccess = false;
        String output = "";
        try {
            output = c2.run(inputStringBuilder.toString());
            compileSuccess = true;
        } catch (Throwable e) {
            // if Compiler.run throws a throwable, all of the useful information is in the e.getMessage(), because I wrote it that way.
            errorLog.append("Unable to compile source\n");
            errorLog.append(e.getMessage());
        }
        if (compileSuccess) {
            errorLog.append("Compiled source\n");

            System.out.println(output);
            errorLog.append("Wrote to stdout\n");
            errorLog.append(String.format("Compiled %d bytes\n", c2.getBytes()));
        }
        System.err.println(errorLog.toString());
    }

	public static String run(File inputFile, File outputFile) {
		StringBuilder errorLog = new StringBuilder();
		String inputString = "";
        boolean readSuccess = false;
		try {
			inputString = new String(Files.readAllBytes(inputFile.toPath()));
            readSuccess = true;
		} catch (IOException e) {
			errorLog.append("Unable to read file \"" + inputFile.getName() + "\"\n");
            errorLog.append(Utils.stackTraceString(e));
		}
        if (readSuccess) {
            errorLog.append("Read from \"" + inputFile.getName() + "\"\n");

            Compiler c2 = new Compiler();
            boolean compileSuccess = false;
            String output = "";
            try {
                output = c2.run(inputString);
                compileSuccess = true;
            } catch (Throwable e) {
                // if Compiler.run throws a throwable, all of the useful information is in the e.getMessage(), because I wrote it that way.
                errorLog.append("Unable to compile source\n");
                errorLog.append(e.getMessage());
            }
            if (compileSuccess) {
                errorLog.append("Compiled source\n");
                boolean writeSuccess = false;
                try {
                    PrintStream outputWriter = new PrintStream(outputFile);
                    outputWriter.print(output);
                    outputWriter.close();
                    writeSuccess = true;
                } catch (FileNotFoundException e) {
                    errorLog.append("Unable to write file \"" + outputFile.getName() + "\"\n");
                    errorLog.append(Utils.stackTraceString(e));
                }
                if (writeSuccess) {
                    errorLog.append("Wrote to \"" + outputFile.getName() + "\"\n");
                    errorLog.append(String.format("Compiled %d bytes\n", c2.getBytes()));
                }
            }
        }
		System.err.println(errorLog.toString());
		return errorLog.toString();
	}
}
