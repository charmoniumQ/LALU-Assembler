LALU Assembler
==============

"A simple assembler for a simple processor."

##### Quick guide:

Execute the program normally (with no arguments) to enter GUI mode. You need to put a source file in the input and select a destination to output the compiled binary. Errors are written to stderr.

Execute the program with an input source file to enter CMD mode (java -jar LALU_Assembler_v*.jar). Output is written to stdout.

##### Commands:
- add (0000)
- sub (0001)
- ld (0010) takes one 4-bit address
- xchg (0011)
- st (0100) takes one 4-bit address
- jmp (101) takes one 5-bit address
- jmpn (110) takes one 5-bit address
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
    goto @abc // spoiler alert: goto statement be coming soon
