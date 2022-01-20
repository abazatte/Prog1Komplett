import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class HamsterAufgabe5 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	bisSchluss();
	prozedur();
} void bisSchluss() {
	while (vornFrei()) {
		prozedur();
		vor();
	}
}	
void prozedur() {	
		linksUm();
		vor();
		vor();
		while (kornDa()) {
			nimm();
		}
		linksUm();
		linksUm();
		vor();
		vor();
		while (!maulLeer()) {
			gib();
		}
		linksUm();
		linksUm();
		vor();
		while (kornDa()) {
			nimm();	
		}
		vor();
		while (!maulLeer()) {
			gib();
		}
		linksUm();
		linksUm();
		vor();
		vor();
		while (kornDa()) {
			nimm();
		}
		linksUm();
		linksUm();
		vor();
		while (!maulLeer()) {
			gib();
		}
		linksUm();
		linksUm();
		vor();
		linksUm();
}}