public class Vocales {

	public static void main(String[] args) {
		System.out.print(eliminarVocalesYRevertir("Hola"));
	}
	public static String eliminarVocalesYRevertir(String s) {
		if (s.length() == 0) {
			return s;
		}
		else {
				if (esVocal (s.charAt(0))) {
					return eliminarVocalesYRevertir (resto (s));
				}
				else {
					return eliminarVocalesYRevertir (resto (s))+ s.charAt(0);
				}
		}
	}
	public static boolean esVocal (char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	public static String resto (String s) {
		String resto = "";
		for (int i =1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
		}
}
