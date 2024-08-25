package practica0;
import java.util.Scanner;
/*Ejercicio 10
Escribir un metodo static int sumatoria(int n) que devuelve la sumatoria de los numeros
desde 1 hasta n.*/
public class Ejercicio_10 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese un número: ");
        int n = scan.nextInt();
        System.out.print ("La sumatoria de 1 hasta "+n+" es "+sumatoria(n));
        scan.close();
    }
    static int sumatoria (int n){
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            cont += i;
        }
        return cont;
    }
}