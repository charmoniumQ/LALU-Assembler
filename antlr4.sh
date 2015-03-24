#!/bin/sh
java -cp "./lib/antlr-4.5-complete.jar" org.antlr.v4.Tool grammer/Main.g4 -o src/me/heraclitus/compiler -visitor
# 7za l LALU_Assembler_v3.2.jar | grep '\.\.\.\.\.' | sort -n -k5,5 | tail -n 20
