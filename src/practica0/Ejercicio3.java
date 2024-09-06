package practica0;
import java.util.Scanner;
/*Ejercicio 3
Escribir un programa que te pregunte por dos numeros, y a continuacion imprima un mensaje
del estilo “La suma es: ” y el valor de la suma de ambos numeros.*/
public class Ejercicio3 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Dame un número ");
        int num1 = scan.nextInt();
        System.out.print ("Dame otro número ");
        int num2 = scan.nextInt();
        System.out.print ("La suma de estos dos números es: "+(num1 + num2));
        scan.close();
    }
}