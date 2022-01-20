
public class Produkt {
	String name;
	Integer produktnummer;
	double preis;

	Produkt() {
		this.name = "No Product";
		this.produktnummer = 0000;
		this.preis = 0.0;
	}

	Produkt(String n, Integer i, double d) {
		this.name = n;
		this.produktnummer = i;
		this.preis = d;
	}
	
	Produkt(String n, Integer i) {
		this.name = n;
		this.produktnummer = i;
	}

	Produkt(String n, double d) {
		this.name = n;
		this.preis = d;
	}

	Produkt(Integer i, double d) {
		this.produktnummer = i;
		this.preis = d;
	}

	Produkt(String n) {
		this.name = n;
	}

	Produkt(Integer i) {
		this.produktnummer = i;
	}

	Produkt(double d) {
		this.preis = d;
	}
	void ausgabe(Produkt p) {
		System.out.println(p.name + " " + p.produktnummer + " " + p.preis);
	}
}
