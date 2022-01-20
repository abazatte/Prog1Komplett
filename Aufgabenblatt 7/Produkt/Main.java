
public class Main {
	public static void main(String[] args) {
		Produkt p1 = new Produkt();
		p1.ausgabe(p1);
		Produkt p2 = new Produkt("Handyh�lle", 1542, 10.99);
		p2.ausgabe(p2);
		Produkt p3 = new Produkt("Handyh�lle", (Integer) 1543);
		p3.ausgabe(p3);
		Produkt p4 = new Produkt("Handyh�lle", 10.89);
		p4.ausgabe(p4);
		Produkt p5 = new Produkt(1544, 10.79);
		p5.ausgabe(p5);
		Produkt p6 = new Produkt("Handyh�lle");
		p6.ausgabe(p6);
		Produkt p7 = new Produkt((Integer) 1545);
		p7.ausgabe(p7);
		Produkt p8 = new Produkt(10.69);
		p8.ausgabe(p8);
	}
}
// b) keine weiteren Konstruktoren, da keine weiteren 
//	  M�glichkeiten existieren.
// c) maximal 4, da alle vom Typ Integer sind und das 
//	  Programm somit nicht wei�, wohin es hinspringen muss.