
public class Lokomotive {
	private int length;
	private int type;
	private Wagen first;
	private String name;
	
	Lokomotive(final int length, final int type, Wagen first, String name) {
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
	
	public Wagen getFirst() {
		return first;
	}
	
	public void setFirst(Wagen first) {
		this.first = first;
	}



	@Override
	public String toString() {
		return "Locomotive " + this.name + ": Laenge: " + this.length + "m, Typ: " + this.type;
	}
	
	
	
	
}
