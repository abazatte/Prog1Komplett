
public class Person {

	String vorName;
	String nachName;

	Person(String vorName, String nachName) {
		this.vorName = vorName;
		this.nachName = nachName;
	}

	public String getVorName() {
		return vorName;
	}

	public void setVorName(String vorName) {
		this.vorName = vorName;
	}

	public String getNachName() {
		return nachName;
	}

	public void setNachName(String nachName) {
		this.nachName = nachName;
	}
}
