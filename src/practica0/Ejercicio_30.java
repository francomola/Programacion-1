package practica0;
/*Ejercicio 30
Escribir las versiones recursivas de los siguientes metodos de la Seccion 3:
a) sumatoria: static int sumatoriaRec(int a)
b) sumatoriaPares: static int sumatoriaParesRec(int b)
c) potencia: static int potenciaRec(double x, int c)
d) factorial: static int factorialRec(int d)*/
public class Ejercicio_30 {
    public static void main (String [] args) {
        System.out.println (sumatoriaRec(10));
        System.out.println (sumatoriaParesRec(6));
        System.out.println (potenciaRec(3, 4));
        System.out.println (factorialRec(5));
    }

    static int sumatoriaRec (int a) {
        if (a == 0) {
            return a;
        } else {
            return a + sumatoriaRec (a - 1);
        }
    }

    static int sumatoriaParesRec (int b) {
        if (b < 2) {
            return 0;
        }
        if (b % 2 == 0) {
            return b + sumatoriaParesRec (b - 2);
        } else {
            return sumatoriaParesRec(b - 1);
        }
    }

    static int potenciaRec (double x, int c) {
        if (c == 0) {
            return 1;
        }
        return (int) x * potenciaRec (x, c - 1);
    }

    static int factorialRec (int d) {
        if (d == 0) {
            return 1;
        } else {
            return d * factorialRec(d - 1);
        }
    }
}