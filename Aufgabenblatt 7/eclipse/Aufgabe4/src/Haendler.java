
public class Haendler {
	double preis;
	double einnamen;

	public Haendler(double preis) {
		this.preis = preis;
	}

	public void kaufen(int anzahl) {
		this.einnamen += this.preis * anzahl;
	}

	public double liefereEinnahmen() {
		return einnamen;
	}
}
