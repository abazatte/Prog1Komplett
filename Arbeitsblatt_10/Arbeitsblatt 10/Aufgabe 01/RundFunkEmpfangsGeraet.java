
public class RundFunkEmpfangsGeraet {
	int lautstaerke;
	boolean eingeschaltet; 
	
	RundFunkEmpfangsGeraet() {
		this.lautstaerke = 0;
		this.eingeschaltet = false;
	}
	void volume(int x) { 
		if(this.eingeschaltet = true)
		if(x<=0) {
			x = x*-1;
			this.lautstaerke = this.lautstaerke - x;
		}
		if(x>=0) {
			this.lautstaerke = this.lautstaerke + x;
		}
	}
	      /** Erhöhe Lautstaerke um 1 */
	void lauter() { 
		this.lautstaerke++;
	}
	      // getter und setter
	      /** Vermindere Lautstaerke um 1. */
	void leiser() { 
		this.lautstaerke--;
	}
	      /** Schalte ein. */
	void an() {
		this.eingeschaltet = true;
	}
	      /** Schalte aus */
	void aus() { 
		this.eingeschaltet = false;
	}
	      /** an oder aus? */
	boolean istAn() {
		return this.eingeschaltet;
	} 
}

