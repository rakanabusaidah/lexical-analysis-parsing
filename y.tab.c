#ifndef lint
static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";
#endif
#define YYBYACC 1
#line 2 "Parser.y"
import java.io.*;
#line 8 "y.tab.c"
#define DEF 257
#define IF 258
#define THEN 259
#define ELSE 260
#define WHILE 261
#define DO 262
#define FOR 263
#define LEFT 264
#define RIGHT 265
#define COLON 266
#define COMMA 267
#define SEMICOLON 268
#define ASSIGHN 269
#define PLUS 270
#define MINUS 271
#define MULT 272
#define REM 273
#define DIV 274
#define EQUAL 275
#define GREATER 276
#define LESS 277
#define LESSEQ 278
#define GREATEREQ 279
#define NOT 280
#define IDENT 281
#define LIT 282
#define WHITESPACE 283
#define YYERRCODE 256
short yylhs[] = {                                        -1,
    0,    0,    1,    2,    2,    3,    3,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    5,    5,    4,    4,
    4,    4,    4,    4,    4,
};
short yylen[] = {                                         2,
    3,    1,    7,    3,    1,    1,    1,    8,    4,    4,
    3,    3,    3,    3,    3,    4,    3,    1,    1,    1,
    1,    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    0,    0,    1,    0,    0,    0,
    0,    4,    0,    0,    0,    0,    0,    6,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   19,
   20,   21,   23,   22,   24,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   16,
    0,   17,    0,    0,    0,
};
short yydgoto[] = {                                       2,
    3,    9,   39,   36,   40,
};
short yysindex[] = {                                   -257,
 -268,    0, -248, -242, -257, -256,    0, -243, -236, -256,
 -231,    0, -251, -251, -251, -251, -225,    0, -186, -197,
 -218, -202, -251, -251, -251, -251, -251, -251, -251,    0,
    0,    0,    0,    0,    0, -251, -251, -251, -209, -219,
 -264, -264, -186, -186, -186, -238, -186, -186, -251,    0,
 -251,    0, -223, -251, -264,
};
short yyrindex[] = {                                      0,
    0,    0,   40,    0,    0,    0,    0, -208,    0,    0,
    0,    0,    0,    0,    0,    0,    1,    0,    2,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0, -206,    0,
   23,   45,   89,  111,  133,    0,  155,  177,    0,    0,
    0,    0,    0,    0,   67,
};
short yygindex[] = {                                     37,
    0,   56,  -10,    0,   41,
};
#define YYTABLESIZE 457
short yytable[] = {                                       1,
    7,    3,   19,   20,   21,   22,   14,   26,   27,   28,
   15,   16,    4,   41,   42,   43,   44,   45,   44,    5,
   51,    6,   11,   10,    8,   46,   47,   48,   11,   17,
   18,   24,   25,   26,   27,   28,   54,   13,   23,    2,
   53,    7,   37,   55,   12,   50,   24,   25,   26,   27,
   28,   24,   25,   26,   27,   28,    5,   49,   18,   38,
   24,   25,   26,   27,   28,   12,    8,   24,   25,   26,
   27,   28,   24,   25,   26,   29,   28,   30,   31,   32,
   33,   34,   35,   24,   25,   26,   27,   28,   13,   52,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   15,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   14,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   10,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    9,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    7,
    7,    7,    7,    0,    0,    7,    0,    7,    7,    3,
    7,    7,    7,    7,    7,    7,    7,    7,    7,    7,
    7,   11,   11,   11,   11,    0,    0,   11,    0,   11,
   11,    0,   11,   11,    0,    0,    0,   11,   11,   11,
   11,   11,   11,   12,   12,   12,   12,    0,    0,   12,
    0,   12,   12,    0,   12,   12,    0,    0,    0,   12,
   12,   12,   12,   12,   12,    8,    8,    8,    8,    0,
    0,    8,    0,    8,    8,    0,    8,    8,    0,    0,
    0,    8,    8,    8,    8,    8,    8,   13,   13,   13,
   13,    0,    0,   13,    0,   13,   13,    0,    0,    0,
    0,    0,    0,   13,   13,   13,   13,   13,   13,   15,
   15,   15,   15,    0,    0,   15,    0,   15,   15,    0,
    0,    0,    0,    0,    0,   15,   15,   15,   15,   15,
   15,   14,   14,   14,   14,    0,    0,   14,    0,   14,
   14,    0,    0,    0,    0,    0,    0,   14,   14,   14,
   14,   14,   14,   10,   10,   10,   10,    0,    0,   10,
    0,   10,   10,    0,    0,    0,    0,    0,    0,   10,
   10,   10,   10,   10,   10,    9,    9,    9,    9,    0,
    0,    9,    0,    9,    9,    0,    0,    0,    0,    0,
    0,    9,    9,    9,    9,    9,    9,
};
short yycheck[] = {                                     257,
    0,    0,   13,   14,   15,   16,  258,  272,  273,  274,
  262,  263,  281,   24,   25,   26,   27,   28,   29,  268,
  259,  264,    0,  267,  281,   36,   37,   38,  265,  281,
  282,  270,  271,  272,  273,  274,  260,  269,  264,    0,
   51,    5,  261,   54,    0,  265,  270,  271,  272,  273,
  274,  270,  271,  272,  273,  274,  265,  267,  265,  262,
  270,  271,  272,  273,  274,   10,    0,  270,  271,  272,
  273,  274,  270,  271,  272,  273,  274,  275,  276,  277,
  278,  279,  280,  270,  271,  272,  273,  274,    0,   49,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
    0,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,    0,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,    0,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,    0,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  259,
  260,  261,  262,   -1,   -1,  265,   -1,  267,  268,  268,
  270,  271,  272,  273,  274,  275,  276,  277,  278,  279,
  280,  259,  260,  261,  262,   -1,   -1,  265,   -1,  267,
  268,   -1,  270,  271,   -1,   -1,   -1,  275,  276,  277,
  278,  279,  280,  259,  260,  261,  262,   -1,   -1,  265,
   -1,  267,  268,   -1,  270,  271,   -1,   -1,   -1,  275,
  276,  277,  278,  279,  280,  259,  260,  261,  262,   -1,
   -1,  265,   -1,  267,  268,   -1,  270,  271,   -1,   -1,
   -1,  275,  276,  277,  278,  279,  280,  259,  260,  261,
  262,   -1,   -1,  265,   -1,  267,  268,   -1,   -1,   -1,
   -1,   -1,   -1,  275,  276,  277,  278,  279,  280,  259,
  260,  261,  262,   -1,   -1,  265,   -1,  267,  268,   -1,
   -1,   -1,   -1,   -1,   -1,  275,  276,  277,  278,  279,
  280,  259,  260,  261,  262,   -1,   -1,  265,   -1,  267,
  268,   -1,   -1,   -1,   -1,   -1,   -1,  275,  276,  277,
  278,  279,  280,  259,  260,  261,  262,   -1,   -1,  265,
   -1,  267,  268,   -1,   -1,   -1,   -1,   -1,   -1,  275,
  276,  277,  278,  279,  280,  259,  260,  261,  262,   -1,
   -1,  265,   -1,  267,  268,   -1,   -1,   -1,   -1,   -1,
   -1,  275,  276,  277,  278,  279,  280,
};
#define YYFINAL 2
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 283
#if YYDEBUG
char *yyname[] = {
"end-of-file",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"DEF","IF","THEN","ELSE","WHILE",
"DO","FOR","LEFT","RIGHT","COLON","COMMA","SEMICOLON","ASSIGHN","PLUS","MINUS",
"MULT","REM","DIV","EQUAL","GREATER","LESS","LESSEQ","GREATEREQ","NOT","IDENT",
"LIT","WHITESPACE",
};
char *yyrule[] = {
"$accept : p",
"p : d SEMICOLON p",
"p : d",
"d : DEF IDENT LEFT args RIGHT ASSIGHN e",
"args : IDENT COMMA args",
"args : IDENT",
"e : LIT",
"e : IDENT",
"e : IF e op e THEN e ELSE e",
"e : FOR e DO e",
"e : DO e WHILE e",
"e : e PLUS e",
"e : e MINUS e",
"e : e MULT e",
"e : e DIV e",
"e : e REM e",
"e : IDENT LEFT r RIGHT",
"r : e COMMA r",
"r : e",
"op : EQUAL",
"op : GREATER",
"op : LESS",
"op : GREATEREQ",
"op : LESSEQ",
"op : NOT",
"op : REM",
};
#endif
#define yyclearin (yychar=(-1))
#define yyerrok (yyerrflag=0)
#ifdef YYSTACKSIZE
#ifndef YYMAXDEPTH
#define YYMAXDEPTH YYSTACKSIZE
#endif
#else
#ifdef YYMAXDEPTH
#define YYSTACKSIZE YYMAXDEPTH
#else
#define YYSTACKSIZE 500
#define YYMAXDEPTH 500
#endif
#endif
int yydebug;
int yynerrs;
int yyerrflag;
int yychar;
short *yyssp;
YYSTYPE *yyvsp;
YYSTYPE yyval;
YYSTYPE yylval;
short yyss[YYSTACKSIZE];
YYSTYPE yyvs[YYSTACKSIZE];
#define yystacksize YYSTACKSIZE
#line 54 "Parser.y"

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

    System.err.println ("Error: " + error);
  }



  public Parser(Reader r) {

    lexer = new lang(r , this);
  }



  public static void main(String args[]) throws IOException {

    System.out.println("Fib parsing :");
    Parser yyparser;

    if ( args.length > 0 ) {


      yyparser = new Parser(new FileReader(args[0]));
	yyparser.yyparse();
	System.out.println("No error detected.");
    }

    else {

	System.out.println("ERROR!!");

    }
  }
