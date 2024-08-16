package miPrimerPaquete;
/*Ejercicio 2:
a) Implementar la función esPrimo que tome un parámetro entero
y retorne verdadero o falso según el entero sea primo o no.
b) Decir cuáles de los siguientes números son primos: 37, 633 y 3592.*/

public class NumeroPrimo {
    public static boolean esPrimo (int num) {
        int a = CantidadDivisores.cantDivisores(num); 
        return a == 2;
    }
    public static void main (String [] args) {
        System.out.println(esPrimo(37));
        System.out.println(esPrimo(633));
        System.out.println(esPrimo(3592));
    }
}