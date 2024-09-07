package practica0;
import java.util.Scanner;
/*Ejercicio 22
Escribir un metodo static String sinRepetidos(String s) que dada una cadena,
devuelve una nueva cadena donde cada uno de los caracteres que apareceran en s, aparecen solo una vez.
Se debe mantener la posicion relativa de los caracteres:
para aquellos que se encuentren repetidos puede conservarse cualquiera de sus apariciones.*/
public class Ejercicio_22 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese una palabra para modificarla: ");
        String s = scan.nextLine();
        System.out.print ("La palabra modificada: "+sinRepetidos(s));
        scan.close();
    }
    static String sinRepetidos (String s) {
        String nuevaS = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean yaExiste = false;
            for (int j = 0; j < nuevaS.length(); j++) {
                if (nuevaS.charAt(j) == c) {
                    yaExiste = true;
                }
            }
            if (!yaExiste) {
                nuevaS += c;
            }
        }
        return nuevaS;
    }
}