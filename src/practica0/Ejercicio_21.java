package practica0;
import java.util.Scanner;
/*Ejercicio 21
Escribir un metodo static boolean esSinRepetidos(String s) que dada una cadena,
devuelve true si no hay letras repetidas en la cadena.
En caso contrario, devuelve false. No utilizar el metodo del ejercicio 22.*/
public class Ejercicio_21 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese una palabra para saber si repite letras: ");
        String s = scan.nextLine();
        if (esSinRepetidos(s)) {
            System.out.print ("La palabra "+s+" tiene letras repetidas");
        }
        else {
            System.out.print ("La palabra "+s+" no tiene letras repetidas");
        }
        scan.close();
    }
    public static boolean esSinRepetidos (String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    return true;
                }
            }
        }
        return false;
    }
}