package ejerciciosFunciones;
import java.util.Scanner;
/*Ejercicio 7:
a) Hacer un programa que "piense" un numero entre
1 y 10 y le pida al usuario que intente adivinarlo, si lo logra, avisarle que gano, y si no , que perdió.
b) Hacer que los intentos sean 3 y tambien que el usuario reciba una ayuda luego de cada intento indicando
si el numero es menor o mayor de lo que ingreso el usuario.*/

public class Adivinar {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Tenes tres intentos para adivinar el número random desde 1 hasta 10");
        int a = 0;
        if (adivinarNum(a, scan)) {
            System.out.print ("¡¡Felicidades ganaste!!");
        } else {
            System.out.print ("No adivinaste el número :(");
        }
        scan.close();
    }
    static boolean adivinarNum (int a, Scanner scan) {
        int aleatorio = (int)(Math.random() * 10) + 1;
        int intentos = 3;
        for (int b = 1; b <= intentos; b++) {
            if (b <= intentos) {
                System.out.print (b+"° Intento: ");
                a = scan.nextInt();
                if (a == aleatorio) {
                    return true;
                }
                if (a > aleatorio) {
                    System.out.println (a+" es mayor al número aleatorio");
                }
                if (a < aleatorio) {
                    System.out.println (a+" es menor al número aleatorio");
                }
            }
        }
        return false;
    }
}