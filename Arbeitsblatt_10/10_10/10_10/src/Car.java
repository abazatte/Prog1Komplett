
public class Car {
	private int length;
	private int passengers;
	private Car next;
	private String name;
	
	Car(final int length, final int passengers, Car next, String name) {
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
	
	public Car getNext() {
		return next;
	}
	
	public void setNext(Car next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "" + this.name + ": Länge: " + this.length + "m, Passagierkapazität: " + this.passengers;
	}
	
}
