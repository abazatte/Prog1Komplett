
public class Train {
	
	private String name;
	private Locomotive loco;
	
	Train(Locomotive loco, String name) {
		this.loco = loco;
		this.name = name;
	}

	//hängt in diesen Zug einen gegebenen Wagen ein
	void add(Car car) {
			//hat die Lokomotive noch keinen Wagen, wird der Wagen zu first
		if(this.loco.getFirst() == null) {
			this.loco.setFirst(car);
		}
			//Läuft alle Wagen durch, bis am Ende angekommen und hängt neuen Wagen ans Ende 
		else {
			Car current = this.loco.getFirst();
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(car);
			current.getNext().setNext(null);
		}
	}

	
		//gibt eine Liste dieses Zuges mit allen Bestandteilen aus
	void print() {
		System.out.println("Zug: " + this.name);
		System.out.println(this.loco);
        Car current = this.loco.getFirst(); 
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
	}
	
		//liefert die Summe der Passagierkapazität aller Wagen
	int getPassengers() {
		Car current = this.loco.getFirst();
		int tmp = 0;
		while (current != null) {
			tmp = tmp + current.getPassagierkapazitaet();
			current = current.getNext();
		}
		return tmp;
	}
	
		//liefert die Summe der Längen aller Wagen
	int getLength() {
		Car current = this.loco.getFirst();
		int tmp = this.loco.getLength();
		while (current != null) {
			tmp = tmp + current.getLength();
			current = current.getNext();
		}
		return tmp;
	}
	
		//hängt den ersten Wagen aus diesem Zug aus und liefert den ausgehängten
		//Wagen als Ergebnis zurück. Die restlichen Wagen rücken nach vorne. Falls es keinen Wagen
		//gibt, ist das Ergebnis null
	Car removeFirst() {
		if(this.loco.getFirst() == null) {		//Wenn es keinen Wagen gibt, null zurückgeben
			return null;
		}
		if(this.loco.getFirst().getNext() == null) {		//Wenn es nur einen Wagen gibt, den Wagen ausgeben und first auf null setzen
			Car ausgabe = this.loco.getFirst();
			this.loco.setFirst(null);
			return ausgabe;
		}
		else {
			Car ausgabe = this.loco.getFirst();				//Bei mindestens zwei Wagen wird first ausgegeben, mit next überschrieben und 
			Car newFirst = this.loco.getFirst().getNext();  //alle Wagen rücken eine Stelle nach vorne
			this.loco.setFirst(newFirst);
		
			return ausgabe;
		}
		
	}
	
		//akzeptiert als Parameter einen anderen Zug und hängt alle Wagen des anderen Zuges
		//in der gleichen Reihenfolge an diesen Zug an. Im anderen Zug bleibt nur die Lokomotive zurück
	void relink(Train train) {
		Car current = this.loco.getFirst(); // Erster Wagen dieses Zuges
		Car tmp = train.loco.getFirst(); //Erster Wagen des anderen Zuges
		if(current == null) {
			this.loco.setFirst(tmp);
		}
		else {
			while (current.getNext() != null) {		//Solange der nächste Wagen dieses Zuges nicht null ist
				current = current.getNext();	//wird der aktuelle Wagen zum nächsten Wagen -> Schleife durch alle Wagen, bis beim letzten angekommen
			}
			current.setNext(tmp); 			//Sobald beim letzten Wagen angekommen, wird der nächste Wagen zum ersten des anderen Zuges
		}
		
		train.loco.setFirst(null);
	}
	
		
		//dreht die Abfolge der Wagen in diesem Zug um

	void revert() {
		Locomotive loco = new Locomotive(0, 0, null, "TempLoco");	//Lokomotive zum Tauschen
		Train temp = new Train(loco, "TempZug");	//Zug zum Tauschen
		Car current = this.loco.getFirst(); 		//Der erste Wagen des eigentlichen Zuges
		
		while(this.loco.getFirst().getNext() != null) {
			
			current = this.loco.getFirst();			//Erster Zug des eigentlichen Zuges
			while (current.getNext() != null) {		//Solange der nächste Wagen dieses Zuges nicht null ist
				current = current.getNext();		//wird current zum nächsten Wagen -> Schleife durch alle Wagen, bis beim letzten angekommen
			}
			
			temp.add(current);						//Der letzte Wagen wird temp hinzugefügt
			current = this.loco.getFirst();			//current wird wieder zum ersten Wagen, der immer noch alle nexts gespeichert hat
			
			while (current.getNext().getNext() != null) {		//Um den letzten Wagen zu entfernen, mit einer Schleife zum vorletzten Wagen gehen
				current = current.getNext();					
			}
			current.setNext(null);								//Und den nächsten mit null überschreiben
		}														//Wiederholen, bis nur noch ein Wagen im Zug übrig ist
		
		temp.add(this.removeFirst());							//Mit removeFirst den ersten Wagen aushängen und temp anhängen
		
		
		this.relink(temp); 										//Mit relink wieder an den ursprüglichen Zug 
		
	}

}
