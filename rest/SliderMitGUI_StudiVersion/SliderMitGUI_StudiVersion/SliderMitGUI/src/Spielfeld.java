/**
 * Quadratisches Spielfeld der Größe für ein "Zahlen-Slider"-Puzzle.
 * 
 * @author Friedhelm Tappe, Prof. Dr.-Ing. Heiko Tapken
 * @version 25.10.2014
 */

public class Spielfeld {



	public Spielfeld(int maxX) {
		super();
//	...
	
	}


	/**
	 * Initialisieren des Spielfeldes mit einem gültigen Endzustand
	 */
	public void init() {

	}

	/**
	 * 
	 * @param counter Initialisiere Spielfeld durch eine Anzahl Verschiebungen aus einem gültigen Endzustand. Stellt zunächst einen gültigen Endzustand her. 
	 */
	public void randomInit(int counter) {
	}

	/**
	 * Setzen von xfrei und yfrei
	 * Die freie Zelle ist die Zelle mit dem Wert sizeXY*sizeXY
	 */
	private void bestimmeXYfrei() {
	}

	/**
	 * Kann die Zelle an der Position x,y verschoben werden?
	 * Es wird überprüft, ob eine Nachbarzelle der Zelle an x, y
	 * die freie Zelle ist.
	 * 
	 * @param x Spalte der Zelle
	 * @param y  Zeile der Zelle
	 * @return Zelle verschiebbar
	 */
	private boolean zelleOK(int x, int y) {
		return false;
	}


	public boolean verschiebeZelle(int x, int y) {
		return false;
	}

	/**
	 * Überprüfung, ob das Puzzle gelöst ist.
	 * 
	 * @return Puzzle gelöst?
	 */
	public boolean fertig() {
		return false;
	}


	/**
	 * Textausgabe einer einzelnen Zelle
	 * 
	 * @param x Spalte der Zelle
	 * @param y Zeile der Zelle
	 * @return Beschriftung der Zelle
	 */
	public String toStringZelle(int x, int y) {
		return "";
	}


	public int getSizeXY() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
