
public class Spielfeld {

	static String[][] spielfeld = new String[6][6];
	
	public String[][] getSpielfeld () {
		return spielfeld;
	}
	
	public void setSpielfeld() {
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				spielfeld[i][j] = "__";
			}
		}
	}
	
	public static String[][] spielfeldAusgeben() {
		for(int i = 0; i < spielfeld.length; i++){
			System.out.println("+--+--+--+--+--+--+");
			for(int j = 0; j < spielfeld[i].length; j++){
				System.out.print("|" + spielfeld[i][j]); 
			}
			if(i == 2) {
				System.out.println();
				continue;
			}
			else {
			System.out.println("|");
			}
		}
		System.out.println("+--+--+--+--+--+--+");
		return spielfeld;
	}	
	
	public boolean geloest() {
		if (spielfeld[2][5].equals("* ")) {
			
			return true;
		}
		else {
			return false;
		}
		
	}
}

