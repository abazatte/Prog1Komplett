
public class Fernseher extends RundFunkEmpfangsGeraet {
	int kanal;

	Fernseher() {
		this.kanal = 1;
	}

	void waehleKanal(int newKanal) {
		if (istAn() == true) {
			this.kanal = newKanal;
		}
	}

	@Override
	public String toString() {
		return "Fernseher [kanal=" + kanal + ", lautstaerke=" + lautstaerke + ", eingeschaltet=" + eingeschaltet + "]";
	}
}
