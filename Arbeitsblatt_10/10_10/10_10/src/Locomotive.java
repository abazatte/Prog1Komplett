
public class Locomotive {
	private int length;
	private int type;
	private Car first;
	private String name;
	
	Locomotive(final int length, final int type, Car first, String name) {
		this.length = length;
		this.type = type;
		this.first = first;
		this.name = name;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public Car getFirst() {
		return first;
	}
	
	public void setFirst(Car first) {
		this.first = first;
	}



	@Override
	public String toString() {
		return "Locomotive " + this.name + ": Länge: " + this.length + "m, Typ: " + this.type;
	}
	
	
	
	
}
