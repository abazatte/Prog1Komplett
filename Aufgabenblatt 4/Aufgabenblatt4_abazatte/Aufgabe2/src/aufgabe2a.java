public class aufgabe2a {
	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		System.out.println(istTeilerVon(a, b));
	}

	public static String istTeilerVon(int a, int b) {
		if (a == 0) {
			return "a ist gleich 0";
		} else if (a % b != 0) {
			return b + " ist kein Teiler von " + a;
		} else if (a % b == 0) {
			return b + " ist ein Teiler von " + a;
		}
		return b + " ist kein Teiler von " + a;
	}
}
