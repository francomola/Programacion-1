package practica0;
import java.util.Scanner;
/*Ejercicio 15
Escribir un metodo static boolean esDivisible(int n, int m)
que devuelve true si n es divisible por m y false en caso contrario.
Probarlo adecuadamente llamandola desde el main.*/
public class Ejercicio_15 {
    public static void main (String []args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Introduzca un número: ");
        int n = scan.nextInt();
        System.out.print ("Introduzca otro para saber si es divisible: ");
        int m = scan.nextInt();
        System.out.print ("El resultado de la división es: "+esDivisible(n, m));
        scan.close();
    }
    static boolean esDivisible (int n, int m) {
        if (n % m == 0) {
            return true;
        }
        return false;
    }
}