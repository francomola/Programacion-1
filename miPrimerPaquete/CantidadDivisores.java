package miPrimerPaquete;
/*Ejercicio 1:
a) Implementar la función cantDivisores que tome un parámetro de tipo entero
y calcule la cantidad de divisores de ese entero.
b) Averiguar cuántos divisores tienen los siguientes números: 45, 2374 y 3529.*/

public class CantidadDivisores{
    public static void cantDivisores(int numero){
        int contador = 0;
        for (int i = 1; i <= número; i++) {
            if (número % i == 0) {
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        System.out.println(cantDivisores(45));
        System.out.println(cantDivisores(2374));
        System.out.println(cantDivisores(3529));
    }
}
