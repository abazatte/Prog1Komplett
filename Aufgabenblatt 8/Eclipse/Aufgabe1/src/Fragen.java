
public class Fragen {
	private String[] frageListe;
	private String frage;

	public Fragen(int i) {
		setFrageListe(i);
		setFrage(i, getFrageListe());
	}

	public String[] getFrageListe() {
		return frageListe;
	}

	public void setFrageListe(int i) {
		this.frageListe = new String[i];
	}

	public String getFrage(int i) {
		return frageListe[i];
	}

	public void setFrage(int i, String[] frageliste) {
		for (int n = 1; n <= i; n++) {
			this.frage = IO.readString("Frage " + n + ": ");
			frageliste[n - 1] = frage;
		}
	}

}
