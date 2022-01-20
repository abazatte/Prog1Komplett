
public class World {

	final static boolean WHITE = true;
	final static boolean BLACK = false;
	static boolean[][] feld;
	static int size;
	Ant ant;
	
	public World(int s) {
		size = s;
		feld = new boolean[s][s];
		ant = new Ant(s / 2, s / 2);
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				feld[i][j] = WHITE;
			}
		}
	}

	public Ant getAnt() {
		return this.ant;
	}

	public int getSize() {
		return size;
	}
	
	public static void changeColor(int x, int y) {
		if(feld[x][y] == WHITE) {
			feld[x][y] = BLACK;
		}
		else {
			feld[x][y] = WHITE;
		}
	}
	public boolean isCellBlack(int x, int y) {
		if (feld[x][y] == BLACK) {
			return true;
		} else {
			return false;
		}
	}
}
