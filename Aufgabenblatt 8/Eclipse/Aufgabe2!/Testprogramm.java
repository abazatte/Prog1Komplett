
public class Testprogramm {

	static int maxPers = 50;
	static Person person1 = new Person("Hans", "Meyer");
	static Person person2 = new Person("Max", "Mustermann");
	static Person person3 = new Person("Marissa", "Musterfrau");

	public static void main(String[] args) {
		System.out.println("(a) Leere Menge");
		System.out.println("(b) Copy Konstruktor");
		System.out.println("(c) Gleichheit");
		System.out.println("(d) Hinzufügen");
		System.out.println("(e) Entfernen");
		System.out.println("(f) ist vorhanden?");
		System.out.println("(g) Schnittmenge");
		System.out.println("(h) Vereiniung");
		System.out.println("(i) Differenz");
		char aufgabe = IO.readChar();
		switch (aufgabe) {
		case 'a':
			Menge ma0 = new Menge(maxPers);
			System.out.println("Wie viele sind in der Menge? " + ma0.getAnzahlPersonen());
			break;
		case 'b':
			Menge mb0 = new Menge(maxPers);
			mb0.personHinzu(person1);
			mb0.personHinzu(person2);
			System.out.println(mb0.personen[0].vorName + " " + mb0.personen[0].nachName);
			System.out.println(mb0.personen[1].vorName + " " + mb0.personen[1].nachName);
			System.out.println("Personen in der ersten Menge: " + mb0.getAnzahlPersonen());
			Menge mb1 = new Menge(mb0);
			System.out.println(mb1.personen[0].vorName + " " + mb1.personen[0].nachName);
			System.out.println(mb1.personen[1].vorName + " " + mb1.personen[1].nachName);
			System.out.println("Personen in der zweiten Menge: " + mb1.getAnzahlPersonen());
			break;
		case 'c':
			Menge mc0 = new Menge(maxPers);
			mc0.personHinzu(person1);
			mc0.personHinzu(person2);
			System.out.println(mc0.personen[0].vorName + " " + mc0.personen[0].nachName);
			System.out.println(mc0.personen[1].vorName + " " + mc0.personen[1].nachName);
			System.out.println("Personen in der ersten Menge: " + mc0.getAnzahlPersonen());
			Menge mc1 = new Menge(mc0);
			System.out.println(mc1.personen[0].vorName + " " + mc1.personen[0].nachName);
			System.out.println(mc1.personen[1].vorName + " " + mc1.personen[1].nachName);
			System.out.println("Personen in der zweiten Menge: " + mc1.getAnzahlPersonen());
			boolean gleich = mc0.mengeGleich(mc1);
			System.out.println("Sind die beiden Mengen gleich? " + gleich);
			break;
		case 'd':
			Menge md0 = new Menge(maxPers);
			md0.personHinzu(person1);
			md0.personHinzu(person2);
			System.out.println(md0.personen[0].vorName + " " + md0.personen[0].nachName);
			System.out.println(md0.personen[1].vorName + " " + md0.personen[1].nachName);
			System.out.println("Personen in der Menge: " + md0.getAnzahlPersonen());
			md0.personHinzu(person3);
			System.out.println(md0.personen[0].vorName + " " + md0.personen[0].nachName);
			System.out.println(md0.personen[1].vorName + " " + md0.personen[1].nachName);
			System.out.println(md0.personen[2].vorName + " " + md0.personen[2].nachName);
			System.out.println("Personen in der Menge: " + md0.getAnzahlPersonen());
			break;
		case 'e':
			Menge me0 = new Menge(maxPers);
			me0.personHinzu(person1);
			me0.personHinzu(person2);
			me0.personHinzu(person3);
			System.out.println(me0.personen[0].vorName + " " + me0.personen[0].nachName);
			System.out.println(me0.personen[1].vorName + " " + me0.personen[1].nachName);
			System.out.println(me0.personen[2].vorName + " " + me0.personen[2].nachName);
			System.out.println("Personen in der Menge: " + me0.getAnzahlPersonen());
			me0.personEntf(person2);
			System.out.println(me0.personen[0].vorName + " " + me0.personen[0].nachName);
			System.out.println(me0.personen[1].vorName + " " + me0.personen[1].nachName);
			System.out.println("Personen in der Menge: " + me0.getAnzahlPersonen());
			break;
		case 'f':
			Menge mf0 = new Menge(maxPers);
			mf0.personHinzu(person1);
			mf0.personHinzu(person2);
			mf0.personHinzu(person3);
			mf0.personEntf(person2);
			System.out.println(mf0.personen[0].vorName + " " + mf0.personen[0].nachName);
			System.out.println(mf0.personen[1].vorName + " " + mf0.personen[1].nachName);
			System.out.println("Personen in der Menge: " + mf0.getAnzahlPersonen());
			boolean suchePerson1 = mf0.suchePerson(person2);
			boolean suchePerson2 = mf0.suchePerson(person3);
			System.out.println("Ist Max in der Menge? " + suchePerson1);
			System.out.println("Ist Marissa in der Menge? " + suchePerson2);
			break;
		case 'g':
			Menge mg0 = new Menge(maxPers);
			mg0.personHinzu(person1);
			mg0.personHinzu(person2);
			System.out.println(mg0.personen[0].vorName + " " + mg0.personen[0].nachName);
			System.out.println(mg0.personen[1].vorName + " " + mg0.personen[1].nachName + "\n-------");
			Menge mg1 = new Menge(maxPers);
			mg1.personHinzu(person2);
			mg1.personHinzu(person3);
			System.out.println(mg1.personen[0].vorName + " " + mg1.personen[0].nachName);
			System.out.println(mg1.personen[1].vorName + " " + mg1.personen[1].nachName);
			Menge mg2 = mg0.schnittMenge(mg1);
			System.out.println("Anzahl der Personen in der Schnittmenge: " + mg2.getAnzahlPersonen());
			System.out.println(mg2.personen[0].vorName + " " + mg2.personen[0].nachName);	
			break;
		case 'h':
			Menge mh0 = new Menge(maxPers);
			mh0.personHinzu(person1);
			System.out.println(mh0.personen[0].vorName + " " + mh0.personen[0].nachName + "\n-------");
			Menge mh1 = new Menge(maxPers);
			mh1.personHinzu(person2);
			mh1.personHinzu(person3);
			System.out.println(mh1.personen[0].vorName + " " + mh1.personen[0].nachName);
			System.out.println(mh1.personen[1].vorName + " " + mh1.personen[1].nachName);
			Menge mh2 = mh0.vereinigeMengen(mh1);
			System.out.println("Anzahl der Personen in der ersten Menge: " + mh0.getAnzahlPersonen());
			System.out.println("Anzahl der Personen in der zweiten Menge: " + mh1.getAnzahlPersonen());
			System.out.println(mh2.personen[0].vorName + " " + mh2.personen[0].nachName);
			System.out.println(mh2.personen[1].vorName + " " + mh2.personen[1].nachName);
			System.out.println(mh2.personen[2].vorName + " " + mh2.personen[2].nachName);
			System.out.println("Vereinigte Anzahl: " + mh2.getAnzahlPersonen());
			break;
		case 'i':
			Menge mi0 = new Menge(maxPers);
			mi0.personHinzu(person1);
			mi0.personHinzu(person2);
			System.out.println(mi0.personen[0].vorName + " " + mi0.personen[0].nachName);
			System.out.println(mi0.personen[1].vorName + " " + mi0.personen[1].nachName + "\n-------");
			Menge mi1 = new Menge(maxPers);
			mi1.personHinzu(person2);
			mi1.personHinzu(person3);
			System.out.println(mi1.personen[0].vorName + " " + mi1.personen[0].nachName);
			System.out.println(mi1.personen[1].vorName + " " + mi1.personen[1].nachName);
			Menge mi2 = mi0.diffMenge(mi1);
			System.out.println("Anzahl der Personen in der Differenzmenge: " + mi2.getAnzahlPersonen());
			System.out.println(mi2.personen[0].vorName + " " + mi2.personen[0].nachName);
			System.out.println(mi2.personen[1].vorName + " " + mi2.personen[1].nachName);
			break;
		}
	}
}
