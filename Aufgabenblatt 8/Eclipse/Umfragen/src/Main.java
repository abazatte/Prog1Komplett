
public class Main {
	public static void main(String[] args) {
		System.out.println("Fragen eingeben\n----------------");
		Umfrage u = new Umfrage();
		u.setTitel(IO.readString("Titel der Umfrage: "));
		u.setAnzahl(IO.readInt("Anzahl der Fragen: "));
		String[] frage = new String[u.getAnzahl()];
		for (int i = 0; i < u.getAnzahl(); i++) {
			int j = i + 1;
			Frage f = new Frage();
			frage[i] = f.setFrage(IO.readString("Frage " + j + ": "));
		}
		System.out.println("Umfrage\n----------------");
		char weiter = IO.readChar("Weitere Teilnehmer (j/n)?");
		while (weiter != 'j' && weiter != 'n') {
			weiter = IO.readChar("Falsche Eingabe (j/n)? ");
		}
		Antworten a = new Antworten();
		char loesung;
		while (weiter != 'n') {
			if (weiter == 'j') {
				for (int i = 0; i < u.getAnzahl(); i++) {
					System.out.println(frage[i]);
					loesung = IO.readChar("ja/nein (j/n)? ");
					while (loesung != 'j' && loesung != 'n') {
						loesung = IO.readChar("Falsche Eingabe (j/n): ");
					}
					if (loesung == 'j') {
						a.setJa(a.getJa() + 1);
					} else {
						a.setNein(a.getNein() + 1);
					}
				}
				weiter = IO.readChar("Weitere Teilnehmer (j/n)? ");
				while (weiter != 'j' && weiter != 'n') {
					weiter = IO.readChar("Falsche Eingabe (j/n)? ");
				}
			}
			a.setTeilnehmer(a.getTeilnehmer() + 1);
		}
		System.out.println("Umfrageergebnisse\n----------------");
		System.out.println("Umfrage: " + u.getTitel());
		for (int i = 0; i < u.getAnzahl(); i++) {
			System.out.println(frage[i]);
			System.out.println("ja-Antworten: " + a.getJa() + " Prozent: " + a.prozent(a.getJa()));
			System.out.println("nein-Antworten: " + a.getNein() + " Prozent: " + a.prozent(a.getNein()));
		}

	}
}
