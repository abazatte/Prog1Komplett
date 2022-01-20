package Bahnstation;

public class Wagen {
	int laenge;
	int passagierKapazitaet;
	Wagen naechsterWagen;
	
	Wagen(){
		
	}
	Wagen(int x, int y){
		this.laenge = x;
		this.passagierKapazitaet = y;
	}
	Wagen(Wagen x){
		this.laenge = x.laenge;
		this.passagierKapazitaet = x.passagierKapazitaet;
		this.naechsterWagen = x.naechsterWagen;
	}
	public void wagenKopieren(Wagen x) {
		this.laenge = x.laenge;
		this.naechsterWagen = x.naechsterWagen;
		this.passagierKapazitaet = x.passagierKapazitaet;
	}
	protected Wagen getNaechsterWagen() {
		return this.naechsterWagen;
	}
	protected void setNaechsterWagen(Wagen x) {
		this.naechsterWagen = x;
	}
}
