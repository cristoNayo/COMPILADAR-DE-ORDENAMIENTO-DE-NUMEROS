
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Feb 10 08:41:02 COT 2015
//----------------------------------------------------

package compilador;

import java_cup.runtime.*;
import java.io.FileReader;
import compilador.Metodos;
import java.util.ArrayList;
import java.util.Arrays;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Feb 10 08:41:02 COT 2015
  */
public class AnalizadorSintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintactico() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\004\000\002\003\004\000\002\002" +
    "\003\000\002\002\003\000\002\004\004\000\002\005\004" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\012\000\004\007\006\001\002\000\004\004\ufffe\001" +
    "\002\000\004\004\014\001\002\000\006\005\013\006\012" +
    "\001\002\000\004\002\011\001\002\000\004\004\uffff\001" +
    "\002\000\004\002\001\001\002\000\004\004\ufffc\001\002" +
    "\000\004\004\ufffd\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\012\000\012\002\004\003\006\004\007\005\003\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintactico$actions(this);
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
    return action_obj.CUP$AnalizadorSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    @Override
    public void syntax_error(Symbol sy) {
        token t=(token)sy.value;
        done_parsing();
        report_error("Error sintáctico cerca de \""+ t.getCadena()+"\" : ["+t.getRow()+" : "+t.getCol()+"]",null);
   System.out.println(">>>ERROR<<<");
        System.out.println("Ingrese Bien la sentencia por  favor -->> Sentencia mal estructurada");
        System.out.println("Revise la Documentacion de como estructurar la Sentencia");
    }

    /* Reporte de error encontrado. */
    public void report_error(String message, Object info) {
        StringBuilder m = new StringBuilder("Error");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            if (s.left >= 0) {                
                m.append(" en la línea "+(s.left+1));
                if (s.right >= 0)
                    m.append(", columna "+(s.right+1));
            }
        }
        m.append(" : "+message);
        System.err.println(m);
    }
   
    /* Cuando se encuentra un error de donde el sistema no puede recuperarse, se lanza un error fatal. Se despliega el mensaje
        de error y se finaliza la ejecucion. */

    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }

    /* Metodos para ordenar los numeros de forma descendente y ascendente. */

    	/* Metodo de ordenar descendente*/

 public String ordenarDescendente(String cadenanumeros) {
        String numerosOrdenados = "";
        int numeros[] = new int[cadenanumeros.length()];
        for (int i = 0; i < cadenanumeros.length(); i++) {
            numeros[i] = Integer.parseInt(cadenanumeros.charAt(i) + "");
        }
        Arrays.sort(numeros);

        for (int i = numeros.length - 1; i >= 0; i--) {
            numerosOrdenados = numerosOrdenados + numeros[i];
        }
        return numerosOrdenados;
    }

    	/* Metodo de ordenar ascendente*/

 public String ordenarAscendente(String cadenanumeros) {
        String numerosOrdenados = "";
        int numeros[] = new int[cadenanumeros.length()];
        for (int i = 0; i < cadenanumeros.length(); i++) {
            numeros[i] = Integer.parseInt(cadenanumeros.charAt(i) + "");
        }
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            numerosOrdenados = numerosOrdenados + numeros[i];
        }
        return numerosOrdenados;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintactico$actions {
  private final AnalizadorSintactico parser;

  /** Constructor */
  CUP$AnalizadorSintactico$actions(AnalizadorSintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintactico$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // cadenaas ::= DIGITO ORDENARAS 
            {
              Object RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object d = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		
    token t1 = (token) d;
    System.out.println("Odenar Cadena Ascendente");
    System.out.println("cadena Ingresada " + t1.getCadena());
    String ordenarasc =new AnalizadorSintactico().ordenarAscendente(t1.getCadena());
    System.out.println("cadena Salida = " + ordenarasc);
    

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("cadenaas",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instruccion ::= cadenadesc 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("instruccion",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instruccion ::= cadenaas 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("instruccion",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // programa ::= instruccion FINLINEA 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("programa",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintactico$parser.done_parsing();
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // cadenadesc ::= DIGITO ORDENARDS 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		
   token t2 = (token) e;
    System.out.println("Odenar Cadena Descendente");
    System.out.println("cadena Ingresada " + t2.getCadena());
    String ordenardesc = new AnalizadorSintactico().ordenarDescendente(t2.getCadena());
    System.out.println("cadena Salida =  " + ordenardesc);
    

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("cadenadesc",3, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

