/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.ArrayList;
import java.util.Arrays;

public class Metodos {

    private String tipo = "";
    private String cadena = "";

    public Metodos() {
    }

    public Metodos(String tipo, String cadena) {
        this.tipo = tipo;
        this.cadena = cadena;
    }

    public String getTipo() {
        return tipo;
    }

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
        System.out.println(numerosOrdenados);
     return numerosOrdenados;

     }

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
     
     public static void main(String[] args) {
        new Metodos().ordenarAscendente("82145");
    }
    public String getCadena() {
        return cadena;
    }

}
