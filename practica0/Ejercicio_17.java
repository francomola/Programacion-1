package practica0;
import java.util.Scanner;
/*Ejercicio 17
Escribir un metodo static int cantidadApariciones(String s, char c) que dada una cadena
y un caracter, cuenta la cantidad de veces que aparece c en s.*/
public class Ejercicio_17 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese una cadena: ");
        String s = scan.nextLine();
        System.out.print ("Ingrese una caracter para saber la cantidad de apariciones: ");
        char c = scan.nextLine().charAt (0);
        System.out.print ("La cantidad de veces en las que " +c+ "aparece en " +s+ " son: " +cantidadApariciones (s, c) );
        scan.close();
    }
    static int cantidadApariciones (String s, char c) {
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                contador ++;
            }
        }
        return contador;
    }
}