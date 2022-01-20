
public class aufgabe2c {
	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		System.out.println(
				groessterGemeinsamerTeiler(a, b) + " ist größter gemeinsamer Teiler von " + a + " und " + b + ". ");
	}

	public static int groessterGemeinsamerTeiler(int a, int b) {
		int ergebnis = 0;
		if (a <= 0) {
			return 0;
		}
		if (b <= 0) {
			return 0;
		}
		for (int i = 2; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				ergebnis = i;
			}
		}
		return ergebnis;
	}
}