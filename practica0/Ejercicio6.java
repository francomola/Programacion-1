package practica0;
import java.util.Scanner;
/*Ejercicio 6
Escribir un metodo static void imprimirSuma(int a, int b)
que al igual que el ejercicio 3 imprima la suma de los dos parametros.
Modificar el programa de dicho ejercicio para que utilice este metodo.*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Ingrese el primer número: ");
        int a = scan.nextInt();
        System.out.print ("Ingrese el segundo número: ");
        int b = scan.nextInt();
        imprimirSuma(a, b);
        scan.close();
    }
    public static void imprimirSuma (int a, int b) {
        System.out.print ("La suma de estos dos números es: "+(a + b));
    }
}