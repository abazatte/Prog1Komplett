
public class RushHour {

	public static void main(String[] args) {

		// Spielfeldobjekt erstellen und mit " " füllen
		Spielfeld sp = new Spielfeld();
		sp.setSpielfeld();

		// Auto Objekte erstellen
		Auto aHaupt = new Auto("* ", 2, 3, "h", 2);
		Auto a1 = new Auto("1 ", 0, 0, "v", 3);
		Auto a2 = new Auto("2 ", 0, 1, "h", 2);
		Auto a3 = new Auto("3 ", 0, 4, "v", 2);
		Auto a4 = new Auto("4 ", 1, 1, "v", 2);
		Auto a5 = new Auto("5 ", 1, 2, "v", 2);
		Auto a6 = new Auto("6 ", 1, 5, "v", 3);
		Auto a7 = new Auto("7 ", 3, 0, "h", 3);
		Auto a8 = new Auto("8 ", 3, 3, "v", 2);
		Auto a9 = new Auto("9 ", 4, 2, "v", 2);
		Auto aA = new Auto("a ", 4, 4, "h", 2);
		Auto aB = new Auto("b ", 5, 0, "h", 2);
		Auto aC = new Auto("c ", 5, 3, "h", 2);

		// Autos ins Spielfeld platzieren
		a1.setzeAuto(a1, sp.getSpielfeld());
		a2.setzeAuto(a2, sp.getSpielfeld());
		a3.setzeAuto(a3, sp.getSpielfeld());
		a4.setzeAuto(a4, sp.getSpielfeld());
		a5.setzeAuto(a5, sp.getSpielfeld());
		a6.setzeAuto(a6, sp.getSpielfeld());
		a7.setzeAuto(a7, sp.getSpielfeld());
		a8.setzeAuto(a8, sp.getSpielfeld());
		a9.setzeAuto(a9, sp.getSpielfeld());
		aA.setzeAuto(aA, sp.getSpielfeld());
		aB.setzeAuto(aB, sp.getSpielfeld());
		aC.setzeAuto(aC, sp.getSpielfeld());
		aHaupt.setzeAuto(aHaupt, sp.getSpielfeld());

		System.out.println("Startspielfeld\n");
		sp.arrayAusgeben();

		// Switchcase zum Bewegen der Autos

		char autoWahl;
		char richtung = '0';
		boolean b = false;
		while (!b) {
			richtung = 'w';
			autoWahl = IO.readChar("Wahl eines Autos: ");

			switch (autoWahl) {

			case 'a': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					aA.bewegeAuto(richtung, aA, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case 'b': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					aB.bewegeAuto(richtung, aB, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case 'c': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					aC.bewegeAuto(richtung, aC, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '1': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					a1.bewegeAuto(richtung, a1, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '2': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					a2.bewegeAuto(richtung, a2, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '3': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					a3.bewegeAuto(richtung, a3, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '4': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					a4.bewegeAuto(richtung, a4, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '5': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					a5.bewegeAuto(richtung, a5, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '6': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					a6.bewegeAuto(richtung, a6, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '7': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					a7.bewegeAuto(richtung, a7, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '8': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					a8.bewegeAuto(richtung, a8, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '9': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					a9.bewegeAuto(richtung, a9, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			case '*': {
				while (richtung != 'q') {
					richtung = IO.readChar("Richtung (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel): ");
					aHaupt.bewegeAuto(richtung, aHaupt, sp.getSpielfeld());
					sp.arrayAusgeben();
				}
				break;
			}

			}

		}
	}

}
