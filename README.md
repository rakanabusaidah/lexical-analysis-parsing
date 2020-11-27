# Lexical Analysis and Parsing for simple language.

(This is for CSC340 Programming Languages and Compilation Assignment)

### Description

I used JFlex for the lexical part and BYACC/J for the parsing.
(http://byaccj.sourceforge.net for more informations)
-------------
Simple language described as:
P -> D ; P | D
D -> def id(ARGS) = E;
ARGS -> id , ARGS | id
E -> int | id| if E1 OP E2 then E3 else E4| for E1 do E2|do E1 while E2
	| E1+E2 | E1-E2 |E1*E2|E1/E2|E1%E2 id(E1, ..., En)
OP -> == | > | < | >= | <= | !=|%  (the mod operation)



### Files used
input.txt (sample program for computing fibonacci numbers)
lang.jflex
lang.java
Parser.y
Parser.java

### How to use
in terminal:
jflex lang.jflex  && yacc -J Parser.y && javac lang.java && javac Parser.java
java Parser [file name].txt (input.txt in this case)



