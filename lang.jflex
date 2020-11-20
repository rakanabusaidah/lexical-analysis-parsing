

%%

%class langflex
%standalone

ident = [a-zA-Z][a-zA-Z0-9_]*
lit = [0-9]+
newline = \n
whitespace = [\t ]+

%%

"def"    {System.out.println("keyword Found:  " + yytext());}
"if"    {System.out.println("keyword Found:  " + yytext());}
"then"    {System.out.println("keyword Found:  " + yytext());}
"else"    {System.out.println("keyword Found:  " + yytext());}
"while"    {System.out.println("keyword Found:  " + yytext());}
"do"    {System.out.println("keyword Found : " + yytext());}
"for"    {System.out.println("keyword Found:  " + yytext());}

"("     {System.out.println("punctuation Found:  " + yytext());}
")"     {System.out.println("punctuation Found:  " + yytext());}
":"      {System.out.println("punctuation Found:  " + yytext());}
","      {System.out.println("punctuation Found:  " + yytext());}
";"      {System.out.println("punctuation Found:  " + yytext());}

"="      {System.out.println("operator Found:  " + yytext());}
"+"      {System.out.println("operator Found:  " + yytext());}
"-"       {System.out.println("operator Found:  " + yytext());}
"*"       {System.out.println("operator Found:  " + yytext());}
"%"       {System.out.println("operator Found:  " + yytext());}
"/"       {System.out.println("operator Found:  " + yytext());}
"=="      {System.out.println("operator Found:  " + yytext());}
">"       {System.out.println("operator Found:  " + yytext());}
"<"       {System.out.println("operator Found:  " + yytext());}
"<="      {System.out.println("operator Found:  " + yytext());}
">="      {System.out.println("operator Found:  " + yytext());}
"!="       {System.out.println("operator Found:  " + yytext());}

{ident}     {System.out.println("identifier Found:  " + yytext());}

{lit}       {System.out.println("Literals Found:  " + yytext());}

{newline}   {}

{whitespace}   {}

.        {System.out.println("UNKONW TOKEN Found:  " + yytext());}
