public class EjerciciosParcial {

  public static void main(String[] args) {
    System.out.println (tomarCaracteresDesde("programacion",4,4));
    System.out.println (tomarCaracteresDesde("capa",7,10));
    System.out.println(tomarCaracteresDesde("claramente",2,3));
  }
  public static String tomarCaracteresDesde(String s, int desde, int cant) {
    if (s.equals("")) {
    return s;
    }
    if (cant == 0) {
      return "";
    }
    if (desde > s.length() - 1) {
      return "";
    }
    else {
      if (desde == 0) {
        return s.charAt(0) + tomarCaracteresDesde (ClaseSalon.resto(s), desde, cant - 1);
      }
      else {
        return tomarCaracteresDesde (ClaseSalon.resto(s), desde - 1, cant);
      }
    }
  }
}
