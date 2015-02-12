LALU Assembler
==============

"A simple assembler for a simple processor."

##### Commands:
- add
- sub
- ld (takes one address)

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
    (noteably) this is a comment
    */


Labels:

    @abc // stores the address of the next command
    add
    sub
    goto @abc // spoiler alert: goto statement be coming soon
