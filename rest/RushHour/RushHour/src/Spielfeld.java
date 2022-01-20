
public class Spielfeld {
	
	int zeile = 6;
	int spalte = 6;
	private String spielfeld[][] = new String[zeile][spalte];
	
	
	public String[][] getSpielfeld() {
		return spielfeld;
	}
	
	public void setSpielfeld() {
		for(int i = 0; i < spielfeld.length; i++){
			for(int j = 0; j < spielfeld[i].length; j++){
				spielfeld[i][j] = "  ";
			}
		}
	}
	
	public String[][] arrayAusgeben() {
		this.spielfeld = spielfeld;
		for(int i = 0; i < spielfeld.length; i++){
			System.out.println("+--+--+--+--+--+--+");
			for(int j = 0; j < spielfeld[i].length; j++){
				System.out.print("|" + spielfeld[i][j]); 
			}
			System.out.println("|");
		}
		System.out.println("+--+--+--+--+--+--+");
		return spielfeld;
	}	
	
	public boolean geloest() {
		return true;
	}
}
