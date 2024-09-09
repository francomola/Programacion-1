package practica0;
import java.util.Scanner;
/*Ejercicio 25
Escribir un metodo static int maximo(int[] a) que dado un arreglo de enteros no vacio, devuelve
el valor mas alto que aparece.*/
public class Ejercicio_25 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print ("Ingrese el "+ (i + 1) +" ° valor: ");
            a [i] = scan.nextInt();
        }
        System.out.print ("El mayor entero de la array es: "+mayor(a));
        scan.close();
    }
    static int mayor (int [] a) {
        int mayor = a [0];
        for (int i = 0; i < a.length; i++) {
            if (a [i] >= mayor) {
                mayor = a [i];
            }
        }
        return mayor;
    }
}