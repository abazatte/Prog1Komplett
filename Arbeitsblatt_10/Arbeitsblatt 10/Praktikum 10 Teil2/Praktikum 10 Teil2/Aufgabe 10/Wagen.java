package Aufgabe91;

public class Wagen {
	private int laenge;
	private int passKapaz;
	private Wagen next;

	public Wagen(int laenge, int passKapaz) {
		this.laenge = laenge;
		this.passKapaz = passKapaz;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public int getPassKapaz() {
		return passKapaz;
	}

	public void setPassKapaz(int passKapaz) {
		this.passKapaz = passKapaz;
	}

	public Wagen getNext() {
		return next;
	}

	public void setNext(Wagen next) {
		this.next = next;
	}

}
