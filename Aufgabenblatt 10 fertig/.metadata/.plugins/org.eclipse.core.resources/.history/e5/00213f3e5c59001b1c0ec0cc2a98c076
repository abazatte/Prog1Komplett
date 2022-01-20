
public class Programm extends UE18Aufgabe.SiebenSpieler{
	Programm(){
		super("Programm");
	}
	@Override
	public int naechsteZahl(int vorherigeZahl) {
		System.out.println(this  + ":  Zahl  nach  "  +  vorherigeZahl  + ": ");
		boolean chars = true;
		boolean zahlGefunden = false;
		int richtigeAntwort = 0;
		int i = vorherigeZahl + 1;
		while(zahlGefunden == false) {
			chars = true;
			String nummer = String.valueOf(i);
	        char[] iChars = nummer.toCharArray();
	        for(int j = 0; j < iChars.length; j++) {
	        	if(iChars[j] == '7') {
	        		chars = false;
	        	}
	        }
	        if(i % 7 != 0 && chars == true) {
	        	zahlGefunden = true;
	        	return i;
	        }
	        i++;
		}
		System.out.println(richtigeAntwort);
		return richtigeAntwort;
	}
}
