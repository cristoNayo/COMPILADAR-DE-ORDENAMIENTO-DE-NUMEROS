package compilador;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainCup {

    public static void main(String[] args) {
        String opciones[] = new String[5];
        opciones[0] = "-destdir";
        opciones[1] = "src" + File.separator + "compilador";
        opciones[2] = "-parser";
        opciones[3] = "AnalizadorSintactico";
        opciones[4] = "src" + File.separator + "compilador" + File.separator + "Sintactico.cup";
        try {
            java_cup.Main.main(opciones);
        } catch (Exception e) {
            System.out.print("ERROR EN EL MAIN " + e.getMessage());
        }

    }

}
