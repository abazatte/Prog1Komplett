package Bahnstation;

public class Lokomotive {
	int laenge;
	String name;
	int Typ;
	Wagen firstWagen;
	
	Lokomotive(int x, int y, String s){
		this.laenge = x;
		this.Typ = y;
		this.name = s;
	}
	
	protected Wagen getFirstWagen(){
		return firstWagen;
	}
	protected void setFirstWagen(Wagen x){
		firstWagen = x;
	}
}
