/**
 * Simulation eines 6-seitigen W�rfels
 * Die oben liegende Zahl ist die gew�rfelte Zahl
 * 
 * TODO
 * Verallgemeinerung auf beliebige "W�rfel"
 * 
 * @author Friedhelm Tappe, Prof. Dr.-Ing. Heiko Tapken
 * @version 25.10.2014
 *
 */

public class Wuerfel {

	private int gewuerfelteZahl;
	
	public Wuerfel() {
		this.wuerfeln();
	}
	
	public Wuerfel(int oben) {
		this.gewuerfelteZahl = oben;
	}
	
	public void wuerfeln() {
		//todo: 
		//weisen Sie der Variablen gewuerfelteZahl wir ein zuf�lliger Wert zwischen 1 und 6 (Integer) zu
	}

	public int getOben() {
		return gewuerfelteZahl;
	}
	
}
