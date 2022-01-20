
public class Radio extends RundFunkEmpfangsGeraet {
	double frequenz;
	
	Radio(){
		this.frequenz = 87.5;
	}
	void waehleSender(double x) {
		if(this.eingeschaltet == true) {
			this.frequenz = x;
		}
		if(this.eingeschaltet = false) {
			System.out.println("System nicht eingeschaltet.");
		}
	}
	
	
	
	
	
	
	
	
}
