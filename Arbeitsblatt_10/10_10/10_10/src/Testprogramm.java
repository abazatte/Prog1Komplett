
public class Testprogramm {

	public static void main(String[] args) {
		
		Locomotive BigChief = new Locomotive(23, 5311, null, "Big Chief");
		Train SantaFe = new Train(BigChief, "Santa Fe"); 

		Car w1 = new Car(12, 50, null, "Wagen1.1");
		Car w2 = new Car(15, 75, null, "Wagen2.1");
		Car w3 = new Car(20, 100, null, "Wagen3.1");
		
		SantaFe.add(w1);
		SantaFe.add(w2);
		SantaFe.add(w3);
		SantaFe.print();

		System.out.println("\nDie Passagierkapazität des ganzen Zuges beträgt " + SantaFe.getPassengers() + ".");
		System.out.println("Die Gesamtlänge des ganzen Zuges beträgt " + SantaFe.getLength() + "m.");
		System.out.println("Der erste Wage ist " + SantaFe.removeFirst() + " und wird entfernt.\n");
		SantaFe.print();
		
		Locomotive SteelHorse = new Locomotive(21, 5409, null, "Steel Horse");
		Train RioGrandeExpress = new Train(SteelHorse, "Rio Grande Express"); 

		Car c1 = new Car(13, 60, null, "Wagen1.2");
		Car c2 = new Car(18, 80, null, "Wagen2.2");
		
		RioGrandeExpress.add(c1);
		RioGrandeExpress.add(c2);
		System.out.println();
		RioGrandeExpress.print();
		
		System.out.println("\nRio Grande Express wird an Santa Fe angehängt:\n");
		SantaFe.relink(RioGrandeExpress);
		SantaFe.print();
		
		System.out.println("\nSanta Fe wird umgedreht:");
		SantaFe.revert();
		SantaFe.print();
		
	}

}
