package practica0;
import java.util.Scanner;
/*Ejercicio 7
Analogamente al ejercicio anterior, escribir un metodo static void imprimirPromedio(int a, int b)
que imprima el promedio de los dos parametros.*/
public class Ejercicio7 {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame el primer número: ");
        int a = scan.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = scan.nextInt();
        imprimirPromedio(a, b);
        scan.close();
    }
    public static void imprimirPromedio (int a, int b){
        System.out.println ("El promedio de estos números es: "+((a + b) / 2.0));
    }
}