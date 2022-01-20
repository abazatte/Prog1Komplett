
public class Umfrage {
	public static void main(String[] args) {
		System.out.println("Fragen eingeben\n----------------");
		String titel = IO.readString("Titel der Umfrage: ");
		int anzahl = IO.readInt("Anzahl der Fragen: ");
		Fragen f = new Fragen(anzahl);
		Antworten a = new Antworten(anzahl);
		System.out.println("----------------");
		char weiter = IO.readChar("Weitere Teilnehmer (j/n)? ");
		do {
			for (int z = 1; z <= anzahl; z++) {
				System.out.println("Frage " + z + ": " + f.getFrage(z - 1));
				char antwort = IO.readChar("ja/nein (j/n)? ");
				if (antwort == 'j') {
					a.setJaAntworten(z - 1);
				} else if (antwort == 'n') {
					a.setNeinAntworten(z - 1);
				} else {
					System.out.println("Keine g�ltige Antwort.");
				}
			}
			weiter = IO.readChar("Weitere Teilnehmer (j/n)? ");
		} while (weiter == 'j');
		System.out.println("----------------");
		System.out.println("Umfrage: " + titel);
		for (int z = 1; z <= anzahl; z++) {
			System.out.println("Frage " + z + ": " + f.getFrage(z - 1));
			a.setProzent(a.getJaAntworten(z - 1), a.getNeinAntworten(z - 1), a.getJaAntworten(z - 1));
			System.out.println("Ja-Antworten: " + a.getJaAntworten(z - 1) + " Prozent: " + a.getProzent());
			a.setProzent(a.getJaAntworten(z - 1), a.getNeinAntworten(z - 1), a.getNeinAntworten(z - 1));
			System.out.println("Nein-Antworten: " + a.getNeinAntworten(z - 1) + " Prozent: " + a.getProzent());
		}
	}
}
