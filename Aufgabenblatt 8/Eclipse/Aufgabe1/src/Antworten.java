
public class Antworten {
	private int[] jaAntworten;
	private int[] neinAntworten;
	private double prozent;

	public Antworten(int i) {
		setJaListe(i);
		setNeinListe(i);
	}

	public void setJaListe(int i) {
		this.jaAntworten = new int[i];
	}

	public void setNeinListe(int i) {
		this.neinAntworten = new int[i];
	}

	public int getJaAntworten(int i) {
		return jaAntworten[i];
	}

	public void setJaAntworten(int i) {
		this.jaAntworten[i] = this.jaAntworten[i] + 1;
	}

	public int getNeinAntworten(int i) {
		return neinAntworten[i];
	}

	public void setNeinAntworten(int i) {
		this.neinAntworten[i] = this.neinAntworten[i] + 1;
	}

	public double getProzent() {
		return prozent;
	}

	public void setProzent(int ja, int nein, int i) {
		this.prozent = 100 / (ja + nein) * i;
	}
}
