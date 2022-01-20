public class aufgabe2b {
	public static void main(String[] args) {
		int a = 100;
		System.out.print("Alle Teiler von " + a + ": ");
		System.out.println(alleTeilerVon(a));
	}

	public static String alleTeilerVon(int a) {
		for (int x = 2; x <= a; x++) {
			if (a % x == 0) {
				System.out.print(x + ", ");
			}
		}
		return "Fertig";
	}
}