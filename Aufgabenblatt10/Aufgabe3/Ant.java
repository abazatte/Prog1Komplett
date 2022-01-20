
public class Ant {

	int x;
	int y;
	char richtung;

	public Ant(int x, int y) {
		this.x = x;
		this.y = y;
		richtung = 'N';
	}

	public void nextStep() {
		World.changeColor(x, y);
		if (World.feld[x][y] == World.WHITE) {
			if (richtung == 'N') {
				richtung = 'O';
			} else if (richtung == 'O') {
				richtung = 'S';
			} else if (richtung == 'S') {
				richtung = 'W';
			} else if (richtung == 'W') {
				richtung = 'N';
			}
		} else {
			if (richtung == 'N') {
				richtung = 'W';
			} else if (richtung == 'W') {
				richtung = 'S';
			} else if (richtung == 'S') {
				richtung = 'O';
			} else if (richtung == 'O') {
				richtung = 'N';
			}
		}
		if (richtung == 'N') {
			if (x != 0) {
				x--;
			} else {
				x = World.size - 1;
			}
		} else if (richtung == 'O') {
			if (y != 0) {
				y--;
			} else {
				y = World.size - 1;
			}
		} else if (richtung == 'S') {
			if (x != World.size - 1) {
				x++;
			} else {
				x = 0;
			}
		} else if (richtung == 'W') {
			if (y != World.size - 1) {
				y++;
			} else {
				y = 0;
			}
		}
	}

}
