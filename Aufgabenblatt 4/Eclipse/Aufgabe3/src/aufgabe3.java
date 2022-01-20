
public class aufgabe3 {
	public static void main(String[] args) {
		System.out.println("Achtung: Start!");
		int eingabe;
		int fehler = 0;
		int s = 0;
		double z = 0;
		double langsam = 0;
		double schnell = 0;
		double mitte = 0;
		int runden = 0;
		while (runden < 5) {
			runden = getRandomNumber(9);
		}
		for (int i = 0; i <= runden; i++) {
			int l = 0;
			while (l < 2) {
				l = getRandomNumber(5);
			}
			wait(l);
			s = getRandomNumber(9);
			System.out.println(s);
			z = getMilliSeconds();
			eingabe = IO.readInt();
			z = (getMilliSeconds() - z) / 1000;
			if (langsam == 0) {
				langsam = z;
				schnell = z;
				mitte = z;
			}
			if (z > langsam) {
				langsam = z;
			} else if (z < schnell) {
				schnell = z;
			}
			mitte = (mitte + z) / 2;
			if (eingabe != s) {
				fehler++;
			}
		}
		System.out.println("Geschafft: Ende!");
		runden++;
		System.out.println("Fehlversuche: " + fehler + " von " + runden);
		System.out.println("Reaktionszeit-Mittelwert: " + mitte + " Sekunden");
		System.out.println("Langsamster Versuch: " + langsam + " Sekunden");
		System.out.println("Schnellster Versuch: " + schnell + " Sekunden");
	}

	// liefert eine Zahl, die die aktuelle Zeit in Millisek repräsentiert
	static long getMilliSeconds() {
		return new java.util.Date().getTime();
	}

	// liefert eine Zufallszahl zwischen 0 und max (einschließlich)
	static int getRandomNumber(int max) {
		return new java.util.Random().nextInt(max + 1);
	}

	// hält das Programm seconds Sekunden an
	static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (Exception exc) {
		}
	}

	// liefert den größt-möglichen long-Wert
	static long getMaxLongNumber() {
		return Long.MAX_VALUE;
	}

}
