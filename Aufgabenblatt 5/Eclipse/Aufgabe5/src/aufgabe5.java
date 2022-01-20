import java.util.Arrays;
import java.util.List;

public class aufgabe5 {
	public static void main(String[] args) {
		aufgabe5 fp = new aufgabe5();
		String Anfangsstadt = null;
		String Zielstadt = null;
		String Stadt = null;
		int anzahl = IO.readInt("Anzahl Städte: ");
		String[] Staedte = new String[anzahl];
		fp.staedteEinlesen(Stadt, Staedte, anzahl);

		int direkt = IO.readInt("Anzahl Direktverbindungen: ");
		String[] Direktverbindungen = new String[direkt * 2];
		fp.direktverbindungen(Anfangsstadt, Zielstadt, Direktverbindungen, Staedte, direkt);
		fp.auskunft(Anfangsstadt, Zielstadt, Direktverbindungen);
	}

	public void auskunft(String anfang, String ende, String[] direktverbindung) {
		int i = 0;
		List<String> list = Arrays.asList(direktverbindung);
		System.out.println("\nAuskunft");
		while (i == 0) {
			anfang = IO.readString("\nAnfangsstadt: ");
			ende = IO.readString("Ziel: ");
			if (list.containsAll(Arrays.asList(anfang + ende)) || list.containsAll(Arrays.asList(ende + anfang))) {
				System.out.println("Es gibt eine Direktverbindung zwischen " + anfang + " und " + ende + ".");
			} else {
				System.out.println("Es gibt keine Direktverbindung zwischen " + anfang + " und " + ende + ".");
			}
		}
	}

	public void staedteEinlesen(String Stadt, String[] stadtliste, int anzahl) {
		for (int i = 1; i <= anzahl; i++) {
			Stadt = IO.readString("Stadt " + i + ": ");
			stadtliste[i - 1] = Stadt;
		}
	}

	public void direktverbindungen(String Anfang, String Ende, String[] direktverbindung, String[] stadtlist,
			int direkt) {
		List<String> listeStadt = Arrays.asList(stadtlist);
		for (int j = 1; j <= direkt; j++) {
			System.out.println("Direktverbindung " + j + ": ");
			Anfang = IO.readString("Ausgangsstadt: ");
			Ende = IO.readString("Ziel: ");
			if (listeStadt.containsAll(Arrays.asList(Anfang)) && listeStadt.containsAll(Arrays.asList(Ende))) {
				direktverbindung[j - 1] = Anfang + Ende;
				direktverbindung[j] = Ende + Anfang;
			} else {
				System.out.println(
						"Die eingegebenen Verbindungen beinhalten Städte, die nicht in der Stadtliste vorhanden sind. Gib bitte neue ein.");
				j--;
			}
		}
	}
}
