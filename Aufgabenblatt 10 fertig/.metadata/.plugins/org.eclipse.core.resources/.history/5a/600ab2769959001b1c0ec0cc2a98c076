
public class Cardinal {

	private int x;

	public Cardinal() {
		x = 0;
	}

	public Cardinal(int x) {
		this.x = x;
	}

	public Cardinal(Cardinal cardinal) {
		try {
			this.x = cardinal.x;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clone(Cardinal cardinal) {
		try {
			this.x = cardinal.x;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean equals(Cardinal cardinal) {
		try {
			if (cardinal.x == this.x) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public String toString() {
		return x + "";
	}

	public Cardinal sub(Cardinal cardinal1, Cardinal cardinal2) {
		try {
			Cardinal result = new Cardinal(cardinal1.x - cardinal2.x);
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public void sub(Cardinal cardinal) {
		try {
			this.x = this.x - cardinal.x;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
