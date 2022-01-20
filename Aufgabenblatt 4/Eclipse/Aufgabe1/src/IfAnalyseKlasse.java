
public class IfAnalyseKlasse {
	static int x = 42;
public static void main(String[] args) {
	boolean a = false;
	boolean b = false;
	x = 42;
	System.out.println(methode0(a,b));
	x = 42;
	System.out.println(methode1(a,b));
	x = 42;
	System.out.println(methode2(a,b));
	x = 42;
	System.out.println(methode3(a,b));
	x = 42;
	System.out.println(methode4(a,b));
	x = 42;
	System.out.println(methode5(a,b));
	x = 42;
	System.out.println(methode6(a,b));
	x = 42;
	System.out.println(methode7(a,b));
	x = 42;
	System.out.println(methode8(a,b));
}
static int methode0(boolean a, boolean b) {
	if (a==true && b==true) {
		x=0;
	}
	return x;
}
static int methode1(boolean a, boolean b) {
	if(a==true) {
		x=0;
		if(b==true) {
			x=0;
		}
	}
	return x;
}
static int methode2(boolean a, boolean b) {
	if(a==true) {
		if(b==true) {
			x=0;
		}
	}
	return x;
}
static int methode3(boolean a, boolean b) {
	if(a==true) {
		x=0;
	} else {
		if (b==true){
			x=0;
		}
	}
	return x;
}
static int methode4(boolean a, boolean b) {
	if (a==true) {
		x=0;
	}
	if (b==true) {
		x=0;
	}
	return x;
}
static int methode5(boolean a, boolean b) {
	if (a==true) {
		if (b==true) {
			x=0;
		}
	} else {
		x=0;
	}
	return x;
}
static int methode6(boolean a, boolean b) {
	if (a==true) {
		x=0;
	}
	if(b==true) {
		x=0;
	} else {
		x=0;
	}
	return x;
}
static int methode7(boolean a, boolean b) {
	if (a==true && b==true) {
		x=0;
	} else {
	}
	return x;
}
static int methode8(boolean a,boolean b) {
	if (a==true) {
		if(!(b==true)) {
		} else {
			x=0;
		}
	}
	return x;
}
}