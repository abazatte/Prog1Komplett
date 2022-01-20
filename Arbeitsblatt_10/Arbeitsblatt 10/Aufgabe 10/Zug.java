package Bahnstation;

public class Zug {
	Lokomotive Maschine;
	String Name;

	Zug(Lokomotive x, String s) {
		this.Maschine = x;
		this.Name = s;
	}

	protected void addWagen(Wagen x) {
		boolean letzterWagen = true;
		if (this.Maschine.firstWagen == null) {
			this.Maschine.firstWagen = x;
		} else {
			Wagen y = new Wagen(this.Maschine.firstWagen);
			while (letzterWagen == true) {
				if (this.Maschine.firstWagen.naechsterWagen == null) {
					this.Maschine.firstWagen.setNaechsterWagen(x);
					letzterWagen = false;
				} else {
					if (y.naechsterWagen != null)
						if (y.naechsterWagen.getNaechsterWagen() == null) {
							y.naechsterWagen.setNaechsterWagen(x);
							letzterWagen = false;
						} else {
							y.wagenKopieren(y.getNaechsterWagen());
						}
				}
			}
		}
	}

	protected void printZug() {
		String st = String.valueOf(this.Name);
		boolean letzterWagen = false;
		int i = 1;
		String s = String.valueOf(this.Maschine.name);
		System.out.println("Zug Name: " + st);
		System.out.println();
		System.out.println("Typ Lokomotive: " + s);
		Wagen x = new Wagen(this.Maschine.firstWagen);
		while (letzterWagen == false) {
			System.out.println("Wagen " + i);
			System.out.println("Laenge: " + x.laenge + "\nPassagierkapazitaet: " + x.passagierKapazitaet);
			System.out.println();
			if (x.getNaechsterWagen() == null) {
				letzterWagen = true;
			}
			if (x.getNaechsterWagen() != null) {
				x.wagenKopieren(x.getNaechsterWagen());
			}
			i++;
		}
	}

	protected int getZugKapazitaet() {
		boolean letzterWagen = false;
		int passagierKapazitaet = 0;
		Wagen wagen = new Wagen(this.Maschine.firstWagen);

		while (letzterWagen == false) {
			if (wagen.getNaechsterWagen() == null) {
				letzterWagen = true;
				passagierKapazitaet = passagierKapazitaet + wagen.passagierKapazitaet;
			}
			else {
			passagierKapazitaet = passagierKapazitaet + wagen.passagierKapazitaet;
			wagen.wagenKopieren(wagen.naechsterWagen);
			}
		}
		return passagierKapazitaet;
	}

	protected int getZugLaenge(Zug x) {
		boolean letzterWagen = false;
		boolean lokomotive = false;
		int zugLaenge = 0;
		Wagen wagen = new Wagen(x.Maschine.firstWagen);

		while (letzterWagen == false) {
			if (lokomotive == false) {
				zugLaenge = zugLaenge + x.Maschine.laenge;
				lokomotive = true;
			}

			if (wagen.naechsterWagen == null) {
				letzterWagen = true;
				zugLaenge = zugLaenge + wagen.laenge;
			}
			else {
			zugLaenge = zugLaenge + wagen.laenge;
			wagen.wagenKopieren(wagen.getNaechsterWagen());
			}
		}
		return zugLaenge;
	}

	protected Wagen removeFirst(Zug x) {
		Wagen y = new Wagen(x.Maschine.firstWagen);
		x.Maschine.firstWagen.wagenKopieren(x.Maschine.firstWagen.naechsterWagen);
		return y;
	}

	protected static void relink(Zug x, Zug y) {
		x.addWagen(y.Maschine.firstWagen);
	}
}
