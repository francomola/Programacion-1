package practica0;
import java.util.Scanner;
/*Dadas 3 cadenas, "a", "b" y "c", se quiere saber si puede colocarse "b" de
manera vertical de modo que "a" y "c" se coloquen de manera horizontal atravezando "a" "b".
Se necesita tambien que "a" este mas arriba que "c" y tengan al menos un renglon de diferencia.
El encabezado del metodo debe ser static boolean puedenColocarse (String a, String b, String c).*/
public class Ejercicio_23 {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Ingrese a para saber si atraviesa b: ");
        String a = scan.nextLine();
        System.out.print ("Ingrese b para saber si se pude colocar de manera vertical: ");
        String b = scan.nextLine();
        System.out.print ("Ingrese c para saber si atraviesa b: ");
        String c = scan.nextLine();
        System.out.print ("¿pueden colocarse? "+puedenColocarse(a, b, c));
        scan.close();
    }
    static boolean puedenColocarse (String a, String b, String c) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        c = c.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(b.charAt(i)) != -1) {
                i++;
                for (int j = i + 1; j < b.length(); j++) {
                    if (c.indexOf(b.charAt(j)) != -1) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}