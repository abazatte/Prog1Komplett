package Aufgabe91;

import java.util.ArrayList;

public class Train {
	private Lokomotive lokomotive;

	public Train(Lokomotive lokomotive) {
		this.lokomotive = lokomotive;
	}

	public void add(Wagen wagen) {
		lokomotive.add(wagen);
	}

	public void print() {
		lokomotive.print();
	}

	public void relink(Train train) {
		lokomotive.add(train.getLokomotive().getFirst());
		train.lokomotive.setFirst(null);
	}

	public void revert() {

		ArrayList<Wagen> list = new ArrayList<Wagen>();
		Wagen wagen = this.lokomotive.getFirst();
		while (wagen != null) {
			list.add(wagen);
			wagen = wagen.getNext();
		}
		Wagen w = this.lokomotive.getFirst();
		for (int i = list.size() - 1; i >= 0; i--) {
			w.setNext(list.get(i));
			w = w.getNext();
		}
		w.setNext(null);
		lokomotive.setFirst(list.get(list.size() - 1));
	}

	public Lokomotive getLokomotive() {
		return lokomotive;
	}

	public void setLokomotive(Lokomotive lokomotive) {
		this.lokomotive = lokomotive;
	}

}
