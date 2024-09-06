package practica0;
import java.util.Scanner;
/*Ejercicio 18
Escribir un metodo static int cantidadVocales(String s) que dada una cadena que contiene
solo letras minusculas sin acentuar, devuelve la cantidad de vocales en dicha cadena.
Nota: se puede utilizar el metodo definido en el ejercicio anterior*/
public class Ejercicio_18 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese una cadena: ");
        String s = scan.nextLine();
        System.out.print ("La cantidad de vocales de la cadena es: "+cantidadVocales(s));
        scan.close();
    }
    public static int cantidadVocales (String s) {
        int contador = 0;
        contador += Ejercicio_17.cantidadApariciones(s, 'a');
        contador += Ejercicio_17.cantidadApariciones(s, 'e');
        contador += Ejercicio_17.cantidadApariciones(s, 'i');
        contador += Ejercicio_17.cantidadApariciones(s, 'o');
        contador += Ejercicio_17.cantidadApariciones(s, 'u');
        return contador;
    }
}