#line 303 "y.tab.c"
#define YYABORT goto yyabort
#define YYACCEPT goto yyaccept
#define YYERROR goto yyerrlab
int
yyparse()
{
    register int yym, yyn, yystate;
#if YYDEBUG
    register char *yys;
    extern char *getenv();

    if (yys = getenv("YYDEBUG"))
    {
        yyn = *yys;
        if (yyn >= '0' && yyn <= '9')
            yydebug = yyn - '0';
    }
#endif

    yynerrs = 0;
    yyerrflag = 0;
    yychar = (-1);

    yyssp = yyss;
    yyvsp = yyvs;
    *yyssp = yystate = 0;

yyloop:
    if (yyn = yydefred[yystate]) goto yyreduce;
    if (yychar < 0)
    {
        if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, reading %d (%s)\n", yystate,
                    yychar, yys);
        }
#endif
    }
    if ((yyn = yysindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: state %d, shifting to state %d (%s)\n",
                    yystate, yytable[yyn],yyrule[yyn]);
#endif
        if (yyssp >= yyss + yystacksize - 1)
        {
            goto yyoverflow;
        }
        *++yyssp = yystate = yytable[yyn];
        *++yyvsp = yylval;
        yychar = (-1);
        if (yyerrflag > 0)  --yyerrflag;
        goto yyloop;
    }
    if ((yyn = yyrindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
        yyn = yytable[yyn];
        goto yyreduce;
    }
    if (yyerrflag) goto yyinrecovery;
#ifdef lint
    goto yynewerror;
#endif
yynewerror:
    yyerror("syntax error");
#ifdef lint
    goto yyerrlab;
#endif
yyerrlab:
    ++yynerrs;
yyinrecovery:
    if (yyerrflag < 3)
    {
        yyerrflag = 3;
        for (;;)
        {
            if ((yyn = yysindex[*yyssp]) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: state %d, error recovery shifting\
 to state %d\n", *yyssp, yytable[yyn]);
#endif
                if (yyssp >= yyss + yystacksize - 1)
                {
                    goto yyoverflow;
                }
                *++yyssp = yystate = yytable[yyn];
                *++yyvsp = yylval;
                goto yyloop;
            }
            else
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: error recovery discarding state %d\n",
                            *yyssp);
#endif
                if (yyssp <= yyss) goto yyabort;
                --yyssp;
                --yyvsp;
            }
        }
    }
    else
    {
        if (yychar == 0) goto yyabort;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, error recovery discards token %d (%s)\n",
                    yystate, yychar, yys);
        }
