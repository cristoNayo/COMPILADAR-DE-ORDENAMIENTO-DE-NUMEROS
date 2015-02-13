/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java_cup.runtime.Symbol;

/**
 *
 * @author cristo
 */
public class MainFlex {

    public static void main(String[] args) {
//        JFlex.Main.generate(new File(
//                "src" + File.separator + "compilador"
//                + File.separator + "Lexico.flex"));

        ArrayList<Integer> listaToken = new ArrayList();
        BufferedReader bf = null;
        System.out.println(" ********************Token***************");
        try {
            bf = new BufferedReader(new FileReader("src/compilador/Archivo.txt"));
            AnalizadorLexico a = new AnalizadorLexico(bf);
            Symbol symbol = null;
            token token = null;
            do {
                symbol = a.next_token();
                token = (token) symbol.value;

                System.out.println(symbol.value.toString());

            } while (symbol != null);

            bf.close();
        } catch (Exception e) {
            System.out.println("ERROR EN EL " + e.getMessage());
        }
    }
}
