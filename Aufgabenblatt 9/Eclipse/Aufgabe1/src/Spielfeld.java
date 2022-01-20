
public class Spielfeld {
	private char[][] spielfeld;

	public char[][] getSpielfeld() {
		return spielfeld;
	}

	public void setSpielfeld(char[][] spielfeld) {
		this.spielfeld = spielfeld;
	}

	public void ausgabe(int groesse) {
		System.out.print("\n\t");
		for (int n = 0; n < groesse; n++) {
			System.out.print("+---");
		}
		System.out.println("+");
		for (int a = 0; a < this.spielfeld.length; a++) {
			System.out.print("\t|");
			for (int b = 0; b < this.spielfeld[a].length; b++) {
				System.out.print(" " + this.spielfeld[a][b] + " |");
			}

			System.out.println("\t");
			System.out.print("\t");
			for (int n = 0; n < groesse; n++) {
				System.out.print("+---");
			}
			System.out.println("+");
		}
	}

	public void groesseFestlegen() {
		int x = IO.readInt("Größe des Spielfeldes (wegen Beispiel = 6!)? ");
		this.spielfeld = new char[x][x];
	}

	public void autoPlatzieren(Auto a) {
		spielfeld[a.x][a.y] = a.klonen();
	}
}
