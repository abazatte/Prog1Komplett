
public class World {

	final static boolean WEISS = true;
	final static boolean SCHWARZ = false;

	Ant ant;
	static boolean[][] feld;
	static int size;

	public World(int s) {
		size = s;
		feld = new boolean[size][size];
		ant = new Ant(size / 2, size / 2);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				feld[i][j] = WEISS;
			}
		}
	}

	public Ant getAnt() {
		return this.ant;
	}

	public int getSize() {
		return size;
	}
	

	
	public static void changeColor(int row, int column) {
		if(feld[row][column] == WEISS) {
			feld[row][column] = SCHWARZ;
		}
		else {
			feld[row][column] = WEISS;
		}
	}
	public boolean isCellBlack(int row, int column) {
		if (feld[row][column] == SCHWARZ) {
			return true;
		} else {
			return false;
		}
	}

}
