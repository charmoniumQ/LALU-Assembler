grammar Main;

options {
    language = Java;
}

@header {
    package me.heraclitus.compiler.grammer;
 }

source : (codebyte | nobyte)+ EOF ;

nobyte :
        label |
        pointer '=' literal_address_4 ;

codebyte :
        '0b' LITERAL_BYTE_8 |
        nullary_command_4 |
        unary_command_4 address_4 |
        unary_command_3 address_5 ;

nullary_command_4 returns [String value] :
        'add' {$value = "00000000";} |
        'sub' {$value = "00000001";} |
        'xchg' {$value = "00000011";} |
        'loada' {$value = "00000111";} |
        'nop' {$value = "00001000";} ;

unary_command_4 returns [String value] :
        'ld' {$value = "0010";} |
        'st' {$value = "0100";};

unary_command_3 returns [String value] :
        'jmp' {$value = "101";} |
        'djmp' {$value = "101";} |
        'jmpn' {$value = "110";} |
        'djmpn' {$value = "110";} ;

address_4 :
        literal_address_4 |
        pointer ;

address_5 :
        literal_address_5 |
        label ;

POINTER : '*' LETTER+ ;

LABEL : '@' LETTER+ ;

LITERAL_ADDRESS_5 : BIT BIT BIT BIT BIT;

LITERAL_ADDRESS_4 : BIT BIT BIT BIT ;

LITERAL_BYTE_8 : BIT BIT BIT BIT BIT BIT BIT BIT ;

fragment BIT : [01] ;

fragment LETTER : [azAZ] ;

WS : [ \r\t\n]+ -> skip ;

COMMENT : '/*' .*? '*/' -> skip ;

LINE_COMMENT : '//' .*? ('\r' | '\n') -> skip ;

pointer : POINTER ;

label : LABEL ;

literal_byte_8 : LITERAL_BYTE_8 ;

literal_address_5 : LITERAL_ADDRESS_5;

literal_address_4 : LITERAL_ADDRESS_4;
