
public class sliderSpiel {

	public static void main(String[] args) {
		String[][] sb = new String[4][4];
		sb[0][0] = "11";
		sb[0][1] = "12";
		sb[0][2] = "13";
		sb[0][3] = "14";
		sb[1][0] = " 1";
		sb[1][1] = " 2";
		sb[1][2] = " 3";
		sb[1][3] = " 4";
		sb[2][0] = " 8";
		sb[2][1] = " 7";
		sb[2][2] = " 6";
		sb[2][3] = " 5";
		sb[3][0] = "  ";
		sb[3][1] = " 9";
		sb[3][2] = "10";
		sb[3][3] = "15";
		int anzahlZuege = 0;
		while (!(sb[0][0] == "  " && sb[0][1] == " 1" && sb[0][2] == " 2" && sb[0][3] == " 3" && sb[1][0] == " 4"
				&& sb[1][1] == " 5" && sb[1][2] == " 6" && sb[1][3] == " 7" && sb[2][0] == " 8" && sb[2][1] == " 9"
				&& sb[2][2] == "10" && sb[2][3] == "11" && sb[3][0] == "12" && sb[3][1] == "13" && sb[3][2] == "14"
				&& sb[3][3] == "15")) {
			System.out.println("+--+--+--+--+");
			for (int i = 0; i < 4; i++) {
				System.out.print("|");
				for (int j = 0; j < 4; j++) {
					System.out.print(sb[i][j] + "|");
				}
				System.out.println("\n+--+--+--+--+");
			}

			int zeile;
			int spalte;
			System.out.println("Welches Feld möchten Sie verschieben");
			System.out.print("Zeile: ");
			zeile = IO.readInt() - 1;
			System.out.print("Spalte: ");
			spalte = IO.readInt() - 1;
			boolean bewegt = false;
			if (zeile > 0 && sb[zeile - 1][spalte].equals("  ")) {
				sb[zeile - 1][spalte] = sb[zeile][spalte];
				bewegt = true;
			} else if (zeile < sb.length - 1 && sb[zeile + 1][spalte].equals("  ")) {
				sb[zeile + 1][spalte] = sb[zeile][spalte];
				bewegt = true;
			} else if (spalte > 0 && sb[zeile][spalte - 1].equals("  ")) {
				sb[zeile][spalte - 1] = sb[zeile][spalte];
				bewegt = true;
			} else if (spalte < sb.length - 1 && sb[zeile][spalte + 1].equals("  ")) {
				sb[zeile][spalte + 1] = sb[zeile][spalte];
				bewegt = true;
			}
			if (bewegt == true) {
				sb[zeile][spalte] = "  ";
			}
			System.out.println(sb[zeile][spalte]);
			anzahlZuege++;
		}
		System.out.println("+--+--+--+--+");
		for (int i = 0; i < 4; i++) {
			System.out.print("|");
			for (int j = 0; j < 4; j++) {
				System.out.print(sb[i][j] + "|");
			}
			System.out.println("\n+--+--+--+--+");
		}
		System.out.println("Geschafft!" + "\nBenötigte Züge: " + anzahlZuege);
	}
}