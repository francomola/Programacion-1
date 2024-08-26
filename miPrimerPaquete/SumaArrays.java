public class SumaArrays {
	public static void main (String []args) {
		int [] a = {110,5,2};
		System.out.print (suma(a));
	}
	public static int suma (int[] a) {
		return sumaAux (a, 0);
	}
	public static int sumaAux (int [] a, int indice) {
		if (indice == a.length) {
			return 0;
		}
		else {
			return a[indice] + sumaAux (a, indice + 1);
		}
	}
}
