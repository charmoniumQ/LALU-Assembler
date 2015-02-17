LALU Assembler
==============

"A simple assembler for a simple processor."

##### Quick guide:

You need to put a source file in the input and select a destination to output the compiled binary.

##### Commands:
- add (0000)
- sub (0001)
- ld (0010) takes one address
- xchg (0011)
- st (0100) takes one address

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
