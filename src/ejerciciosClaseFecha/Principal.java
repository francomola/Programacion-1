package ejerciciosClaseFecha;

public class Principal {
    public static void main (String [] args) {
        Fecha fecha = new Fecha(15, 2, 2024);
        int dias = fecha.diasDelMes();
        System.out.println("El mes " + fecha.mes + " del año " + fecha.anio + " tiene " + dias + " días.");
    }
}