/**
 * Würfelspiel Es wird gewettet, ob eine gerade oder ungerade Zahl gewürfelt
 * wird.
 * 
 * Der Spieler erhält ein Startguthaben. Es können Wettbeträge auf gerade und
 * ungerade gesetzt werden. Bei Gewinn/Verlust wird der gesetzte Betrag zum/vom
 * aktuellen Guthaben hinzugefügt/abgezogen Es kann gleichzeitig auf
 * gerade/ungerade gesetzt werden.
 * 
 * Im Prinzip entspricht dieses Spiel dem Kopf/Zahl-Raten beim Werfen einer
 * Münze.
 * 
 * Die interaktive Steuerung geschieht durch GUI.
 * 
 * TODO Erweiterung: Wetten auf einzelne Zahlen
 * 
 * @author Friedhelm Tappe, Prof. Dr.-Ing. Heiko Tapken
 * @version 25.10.2014
 */
public class Spiel {

	private int startguthaben = 0;
	private int aktuellesGuthaben = 0;
	private int wettbetragGerade = 0;
	private int wettbetragUngerade = 0;

	private Wuerfel einWuerfel;

	public Spiel(int guthaben, Wuerfel einWuerfel) {
		this.startguthaben = guthaben;
		this.aktuellesGuthaben = this.startguthaben;
		this.einWuerfel = einWuerfel;
	}

	public int wuerfeln() {
		einWuerfel.wuerfeln();
		return (einWuerfel.getOben());
	}

	public void init() {
		
		// todo
		// Initialisiere die globale Variable aktuellesGuthaben mit dem Wert von
		// startguthaben
		// der Wettbetrag für gerade und ungerade wird mit 0 initialisiert.
	}

	public void auswertenSpielzug(int gewuerfelteZahl) {
		// todo
		// Diese Methode wird zur Auswertung eine Spielzugs aufgerufen. 
		// Das aktuelle Guthaben (aktuellesGuthaben) wird aktualisiert in Abhängigkeit davon ob.
		// Schreiben Sie ein Programm, dass die Variable aktuellesGuthaben in Abhängigkeit vom Wert der 
		// übergebenen Variablen gewuerfelteZahl aktualisiert.
	}

	public int getStartguthaben() {
		return startguthaben;
	}

	public int getAktuellesGuthaben() {
		return aktuellesGuthaben;
	}

	public int getWettbetragGerade() {
		return wettbetragGerade;
	}

	public int getWettbetragUngerade() {
		return wettbetragUngerade;
	}

	public boolean setWettbetraege(int betragGerade, int betragUngerade) {
		// todo
		// betragGerade ist der auf gerade gesetzte Betrag
		// betragUngerade ist der auf ungerade gesetzte Betrag
		// Setze wettbetragGerade auf 0;
		// Setze wettbetragUngerade auf 0;
       
		// liefere false zurück, falls ein negativer Betrag gesetzt wurde.
		// Das nach Abzug der Einsätze verfügbare Guthaben darf nicht negativ sein. Ist es negativ, liefert die Methode false zurück.
		// sind die Einsätze gültig, so werden wettbetragGerade und wettbetragUngerade auf den gesetzten betrag gesetzt und true zurückgegeben.
		
		return true; // muss nach Lösen der Aufgabe gelöscht werden.
	}

}
