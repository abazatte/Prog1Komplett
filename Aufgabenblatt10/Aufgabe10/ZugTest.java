
public class ZugTest{

	public static void main(String[] args) {
		
		Lokomotive BigChief = new Lokomotive(23, 5311, null, "Big Chief");
		Zug SantaFe = new Zug(BigChief, "Santa Fe"); 

		Wagen w1 = new Wagen(12, 50, null, "Wagen1.1");
		Wagen w2 = new Wagen(15, 75, null, "Wagen2.1");
		Wagen w3 = new Wagen(20, 100, null, "Wagen3.1");
		
		SantaFe.add(w1);
		SantaFe.add(w2);
		SantaFe.add(w3);
		SantaFe.print();

		System.out.println("\nDie Passagierkapazitaet des ganzen Zuges betraegt " + SantaFe.getPassengers() + ".");
		System.out.println("Die Gesamtlaenge des ganzen Zuges betraegt " + SantaFe.getLength() + "m.");
		System.out.println("Der erste Wage ist " + SantaFe.removeFirst() + " und wird entfernt.\n");
		SantaFe.print();
		
		Lokomotive SteelHorse = new Lokomotive(21, 5409, null, "Steel Horse");
		Zug RioGrandeExpress = new Zug(SteelHorse, "Rio Grande Express"); 

		Wagen c1 = new Wagen(13, 60, null, "Wagen1.2");
		Wagen c2 = new Wagen(18, 80, null, "Wagen2.2");
		
		RioGrandeExpress.add(c1);
		RioGrandeExpress.add(c2);
		System.out.println();
		RioGrandeExpress.print();
		
		System.out.println("\nRio Grande Express wird an Santa Fe angehaengt:\n");
		SantaFe.relink(RioGrandeExpress);
		SantaFe.print();
		
		System.out.println("\nSanta Fe wird umgedreht:");
		SantaFe.revert();
		SantaFe.print();
		
	}

}
