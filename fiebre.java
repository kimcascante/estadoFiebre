package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Determinar si una persona tiene fiebre. Una persona tiene fiebre si la temperatura es
mayor a 37 grados. El programa recibe como información la temperatura de la persona.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej1w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{
        int temperatura;
        String resultado;

        escribir.println("Digite la temperatura de la persona");
        temperatura = Integer.parseInt(leer.readLine());

        if (temperatura>=37){
            resultado = "La persona tiene fiebre";
        } else {
            resultado = "La persona no tiene fiebre";
        }

        escribir.println(resultado);
    }
}