
public class pascalscheDreieck {
	public static void main(String[] args) {
		System.out.println("(1) beliebige Binomialkoeffizienten \n(2) Pascalsche Dreieck \n");
		int waehle = IO.readInt("Auswahl: ");
		while (waehle <= 0 || waehle >= 3) {
			waehle = IO.readInt("Auswahl: ");
		}
		if (waehle == 1) {
			int n = IO.readInt("obere Zahl: ");
			int k = IO.readInt("untere Zahl: ");
			beliebigeBinomial(n, k);
		}
		if (waehle == 2) {
			int n = IO.readInt("n = ");
			binomialKoeffizient(n);
		}
	}

	public static void beliebigeBinomial(int n, int k) {
		int ergebnis;
		int erg1 = 1;
		int erg2 = 1;
		for (int i = n; i > k; i--) {
			erg1 = erg1 * i;
		}
		int hilf = n - k;
		for (int i = 1; i <= hilf; i++) {
			erg2 = erg2 * i;
		}
		ergebnis = erg1 / erg2;
		System.out.println(ergebnis);
	}

	public static void binomialKoeffizient(int n) {
		long[][] pascal = new long[n + 1][];
		for (int s = 0; s <= n; s++) {
			pascal[s] = new long[s + 1];
			pascal[s][0] = 1;
			for (int t = 1; t < s; t++) {
				pascal[s][t] = pascal[s - 1][t - 1] + pascal[s - 1][t];
			}
			pascal[s][s] = 1;
		}
		for (int s = 0; s <= n; s++) {
			String z = "";
			for (int p = n - s; p > 0; p--) {
				z = z + "    ";
			}
			for (int t = 0; t <= s; t++) {
				String str = "" + pascal[s][t];
				for (int k = 0; k <= (6 - str.length() + 1) / 2; k++) {
					z = z + " ";
				}
				z = z + str;
				for (int w = 0; w <= (6 - str.length()) / 2; w++) {
					z = z + " ";
				}
			}
			System.out.println(z);
		}
	}
}
