
public class Main {
	public static void main (String [] args) {
	//default konstruktoren prüfen
	Fernseher Loewe = new Fernseher();
	System.out.println(Loewe.kanal);
	Radio BaustellenRadio = new Radio();
	System.out.println(BaustellenRadio.frequenz);
	
	//getter setter RundFunkEmpfangsGeraet prüfen
	System.out.println(Loewe.lautstaerke);
	Loewe.an();
	Loewe.lauter();
	System.out.println(Loewe.lautstaerke);
	Loewe.istAn();
	//Loewe.volume(IO.readInt());
	System.out.println(Loewe.lautstaerke);
	
	//methoden Radio und Fernseher
	BaustellenRadio.waehleSender(100.00);
	System.out.println(BaustellenRadio.frequenz);
	BaustellenRadio.eingeschaltet = true;
	BaustellenRadio.waehleSender(100.00);
	System.out.println(BaustellenRadio.frequenz);
	
	Loewe.waehleKanal(5);
	System.out.println(Loewe.kanal);
	Loewe.eingeschaltet = false;
	System.out.println(Loewe.kanal);
	}
}
