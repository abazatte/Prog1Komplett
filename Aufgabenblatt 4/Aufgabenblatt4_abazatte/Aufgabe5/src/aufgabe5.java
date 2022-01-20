import java.util.Random;

public class aufgabe5 {

	public static String computer;
	public static String eingabe;
	public boolean g;

	public static void main(String[] args) {
		aufgabe5 a = new aufgabe5();
		int runde = 1;
		int spielstandPC = 0;
		int spielstandMe = 0;
		while (spielstandPC < 10 && spielstandMe < 10) {
			System.out.println("Spielrunde " + runde + ":");
			eingabe = IO.readString("Symbol eingeben (Brunnen, Schere, Stein, Papier): -> ");
			System.out.println("Computer: " + a.computerZufall());
			a.werGewinnt();
			if (eingabe.equals(computer)) {
				System.out.println("Unentschieden.");
				System.out.println("Spielstand: Spieler: " + spielstandMe + " Computer: " + spielstandPC);
				runde++;
			} else if (a.g == true) {
				spielstandMe++;
				runde++;
				System.out.println("Spieler gewinnt!");
				System.out.println("Spielstand: Spieler: " + spielstandMe + " Computer: " + spielstandPC);
			} else if (a.g == false) {
				spielstandPC++;
				runde++;
				System.out.println("Computer gewinnt!");
				System.out.println("Spielstand: Spieler: " + spielstandMe + " Computer: " + spielstandPC);
			}
		}
		if (spielstandPC == 10) {
			System.out.println("Spielende: Computer hat gewonnen!");
		} else if (spielstandMe == 10) {
			System.out.println("Spielende: Du hast gewonnen!");
		}
	}

	String computerZufall() {
		Random computerZufallZahl = new Random();
		int computerZahl = computerZufallZahl.nextInt(4);
		if (computerZahl == 0) {
			computer = "Brunnen";
		} else if (computerZahl == 1) {
			computer = "Schere";
		} else if (computerZahl == 2) {
			computer = "Stein";
		} else if (computerZahl == 3) {
			computer = "Papier";
		}
		return computer;
	}

	void werGewinnt() {
		if (eingabe.equals("Brunnen") && computer.equals("Schere")
				|| eingabe.equals("Brunnen") && computer.equals("Stein")
				|| eingabe.equals("Schere") && computer.equals("Papier")
				|| eingabe.equals("Papier") && computer.equals("Stein")
				|| eingabe.equals("Stein") && computer.equals("Schere")
				|| eingabe.equals("Papier") && computer.equals("Brunnen")) {
			g = true;
		} else if (eingabe.equals("Schere") && computer.equals("Brunnen")
				|| eingabe.equals("Stein") && computer.equals("Brunnen")
				|| eingabe.equals("Papier") && computer.equals("Schere")
				|| eingabe.equals("Stein") && computer.equals("Papier")
				|| eingabe.equals("Schere") && computer.equals("Stein")
				|| eingabe.equals("Brunnen") && computer.equals("Papier")) {
			g = false;
		}
	}
}
