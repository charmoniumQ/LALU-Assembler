#!/bin/sh
java -cp "./lib/antlr-4.5-complete.jar" org.antlr.v4.Tool grammer/Main.g4 -o src/me/heraclitus/compiler -visitor
