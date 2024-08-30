package ejerciciosString;
import java.util.Scanner;
/*1. Hacer una función que tome un String y cuente
la cantidad de veces que aparece la letra 'e' ya sea mayúscula o minúscula.*/
public class LetraE {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Escribe una palabra: ");
        String a = scan.nextLine();
        System.out.print ("La palabra "+a+" tiene la letra e "+cantidadE(a)+" veces");
        scan.close();
    }
    public static int cantidadE (String a) {
        int cont = 0;
        for (int i = 0; i < a.length(); i++ ) {
            if ('e' == a.charAt(i) || 'E' == a.charAt(i)) {
                cont ++;
            }
        }
        return cont;
    }
}
