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
- loada (0111)
- nop (1000)

##### Features:
Literal command:

If your implementation has extra non-standard commands, good for you! You can still use the assembler if you encode your special commands as literals. If the assembler comes across an 0b followed immediately by an 8-digit long binary number, it translates that number into binary literally. For example:

This

    add
    sub
    0b11110001
    add
    sub

Compiles to

    00 01 F1 00 01

since 11110001 base 2 is F1 base 16.

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
