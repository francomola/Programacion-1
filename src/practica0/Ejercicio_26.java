package practica0;
/*Ejercicio 26
Escribir un metodo static int maximoIndice(int[] a) que dado un arreglo de enteros no vacio,
devuelve el indice del valor mas alto que aparece.*/
public class Ejercicio_26 {
    public static void main (String [] args) {
        int [] a = {10,84,37,100,50};
        System.out.print ("El maximo indice de la array es "+maximoIndice(a));
    }
    static int maximoIndice (int [] a) {
        int mayor = Ejercicio_25.mayor(a);
        for (int i = 0; i < a.length; i++) {
            if (a [i] == mayor) {
                return i;
            }
        }
        return -1;
    }
}