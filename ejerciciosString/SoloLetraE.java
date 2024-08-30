package ejerciciosString;
import java.util.Scanner;
/*2. Hacer una función que devuelva true
si el String está compuesto solamente por letras 'e', y false en caso contrario.*/
public class SoloLetraE {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print ("Escribe una palabra: ");
        String b = scan.nextLine();
        System.out.print ("¿La palabra "+b+" solo tiene letras E? "+soloLetraE(b));
        scan.close();
    }
    public static Boolean soloLetraE (String b) {
        if (b.length() == LetraE.cantidadE(b)) {
            return true;
        }
        return false;
    }
}