
public class Teatprogramm {
	public static void main(String[] args) {
		Cardinal c1 = new Cardinal(-1);
		System.out.println(c1);
		Cardinal c2 = new Cardinal(5);
		System.out.println(c2);
		System.out.println("Ist gleich? " + c1.equals(c2));
		c1.sub(c2);
		System.out.println(c1);
	}
}
