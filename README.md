LALU Assembler
==============

"A simple assembler for a simple processor."

##### Labels:

Writing the @ symbol lets you 'name' the next address in program memory. A label can be used in place of any 5-bit address.

    @abc // stores the address of the next command
    add
    sub
    jmp @abc // goes back to the 'add' statement

##### Pointers:

Writing the * symbol lets you 'name' an address in data memory. A pointer can be used in place of any 4-bit address.

    *idx = 0101
    st *idx // stores A to 0101

##### Literal command:

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

##### Comments:

Java-style comments are ignored (both line-comments and block-comments).

    add // This is a comment
    sub /*
    this is a comment
    so is this
    */
    ld 100 // /*
    (notably) this is a comment
    */

##### Bases:

You can enter any number as a binary, decimal, or hexidecimal. All of the following lines do the same thing (set the pointer `*idx` to `0100`). The assembler deduces the number of bits that the number should take up.

    *idx = 0b100 // 0b in front means binary
    *idx = 0b0100 // any number of leading zeros
    *idx = 100 // (no modifier means binary)
    *idx = 0d4 // 0d for decimal
    *idx = 0x4 // 0x for hexidecimal

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


##### Whitespace ignorant:

This

    add       sub
    ld
    1000
    st1000
    
is equivalent to this

    add
    sub
    ld 1000
    st 1000

##### Errors:

Error messages look really nice with line number and the error line with the offending token underlined. Hopefully you won't have to see them. :)

##### CMD mode:

Execute the program normally (with no arguments) to enter GUI mode as usual.

To use CMD mode, add the argument `cmd` to the program. It reads source from stdin, outputs the assembled binary to stdout, and outputs errors to stderr. Run this from the prompt to compile test.asm to tset.out: `java -jar LALU_Assembler_v*.jar cmd < test.asm > test.out`.
