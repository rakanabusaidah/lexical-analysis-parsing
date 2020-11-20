### Project Title
Lexical Analysis and Patsing for simple language

### Description
Simple language described as:
P -> D ; P | D
D -> def id(ARGS) = E;
ARGS -> id , ARGS | id
E -> int | id| if E1 OP E2 then E3 else E4| for E1 do E2|do E1 while E2
	| E1+E2 | E1-E2 |E1*E2|E1/E2|E1%E2 id(E1, ..., En)
OP -> == | > | < | >= | <= | !=|%  (the mod operation)
-------------
I used JFlex for the lexical part.


### Files used
input.txt (program for computing fibonacci numers)
lang.jflex
langflex.java


