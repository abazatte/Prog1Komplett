
public class Aufgabe_Probe {

	public static void main(String[] args) {
		char[] klartext = new char[10];
		klartext[0] = 'G';
		klartext[1] = 'a';
		klartext[2] = 'r';
		klartext[3] = 't';
		klartext[4] = 'e';
		klartext[5] = 'n';
		klartext[6] = 'z';
		klartext[7] = 'a';
		klartext[8] = 'u';
		klartext[9] = 'n';
		System.out.println(klartext);
		System.out.println(verschluesseln(klartext));
		System.out.println(entschluesseln(verschluesseln(klartext)));
	}

	static char[] verschluesseln(char[] klar) {
		char[] verschl1 = new char[klar.length / 2];
		char[] verschl2 = new char[klar.length / 2];
		for (int i = 0; i < klar.length; i++) {
			if (i % 2 == 0) {
				verschl1[i / 2] = klar[i];
			} else {
				verschl2[i / 2] = klar[i];
			}
		}

		char[] verschl = new char[klar.length];
		for (int i = 0; i < verschl1.length; i++) {
			verschl[i] = verschl1[i];
		}
		int x = 0;
		for (int i = 5; i < klar.length; i++) {
			verschl[i] = verschl2[x];
			x++;
		}
		return verschl;
	}

	static char[] entschluesseln(char[] geheim) {
		char[] entschl1 = new char[geheim.length / 2];
		char[] entschl2 = new char[geheim.length / 2];

		for (int i = 0; i < geheim.length / 2; i++) {
			entschl1[i] = geheim[i];
		}
		int x = 0;
		for (int i = 5; i < geheim.length; i++) {
			entschl2[x] = geheim[i];
			x++;
		}

		char[] entschl = new char[geheim.length];
		for (int i = 0; i < entschl.length; i++) {
			if (i % 2 == 0) {
				entschl[i] = entschl1[i / 2];
			} else {
				entschl[i] = entschl2[i / 2];
			}
		}
		return entschl;
	}
}
