LALU Assembler
==============

"A simple assembler for a simple processor."

##### Quick guide:

Execute the program normally (with no arguments) to enter GUI mode. You need to put a source file in the input and select a destination to output the compiled binary.

To use CMD mode, supply the name of a source file as an argument and pipe the stdout to a file. Run this from the prompt to compile test.asm to tset.out: `java -jar LALU_Assembler_v*.jar test.asm > test.out`). Debugging information is written to stderr.

##### Commands:
- add (0000)
- sub (0001)
- ld (0010) takes one 4-bit address
- xchg (0011)
- st (0100) takes one 4-bit address
- jmp (101) takes one 5-bit address
- djmp ("delayed jump") is an alias for jmp
- jmpn (110) takes one 5-bit address
- djmpn ("delayed jump if negative") is an alias for jmpn
- loadA (0111)
- nop (1000)

##### Features:
Whitespace ignorant:

This

    add sub ld 1000
    
is equivalent to this

    add
    sub
    ld 100

Comments (line comments and block comments):

    add // This is a comment
    sub /*
    this is a comment
    so is this
    */
    ld 100 // /*
    (notably) this is a comment
    */


Labels:

    @abc // stores the address of the next command
    add
    sub
    jmp @abc // goes back to the 'add' statement
