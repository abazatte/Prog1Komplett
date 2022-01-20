package Aufgabe91;

public class Lokomotive {
	private int laenge;
	private int typ;
	private Wagen first;

	public Lokomotive(int laenge, int typ) {
		this.laenge = laenge;
		this.typ = typ;

	}

	public void add(Wagen wagen) {
		Wagen l = first;
		if (first == null)
			first = wagen;
		else {
			while (l.getNext() != null) {
				l = l.getNext();
			}
			l.setNext(wagen);
		}
	}

	public void print() {
		Wagen l = first;
		System.out.println("Lokomotive: " + typ + " laenge = " + laenge);
		int i = 1;
		while (l != null) {
			System.out.println("  " + i + ". Wagen: laenge = " + l.getLaenge() + ", Kapazitaet " + l.getPassKapaz());
			l = l.getNext();
			i++;
		}
	}

	public int getPassengers() {
		int passengers = 0;
		Wagen l = first;
		while (l != null) {
			passengers += l.getPassKapaz();
			l = l.getNext();
		}
		return passengers;
	}

	public int getLength() {
		int length = this.laenge;
		Wagen l = first;
		while (l != null) {
			length += l.getLaenge();
			l = l.getNext();
		}
		return length;
	}

	public Wagen removeFirst() {
		if (first == null)
			return null;
		Wagen f = first;
		this.first = first.getNext();
		f.setNext(null); //
		return f;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public int getTyp() {
		return typ;
	}

	public void setTyp(int typ) {
		this.typ = typ;
	}

	public Wagen getFirst() {
		return first;
	}

	public void setFirst(Wagen first) {
		this.first = first;
	}
}
