package practica0;
import java.util.Scanner;
/*Ejercicio 8
Escribir un metodo static void ponerNota(double x, double y) que toma dos numeros decimales y los promedia.
En caso que el promedio sea mayor o igual a 7, debera imprimir ‘‘Promocionado’’,
si es mayor o igual a 4 pero menor que 7, imprime ‘‘Aprobado’’ y si es menor que 4 imprime ‘‘Debe recuperar’’.
Probarla llamandola desde el main con distintos numeros.
Luego, pedirle ambos numeros al usuario (usando nextFloat() del Scanner) para pasarselos a ponerNota.*/
public class Ejercicio8 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Primera nota: ");
        double x = scan.nextFloat();
        System.out.print ("Segunda nota: ");
        double y = scan.nextFloat();
        ponerNota(x, y);
        scan.close();
    }
    public static void ponerNota (double x, double y) {
        double promedio = (x + y) / 2;
        if (promedio >= 7) {
            System.out.print ("Promocionado");
        }
        if (promedio >= 4 && promedio < 7) {
            System.out.print ("Aprobado");
        }
        if (promedio < 4){
            System.out.print ("Debe recuperar");
        }
    }
}