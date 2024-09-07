package ejerciciosFunciones;
/*Ejercicio 5:
a) Implementar una función que calcule la cantidad de dígitos de un número.
b) Decir cuantos dígitos tiene 562,4289,12 y 7.*/

public class CantidadDigitos {
    public static void main(String[] args) {
        System.out.println (cantidadDigitos(562));
        System.out.println (cantidadDigitos(4289));
        System.out.println (cantidadDigitos(12));
        System.out.println (cantidadDigitos(7));
    }
    static int cantidadDigitos (int num) {
        int contador = 0;
        while (num > 0) {
            num /= 10;
            contador ++;
        }
        return contador;
    }
}