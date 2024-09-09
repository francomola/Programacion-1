package practica0;
/*Ejercicio 27
Escribir un metodo static int suma(int[] a) que dado un arreglo de enteros, devuelve el valor
de la suma de todos sus elementos.*/
public class Ejercicio_27 {
    public static void main (String [] args) {
        int [] a = {1000,180,200,40,50};
        System.out.print ("La suma total de la array es de: "+suma(a));
    }
    static int suma (int [] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a [i];
        }
        return suma;
    }
}
