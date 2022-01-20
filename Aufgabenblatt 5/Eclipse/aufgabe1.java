
public class aufgabe1 {
	public static void main(String[] args) {
		int zahl = IO.readInt();
		switch (zahl) {
		case -1:
		case 0:
		case 1: {
			System.out.println("nein");
			break;
		}
		case 4: {
			System.out.println("weiss nicht");
			break;
		}
		case 5:
		case 6: {
			System.out.println("ja");
			break;
		}
		default: {
			System.out.println("vielleicht");
		}
		}
	}
}