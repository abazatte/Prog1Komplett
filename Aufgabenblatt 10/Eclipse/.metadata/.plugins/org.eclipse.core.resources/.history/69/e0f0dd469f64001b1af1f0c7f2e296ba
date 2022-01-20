
public class K {
	private Integer x;
	private Integer y;

	public K() {
		this.x = 2;
		this.y = 2;
		}

	public K(Integer w) {
		this.x = w;
		this.y = this.x;
		}

	public void mach() {
		this.x = this.x + this.x;
		this.x = this.x + this.x;
		this.x = this.x + this.x;
	}

	public Integer mult() {
		return this.x * this.y;
	}

	public K nouvo(Integer a) {
		return new K(this.x + a);
	}

	public void show() {
		System.out.println("x:" + this.x + " y:" + this.y + "\n");
	}

	public static void doIt() {
		K k1 = new K();
		k1.show();
		k1.mach();
		k1.show();
		K k2 = new K(3);
		k2.show();
		k2.mach();
		k2.show();
		K k3 = new K();
		K k4 = new K(k3.mult());
		k4.show();
		K k5 = k3.nouvo(4);
		k5.show();
	}
	public static void main(String[] args) {
		doIt();
	}
}