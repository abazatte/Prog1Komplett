
public class aufgabe2 {

	public static void main(String[] args) {
		System.out.println(
				"(1) Fibunacci-Zahl \n(2) Vertauschen zweier Double Werten \n(3) Runden und positiv \n(4) Die n‰chst kleinere Primzahl");
		System.out.println(
				"(5) 7 in einer Zahl? \n(6) Keine Ahnung, wie ich das nennen soll \n(7) Addition bis n \n(8) Float-Werte Addieren ");
		System.out.println("(9) Float-Wert auf n Nachkommastellen runden\n(10) Summe zweier Uhrzeiten \n(11) Summe und Differenz \n");
		int i = IO.readInt("Welche Teilaufgabe soll bearbeitet werden? ");
		while (i < 1||i>11) {
			i = IO.readInt("Welche Teilaufgabe soll bearbeitet werden? ");
		}
		if (i == 1) {
			int a = IO.readInt("a = ");
			System.out.println("f(" + a + ") == " + fibunacciZahl(a));
		}
		if (i == 2) {
			double a = IO.readDouble("double a = ");
			double b = IO.readDouble("double b = ");
			System.out.println(a);
			vertauschen(a, b);
			System.out.println(a);
		}
		if (i == 3) {
			double a = IO.readDouble("double Wert: ");
			System.out.println("f(" + a + ") == " + runden(a));
		}
		if (i == 4) {
			int a = IO.readInt("a = ");
			while (a < 2) {
				a = IO.readInt("Gib einen grˆﬂeren Wert als 2 ein: ");
			}
			System.out.println("f(" + a + ") == " + kleinerePrimzahl(a));
		}
		if (i == 5) {
			String a = IO.readString("a = ");
			System.out.println("f(" + a + ") == " + sieben(a));
		}
		if (i == 6) {
			System.out.println("Die Funktion ist nicht lˆsbar, weil man keine Funktion als Parameter w‰hlen kann.");
		}
		if (i == 7) {
			int n = IO.readInt("n = ");
			if (n < 0) {
				System.out.println("f(" + n + ") == false");
			} else {
				System.out.println("f(" + n + ") == " + addition(n));
			}
		}
		if (i == 8) {
//			int s = IO.readInt("n = ");
//			float[] d = new float[s];
//			float f = 1.1f;
//			for (int i1 = 0; i1 < d.length; i1++) {
//				d[i1] = f;
//				f = f + 1.1f;
//			}
//			System.out.println("f(" + s + ") == " + floatAddieren(d));
			System.out.println("Die Parameter sind Variabel und demnach nicht lˆsbar.");
		}
		if (i == 9) {
			float x = IO.readInt("x = ");
			while (x <= 0 || x > 1000) {
				x = IO.readFloat("x = ");
			}
			int n = IO.readInt("Nachkommastellen: ");
			while (n <= 1 || n >= 5) {
				n = IO.readInt("Nachkommastellen: ");
			}
			System.out.println("f(" + x + ", " + n + ") == " + floatRunden(x, n));
		}
		if (i == 10) {
			float s = IO.readFloat("erste Uhrzeit: ");
			while (s < 0 || s >= 24) {
				s = IO.readFloat("einschlieﬂlich 0 bis 24: ");
			}
			float t = IO.readFloat("zweite Uhrzeit: ");
			while (t < 0 || t >= 24) {
				t = IO.readFloat("einschlieﬂlich 0 bis 24: ");
			}
			System.out.println("f(" + s + ", " + t + ") == " + uhrzeit(s, t));
		}
		if (i==11) {
			int a = IO.readInt("a = ");
			int b = IO.readInt("b = ");
			int[] ergebnis = sumUndDif(a,b);
			System.out.println("f(" + a + ", " + b + ") = (" + ergebnis[0] + ", " + ergebnis[1] + ")");
		}
	}

	public static boolean fibunacciZahl(int a) {
		int t = 1;
		int tausch = 0;
		int ergebnis = 0;
		while (ergebnis < a) {
			tausch = ergebnis;
			ergebnis = ergebnis + t;
			t = tausch;
		}
		if (ergebnis == a) {
			return true;
		}
		return false;
	}

	public static void vertauschen(double a, double b) {
		double c = 0;
		c = b;
		b = a;
		a = c;
		System.out.println("f(a, b); Ergebnis: " + "a== " + a + "; b== " + b);
	}

	public static int runden(double a) {
		int ergebnis = 0;
		ergebnis = (int) Math.round(a);
		if (ergebnis < 0) {
			ergebnis = ergebnis - (2 * ergebnis);
		}
		return ergebnis;
	}

	public static int kleinerePrimzahl(int a) {
		int ergebnis = 0;
		boolean istTolleZahl = true;
		int n = a - 1;
		while (n <= a) {
			int z = 2;
			istTolleZahl = true;
			while (z * z <= n) {
				boolean temp = true;
				if (n % z == 0) {
					istTolleZahl = false;
					temp = false;
				}
				if (!temp) {
					z = (int) Math.sqrt(n);
				}
				z++;
			}
			if (istTolleZahl == true && n != 0 && n != 1) {
				return n;
			}
			n--;
		}
		return ergebnis;
	}

	public static boolean sieben(String a) {
		if (a.contains("7")) {
			return true;
		}
		return false;
	}

	public static int addition(int n) {
		int ergebnis = 0;
		for (int z = 0; z <= n; z++) {
			ergebnis = ergebnis + z;
		}
		return ergebnis;
	}

	public static float floatAddieren(float[] d) {
		float ergebnis = 0;
		for (int i2 = 0; i2 < d.length; i2++) {
			ergebnis = ergebnis + d[i2];
		}
		ergebnis = ergebnis * 10;
		ergebnis = Math.round(ergebnis);
		ergebnis = ergebnis / 10;
		return ergebnis;
	}

	public static float floatRunden(float x, int n) {
		float ergebnis = x;
		for (int w = 0; w < n; w++) {
			ergebnis = ergebnis * 10;
		}
		ergebnis = Math.round(ergebnis);
		for (int w = n; w > 0; w--) {
			ergebnis = ergebnis / 10;
		}
		return ergebnis;
	}

	public static float uhrzeit(float s, float t) {
		int a = (int) s;
		float b = s - a;
		int c = (int) t;
		float d = t - c;
		float e = b + d;
		float uhrzeit = 0;
		uhrzeit = a + c;
		if (e >= 0.60) {
			uhrzeit++;
			e = (float) (e - 0.6);
		}
		if (uhrzeit > 24) {
			uhrzeit = uhrzeit - 24;
		}
		uhrzeit = uhrzeit + e;
		uhrzeit = uhrzeit * 100;
		uhrzeit = Math.round(uhrzeit);
		uhrzeit = uhrzeit / 100;
		return uhrzeit;
	}
	
	public static int[] sumUndDif(int a, int b) {
		return new int[] {a+b , a-b};
	}
	
}