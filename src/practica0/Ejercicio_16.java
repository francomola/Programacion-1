package practica0;
import java.util.Scanner;
/*Ejercicio 16
a) Escribir un programa que pida por pantalla un texto y a continuacion lo imprima de atras para adelante.
b) Mover el codigo que imprime la cadena al reves a un metodo static void imprimirReversa(String cadena)
c) Escribir un metodo static String reversa(String cadena) que dado un String, devuelve otro
String con los caracteres invertidos. Por ejemplo, reversa(‘‘hola’’) debera devolver el String ‘‘aloh’’.
d) Modificar el metodo imprimirReversa para que utilice el metodo definido en el punto anterior.*/
public class Ejercicio_16 {
    public static void main (String []args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("introduzca una cadena para devolverla al revés: ");
        String cadena = scan.nextLine();
        imprimirReversa(cadena);
        scan.close();
    }
    static void imprimirReversa(String cadena) {
        System.out.println(reversa(cadena));
    }
    static String reversa (String cadena) {
        String nuevaCadena = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            nuevaCadena += cadena.charAt(i);
        }
        return nuevaCadena;
    }
}