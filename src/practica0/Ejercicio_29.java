package practica0;
/*Ejercicio 29
Escribir un metodo static double promedio(double[] a) que dado un arreglo de numeros con
coma, devuelve el valor del promedio de todos los elementos.*/
public class Ejercicio_29 {
    public static void main (String [] args) {
        double [] a = {856,140,152,20,47};
        System.out.print ("El promedio de la array es: "+ promedio(a));
    }
    static double promedio (double [] a) {
        double prom = 0;
        for (int i = 0; i < a.length; i++) {
            prom += a[i];
        }
        return prom / a.length;
    }
}