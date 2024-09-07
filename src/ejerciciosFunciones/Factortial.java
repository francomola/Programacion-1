package ejerciciosFunciones;
/*Ejercicio 4:
a) Implementar una función que calcule el factorial de un número.
b) Calcular el factorial de los números: 3, 7 y 16.*/

public class Factortial {
    public static void main (String [] args) {
        System.out.println (factorial(3));
        System.out.println (factorial(7));
        System.out.println (factorial(16));
    }
    static int factorial (int num) {
        int contador = 1;
        for (int i = num; i > 0; i--) {
            contador *= i;
        }
        return contador;
    }
}
