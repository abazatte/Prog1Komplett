public class mathetrainer {
	public static void main(String[] args) {
		System.out.println("Start des Mathetrainers!");
		int richtig = 0;
		while (richtig < 10) {
			if (frageBearbeiten() == true) {
				System.out.println("Richtig!");
				richtig++;
			} else {
				System.out.println("Leider falsch! Korrektes Ergebnis ist ");
			}
			System.out.println("Korrekte Antworten: " + richtig);
		}
		System.out.println("Ende des Mathetrainers!");
	}

	static boolean frageBearbeiten() {
		int a = generiereZahl();
		int b = generiereZahl();
		int ergebnis = 0;
		char operator = (char) generiereOperator();
		int d = IO.readInt(a + " " + operator + " " + b + " = ");
		if (operator == '*') {
			ergebnis = a * b;
		} else {
			ergebnis = a / b;
		}
		if (d == ergebnis) {
			return true;
		}
		return false;
	}

	static int generiereZahl() {
		int random = getRandomNumber(9);
		return random;
	}

	static int getRandomNumber(int max) {
		return new java.util.Random().nextInt(max + 1);
	}

	static char generiereOperator() {
		char operator = 0;
		double s = Math.random();
		if (s <= 0.5) {
			operator = '/';
		} else {
			operator = '*';
		}
		return operator;
	}
}
