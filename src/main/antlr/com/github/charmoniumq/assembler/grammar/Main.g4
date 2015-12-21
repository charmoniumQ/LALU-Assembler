grammar Main;

options {
    language = Java;
}

@header {
    package com.github.charmoniumq.assembler.grammar;
}

// visitSource visits its codebyte children and asks for a string
// visitSource knows how to format the bytes for Logisim
source : (codebyte)+ eof ;

codebyte : literal8
         | command8Execute
         | command4Execute
         | command3Execute
         | setLabel
         | setPointer
         ;

// visitSetLabel sets the label and returns emptystring
setLabel : label ;

// visitPointer asks visit(literal4) to get an address
// then it sets the value of a pointer and returns emptystring
setPointer : pointer '=' literal4 ;

// visitCommand_n_Execute combines the binary code of its children
command4Execute : command4Name address4 ;

command3Execute : command3Name address5 ;

command8Execute : command8Name ;

// visitCommand_n_Name returns the code shown here
command8Name
returns [String code] : 'add'   {$code = "00000000";}
                      | 'sub'   {$code = "00000001";}
                      | 'xchg'  {$code = "00000011";}
                      | 'loada' {$code = "00000111";}
                      | 'storea'{$code = "00001001";}
                      | 'incr'  {$code = "00001010";}
                      | 'nop'   {$code = "00001000";}
                      ;

command4Name
returns [String code] : 'ld' {$code = "0010";}
                      | 'st' {$code = "0100";}
                      ;

command3Name
returns [String code] : 'jmp'   {$code = "101";}
                      | 'djmp'  {$code = "101";}
                      | 'jmpn'  {$code = "110";}
                      | 'djmpn' {$code = "110";}
                      ;

address5 : literal5
         | getLabel
         ;

address4 : literal4
         | getPointer
         ;

// visitGetPointer looks up pointer in database and returns its value
// could throw an error if pointer is not previously defined
getPointer : pointer ;

// visitGetLabel looks up label in database and returns its value
// could throw an error if label is not previously defined
getLabel : label ;

label : '@' word ;

pointer : '*' word ;

// visitLiteral_N interprets the literal as an N-bit number
literal8 : literal ;

literal5 : literal ;

literal4 : literal ;

literal : BIN_NUMBER
        | DEC_NUMBER
        | HEX_NUMBER
        ;

word : WORD ;

WORD : LETTER+ ;

BIN_NUMBER : '0' 'b' BIN_DIGIT+
           | BIN_DIGIT+
           ;

DEC_NUMBER : '0' 'd' DEC_DIGIT+;

HEX_NUMBER : '0' 'x' HEX_DIGIT+;

fragment BIN_DIGIT : ('0'..'1') ;

fragment DEC_DIGIT : ('0'..'9') ;

fragment HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment LETTER : ('a'..'z'|'A'..'Z') ;

// visitEof has to return empty string so it will work with the visitSource
eof : EOF ;

WHITESPACE : [ \r\t\n]+ -> skip ;

BLOCK_COMMENT : '/*' .*? '*/' -> skip ;

LINE_COMMENT : '//' .*? ('\r' | '\n') -> skip ;

OTHER_CHAR : . ;
