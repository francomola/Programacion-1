package practica0;
import java.util.Scanner;
/*Ejercicio 11
Escribir un metodo static int sumatoriaPares(int n) que devuelve la sumatoria de los numeros pares desde 2 hasta n.*/
public class Ejercicio_11 {
    public static void main (String []args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese un número: ");
        int n = scan.nextInt();
        System.out.print ("La sumatoria de los números pares desde 2 hasta "+n+" es de "+sumatoriaPares(n));
        scan.close();
    }
    public static int sumatoriaPares (int n) {
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                cont += i;
            }
        }
        return cont;
    }
}