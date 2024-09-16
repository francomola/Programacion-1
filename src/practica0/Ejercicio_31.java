package practica0;
/*Ejercicio 31
Los primeros numeros de la sucesion de Fibonacci serian: 0, 1, 1, 2, 3, 5, 8, 13, 21, . . .
Implementar el metodo que devuelve el n-esimo elemento de la sucesion: 
a) usando recursividad, con la siguiente signatura: static int fibrec(int n)
b) usando un ciclo, con la siguiente signatura: static int fibiter(int n)*/
public class Ejercicio_31 {
    public static void main (String [] args) {
        System.out.println (fibrec(9));
        System.out.println (fibiter(9));
    }

    static int fibrec(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibrec(n - 1) + fibrec(n - 2);
    }

    static int fibiter(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f0 = 0;
        int f1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = f0 + f1;
            f0 = f1;
            f1 = fib;
        }
        return f1;
    }
}