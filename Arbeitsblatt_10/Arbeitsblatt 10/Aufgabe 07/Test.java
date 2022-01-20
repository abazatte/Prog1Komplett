
public class Test {
	public static void main (String [] args) {
	Konto Tom = new Konto();
	Konto Nicklas = new Konto(Tom);
	Tom.einZahlung();
	System.out.println(Konto.kontoStandAusgeben(Tom));
	Konto.Ueberweisung(Tom, Nicklas);
	System.out.println(Konto.kontoStandAusgeben(Tom));
	System.out.println(Konto.kontoStandAusgeben(Nicklas));
	Konto NicklasKlon = Nicklas.klonier();
	System.out.println(Konto.kontoStandAusgeben(NicklasKlon));
	}
}
