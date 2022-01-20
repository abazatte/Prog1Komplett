import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class HamsterAufgabe3 extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	ersteReihe();
	zweiteReihe();
	dritteReihe();
	vierteReihe();
}
void ersteReihe() {
	rechtsUm();
	vor();
	nimm();
	zurück();
	zweiterKorn();
	dritterKorn();
	position1();
}
void zweiteReihe() {
	rechtsUm();
	vor();
	nimm();
	zurück();
	zweiterKorn();
	dritterKorn();
	position1();
}
void dritteReihe() {
	rechtsUm();
	vor();
	nimm();
	zurück();
	zweiterKorn();
	dritterKorn();
	position1();
}
void vierteReihe() {
	zweiterKorn();
	ende();
}
void rechtsUm() {
	linksUm();
	linksUm();
	linksUm();
}
void zurück(){
	linksUm();
	linksUm();
	vor();
	rechtsUm();
}
void zweiterKorn() {
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	nimm();
}
void dritterKorn() {
	vor();
	vor();
	vor();
	vor();
	vor();
	rechtsUm();
	vor();
	nimm();	
}
void position1() {
	vor();
	rechtsUm();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	vor();
	nachHinten();	
}
void nachHinten() {
	linksUm();
	linksUm();
}
void ende() {
	vor();
	vor();
	vor();
	vor();
	vor();
	gib();
	gib();
	gib();
	gib();	
	gib();
	gib();	
	gib();
	gib();	
	gib();
	gib();
}}