
public class aufgabe9 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		System.out.println(a + " + " + b + " = " + addiere(a, b));
		System.out.println(a + " - " + b + " = " + subtrahiere(a,b));
		System.out.println(a + " * " + b + " = " + multipliziere(a,b));
		System.out.println(a + " / " + b + " = " + dividiere(a,b) + " Rest: " + modulo(a,b));
	}
	static int addiere(int a ,int b) {
		return a+b;
	}
	static int subtrahiere(int a ,int b) {
		return a-b;
	}
	static int multipliziere(int a,int b) {
		return a*b;
	}
	static int dividiere(int a,int b) {
		return a/b;
	}
	static int modulo(int a,int b) {
		return a%b;
	}
}
