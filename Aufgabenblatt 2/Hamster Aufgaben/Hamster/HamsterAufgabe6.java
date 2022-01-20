import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class HamsterAufgabe6 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	while (vornFrei()) {
		prozedur();
		vor();
	}
	prozedur();
	zurückZumAnfang();
	while (vornFrei()) {
		prozedur();
		vor();
	}
	prozedur();
	zurückZumAnfang();
}
void prozedur() {
	int i = 0;	
	int j = 0;	
   		while (kornDa()) {
 	  		nimm();
  		 	i++;
		}
		rechtsUm();
		vor();
		linksUm();
		while (kornDa()) {
			nimm();
			j++;
		}
		for (int k = i; i>0; i--) {
    		gib();
    	}
    	linksUm();
    	vor();
    	rechtsUm();
    	for (int k = j; j>0; j--) {
    	gib();
    	}
}
void rechtsUm() {
	linksUm();
	linksUm();
	linksUm();
}
void zurückZumAnfang() {
	linksUm();
	linksUm();
	while (vornFrei()) {
	vor();
	}
	linksUm();
	linksUm();
}}