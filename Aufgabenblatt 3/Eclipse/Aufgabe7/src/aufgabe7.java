
public class aufgabe7 {
	public static void main (String[] args) {
		System.out.print("Anzahl Downloads (>=0): ");
		int i = IO.readInt();
		float j = 0f;
		int k = 0;
		while (k<=i) {
			if (k<=5) {
				j=j+0f;
				k=k+1;
			}
			if (k>5 && k<=35) {
				j=j+0.2f;
				k=k+1;
			}
			if (k>35 && k<=i) {
				j=j+0.15f;
				k=k+1;
			}
		}
		j = Math.round(100.0 * j) / 100.00f;
		System.out.printf("Gebuehren = " + j);
	}
}