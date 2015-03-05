grammar Main;

options {
    language = Java;
}

@header {
    package me.heraclitus.compiler.grammer;
}

source : ((nb = nobyte | cb = codebyte))+ eof ;

nobyte : labelName = label # assignLabel
       | pointerName = pointer '=' literal = literal_address_4 # assignPointer
       ;

codebyte : '0b' literal = literal_byte_8 # codebyteLiteral
         | command = nullary_command # codebyteNullary
         | command = unary_command_4 address = address_4 # codebyteUnary4
         | command = unary_command_3 address = address_5 # codebyteUnary3
         ;

nullary_command
returns [String code] : 'add' {$code = "00000000";}
                       | 'sub' {$code = "00000001";}
                       | 'xchg' {$code = "00000011";}
                       | 'loada' {$code = "00000111";}
                       | 'nop' {$code = "00001000";}
                       ;

unary_command_4
returns [String code] : 'ld' {$code = "0010";}
                       | 'st' {$code = "0100";};

unary_command_3
returns [String code] : 'jmp' {$code = "101";}
                       | 'djmp' {$code = "101";}
                       | 'jmpn' {$code = "110";}
                       | 'djmpn' {$code = "110";}
                       ;

address_4 : literal = literal_address_4 # addressLiteral4
          | pointerName = pointer # addressPointer
          ;

address_5 : literal = literal_address_5 # addressLiteral5
          | labelName = label # addressLabel
          ;

POINTER : '*' LETTER+ ;

LABEL : '@' LETTER+ ;

LITERAL_ADDRESS_5 : BIT BIT BIT BIT BIT;

LITERAL_ADDRESS_4 : BIT BIT BIT BIT ;

LITERAL_BYTE_8 : BIT BIT BIT BIT BIT BIT BIT BIT ;

fragment BIT : [01] ;

fragment LETTER : [a-zA-Z] ;

eof : EOF ;

WS : [ \r\t\n]+ -> skip ;

COMMENT : '/*' .*? '*/' -> skip ;

LINE_COMMENT : '//' .*? ('\r' | '\n') -> skip ;

pointer : POINTER ;

label : LABEL ;

literal_byte_8 : LITERAL_BYTE_8 ;

literal_address_5 : LITERAL_ADDRESS_5;

literal_address_4 : LITERAL_ADDRESS_4;
