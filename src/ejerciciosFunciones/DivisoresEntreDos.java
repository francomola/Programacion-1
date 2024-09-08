package ejerciciosFunciones;
/*Ejercicio 6:
Hacer una función que recibe dos números enteros y devuelve la cantidad de divisores comunes entre esos números.*/

public class DivisoresEntreDos {
    public static void main(String[] args) {
        System.out.print (cantidadDivisoresEntreDos(12, 18));
    }
    static int cantidadDivisoresEntreDos (int a, int b) {
        int contador = 0;
        if (a > b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    contador ++;
                }
            }
        }
        if (b > a) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    contador ++;
                }
            }
        }
        return contador;
    }
}