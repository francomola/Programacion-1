package ejerciciosFunciones;
/*Ejercicio 3:
a) Implementar la función siguientePrimo que dado un numero entero, retorne el primer número primo mayor a él.
b) Calcular los siguientes primos de 8, 230 y 3527.*/

public class NumeroPrimo2 {
    public static void main (String [] args) {
        System.out.print (siguientePrimo(8));
        System.out.print (siguientePrimo(230));
        System.out.print (siguientePrimo(3527));
    }
    static int siguientePrimo (int num) {
        num++;
        while (!NumeroPrimo.esPrimo(num)) {
            num++;
        }
        return num;
    }
}