//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 2 "Parser.y"
import java.io.*;
//#line 19 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//public class ParserVal is defined in ParserVal.java


String   yytext;//user variable to return contextual strings
ParserVal yyval; //used to return semantic vals from action routines
ParserVal yylval;//the 'lval' (result) I got from yylex()
ParserVal valstk[];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
void val_init()
{
  valstk=new ParserVal[YYSTACKSIZE];
  yyval=new ParserVal();
  yylval=new ParserVal();
  valptr=-1;
}
void val_push(ParserVal val)
{
  if (valptr>=YYSTACKSIZE)
    return;
  valstk[++valptr]=val;
}
ParserVal val_pop()
{
  if (valptr<0)
    return new ParserVal();
  return valstk[valptr--];
}
void val_drop(int cnt)
{
int ptr;
  ptr=valptr-cnt;
  if (ptr<0)
    return;
  valptr = ptr;
}
ParserVal val_peek(int relative)
{
int ptr;
  ptr=valptr-relative;
  if (ptr<0)
    return new ParserVal();
  return valstk[ptr];
}
final ParserVal dup_yyval(ParserVal val)
{
  ParserVal dup = new ParserVal();
  dup.ival = val.ival;
  dup.dval = val.dval;
  dup.sval = val.sval;
  dup.obj = val.obj;
  return dup;
}
//#### end semantic value section ####
public final static short DEF=257;
public final static short IF=258;
public final static short THEN=259;
public final static short ELSE=260;
public final static short WHILE=261;
public final static short DO=262;
public final static short FOR=263;
public final static short LEFT=264;
public final static short RIGHT=265;
public final static short COLON=266;
public final static short COMMA=267;
public final static short SEMICOLON=268;
public final static short PLUS=269;
public final static short MINUS=270;
public final static short MULT=271;
public final static short REM=272;
public final static short DIV=273;
public final static short EQUAL=274;
public final static short ASSIGHN=275;
public final static short GREATER=276;
public final static short LESS=277;
public final static short LESSEQ=278;
public final static short GREATEREQ=279;
public final static short NOT=280;
public final static short IDENT=281;
public final static short LIT=282;
public final static short WHITESPACE=283;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    0,    1,    2,    2,    3,    3,    3,    3,    3,
    3,    3,    3,    3,    3,    3,    4,    4,    4,    4,
    4,    4,    4,
};
final static short yylen[] = {                            2,
    3,    1,    8,    3,    1,    1,    1,    8,    4,    4,
    3,    3,    3,    3,    3,    4,    1,    1,    1,    1,
    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    0,    0,    1,    0,    0,    0,
    0,    4,    0,    0,    0,    0,    0,    6,    0,    0,
    0,    0,    0,    3,    0,    0,    0,    0,    0,    0,
   17,   18,   19,   21,   20,   22,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   16,    0,
    0,    0,    0,
};
final static short yydgoto[] = {                          2,
    3,    9,   44,   37,
};
final static short yysindex[] = {                      -251,
 -276,    0, -257, -249, -251, -259,    0, -244, -229, -259,
 -235,    0, -254, -254, -254, -254, -216,    0,  -32,  -21,
  -26,   -8, -254,    0, -254, -254, -254, -254, -254, -254,
    0,    0,    0,    0,    0,    0, -254, -254, -254,    1,
 -242, -242,    6,    6,    6, -252,    6,    6,    0, -254,
  -39, -254, -242,
};
final static short yyrindex[] = {                         0,
    0,    0,   58,    0,    0,    0,    0, -206,    0,    0,
    0,    0,    0,    0,    0,    0, -227,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
 -205, -183, -139, -117,  -95,    0,  -73,  -51,    0,    0,
    0,    0, -161,
};
final static short yygindex[] = {                        56,
    0,   52,  -13,    0,
};
final static int YYTABLESIZE=279;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         19,
   20,   21,   22,   14,    4,    1,   50,   15,   16,   40,
    5,   41,   42,   43,    6,   45,   25,   26,   27,   28,
   29,    8,   10,   46,   47,   48,   17,   18,   27,   28,
   29,    7,    7,    7,    7,   11,   51,    7,   53,   13,
    7,    7,    7,    7,    7,    7,    7,   23,    7,    7,
    7,    7,    7,   11,   11,   11,   11,    2,    5,   11,
    7,   12,   11,   11,   11,    0,    0,    0,   11,    0,
   11,   11,   11,   11,   11,   12,   12,   12,   12,    0,
    0,   12,    0,    0,   12,   12,   12,    0,    0,    0,
   12,    0,   12,   12,   12,   12,   12,    8,    8,    8,
    8,    0,    0,    8,    0,    0,    8,    8,    8,    0,
    0,    0,    8,    0,    8,    8,    8,    8,    8,   13,
   13,   13,   13,    0,    0,   13,    0,    0,   13,    0,
    0,    0,    0,    0,   13,    0,   13,   13,   13,   13,
   13,   15,   15,   15,   15,    0,    0,   15,    0,    0,
   15,    0,    0,    0,    0,    0,   15,    0,   15,   15,
   15,   15,   15,   14,   14,   14,   14,    0,    0,   14,
    0,    0,   14,    0,    0,    0,    0,    0,   14,    0,
   14,   14,   14,   14,   14,   10,   10,   10,   10,    0,
    0,   10,    0,    0,   10,    0,    0,    0,    0,    0,
   10,    0,   10,   10,   10,   10,   10,    9,    9,    9,
    9,    0,    0,    9,    0,    0,    9,    0,    0,    0,
   52,    0,    9,    0,    9,    9,    9,    9,    9,   25,
   26,   27,   28,   29,   38,   24,   25,   26,   27,   28,
   29,    0,   25,   26,   27,   28,   29,   25,   26,   27,
   30,   29,   31,   39,   32,   33,   34,   35,   36,    0,
   25,   26,   27,   28,   29,   49,    0,    0,    0,   25,
   26,   27,   28,   29,   25,   26,   27,   28,   29,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         13,
   14,   15,   16,  258,  281,  257,  259,  262,  263,   23,
  268,   25,   26,   27,  264,   29,  269,  270,  271,  272,
  273,  281,  267,   37,   38,   39,  281,  282,  271,  272,
  273,  259,  260,  261,  262,  265,   50,  265,   52,  275,
  268,  269,  270,  271,  272,  273,  274,  264,  276,  277,
  278,  279,  280,  259,  260,  261,  262,    0,  265,  265,
    5,   10,  268,  269,  270,   -1,   -1,   -1,  274,   -1,
  276,  277,  278,  279,  280,  259,  260,  261,  262,   -1,
   -1,  265,   -1,   -1,  268,  269,  270,   -1,   -1,   -1,
  274,   -1,  276,  277,  278,  279,  280,  259,  260,  261,
  262,   -1,   -1,  265,   -1,   -1,  268,  269,  270,   -1,
   -1,   -1,  274,   -1,  276,  277,  278,  279,  280,  259,
  260,  261,  262,   -1,   -1,  265,   -1,   -1,  268,   -1,
   -1,   -1,   -1,   -1,  274,   -1,  276,  277,  278,  279,
  280,  259,  260,  261,  262,   -1,   -1,  265,   -1,   -1,
  268,   -1,   -1,   -1,   -1,   -1,  274,   -1,  276,  277,
  278,  279,  280,  259,  260,  261,  262,   -1,   -1,  265,
   -1,   -1,  268,   -1,   -1,   -1,   -1,   -1,  274,   -1,
  276,  277,  278,  279,  280,  259,  260,  261,  262,   -1,
   -1,  265,   -1,   -1,  268,   -1,   -1,   -1,   -1,   -1,
  274,   -1,  276,  277,  278,  279,  280,  259,  260,  261,
  262,   -1,   -1,  265,   -1,   -1,  268,   -1,   -1,   -1,
  260,   -1,  274,   -1,  276,  277,  278,  279,  280,  269,
  270,  271,  272,  273,  261,  268,  269,  270,  271,  272,
  273,   -1,  269,  270,  271,  272,  273,  269,  270,  271,
  272,  273,  274,  262,  276,  277,  278,  279,  280,   -1,
  269,  270,  271,  272,  273,  265,   -1,   -1,   -1,  269,
  270,  271,  272,  273,  269,  270,  271,  272,  273,
};
}
final static short YYFINAL=2;
final static short YYMAXTOKEN=283;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,"DEF","IF","THEN","ELSE","WHILE","DO","FOR","LEFT","RIGHT",
"COLON","COMMA","SEMICOLON","PLUS","MINUS","MULT","REM","DIV","EQUAL","ASSIGHN",
"GREATER","LESS","LESSEQ","GREATEREQ","NOT","IDENT","LIT","WHITESPACE",
};
final static String yyrule[] = {
"$accept : p",
"p : d SEMICOLON p",
"p : d",
"d : DEF IDENT LEFT args RIGHT ASSIGHN e SEMICOLON",
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
"e : IDENT LEFT e RIGHT",
"op : EQUAL",
"op : GREATER",
"op : LESS",
"op : GREATEREQ",
"op : LESSEQ",
"op : NOT",
"op : REM",
};

//#line 51 "Parser.y"

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
//#line 323 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################
