package practica0;
import java.util.Scanner;
/*Ejercicio 5
Escribir un programa que te pregunte por dos numeros, y a continuacion imprima un mensaje
del estilo “El promedio es: ” y el valor del promedio de ambos numeros.*/
public class Ejercicio5 {
    public static void main (String []args){
        Scanner scan = new Scanner (System.in);
        System.out.print ("Dame el primer número: ");
        double primero = scan.nextInt();
        System.out.print ("Dame el segundo número: ");
        double segundo = scan.nextInt();
        System.out.print ("El promedio es: "+ ((primero + segundo) / 2));
        scan.close();
    }
}