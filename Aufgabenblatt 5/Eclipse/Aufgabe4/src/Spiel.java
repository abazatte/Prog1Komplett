/**
 * W�rfelspiel Es wird gewettet, ob eine gerade oder ungerade Zahl gew�rfelt
 * wird.
 * 
 * Der Spieler erh�lt ein Startguthaben. Es k�nnen Wettbetr�ge auf gerade und
 * ungerade gesetzt werden. Bei Gewinn/Verlust wird der gesetzte Betrag zum/vom
 * aktuellen Guthaben hinzugef�gt/abgezogen Es kann gleichzeitig auf
 * gerade/ungerade gesetzt werden.
 * 
 * Im Prinzip entspricht dieses Spiel dem Kopf/Zahl-Raten beim Werfen einer
 * M�nze.
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
		// der Wettbetrag f�r gerade und ungerade wird mit 0 initialisiert.
		this.aktuellesGuthaben = this.startguthaben;
		this.wettbetragGerade = 0;
		this.wettbetragUngerade = 0;
	}

	public void auswertenSpielzug(int gewuerfelteZahl) {
		// todo
		// Diese Methode wird zur Auswertung eine Spielzugs aufgerufen.
		// Das aktuelle Guthaben (aktuellesGuthaben) wird aktualisiert in Abh�ngigkeit
		// davon ob.
		// Schreiben Sie ein Programm, dass die Variable aktuellesGuthaben in
		// Abh�ngigkeit vom Wert der
		// �bergebenen Variablen gewuerfelteZahl aktualisiert.
		if (gewuerfelteZahl % 2 == 0) {
			this.aktuellesGuthaben = this.aktuellesGuthaben + this.wettbetragGerade;
			this.aktuellesGuthaben = this.aktuellesGuthaben - this.wettbetragUngerade;
		} else {
			this.aktuellesGuthaben = this.aktuellesGuthaben + this.wettbetragUngerade;
			this.aktuellesGuthaben = this.aktuellesGuthaben - this.wettbetragGerade;
		}
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
		this.wettbetragGerade = 0;
		this.wettbetragUngerade = 0;

		if (betragGerade < 0 || betragUngerade < 0 || aktuellesGuthaben < 0
				|| betragGerade + betragUngerade > aktuellesGuthaben) {
			return false;
		} else {
			this.wettbetragGerade = betragGerade;
			this.wettbetragUngerade = betragUngerade;
			return true;
		}
		// liefere false zur�ck, falls ein negativer Betrag gesetzt wurde.
		// Das nach Abzug der Eins�tze verf�gbare Guthaben darf nicht negativ sein. Ist
		// es negativ, liefert die Methode false zur�ck.
		// sind die Eins�tze g�ltig, so werden wettbetragGerade und wettbetragUngerade
		// auf den gesetzten betrag gesetzt und true zur�ckgegeben.
		// muss nach L�sen der Aufgabe gel�scht werden.

	}

}
