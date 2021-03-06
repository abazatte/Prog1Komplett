
public class Menge {
	Person personen[];
	int anzahlPersonen = 0;
	private int maxPersonen = 0;

	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}

	Menge(int maxPersonen) {
		personen = new Person[maxPersonen];
		for (int i = 0; i < maxPersonen; i++) {
			personen[i] = null;
		}
		this.maxPersonen = maxPersonen;
	}

	Menge(Menge mengeOrg) {
		this.anzahlPersonen = mengeOrg.anzahlPersonen;
		this.maxPersonen = mengeOrg.maxPersonen;
		personen = new Person[mengeOrg.maxPersonen];
		int i = 0;
		for (i = 0; i < mengeOrg.anzahlPersonen; i++) {
			this.personen[i] = mengeOrg.personen[i];
		}
		while (i < this.maxPersonen) {
			this.personen[i++] = null;
		}
	}

	public boolean suchePerson(Person person) {
		for (int i = 0; i < this.anzahlPersonen; i++) {
			if (this.personen[i].equals(person))
				return true;
		}
		return false;
	}

	public boolean mengeGleich(Menge vergleichsMenge) {
		if (this.anzahlPersonen != vergleichsMenge.anzahlPersonen)
			return false;
		for (int i = 0; i < this.anzahlPersonen; i++) {
			if (!((vergleichsMenge.suchePerson(this.personen[i])))) {
				return false;
			}
		}
		return true;
	}

	public boolean personHinzu(Person person) {
		if (this.suchePerson(person)) {
			return false;
		}
		if (this.anzahlPersonen < this.maxPersonen) {
			personen[this.anzahlPersonen] = person;
			this.anzahlPersonen++;
			return true;
		}
		return false;

	}

	public boolean personEntf(Person person) {
		int i = 0;
		for (i = 0; i < this.anzahlPersonen; i++) {
			if (this.personen[i].nachName.equals(person.nachName))
				if (this.personen[i].vorName.equals(person.vorName))
					break;
		}
		if (i < this.anzahlPersonen) {
			this.personen[i] = null;
			this.anzahlPersonen--;
			while (i < this.anzahlPersonen) {
				this.personen[i] = this.personen[i + 1];
				i++;
			}
			return true;
		}
		return false;
	}

	public Menge schnittMenge(Menge m2) {
		Menge m1und2 = new Menge(this.maxPersonen);
		for (int i = 0; i < this.anzahlPersonen; i++) {
			if (m2.suchePerson(this.personen[i])) {
				m1und2.personHinzu(this.personen[i]);
			}
		}
		return m1und2;
	}

	public Menge vereinigeMengen(Menge m2) {
		Menge m1oder2 = new Menge(m2);
		for (int i = 0; i < this.anzahlPersonen; i++) {
			if (!(m2.suchePerson(this.personen[i]))) {
				m1oder2.personHinzu(this.personen[i]);
			}
		}
		return m1oder2;
	}

	public Menge diffMenge(Menge m2) {
		Menge m1diff2 = new Menge(this.anzahlPersonen);
		for (int i = 0; i < this.anzahlPersonen; i++) {
			if (!(m2.suchePerson(this.personen[i]))) {
				m1diff2.personHinzu(this.personen[i]);
			}
		}
		for (int i = 0; i < m2.anzahlPersonen; i++) {
			if (!(this.suchePerson(m2.personen[i]))) {
				m1diff2.personHinzu(m2.personen[i]);
			}
		}
		return m1diff2;
	}
}
