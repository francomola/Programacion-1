package practica0;
/*Ejercicio 32
La sucesion de Collatz se define de la siguiente manera. Se comienza del numero n y se prosigue asi:
-Si n es par, entonces el siguiente numero es n/2
-Si n es impar, entonces el siguiente numero es 3 ∗ n + 1
-Cuando n vale 1, no hay siguiente numero.
Escribir un metodo static void collatz(int n) que toma un natural n e imprime, en lineas
separadas, los numeros de la sucesion*/
public class Ejercicio_32 {
    public static void main (String []args) {
        collatz(6);
    }
    static void collatz (int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            collatz(n / 2);
        }
        else {
            collatz(3 * n + 1);
        }
    }
}