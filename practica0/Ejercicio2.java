package practica0;
import java.util.Scanner;
/*/*Ejercicio 2
Escribir un programa que te pregunte tu nombre y a continuacion imprima un saludo del estilo
“Hola nombre”.*/
public class Ejercicio2 {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("¿Cuál es tu nombre?");
        String nombre = scan.nextLine();
        System.out.print ("Hola "+nombre);
        scan.close();
    }
}