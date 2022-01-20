
public class schiffeVersenken {
	public static final int PROZENTUALERANTEIL = 10;

	public static void main(String[] args) {
		int seitenlaenge = IO.readInt("Breite des Feldes: ");
		int maxSchiffe = (seitenlaenge * seitenlaenge) / PROZENTUALERANTEIL;
		String[][] sf1 = feld(seitenlaenge, maxSchiffe);
		String[][] sf2 = feld(seitenlaenge, maxSchiffe);
		System.out.println("Spieler 1:\n");
		ausgabe(sf1, seitenlaenge);
		int gewinn1 = IO.readInt("Wie viele Punkte bis zum Gewinn? ");
		System.out.println("Spieler 2:\n");
		ausgabe(sf2, seitenlaenge);
		int gewinn2 = IO.readInt("Wie viele Punkte bis zum Gewinn? ");
		String[][] sf11 = new String[seitenlaenge][seitenlaenge];
		for (int a = 0; a < sf11.length; a++) {
			for (int b = 0; b < sf11.length; b++) {
				sf11[a][b] = " ";
			}
		}
		String[][] sf12 = new String[seitenlaenge][seitenlaenge];
		for (int a = 0; a < sf12.length; a++) {
			for (int b = 0; b < sf12.length; b++) {
				sf12[a][b] = " ";
			}
		}
		System.out.println("Spieler 1:\n");
		ausgabe(sf11, seitenlaenge);
		System.out.println("Spieler 2:\n");
		ausgabe(sf12, seitenlaenge);
		raten(gewinn1, gewinn2, sf1, sf2, sf11, sf12, seitenlaenge);
	}

	static String[][] feld(int seitenlaenge, int maxSchiffe) {
		int schiffZaehler = 0;
		String[][] feldZwei = new String[seitenlaenge][seitenlaenge];
		for (int a = 0; a < feldZwei.length; a++) {
			for (int b = 0; b < feldZwei[a].length; b++) {
				feldZwei[a][b] = "";
			}
		}
		while (schiffZaehler < maxSchiffe) {
			for (int a = 0; a < feldZwei.length; a++) {
				for (int b = 0; b < feldZwei[a].length; b++) {
					if (schiffZaehler < maxSchiffe && !feldZwei[a][b].equals("1") && getZufallsZahl() == 1) {
						feldZwei[a][b] = "1";
						schiffZaehler++;
					} else {
						feldZwei[a][b] = "0";
					}
				}
			}
		}
		return feldZwei;
	}

	static int getZufallsZahl() {
		if ((int) (Math.random() * 10) >= 8) {
			return 1;
		} else {
			return 0;
		}
	}

	static void ausgabe(String feld[][], int seitenlaenge) {
		System.out.print("\t");
		for (int n = 0; n < seitenlaenge; n++) {
			System.out.print("  " + n + " ");
		}
		System.out.print("\n\t");
		for (int n = 0; n < seitenlaenge; n++) {
			System.out.print("+---");
		}
		System.out.println("+");
		for (int a = 0; a < feld.length; a++) {
			System.out.print(a + "\t|");
			for (int b = 0; b < feld[a].length; b++) {
				System.out.print(" " + feld[a][b] + " |");
			}

			System.out.println("\t");
			System.out.print("\t");
			for (int n = 0; n < seitenlaenge; n++) {
				System.out.print("+---");
			}
			System.out.println("+");
		}
	}

	public static void raten(int gewinn1, int gewinn2, String[][] sf1, String[][] sf2, String[][] sf11, String[][] sf12,
			int seitenlaenge) {
		int eins = 0;
		int zwei = 0;
		int x1;
		int y1;
		int x2;
		int y2;
		while (eins <= gewinn1 || zwei <= gewinn2) {
			System.out.println("Spieler 1:");
			x1 = IO.readInt("y = ");
			y1 = IO.readInt("x = ");
			if (sf2[x1][y1].equals("1")) {
				sf12[x1][y1] = "2";
				ausgabe(sf12, seitenlaenge);
				System.out.println("Treffer!");
				int punkteTemp = 0;
				punkteTemp = quersummex(x1) + quersummey(y1);
				eins = eins + punkteTemp;
				System.out.println(eins);
			} else if (sf2[x1][y1].equals("0")) {
				sf12[x1][y1] = "3";
				ausgabe(sf12, seitenlaenge);
				System.out.println("Kein Treffer!");
			}
			if (eins >= gewinn1) {
				System.out.println("Spieler 1 hat gewonnen!");
				break;
			} else {
				System.out.println(eins);
			}
			System.out.println("Spieler 2:");
			x2 = IO.readInt("y = ");
			y2 = IO.readInt("x = ");
			if (sf1[x2][y2].equals("1")) {
				sf11[x2][y2] = "2";
				ausgabe(sf11, seitenlaenge);
				System.out.println("Treffer!");
				int punkteTemp = 0;
				punkteTemp = quersummex(x2) + quersummey(y2);
				zwei = zwei + punkteTemp;
				System.out.println(zwei);
			} else if (sf1[x2][y2].equals("0")) {
				sf11[x2][y2] = "3";
				ausgabe(sf11, seitenlaenge);
				System.out.println("Kein Treffer!");
			}
			if (zwei >= gewinn2) {
				System.out.println("Spieler 2 gewinnt!");
				break;
			} else {
				System.out.println(zwei);
			}
		}
		System.out.println("Spiel beendet!");
	}

	public static int quersummex(int x) {
		if (x <= 9) {
			return x;
		} else {
			return x + quersummex(x / 10);
		}
	}

	public static int quersummey(int y) {
		if (y <= 9) {
			return y;
		} else {
			return y + quersummey(y / 10);
		}
	}
}