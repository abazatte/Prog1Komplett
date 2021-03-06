public class Umfrage {
	
	public static void main(String[] args) {
		
		System.out.println("Fragen eingeben\n-----------------------");
		String umfragenname = IO.readString("Titel der Umfrage: ");
		int anzahlFragen = IO.readInt("Anzahl der Fragen: ");
		
		Frage[] fragen = new Frage[anzahlFragen];
		for(int i=1; i <= anzahlFragen; i++) {
			Frage frage = new Frage(IO.readString("Frage " + i + ": "));
			fragen[i-1] = frage;
		}
		
			//UMFRAGE STARTEN
		
		System.out.println("-----------------------\nUMFRAGE\n-----------------------");
		
		char weiter = IO.readChar("\nWeiterer Teilnehmer (j/n)? ");;
		
		do {
		for (int d = 1; d <= anzahlFragen; d++) {
			System.out.println("Frage " + d + ": " + fragen[d-1]);
			char antwort = IO.readChar("Ja oder nein (j/n)?");
			if (antwort == 'j') {
				fragen[d-1].mitJaBeantwortet();
			}
			else if (antwort == 'n') {
				fragen[d-1].mitNeinBeantwortet();
			}
			else {
				System.out.println("Keine g?ltige Antwort.\n");
			}
		}
		weiter = IO.readChar("\nWeiterer Teilnehmer (j/n)? ");
	} while (weiter == 'j');
		
		
		
		//ERGEBNISSE
	
		System.out.println("-----------------------\nUMFRAGENERGEBNISSE\n-----------------------\nUmfrage: " + umfragenname + "\n");
	
		for (int v = 1; v <= anzahlFragen; v++) {
			System.out.println("Frage " + v + ": " + fragen[v-1]);
			System.out.println("Ja-Antworten: " + fragen[v-1].getJaAntworten() + " = " + fragen[v-1].getProzentJa() + " Prozent");
			System.out.println("Nein-Antworten: " + fragen[v-1].getNeinAntworten() + " = " + fragen[v-1].getProzentNein() + " Prozent");
		}
	}
}