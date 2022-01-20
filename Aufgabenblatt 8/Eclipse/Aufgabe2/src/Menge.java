public class Menge {
	public Person[] menge;

	public Menge() {
		this.menge = null;
	}

	public Menge(Menge m) {
		this.menge = m.menge;
	}

	public Person a() {
		Person p = new Person(IO.readString(), IO.readString());
		this.menge = new Person[1];
		this.menge[0] = null;

		return menge[0];

	}

	public boolean c() {
		this.menge = new Person[2];
		Person p1 = new Person(IO.readString(), IO.readString());
		this.menge[0] = p1;
		Person p2 = new Person(IO.readString(), IO.readString());
		this.menge[1] = p2;
		return (menge[0].vorname + menge[0].nachname).equals(menge[1].vorname + menge[1].nachname);

	}

	public void d() {
		this.menge = new Person[2];
		Person p1 = new Person(IO.readString(), IO.readString());
		this.menge[0] = p1;
		Person p2 = new Person(IO.readString(), IO.readString());
		for (int v = 0; v < 1; v++) {
			System.out.println(menge[v].vorname + menge[v].nachname);
		}

		int next = 1;
		if (next <= menge.length - 1) {
			menge[next] = p2;
			next++;
		}

		for (int v = 0; v < 2; v++) {
			System.out.println(menge[v].vorname + menge[v].nachname);
		}
	}

	public void e() {
		// Schritt 1: Person finden
		this.menge = new Person[2];
		Person p1 = new Person(IO.readString(), IO.readString());
		this.menge[0] = p1;
		Person p2 = new Person(IO.readString(), IO.readString());
		this.menge[1] = p2;
		int next = 0;
		for (int v = 0; v <= 1; v++) {
			System.out.println(menge[v].vorname + menge[v].nachname);
		}

		Person gesuchtePerson = suchePerson(IO.readString(), IO.readString());
		if (gesuchtePerson != null) {
			// Schritt 2: Referenz ause dem Array nehmen
			int pos = suchePosition(gesuchtePerson);
			menge[pos] = menge[next - 1];
			// Schritt 3: next runter
			next--;
		}

		for (int v = 0; v < 1; v++) {
			System.out.println(menge[v].vorname + menge[v].nachname);
		}
	}

	public int suchePosition(Person s) {
		for (int i = 0; i < menge.length; i++) {
			if (menge[i] == s) {
				return i;
			}
		}
		return -1;

	}

	public Person suchePerson(String name, String vorname) {

		for (Person s : menge) {

			if ((s.getVorname() + s.getNachname()).equals(name)) {
				return s;
			}
		}
		int next = 0;
		for (int i = 0; i < next; i++) {

			if ((menge[i].getVorname() + menge[i].getNachname()).equals(name)) {
				return menge[i];
			}
		}

		return null;
	}

	public boolean f(String name, String vorname) {
		this.menge = new Person[2];
		Person p1 = new Person(IO.readString(), IO.readString());
		this.menge[0] = p1;
		Person p2 = new Person(IO.readString(), IO.readString());
		this.menge[1] = p2;

		int next = 2;
		for (int i = 0; i < next; i++) {

			if ((menge[i].vorname + menge[i].nachname).equals(vorname + name)) {
				return true;
			}
		}
		return false;
	}

	public String g() {
		Person[] m1 = new Person[2];
		Person[] m2 = new Person[2];
		Person p1 = new Person(IO.readString(), IO.readString());
		m1[0] = p1;
		Person p2 = new Person(IO.readString(), IO.readString());
		m1[1] = p2;

		Person p3 = new Person(IO.readString(), IO.readString());
		m2[0] = p3;
		Person p4 = new Person(IO.readString(), IO.readString());
		m2[1] = p4;

		int next = 2;
		for (int i = 0; i < next; i++) {
			for (int n = 0; n < m2.length; n++) {
				if ((m1[i].vorname + m1[i].nachname).equals((m2[n].vorname + m2[n].nachname))) {
					return m1[i].vorname + " " + m1[i].nachname + " = Schnittmenge";
				}

			}
		}
		return "keine Schnittmengen";

	}

	public void h() {
		int x = 2;
		int y = 2;
		Person[] m1 = new Person[x];
		Person[] m2 = new Person[y];
		Person p1 = new Person(IO.readString(), IO.readString());
		m1[0] = p1;
		Person p2 = new Person(IO.readString(), IO.readString());
		m1[1] = p2;

		Person p3 = new Person(IO.readString(), IO.readString());
		m2[0] = p3;
		Person p4 = new Person(IO.readString(), IO.readString());
		m2[1] = p4;

		int z = x + y;
		Person[] m3 = new Person[z];

		m3[0] = m1[0];
		// m3[0].nachname = m1[0].nachname;

		m3[1] = m1[1];
		// m3[1].nachname = m1[1].nachname;

		m3[2] = m2[0];
		// m3[2].nachname = m2[0].nachname;

		m3[3] = m2[1];
		// m3[3].nachname = m2[1].nachname;

		for (int v = 0; v < 4; v++) {
			System.out.println(m3[v].vorname + m3[v].nachname);
		}
	}

	public void i() {
		Person[] m1 = new Person[2];
		Person[] m2 = new Person[2];
		Person p1 = new Person(IO.readString(), IO.readString());
		m1[0] = p1;
		Person p2 = new Person(IO.readString(), IO.readString());
		m1[1] = p2;

		Person p3 = new Person(IO.readString(), IO.readString());
		m2[0] = p3;
		Person p4 = new Person(IO.readString(), IO.readString());
		m2[1] = p4;

		Person[] m3 = new Person[4];

		if (!((m1[0].vorname + m1[0].nachname).equals((m2[0].vorname + m2[0].nachname)))) {
			m3[0] = m1[0];
			System.out.println(m3[0].vorname + " " + m3[0].nachname);

			if (!((m1[1].vorname + m1[1].nachname).equals((m2[0].vorname + m2[0].nachname)))) {
				m3[1] = m1[1];
				System.out.println(m3[1].vorname + " " + m3[1].nachname);

				if (!((m1[0].vorname + m1[0].nachname).equals((m2[1].vorname + m2[1].nachname)))) {
					m3[2] = m2[0];
					System.out.println(m3[2].vorname + " " + m3[2].nachname);

					if (!((m1[1].vorname + m1[1].nachname).equals((m2[1].vorname + m2[1].nachname)))) {
						m3[3] = m2[1];
						System.out.println(m3[3].vorname + " " + m3[3].nachname);
					}
				}
			}
		}
	}

	public Person[] getMenge() {
		return menge;
	}

	public void setMenge(Person[] menge) {
		this.menge = menge;
	}

}
