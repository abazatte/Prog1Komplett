
public class Frage {

	private String frage;
	private int jaAntworten = 0;
	private int neinAntworten = 0;
	
	public Frage(String frage) {
		this.frage = frage;
	}
	
	public Frage getFrage(Frage frage) {
		return frage;
	}
	
	public void mitJaBeantwortet() {
		this.jaAntworten++;
	}
	
	public int getJaAntworten() {
		return jaAntworten;
	}
	
	public int getNeinAntworten() {
		return neinAntworten;
	}
	
	public double getProzentJa() {
		int gesamt = this.jaAntworten + this.neinAntworten;
		return 100 / (double)gesamt*this.jaAntworten;
	}
	
	public void mitNeinBeantwortet() {
		this.neinAntworten++;
	}
	
	public double getProzentNein() {
		int gesamt = this.jaAntworten + this.neinAntworten;
		return 100 / (double)gesamt*this.neinAntworten;
	}
	
    public String toString(){
        return this.frage;
    }
	
}
