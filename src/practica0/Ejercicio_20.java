package practica0;
import java.util.Scanner;
/*Ejercicio 20
Escribir el metodo static boolean esCapicua(String s) que dada una cadena,
devuelve true si la cadena es igual de atras hacia adelante o de adelante hacia atras.
En caso contrario, devuelve false.*/
public class Ejercicio_20 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese una palabra para saber si es capicua: ");
        String s = scan.nextLine();
        if (esCapicua(s)) {
            System.out.print ("La palabra "+s+" es capicua");
        }
        else {
            System.out.print ("La palabra "+s+" no es capicua");
        }
        scan.close();
    }
    static boolean esCapicua (String s) {
        s = s.toLowerCase();
        String p = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            p += s.charAt(i);
        }
        return s.equals(p);
    }
}