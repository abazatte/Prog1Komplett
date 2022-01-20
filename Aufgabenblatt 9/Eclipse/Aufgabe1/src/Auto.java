
public class Auto {

	int x;
	int y;
	int groesse;
	String richtung;

	public Auto(int x, int y, String richtung, int groesse) {
		super();
		this.x = x;
		this.y = y;
		this.groesse = groesse;
		this.richtung = richtung;
	}

	public void bewegeRunter() {
		this.x++;
	}

	public void bewegeHoch() {
		this.x--;
	}

	public void bewegeRechts() {
		this.y++;
	}

	public void bewegeLinls() {
		this.y--;
	}

	public boolean isHorizontal() {
		return richtung.equals("h");
	}

	public boolean isVertikal() {
		return richtung.equals("v");
	}

	public Auto klonen() {
		return new Auto(this.x, this.y, this.richtung, this.groesse);
	}
}