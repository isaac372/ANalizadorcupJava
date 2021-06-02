package analizadores;

import java.io.File;
import java.io.FileReader;
import java_cup.runtime.*;
import javax.swing.JFileChooser;

/** CUP v0.10k generated parser.
  * @version Tue Jun 01 23:14:10 CST 2021
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\046\000\002\002\004\000\002\003\004\000\002\003" +
    "\003\000\002\004\004\000\002\004\003\000\002\006\005" +
    "\000\002\005\003\000\002\007\003\000\002\007\002\000" +
    "\002\011\004\000\002\011\003\000\002\012\005\000\002" +
    "\012\005\000\002\012\003\000\002\012\003\000\002\012" +
    "\005\000\002\013\005\000\002\013\005\000\002\013\005" +
    "\000\002\013\005\000\002\013\005\000\002\013\005\000" +
    "\002\013\005\000\002\014\012\000\002\015\006\000\002" +
    "\015\002\000\002\016\011\000\002\017\006\000\002\023" +
    "\002\000\002\020\005\000\002\021\004\000\002\022\007" +
    "\000\002\010\003\000\002\010\003\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\022\002\ufff9\005\025\035\013\037\005\040" +
    "\020\041\026\042\017\043\012\001\002\000\004\002\ufffb" +
    "\001\002\000\004\033\115\001\002\000\020\002\ufff9\005" +
    "\025\035\013\037\005\040\020\041\026\043\012\001\002" +
    "\000\022\002\uffe0\005\uffe0\034\uffe0\035\uffe0\037\uffe0\040" +
    "\uffe0\041\uffe0\043\uffe0\001\002\000\022\002\uffdf\005\uffdf" +
    "\034\uffdf\035\uffdf\037\uffdf\040\uffdf\041\uffdf\043\uffdf\001" +
    "\002\000\022\002\uffe1\005\uffe1\034\uffe1\035\uffe1\037\uffe1" +
    "\040\uffe1\041\uffe1\043\uffe1\001\002\000\010\005\033\022" +
    "\036\023\056\001\002\000\004\033\054\001\002\000\004" +
    "\002\053\001\002\000\006\002\ufffa\034\ufffa\001\002\000" +
    "\004\002\uffff\001\002\000\004\005\051\001\002\000\004" +
    "\025\050\001\002\000\022\002\ufff7\005\025\034\ufff7\035" +
    "\013\037\005\040\020\041\026\043\012\001\002\000\022" +
    "\002\ufffd\005\ufffd\035\ufffd\037\ufffd\040\ufffd\041\ufffd\042" +
    "\017\043\ufffd\001\002\000\022\002\uffde\005\uffde\034\uffde" +
    "\035\uffde\037\uffde\040\uffde\041\uffde\043\uffde\001\002\000" +
    "\022\002\uffdc\005\uffdc\034\uffdc\035\uffdc\037\uffdc\040\uffdc" +
    "\041\uffdc\043\uffdc\001\002\000\004\006\032\001\002\000" +
    "\004\025\uffe5\001\002\000\022\002\uffdd\005\uffdd\034\uffdd" +
    "\035\uffdd\037\uffdd\040\uffdd\041\uffdd\043\uffdd\001\002\000" +
    "\004\025\031\001\002\000\022\002\uffe4\005\uffe4\034\uffe4" +
    "\035\uffe4\037\uffe4\040\uffe4\041\uffe4\043\uffe4\001\002\000" +
    "\010\005\033\022\036\023\034\001\002\000\032\007\ufff3" +
    "\010\ufff3\011\ufff3\013\ufff3\015\ufff3\016\ufff3\017\ufff3\020" +
    "\ufff3\024\ufff3\025\ufff3\033\ufff3\034\ufff3\001\002\000\010" +
    "\005\033\022\036\023\034\001\002\000\010\017\041\020" +
    "\037\025\040\001\002\000\032\007\ufff4\010\ufff4\011\ufff4" +
    "\013\ufff4\015\ufff4\016\ufff4\017\ufff4\020\ufff4\024\ufff4\025" +
    "\ufff4\033\ufff4\034\ufff4\001\002\000\010\005\033\022\036" +
    "\023\034\001\002\000\022\002\uffe6\005\uffe6\034\uffe6\035" +
    "\uffe6\037\uffe6\040\uffe6\041\uffe6\043\uffe6\001\002\000\010" +
    "\005\033\022\036\023\034\001\002\000\032\007\ufff6\010" +
    "\ufff6\011\ufff6\013\ufff6\015\ufff6\016\ufff6\017\ufff6\020\ufff6" +
    "\024\ufff6\025\ufff6\033\ufff6\034\ufff6\001\002\000\032\007" +
    "\ufff5\010\ufff5\011\ufff5\013\ufff5\015\ufff5\016\ufff5\017\ufff5" +
    "\020\ufff5\024\ufff5\025\ufff5\033\ufff5\034\ufff5\001\002\000" +
    "\010\017\041\020\037\024\045\001\002\000\032\007\ufff2" +
    "\010\ufff2\011\ufff2\013\ufff2\015\ufff2\016\ufff2\017\ufff2\020" +
    "\ufff2\024\ufff2\025\ufff2\033\ufff2\034\ufff2\001\002\000\020" +
    "\002\ufffe\005\ufffe\035\ufffe\037\ufffe\040\ufffe\041\ufffe\043" +
    "\ufffe\001\002\000\006\002\ufff8\034\ufff8\001\002\000\022" +
    "\002\uffe3\005\uffe3\034\uffe3\035\uffe3\037\uffe3\040\uffe3\041" +
    "\uffe3\043\uffe3\001\002\000\004\025\052\001\002\000\022" +
    "\002\ufffc\005\ufffc\035\ufffc\037\ufffc\040\ufffc\041\ufffc\042" +
    "\ufffc\043\ufffc\001\002\000\004\002\001\001\002\000\010" +
    "\005\033\022\036\023\056\001\002\000\010\015\074\016" +
    "\073\034\077\001\002\000\010\005\033\022\036\023\056" +
    "\001\002\000\016\007\060\010\061\011\062\013\063\017" +
    "\041\020\037\001\002\000\010\005\033\022\036\023\034" +
    "\001\002\000\010\005\033\022\036\023\034\001\002\000" +
    "\010\005\033\022\036\023\034\001\002\000\010\005\033" +
    "\022\036\023\034\001\002\000\020\015\uffec\016\uffec\017" +
    "\041\020\037\024\uffec\033\uffec\034\uffec\001\002\000\020" +
    "\015\uffed\016\uffed\017\041\020\037\024\uffed\033\uffed\034" +
    "\uffed\001\002\000\020\015\uffee\016\uffee\017\041\020\037" +
    "\024\uffee\033\uffee\034\uffee\001\002\000\020\015\uffef\016" +
    "\uffef\017\041\020\037\024\uffef\033\uffef\034\uffef\001\002" +
    "\000\010\015\074\016\073\024\072\001\002\000\020\007" +
    "\060\010\061\011\062\013\063\017\041\020\037\024\045" +
    "\001\002\000\014\015\uffeb\016\uffeb\024\uffeb\033\uffeb\034" +
    "\uffeb\001\002\000\010\005\033\022\036\023\056\001\002" +
    "\000\010\005\033\022\036\023\056\001\002\000\014\015" +
    "\ufff1\016\ufff1\024\ufff1\033\ufff1\034\ufff1\001\002\000\014" +
    "\015\ufff0\016\ufff0\024\ufff0\033\ufff0\034\ufff0\001\002\000" +
    "\004\033\100\001\002\000\020\005\025\034\ufff9\035\013" +
    "\037\005\040\020\041\026\043\012\001\002\000\004\034" +
    "\102\001\002\000\024\002\uffe8\005\uffe8\034\uffe8\035\uffe8" +
    "\036\103\037\uffe8\040\uffe8\041\uffe8\043\uffe8\001\002\000" +
    "\004\033\105\001\002\000\022\002\uffea\005\uffea\034\uffea" +
    "\035\uffea\037\uffea\040\uffea\041\uffea\043\uffea\001\002\000" +
    "\020\005\025\034\ufff9\035\013\037\005\040\020\041\026" +
    "\043\012\001\002\000\004\034\107\001\002\000\022\002" +
    "\uffe9\005\uffe9\034\uffe9\035\uffe9\037\uffe9\040\uffe9\041\uffe9" +
    "\043\uffe9\001\002\000\010\015\074\016\073\033\111\001" +
    "\002\000\020\005\025\034\ufff9\035\013\037\005\040\020" +
    "\041\026\043\012\001\002\000\004\034\113\001\002\000" +
    "\022\002\uffe2\005\uffe2\034\uffe2\035\uffe2\037\uffe2\040\uffe2" +
    "\041\uffe2\043\uffe2\001\002\000\004\002\000\001\002\000" +
    "\010\005\033\022\036\023\056\001\002\000\010\015\074" +
    "\016\073\034\117\001\002\000\004\033\120\001\002\000" +
    "\020\005\025\034\ufff9\035\013\037\005\040\020\041\026" +
    "\043\012\001\002\000\004\034\122\001\002\000\022\002" +
    "\uffe7\005\uffe7\034\uffe7\035\uffe7\037\uffe7\040\uffe7\041\uffe7" +
    "\043\uffe7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\120\000\034\003\013\004\005\005\015\006\021\007" +
    "\003\010\020\011\014\014\010\016\006\017\007\020\022" +
    "\021\023\022\026\001\001\000\002\001\001\000\002\001" +
    "\001\000\026\005\113\007\003\010\020\011\014\014\010" +
    "\016\006\017\007\020\022\021\023\022\026\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\012\056\013\107\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\022\010\020\011\046\014\010\016" +
    "\006\017\007\020\022\021\023\022\026\001\001\000\006" +
    "\004\045\006\021\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\023\027\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\012" +
    "\034\001\001\000\002\001\001\000\004\012\043\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\042\001" +
    "\001\000\002\001\001\000\004\012\041\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\012\056\013\054\001\001\000\002\001\001\000\006" +
    "\012\070\013\067\001\001\000\002\001\001\000\004\012" +
    "\066\001\001\000\004\012\065\001\001\000\004\012\064" +
    "\001\001\000\004\012\063\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\012" +
    "\056\013\075\001\001\000\006\012\056\013\074\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\024\007\100\010\020\011\014\014\010\016\006\017\007" +
    "\020\022\021\023\022\026\001\001\000\002\001\001\000" +
    "\004\015\103\001\001\000\002\001\001\000\002\001\001" +
    "\000\024\007\105\010\020\011\014\014\010\016\006\017" +
    "\007\020\022\021\023\022\026\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\024\007\111\010" +
    "\020\011\014\014\010\016\006\017\007\020\022\021\023" +
    "\022\026\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\012\056\013\115\001\001\000\002" +
    "\001\001\000\002\001\001\000\024\007\120\010\020\011" +
    "\014\014\010\016\006\017\007\020\022\021\023\022\026" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public static void main(String args[]) throws Exception {
                JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            File MyArchivo = file.getSelectedFile();
            FileReader AnalizarArchivo = new FileReader(MyArchivo);
		new parser(new Yylex(AnalizarArchivo)).parse();
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Sentencia ::= SentenciaBreak 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*Sentencia*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Sentencia ::= SentenciaSwitch 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*Sentencia*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // Sentencia ::= SentenciaPuts 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*Sentencia*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // Sentencia ::= SentenciaAsignacion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*Sentencia*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // Sentencia ::= SentenciaWhile 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*Sentencia*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // Sentencia ::= SentenciaIf 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*Sentencia*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SentenciaSwitch ::= SWITCH Condicion INICIOLLAVE BloqueSentencias FINLLAVE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(16/*SentenciaSwitch*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SentenciaBreak ::= BREAK PTOCOMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(15/*SentenciaBreak*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SentenciaPuts ::= PUTS NT$0 PTOCOMA 
            {
              Object RESULT = null;
              // propagate RESULT from NT$0
              if ( ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value != null )
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*SentenciaPuts*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // NT$0 ::= 
            {
              Object RESULT = null;
 System.out.println(" = ;"); 
              CUP$parser$result = new java_cup.runtime.Symbol(17/*NT$0*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // SentenciaAsignacion ::= IDENTIFICADOR ASIGNAR Expresion PTOCOMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*SentenciaAsignacion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // SentenciaWhile ::= WHILE INICIOLLAVE Condicion FINLLAVE INICIOLLAVE BloqueSentencias FINLLAVE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(12/*SentenciaWhile*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // SentenciaElse ::= 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(11/*SentenciaElse*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // SentenciaElse ::= ELSE INICIOLLAVE BloqueSentencias FINLLAVE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(11/*SentenciaElse*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // SentenciaIf ::= IF INICIOLLAVE Condicion FINLLAVE INICIOLLAVE BloqueSentencias FINLLAVE SentenciaElse 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*SentenciaIf*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Condicion ::= LPAREN Condicion RPAREN 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*Condicion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Condicion ::= Expresion MAYOR Expresion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*Condicion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Condicion ::= Expresion MENOR Expresion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*Condicion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Condicion ::= Expresion DISTINTO Expresion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*Condicion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Condicion ::= Expresion IGUAL Expresion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*Condicion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Condicion ::= Condicion AND Condicion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*Condicion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Condicion ::= Condicion OR Condicion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*Condicion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Expresion ::= LPAREN Expresion RPAREN 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*Expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Expresion ::= IDENTIFICADOR 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*Expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Expresion ::= ENTERO 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*Expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Expresion ::= Expresion RESTA Expresion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*Expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Expresion ::= Expresion SUMA Expresion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*Expresion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Sentencias ::= Sentencia 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*Sentencias*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Sentencias ::= Sentencia Sentencias 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*Sentencias*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // BloqueSentencias ::= 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*BloqueSentencias*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // BloqueSentencias ::= Sentencias 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*BloqueSentencias*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Cuerpo ::= BloqueSentencias 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*Cuerpo*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Declaracion ::= SET IDENTIFICADOR PTOCOMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*Declaracion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Declaraciones ::= Declaracion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*Declaraciones*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Declaraciones ::= Declaracion Declaraciones 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*Declaraciones*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Programa ::= Cuerpo 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*Programa*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Programa ::= Declaraciones Cuerpo 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*Programa*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Programa EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

