package practica0;
/*Ejercicio 28
Escribir un metodo static boolean estaOrdenado(int[] a) que dado un arreglo de enteros,
devuelve verdadero si el arreglo esta ordenado crecientemente de menor a mayor, y falso en caso
contrario.*/
public class Ejercicio_28 {
    public static void main (String [] args) {
        int [] a = {100,180,200,4000,500};
        if (estaOrdenado(a)) {
            System.out.print ("El array esta ordenado de menor a mayor");
        }else {
            System.out.print ("El array no esta ordenado de menor a mayor");
        }
    }
    static boolean estaOrdenado (int [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a [i] > a [i + 1] ) {
                return false;
            }
        }
        return true;
    }
}
