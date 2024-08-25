package practica0;
import java.util.Scanner;
/*Ejercicio 14
Escribir un metodo static int cantCifras(int n) que devuelve la cantidad de cifras de n.
Probarlo adecuadamente llamandola desde el main.*/
public class Ejercicio_14 {
    public static void main (String []args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese un número para saber la cantidad de cifras: ");
        int n = scan.nextInt();
        System.out.print ("La cantidad de cifras de "+n+" es: "+cantCifras(n));
        scan.close();
    }
    public static int cantCifras (int n) {
        int cont = 0;
        while (n != 0) {
            n /= 10;
            cont ++;
        }
        return cont;
    }
}