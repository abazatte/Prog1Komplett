package Aufgabe6;

public class UE18Aufgabe {
	public static void main(String[] args) {
		System.out.print("Wie viele Spieler: ");
		int spielerAnzahl = IO.readInt();
		args = new String[spielerAnzahl];
		for (int x = 0; x < spielerAnzahl; x++) {
			System.out.print("Spieler " + (x + 1) + " :");
			args[x] = IO.readString();
		}
		if (args.length < 2) {
			IO.println("Bitte     mindestens zwei     Spielernamen uebergeben");
			return;
		}
		SiebenSpieler[] spieler = new SiebenSpieler[args.length + 1];
		for (int i = 0; i < args.length; i++) {
			spieler[i] = new SiebenSpieler(args[i]);
		}
		spieler[args.length] = new Programm();
		spielen(spieler);
	}

	public static void spielen(SiebenSpieler[] spieler) {
		int anzahlAusgeschieden = 0;
		int zahl = 0;
		hauptschleife: while (zahl < 10000) {
			for (int i = 0; i < spieler.length; i++) {
				if (!spieler[i].istAusgeschieden()) {
					int ergebnis = spieler[i].naechsteZahl(zahl);
					if (!check(zahl, ergebnis)) {
						spieler[i].ausscheiden();
						IO.println("Falsch! " + spieler[i] + " ist ausgeschieden!");
						anzahlAusgeschieden++;
						if (anzahlAusgeschieden == spieler.length - 1) {
							break hauptschleife;
						}
					} else {
						zahl = ergebnis;
					}
				}
			}
		}
		gibSiegerBekannt(spieler);
	}

	public static void gibSiegerBekannt(SiebenSpieler[] spieler) {
		for (int i = 0; i < spieler.length; i++) {
			if (!spieler[i].istAusgeschieden()) {
				IO.println(spieler[i] + " ist Sieger!");
			}
		}
	}

	public static boolean check(int aktuelleZahl, int gelieferteZahl) {
		boolean chars = true;
		if (aktuelleZahl < gelieferteZahl) {
			String nummer = String.valueOf(gelieferteZahl);
			char[] iChars = nummer.toCharArray();
			for (int j = 0; j < iChars.length; j++) {
				if (iChars[j] == '7') {
					chars = false;
				}
			}
			if (gelieferteZahl % 7 != 0 && chars == true) {
				return true;
			}
		}
		return false;
	}

	static class SiebenSpieler {
		private String name;
		private boolean ausgeschieden;

		public SiebenSpieler(String name) {
			this.name = name;
			this.ausgeschieden = false;
		}

		public String toString() {
			return this.name;
		}

		public int naechsteZahl(int vorherigeZahl) {
			return IO.readInt(this + ":  Zahl  nach  " + vorherigeZahl + ": ");
		}

		public void ausscheiden() {
			this.ausgeschieden = true;
		}

		public boolean istAusgeschieden() {
			return this.ausgeschieden;
		}
	}
}