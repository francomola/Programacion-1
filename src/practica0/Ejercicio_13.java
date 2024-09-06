package practica0;
import java.util.Scanner;
/*Ejercicio 13
Escribir un metodo static double factorial(int n) que toma un entero positivo n y calcula
n! (el factorial de n) que se define como el producto de todos los naturales desde 1 hasta n.
Por ejemplo 5! = 5 × 4 × 3 × 2 × 1 = 120. Ojo: por definicion, el factorial de 0, es 1 (0! = 1).*/
public class Ejercicio_13 {
    public static void main (String []args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese un número para calcular el factorial: ");
        int n = scan.nextInt();
        System.out.print ("El factorial de "+n+" es: "+factorial(n));
        scan.close();
    }
    public static double factorial (int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}