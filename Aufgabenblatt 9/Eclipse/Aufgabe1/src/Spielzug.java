
public class Spielzug {
	public static void main(String[] args) {
		Spielfeld sp = new Spielfeld();
		sp.groesseFestlegen();
		sp.ausgabe(6);
		
		Auto a0 = new Auto(0, 0, "h", 3);
		sp.ausgabe(6);
	}
}
