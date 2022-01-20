public class aufgabe2e {
	public static void main(String[] args) {
		System.out.println(zahlenRaten());
	}
	public static String zahlenRaten() {
		double i = Math.random()*100;
		i = Math.round(i);
		i = (int) i;
		int a = 1;
		int d = 0;
		while (i != d) {
			d = IO.readInt(a + ". Versuch: Zahl raten: ");
			if (d<i) {
				System.out.println("Zu tief!");
			}
			if (d>i) {
				System.out.println("Zu hoch!");
			}
			a++;
		}
		return "Bravo, getroffen!";
}
}