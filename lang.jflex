import java.util.*;
import java.io.*;
%%

%class lang
%standalone
%line
%byaccj
%{
    private Parser yyparser;

    public lang(java.io.Reader r, Parser yyparser) {

    this(r);
    this.yyparser = yyparser;
}

%}

IDENT = [a-zA-Z][a-zA-Z0-9_]*
LIT = 0|[1-9][0-9]*
WHITESPACE = [\n\t ]+
%%

"def"     {return Parser.DEF;}
"if"      {return Parser.IF;}
"then"    {return Parser.THEN;}
"else"    {return Parser.ELSE;}
"while"   {return Parser.PLUS;}
"do"      {return Parser.DO;}
"for"     {return Parser.FOR;}
"("       {return Parser.LEFT;}
")"       {return Parser.RIGHT;}
":"       {return Parser.COLON;}
","       {return Parser.COMMA;}
";"       {return Parser.SEMICOLON;}
"=="      {return Parser.EQUAL;}
"="       {return Parser.ASSIGHN;}
"+"       {return Parser.PLUS;}
 "-"      {return Parser.MINUS;}
"*"       {return Parser.MULT;}
"%"       {return Parser.REM;}
"/"       {return Parser.DIV;}
"<"       {return Parser.LESS;}
">"       {return Parser.GREATER;}
"<="      {return Parser.LESSEQ;}
">="      {return Parser.GREATEREQ;}
"!="      {return Parser.NOT;}



{IDENT}     {yyparser.yylval = new ParserVal(yytext()); return Parser.IDENT;}

{LIT}       {yyparser.yylval = new ParserVal(yytext());	return Parser.LIT;}

{WHITESPACE}   {}

.        {System.out.println("UNKONW TOKEN Found:  " + yytext());}
