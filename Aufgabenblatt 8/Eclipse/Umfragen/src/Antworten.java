
public class Antworten {
	public int teilnehmer;
	public int ja;
	public int nein;
	public String frage;

	public int getJa() {
		return ja;
	}

	public void setJa(int ja) {
		this.ja = ja;
	}

	public int getNein() {
		return nein;
	}

	public void setNein(int nein) {
		this.nein = nein;
	}

	public String getFrage() {
		return frage;
	}

	public void setFrage(String frage2) {
		this.frage = frage2;
	}

	public int getTeilnehmer() {
		return teilnehmer;
	}

	public void setTeilnehmer(int teilnehmer) {
		this.teilnehmer = teilnehmer;
	}

	public double teilenja(int i) {
		return this.ja = this.ja / 2;
	}

	public double teilennein(int i) {
		return this.nein = this.nein / 2;
	}

	public double prozent(int i) {
		int gesamt = this.getJa() + this.getNein();
		return i / gesamt * 100;
	}

}
