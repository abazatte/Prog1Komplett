
public class Wagen {
	private int length;
	private int passengers;
	private Wagen next;
	private String name;
	
	Wagen(final int length, final int passengers, Wagen next, String name) {
		this.length = length;
		this.passengers = passengers;
		this.next = next;
		this.name = name;
	}


	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getPassagierkapazitaet() {
		return passengers;
	}
	
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public Wagen getNext() {
		return next;
	}
	
	public void setNext(Wagen next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "" + this.name + ": Laenge: " + this.length + "m, Passagierkapazitaet: " + this.passengers;
	}
	
}
