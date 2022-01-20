
public class Radio extends RundFunkEmpfangsGeraet {
	double frequenz;

	Radio() {
		this.frequenz = 87.5;
	}

	void waehleSender(double newFrequenz) {
		if (istAn() == true) {
			this.frequenz = newFrequenz;
		}
	}

	@Override
	public String toString() {
		return "Radio [frequenz=" + frequenz + ", lautstaerke=" + lautstaerke + ", eingeschaltet=" + eingeschaltet
				+ "]";
	}
}
