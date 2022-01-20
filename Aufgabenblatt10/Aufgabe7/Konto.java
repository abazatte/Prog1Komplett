public class Konto {
	int kontostand;
	int kredit;

	Konto() {
		this.kontostand = 0;
		this.kredit = 0;
	}

	Konto(Konto x) {
		this.kontostand = x.kontostand;
		this.kredit = x.kredit;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Konto(this);
	}

//	public Konto klonen() {
//		try {
//			return (Konto) super.clone();
//		} catch (CloneNotSupportedException e) {
//			throw new InternalError();
//		}
//	}

	public boolean werteGleich(Konto x, Konto y) {
		if (x.equals(y)) {
			return true;
		} else {
			return false;
		}
	}

	public static int kontoStand(Konto x) {
		return x.kontostand;
	}

	public void einzahlung() {
		this.kontostand = this.kontostand + IO.readInt("Wie viel soll eingezahlt werden? ");
		if (this.kontostand >= 10000) {
			this.kredit = 3000;
		}
	}

	public void abheben() {
		this.kontostand = this.kontostand - IO.readInt("Wie viel soll abgehoben werden? ");
	}

	public int kontostandPrint() {
		return this.kontostand;
	}

	public static void Ueberweisung(Konto x, Konto y) {
		int Summe = IO.readInt("Wie viel soll überwiesen werden? ");
		x.kontostand = x.kontostand + Summe;
		y.kontostand = y.kontostand - Summe;
	}
}
