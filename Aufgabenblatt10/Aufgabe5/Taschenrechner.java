
public class Taschenrechner {

	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mult(int x, int y) {
		return x * y;
	}

	public int div(int x, int y) {
		try {
			return x / y;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	public int mod(int x, int y) {
		try {
			return x % y;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
}
