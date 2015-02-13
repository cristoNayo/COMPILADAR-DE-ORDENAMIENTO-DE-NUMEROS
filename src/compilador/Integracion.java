package compilador;

import java.io.BufferedReader;
import java.io.FileReader;

public class Integracion {

    public void ejecutar() {

        try {

            BufferedReader bf = new BufferedReader(new FileReader("src/compilador/Archivo.txt"));
            AnalizadorLexico lex = new AnalizadorLexico(bf);
            AnalizadorSintactico parser = new AnalizadorSintactico(lex);
            parser.parse();
        } catch (Exception e) {
            System.out.println("error en " + e.getMessage());

        }
    }

    public static void main(String[] args) {
        new Integracion().ejecutar();
    }

}
