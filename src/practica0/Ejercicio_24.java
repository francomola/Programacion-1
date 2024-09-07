package practica0;
import java.util.Scanner;
/*Ejercicio 24
Decimos que una cadena de caracteres es un doblete capicua
si la cadena es la concatenacion de dos cadenas capicuas.
Ej: ”banana” es doblete capicua ya que es la concatenacion de ”b” y ”anana”, ambas capicua.
Escribir un metodo static boolean esDoblete(String s)
que devuelve true cuando la cadena es doblete capicua y false en caso contrario.*/
public class Ejercicio_24 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Ingrese un String para saber si es doblete capicua: ");
        String s = scan.nextLine();
        System.out.print ("El String "+s+" ¿es doblete capicua? "+esDoblete(s));
        scan.close();
    }
    static boolean esDoblete (String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            boolean primeraParteCapicua = true;
            for (int j = 0, k = i - 1; j < k; j++, k--) {
                if (s.charAt(j) != s.charAt(k)) {
                    primeraParteCapicua = false;
                }
            }
            if (primeraParteCapicua) {
                boolean segundaParteCapicua = true;
                for (int j = i, k = s.length() - 1; j < k; j++, k--) {
                    if (s.charAt(j) != s.charAt(k)) {
                        segundaParteCapicua = false;
                        break;
                    }
                }
                if (segundaParteCapicua) {
                    return true;
                }
            }
        }
        return false;
    }
}