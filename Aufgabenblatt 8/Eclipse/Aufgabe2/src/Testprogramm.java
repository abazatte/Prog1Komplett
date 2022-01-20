
public class Testprogramm {
	public static void main(String[] args) {
		Menge a = new Menge();
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
			System.out.println(a.a());
			break;
		case 'b':
			Menge m = new Menge();
			System.out.println(m);
			Menge m1 = new Menge(m);
			System.out.println(m1);
			break;
		case 'c':
			System.out.println(a.c());
			break;
		case 'd':
			a.d();
			break;
		case 'e':
			a.e();
			break;
		case 'f':
			System.out.println(a.f(IO.readString(), IO.readString()));
			break;
		case 'g':
			System.out.println(a.g());
			break;
		case 'h':
			a.h();
			break;
		case 'i':
			a.i();
			break;
		}
	}
}