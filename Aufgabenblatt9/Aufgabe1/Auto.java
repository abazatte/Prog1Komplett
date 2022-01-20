
public class Auto {

	private String name;
	private int positionx;
	private int positiony;
	private boolean horizontal;
	private int leange;

	public Auto(String name, int positiony, int positionx, boolean horizontal, int leange) {

		this.name = name;
		this.positiony = positiony;
		this.positionx = positionx;
		this.horizontal = horizontal;
		this.leange = leange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPositionx() {
		return positionx;
	}

	public void setPositionx(int positionx) {
		this.positionx = positionx;
	}

	public int getPositiony() {
		return positiony;
	}

	public void setPositiony(int positiony) {
		this.positiony = positiony;
	}

	public boolean getHorizontal() {
		return horizontal;
	}

	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	public int getLeange() {
		return leange;
	}

	public void setLeange(int leange) {
		this.leange = leange;
	}

	public String[][] autoPlazieren(Auto auto, String[][] spielfeld) {
		spielfeld[auto.positiony][auto.positionx] = auto.name;
		if (auto.horizontal == true) {
			for (int i = 1; i < auto.leange; i++) {
				spielfeld[auto.positiony][auto.positionx + i] = auto.name;
			}
		} else if (auto.horizontal == false) {
			for (int i = 1; i < auto.leange; i++) {
				spielfeld[auto.positiony + i][auto.positionx] = auto.name;
			}
		}
		return spielfeld;
	}

	public boolean rechtsFrei(Auto auto, String[][] spielfeld) {
		if (auto.horizontal == false) {
			System.out.println("Du kannst mit diesem Auto nur hoch oder runter!");
			return false;
		}
		if (auto.leange == 2) {
			// Rechts außerhalb des Spielfeldes
			if (positionx + 2 > 5) {
				System.out.println("Du kannst nicht gegen eine Wand fahren!");
				return false;
			}
			if (spielfeld[positiony][positionx + 2] == "__") {
				return true;
			} else {
				System.out.println("Dort kannst du nicht hin!");
				return false;
			}
		} else if (auto.leange == 3) {
			if (positionx + 3 > 5) {
				System.out.println("Du kannst nicht gegen eine Wand fahren!");
				return false;
			}
			if (spielfeld[positiony][positionx + 3] == "__") {
				return true;
			} else {
				System.out.println("Dort kannst du nicht hin!");
				return false;
			}
		}
		return true;
	}

	public boolean linksFrei(Auto auto, String[][] spielfeld) {
		if (auto.horizontal == false) {
			System.out.println("Du kannst mit diesem Auto nur hoch oder runter!");
			return false;
		}
		// Links außerhalb des Spielfeldes
		if (positionx - 1 < 0) {
			System.out.println("Du kannst nicht gegen eine Wand fahren!");
			return false;
		}

		if (spielfeld[positiony][positionx - 1] == "__") {
			return true;
		} else {
			System.out.println("Dort kannst du nicht hin!");
			return false;
		}
	}

	public boolean obenFrei(Auto auto, String[][] spielfeld) {
		if (auto.horizontal == true) {
			System.out.println("Du kannst mit diesem Auto nur links oder rechts!");
			return false;
		}
		// Oben außerhalb des Spielfeldes
		if (positiony - 1 < 0) {
			System.out.println("Du kannst nicht gegen eine Wand fahren!");
			return false;
		}
		if (spielfeld[positiony - 1][positionx] == "__") {
			return true;
		} else {
			System.out.println("Dort kannst du nicht hin!");
			return false;
		}
	}

	public boolean untenFrei(Auto auto, String[][] spielfeld) {
		if (auto.horizontal == true) {
			System.out.println("Du kannst mit diesem Auto nur links oder rechts!");
			return false;
		}
		if (auto.leange == 2) {
			// Unten außerhalb des Spielfeldes
			if (positiony + 2 > 5) {
				System.out.println("Du kannst nicht gegen eine Wand fahren!");
				return false;
			}
			if (spielfeld[positiony + 2][positionx] == "__") {
				return true;
			} else {
				System.out.println("Dort kannst du nicht hin!");
				return false;
			}
		} else if (auto.leange == 3) {
			if (positiony + 3 > 5) {
				System.out.println("Du kannst nicht gegen eine Wand fahren!");
				return false;
			}
			if (spielfeld[positiony + 3][positionx] == "__") {
				return true;
			} else {
				System.out.println("Dort kannst du nicht hin!");
				return false;
			}
		}
		return true;
	}

	// AUTO IN GEWÄHLTE RICHTUNG BEWEGEN

	public String[][] nachRechts(Auto auto, String[][] spielfeld) {
		spielfeld[auto.positiony][auto.positionx] = "__";
		auto.positionx = auto.positionx + 1;
		if (auto.leange == 2) {
			spielfeld[auto.positiony][auto.positionx + 1] = auto.name;
		} else if (auto.leange == 3) {
			spielfeld[auto.positiony][auto.positionx + 2] = auto.name;
		}
		return spielfeld;
	}

	public String[][] nachLinks(Auto auto, String[][] spielfeld) {
		auto.positionx = auto.positionx - 1;
		spielfeld[auto.positiony][auto.positionx] = auto.name;
		if (auto.leange == 2) {
			spielfeld[auto.positiony][auto.positionx + 2] = "__";
		} else if (auto.leange == 3) {
			spielfeld[auto.positiony][auto.positionx + 3] = "__";
		}
		return spielfeld;
	}

	public String[][] nachUnten(Auto auto, String[][] spielfeld) {
		spielfeld[auto.positiony][auto.positionx] = "__";
		auto.positiony = auto.positiony + 1;
		if (auto.leange == 2) {
			spielfeld[auto.positiony + 1][auto.positionx] = auto.name;
		} else if (auto.leange == 3) {
			spielfeld[auto.positiony + 2][auto.positionx] = auto.name;
		}
		return spielfeld;
	}

	public String[][] nachOben(Auto auto, String[][] spielfeld) {
		auto.positiony = auto.positiony - 1;
		spielfeld[auto.positiony][auto.positionx] = auto.name;
		if (auto.leange == 2) {
			spielfeld[auto.positiony + 2][auto.positionx] = "__";
		} else if (auto.leange == 3) {
			spielfeld[auto.positiony + 3][auto.positionx] = "__";
		}
		return spielfeld;
	}

	// ZUSAMMENFASSUNG

	public void bewegeAuto(char auswahl, Auto auto, String[][] spielfeld) {
		if (auswahl == 'l') {
			if (linksFrei(auto, spielfeld)) {
				nachLinks(auto, spielfeld);
				Spielfeld.spielfeldAusgeben();
			}
		} else if (auswahl == 'r') {
			if (rechtsFrei(auto, spielfeld)) {
				nachRechts(auto, spielfeld);
				Spielfeld.spielfeldAusgeben();
			}
		} else if (auswahl == 'u') {
			if (obenFrei(auto, spielfeld)) {
				nachOben(auto, spielfeld);
				Spielfeld.spielfeldAusgeben();
			}
		} else if (auswahl == 'd') {
			if (untenFrei(auto, spielfeld)) {
				nachUnten(auto, spielfeld);
				Spielfeld.spielfeldAusgeben();
			}
		}
	}
}
