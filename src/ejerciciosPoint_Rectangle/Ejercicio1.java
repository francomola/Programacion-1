package ejerciciosPoint_Rectangle;
import java.awt.*;
/*1)
double distancia(Point p1, Point p2)
El método debe devolver la distancia entre los puntos dados.*/
public class Ejercicio1 {
    public static void main (String [] args) {
        Point p1 = new Point (3,4);
        Point p2 = new Point (10,5);
        System.out.print ("La distancia entre ("+p1.x+" , "+p1.y+") y ("+p2.x+" , "+p2.y+") es de "+distancia(p1, p2));
    }
    static double distancia (Point p1, Point p2) {
        double distancia = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        return distancia;
    }
}