#endif
        yychar = (-1);
        goto yyloop;
    }
yyreduce:
#if YYDEBUG
    if (yydebug)
        printf("yydebug: state %d, reducing by rule %d (%s)\n",
                yystate, yyn, yyrule[yyn]);
#endif
    yym = yylen[yyn];
    yyval = yyvsp[1-yym];
    switch (yyn)
    {
    }
    yyssp -= yym;
    yystate = *yyssp;
    yyvsp -= yym;
    yym = yylhs[yyn];
    if (yystate == 0 && yym == 0)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: after reduction, shifting from state 0 to\
 state %d\n", YYFINAL);
#endif
        yystate = YYFINAL;
        *++yyssp = YYFINAL;
        *++yyvsp = yyval;
        if (yychar < 0)
        {
            if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
            if (yydebug)
            {
                yys = 0;
                if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
                if (!yys) yys = "illegal-symbol";
                printf("yydebug: state %d, reading %d (%s)\n",
                        YYFINAL, yychar, yys);
            }
#endif
        }
        if (yychar == 0) goto yyaccept;
        goto yyloop;
    }
    if ((yyn = yygindex[yym]) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn];
    else
        yystate = yydgoto[yym];
#if YYDEBUG
    if (yydebug)
        printf("yydebug: after reduction, shifting from state %d \
to state %d\n", *yyssp, yystate);
#endif
    if (yyssp >= yyss + yystacksize - 1)
    {
        goto yyoverflow;
    }
    *++yyssp = yystate;
    *++yyvsp = yyval;
    goto yyloop;
yyoverflow:
    yyerror("yacc stack overflow");
yyabort:
    return (1);
yyaccept:
    return (0);
}
