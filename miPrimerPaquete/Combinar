public class ClaseSalon {

	public static void main(String[] args) {
		System.out.print (combinar("fgd","adfxgtgs"));
	}
	public static String combinar (String s,String t) {
		if (s.equals("")) {
			return t;
		}
		if (t.equals("")) {
			return s;
		}
		else  {
			if (s.charAt(0) < t.charAt(0)) {
				return s.charAt(0) + combinar (resto(s),resto(t));
			}
			else {
				return t.charAt(0) + combinar (resto(s),resto(t));
			}
		}
	}
	public static String resto (String s) {
		String resto = "";
		for (int i =1; i < s.length(); i++) {
			resto = resto + s.charAt(i);
		}
		return resto;
	}
}
