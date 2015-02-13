package compilador;
import java_cup.runtime.Symbol;
%%
/* segunda parte: declaramos las directivas y los macros */
%class AnalizadorLexico
%line
%column
%cup

SaltoLinea = \r|\n|\r\n|\n\r
Espacios = {SaltoLinea} | [ \t\f]
Numero = [0-9]*


%%
/* OPERADORES Y SIGNOS */
";" {return new Symbol(sym.FINLINEA, new token(yycolumn, yyline, yytext()));}

/* PALABRAS RESERVADAS */

"ordenaras" {return new Symbol(sym.ORDENARAS, new token(yycolumn, yyline, yytext()));}
"ordenards" {return new Symbol(sym.ORDENARDS, new token(yycolumn, yyline, yytext()));}


/* EXPRESIONES */

{Numero} {return new Symbol(sym.DIGITO, new token(yycolumn, yyline, yytext()));}
{Espacios} {/* ignorar */}
. {System.err.println("caracter invalido " + yytext() + " ["+ yyline + ":"+ yycolumn + "]");}