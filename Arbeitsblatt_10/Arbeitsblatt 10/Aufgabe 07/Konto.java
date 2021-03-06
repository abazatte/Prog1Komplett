public class Konto implements Cloneable{
	int kontostand;
	int kredit;
	Konto(){
		this.kontostand = 0;
		this.kredit = 0;
	}
	Konto(Konto x){
		Konto a = new Konto();
		a.kontostand = x.kontostand;
		a.kredit = x.kredit;
	}
	public Konto klonier(){
		try {
			return (Konto) super.clone();
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
	public boolean werteGleich(Konto x, Konto y) {
		if(x.equals(y)) {
			return true;
		}
		else return false;
	}
	public static String kontoStandAusgeben(Konto x) {
		String a = String.valueOf(x.kontostand);
		return a;
	}
	public void einZahlung() {
		this.kontostand = this.kontostand + IO.readInt();
		if(this.kontostand>=10000) {
			this.kredit = 3000;
		}
	}
	public void abheben() {
		this.kontostand = this.kontostand - IO.readInt();
	}
	public int kontostandPrint() {
		return this.kontostand;
	}
	public static void Ueberweisung (Konto x, Konto y) {
		int Summe = IO.readInt();
		x.kontostand = x.kontostand + Summe;
		y.kontostand = y.kontostand - Summe;
	}
	
}
