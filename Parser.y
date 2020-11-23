%{
import java.io.*;
%}
%token DEF IF THEN ELSE WHILE DO FOR
%token LEFT RIGHT COLON COMMA SEMICOLON
%token PLUS MINUS MULT REM DIV EQUAL ASSIGHN GREATER LESS LESSEQ GREATEREQ NOT
%token<sval> IDENT
%token<ival> LIT
%token WHITESPACE
%left MINUS PLUS
%right ELSE


%%

p	    : 	 d SEMICOLON p
| 		     d
;

d	     : 	  DEF IDENT LEFT args RIGHT ASSIGHN e SEMICOLON
;

args  	:  	IDENT COMMA args
| 	       	IDENT
;

e	      : 	LIT
| 	       	IDENT
|		        IF e op e THEN e ELSE e
|           FOR e DO e
|           DO e WHILE e
| 	        e PLUS e
|		        e MINUS e
|           e MULT e
|           e DIV e
|           e REM e
| 	        IDENT LEFT e RIGHT
;


op :        EQUAL
|           GREATER
|           LESS
|           GREATEREQ
|           LESSEQ
|           NOT
|           REM
;

%%

private lang lexer;


private int yylex() {

    int yyl_return = -1;

try {
      yylval = new ParserVal(0);

      yyl_return = lexer.yylex();
    }

   catch (IOException e) {
      System.err.println("IO error :"+e);

    }
    return yyl_return;
  }



  public void yyerror (String error) {

    System.err.println ("error: " + error);
  }



    public Parser(Reader r) {
      lexer = new lang(r, this);
    }



    public static void main(String args[]) throws IOException {
      System.out.println("The Parser: ");
      Parser yyparser;

      if ( args.length > 0 ) {
        yyparser = new Parser(new FileReader(args[0]));
        yyparser.yyparse();
        System.out.println("no Syntax error");
      }
      
    }
