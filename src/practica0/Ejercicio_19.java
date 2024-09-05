package practica0;
import java.util.Scanner;
/*Ejercicio 19
Una palabra se dice que es “abecedaria” si las letras en la palabra aparecen en orden alfabetico.
Describir un algoritmo para decidir si una palabra dada es abecedaria.
Implementar el algoritmo en un m´etodo static boolean esAbecedaria(String s).*/
public class Ejercicio_19 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese una palabra para saber si es abecedaria: ");
        String s = scan.nextLine();
        if (esAbecedaria(s)) {
            System.out.print ("La palabra "+s+" es abecedaria");
        }
        else {
            System.out.print ("La palabra "+s+" no es abecedaria");
        }
        scan.close();
    }
    static boolean esAbecedaria (String s) {
        s = s.toLowerCase ();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt (i) > s.charAt (i + 1)) {
                return false;
            }
        }
        return true;
    }
}