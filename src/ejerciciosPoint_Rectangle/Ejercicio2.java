package ejerciciosPoint_Rectangle;
import java.awt.*;
/*2) double diagonal(Rectangle r)
El método debe devolver la medida de la diagonal del rectángulo pasado como parámetro. 
Usar el método "distancia" del punto anterior sobre determinados puntos del rectángulo.*/
public class Ejercicio2 {
    public static void main (String [] args) {
        Rectangle r = new Rectangle(0,0,3,4);
        System.out.print ("El rectángulo que tiene un lado de "+r.width+" y una altura de "+r.height+", tiene una diagonal de "+diagonal(r));
    }
    static double diagonal (Rectangle r) {
        Point p1 = new Point(r.x, r.y);
        Point p2 = new Point(r.x + r.width, r.y + r.height);
        return Ejercicio1.distancia(p1, p2);
    }
}