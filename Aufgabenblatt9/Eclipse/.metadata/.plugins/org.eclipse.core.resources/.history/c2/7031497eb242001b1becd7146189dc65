public class Auto {

	private String kennzeichnung;
	private int xpos;
	private int ypos;
	private String ausrichtung;
	private int groesse;

	public Auto(String kennzeichnung, int ypos, int xpos, String ausrichtung, int groesse) {
		this.kennzeichnung = kennzeichnung;
		this.xpos = xpos;
		this.ypos = ypos;
		this.ausrichtung = ausrichtung;
		this.groesse = groesse;
	}

	public String getKennzeichnung() {
		return kennzeichnung;
	}

	public void setKennzeichnung(String kennzeichnung) {
		this.kennzeichnung = kennzeichnung;
	}

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}

	public String getAusrichtung() {
		return ausrichtung;
	}

	public void setAusrichtung(String ausrichtung) {
		this.ausrichtung = ausrichtung;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	// AUTO INS SPIELFELD PLATZIEREN

	public String[][] setzeAuto(Auto auto, String[][] spielfeld) {
		spielfeld[auto.ypos][auto.xpos] = auto.kennzeichnung;
		if (auto.ausrichtung == "h") {
			for (int i = 1; i < auto.groesse; i++) {
				spielfeld[auto.ypos][auto.xpos + i] = auto.kennzeichnung;
			}
		} else if (auto.ausrichtung == "v") {
			for (int i = 1; i < auto.groesse; i++) {
				spielfeld[auto.ypos + i][auto.xpos] = auto.kennzeichnung;
			}
		}
		return spielfeld;
	}

	// PRÜFEN, OB DAS AUTO BEWEGT WERDEN KANN

	public boolean rechtsFrei(Auto auto, String[][] spielfeld) {
		if (auto.ausrichtung == "v") {
			return false;
		}
		if (auto.groesse == 2) {
			if (spielfeld[ypos][xpos + 2] == "  ") {
				return true;
			} else {
				return false;
			}
		} else if (auto.groesse == 3) {
			if (spielfeld[ypos][xpos + 3] == "  ") {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean linksFrei(Auto auto, String[][] spielfeld) {
		if (auto.ausrichtung == "v") {
			return false;
		}

		if (spielfeld[ypos][xpos - 1] == "  ") {
			return true;
		} else {
			return false;
		}
	}

	public boolean obenFrei(Auto auto, String[][] spielfeld) {
		if (auto.ausrichtung == "h") {
			return false;
		}
		if (spielfeld[ypos - 1][xpos] == "  ") {
			return true;
		} else {
			return false;
		}
	}

	public boolean untenFrei(Auto auto, String[][] spielfeld) {
		if (auto.ausrichtung == "h") {
			return false;
		}
		if (auto.groesse == 2) {
			if (spielfeld[ypos + 2][xpos] == "  ") {
				return true;
			} else {
				return false;
			}
		} else if (auto.groesse == 3) {
			if (spielfeld[ypos + 3][xpos] == "  ") {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	// AUTO IN GEWÄHLTE RICHTUNG BEWEGEN

	public String[][] nachRechts(Auto auto, String[][] spielfeld) {
		spielfeld[auto.ypos][auto.xpos] = "  ";
		auto.xpos = auto.xpos + 1;
		if (auto.groesse == 2) {
			spielfeld[auto.ypos][auto.xpos + 1] = auto.kennzeichnung;
		} else if (auto.groesse == 3) {
			spielfeld[auto.ypos][auto.xpos + 2] = auto.kennzeichnung;
		}
		return spielfeld;
	}

	public String[][] nachLinks(Auto auto, String[][] spielfeld) {
		auto.xpos = auto.xpos - 1;
		spielfeld[auto.ypos][auto.xpos] = auto.kennzeichnung;
		if (auto.groesse == 2) {
			spielfeld[auto.ypos][auto.xpos + 2] = "  ";
		} else if (auto.groesse == 3) {
			spielfeld[auto.ypos][auto.xpos + 3] = "  ";
		}
		return spielfeld;
	}

	public String[][] nachUnten(Auto auto, String[][] spielfeld) {
		spielfeld[auto.ypos][auto.xpos] = "  ";
		auto.ypos = auto.ypos + 1;
		if (auto.groesse == 2) {
			spielfeld[auto.ypos + 1][auto.xpos] = auto.kennzeichnung;
		} else if (auto.groesse == 3) {
			spielfeld[auto.ypos + 2][auto.xpos] = auto.kennzeichnung;
		}
		return spielfeld;
	}

	public String[][] nachOben(Auto auto, String[][] spielfeld) {
		auto.ypos = auto.ypos - 1;
		spielfeld[auto.ypos][auto.xpos] = auto.kennzeichnung;
		if (auto.groesse == 2) {
			spielfeld[auto.ypos + 2][auto.xpos] = "  ";
		} else if (auto.groesse == 3) {
			spielfeld[auto.ypos + 3][auto.xpos] = "  ";
		}
		return spielfeld;
	}

	// ZUSAMMENFASSUNG

	public void bewegeAuto(char auswahl, Auto auto, String[][] spielfeld) {
		if (auswahl == 'l') {
			linksFrei(auto, spielfeld);
			nachLinks(auto, spielfeld);
		} else if (auswahl == 'r') {
			rechtsFrei(auto, spielfeld);
			nachRechts(auto, spielfeld);
		} else if (auswahl == 'u') {
			obenFrei(auto, spielfeld);
			nachOben(auto, spielfeld);
		} else if (auswahl == 'd') {
			untenFrei(auto, spielfeld);
			nachUnten(auto, spielfeld);
		}
	}

}
