public class RundFunkEmpfangsGeraet {
	int lautstaerke;
	boolean eingeschaltet;

	RundFunkEmpfangsGeraet() {
		this.lautstaerke = 0;
		this.eingeschaltet = false;
	}

	/**
	 * ver�ndere Lautstaerke um x nach oben oder unten, je nach Vorzeichen von x
	 */
	void volume(int x) {
		if (istAn() == true) {
			this.lautstaerke = this.lautstaerke + x;
		}
		if (this.lautstaerke < 0) {
			this.lautstaerke = 0;
		} else if (this.lautstaerke > 100) {
			this.lautstaerke = 100;
		}

	}

	/** Erh�he Lautstaerke um 1 */
	void lauter() {
		if (istAn() == true) {
			if (this.lautstaerke < 100) {
				this.lautstaerke++;
			}
		}
	}

// getter und setter
	/** Vermindere Lautstaerke um 1. */
	void leiser() {
		if (istAn() == true) {
			if (this.lautstaerke > 0) {
				this.lautstaerke--;
			}
		}
	}

	/** Schalte ein. */
	void an() {
		if (istAn() == false) {
			this.eingeschaltet = true;
		}
	}

	/** Schalte aus */
	void aus() {
		if (istAn()) {
			this.eingeschaltet = false;
		}
	}

	/** an oder aus? */
	boolean istAn() {
		//return eingeschaltet;
		
		
		if (this.eingeschaltet == true) {
			return true;
		}
		return false;
	}
}
