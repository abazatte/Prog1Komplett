
public class Test {
	public static void main(String[] args) {
		Konto p0 = new Konto();
		Konto p1 = new Konto(p0);
		p0.einzahlung();
		System.out.println("Kontostand Person 1: " + Konto.kontoStand(p0));
		p1.einzahlung();
		System.out.println("Kontostand Person 2: " + Konto.kontoStand(p1));
		Konto.Ueberweisung(p0, p1);
		System.out.println("Kontostand Person 1: " + Konto.kontoStand(p0));
		System.out.println("Kontostand Person 2: " + Konto.kontoStand(p1));
		p0.abheben();
		System.out.println("Kontostand Person 1: " + Konto.kontoStand(p0));
		Konto p1Klon = p1.klonen();
		System.out.println("Kontostand Person 2(Klon): " + Konto.kontoStand(p1Klon));
	}
}
