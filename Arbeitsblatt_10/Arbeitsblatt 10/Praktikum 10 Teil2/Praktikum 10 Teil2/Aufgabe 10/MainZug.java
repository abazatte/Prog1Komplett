package Aufgabe91;

public class MainZug {

	public static void main(String[] args) {

		Lokomotive bigChief = new Lokomotive(23, 5311);
		Train santaFe = new Train(bigChief);
		santaFe.add(new Wagen(12, 50));
		santaFe.add(new Wagen(15, 75));
		santaFe.add(new Wagen(20, 100));
		santaFe.print();

		Lokomotive steelHorse = new Lokomotive(21, 5409);
		Train rioGrandeExpress = new Train(steelHorse);
		steelHorse.add(new Wagen(13, 60));
		steelHorse.add(new Wagen(18, 80));
		steelHorse.print();

		rioGrandeExpress.relink(santaFe);
		rioGrandeExpress.print();

		rioGrandeExpress.revert();
		rioGrandeExpress.print();
		
	}

}
