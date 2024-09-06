package practica0;
import java.util.Scanner;
/*Ejercicio 9
Escribir un metodo static void imprimirFecha(int día, int mes, int año) que imprime la
fecha pasada como parametro en formato del estilo “5 de Julio de 2030”.*/
public class Ejercicio9 {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Ingrese un día: ");
        int día = scan.nextInt();
        System.out.print ("ingrese un mes: ");
        int mes = scan.nextInt();
        System.out.print ("Ingrese un año: ");
        int año = scan.nextInt();
        imprimirFecha(día, mes, año);
        scan.close();
    }
    public static void imprimirFecha (int día, int mes, int año) {
        String nombreMes = "";
        switch (mes){
            case 1: nombreMes = "Enero"; break;
            case 2: nombreMes = "Febrero"; break;
            case 3: nombreMes = "Marzo"; break;
            case 4: nombreMes = "Abril"; break;
            case 5: nombreMes = "Mayo"; break;
            case 6: nombreMes = "Junio"; break;
            case 7: nombreMes = "Julio"; break;
            case 8: nombreMes = "Agosto"; break;
            case 9: nombreMes = "Septiembre"; break;
            case 10: nombreMes = "Octubre"; break;
            case 11: nombreMes = "Noviembre"; break;
            case 12: nombreMes = "Diciembre"; break;
        }
        if (día <= 31 && día >= 1 && mes <= 12 && mes >= 1) {
            System.out.print (día+" de "+ nombreMes +" de "+año);
        }
        else {
            System.out.print ("ingrese un día o mes valido");
        }
    }
}