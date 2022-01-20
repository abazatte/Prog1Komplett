
public class RushHour {

	public static void main(String[] args) {

		Spielfeld sf = new Spielfeld();
		sf.setSpielfeld();

		Auto hauptAuto = new Auto("* ", 2, 3, true, 2);
		Auto auto1 = new Auto("1 ", 0, 0, false, 3);
		Auto auto2 = new Auto("2 ", 0, 1, true, 2);
		Auto auto3 = new Auto("3 ", 0, 4, false, 2);
		Auto auto4 = new Auto("4 ", 1, 1, false, 2);
		Auto auto5 = new Auto("5 ", 1, 2, false, 2);
		Auto auto6 = new Auto("6 ", 1, 5, false, 3);
		Auto auto7 = new Auto("7 ", 3, 0, true, 3);
		Auto auto8 = new Auto("8 ", 3, 3, false, 2);
		Auto auto9 = new Auto("9 ", 4, 2, false, 2);
		Auto autoA = new Auto("a ", 4, 4, true, 2);
		Auto autoB = new Auto("b ", 5, 0, true, 2);
		Auto autoC = new Auto("c ", 5, 3, true, 2);

		hauptAuto.autoPlazieren(hauptAuto, sf.getSpielfeld());
		auto1.autoPlazieren(auto1, sf.getSpielfeld());
		auto2.autoPlazieren(auto2, sf.getSpielfeld());
		auto3.autoPlazieren(auto3, sf.getSpielfeld());
		auto4.autoPlazieren(auto4, sf.getSpielfeld());
		auto5.autoPlazieren(auto5, sf.getSpielfeld());
		auto6.autoPlazieren(auto6, sf.getSpielfeld());
		auto7.autoPlazieren(auto7, sf.getSpielfeld());
		auto8.autoPlazieren(auto8, sf.getSpielfeld());
		auto9.autoPlazieren(auto9, sf.getSpielfeld());
		autoA.autoPlazieren(autoA, sf.getSpielfeld());
		autoB.autoPlazieren(autoB, sf.getSpielfeld());
		autoC.autoPlazieren(autoC, sf.getSpielfeld());

		Spielfeld.spielfeldAusgeben();

		char auswahl;
		char richtung;

		while (!sf.geloest()) {

			richtung = '0';
			auswahl = IO.readChar("Welches Auto möchten Sie verschieben? ");

			switch (auswahl) {

			case '*':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					hauptAuto.bewegeAuto(richtung, hauptAuto, sf.getSpielfeld());

					if (sf.geloest()) {
						System.out.println("Sie haben es geloest!");
						break;
					}
				}
				break;

			case '1':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					auto1.bewegeAuto(richtung, auto1, sf.getSpielfeld());

				}
				break;

			case '2':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					auto2.bewegeAuto(richtung, auto2, sf.getSpielfeld());

				}
				break;

			case '3':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					auto3.bewegeAuto(richtung, auto3, sf.getSpielfeld());

				}
				break;

			case '4':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					auto4.bewegeAuto(richtung, auto4, sf.getSpielfeld());

				}
				break;

			case '5':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					auto5.bewegeAuto(richtung, auto5, sf.getSpielfeld());

				}
				break;

			case '6':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					auto6.bewegeAuto(richtung, auto6, sf.getSpielfeld());

				}
				break;

			case '7':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					auto7.bewegeAuto(richtung, auto7, sf.getSpielfeld());

				}
				break;

			case '8':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					auto8.bewegeAuto(richtung, auto8, sf.getSpielfeld());

				}
				break;

			case '9':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					auto9.bewegeAuto(richtung, auto9, sf.getSpielfeld());

				}
				break;

			case 'a':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					autoA.bewegeAuto(richtung, autoA, sf.getSpielfeld());

				}
				break;

			case 'b':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					autoB.bewegeAuto(richtung, autoB, sf.getSpielfeld());

				}
				break;

			case 'c':
				while (richtung != 'q') {
					richtung = IO.readChar(
							"In welche Richtung möchten Sie das Auto verschieben? (l=links, r=rechts, u=hoch, d=runter, q=Autowechsel) ");
					autoC.bewegeAuto(richtung, autoC, sf.getSpielfeld());

				}
				break;

			default:
				System.out.println("Dieses Auto existiert nicht!");
				break;

			}
		}
	}
}
