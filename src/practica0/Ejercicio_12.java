package practica0;
import java.util.Scanner;
/*Ejercicio 12
Escribir un metodo static double potencia(double x, int a) que toma un numero racional
x y un entero a y calcula x^a.*/
public class Ejercicio_12 {
    public static void main (String []args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese un racional: ");
        double x = scan.nextDouble();
        System.out.print ("Ingrese un entero: ");
        int a = scan.nextInt();
        System.out.print ("La base "+x + a +" elevada a "+ a +" es de: "+potencia(x, a));
        scan.close();
    }
    public static double potencia (double x, int a) {
        double base = x / a;
        double resultado = 1;
        for (int i = 0; i < a; i++) {
            resultado *= base;
        }
        return resultado;
    }
}