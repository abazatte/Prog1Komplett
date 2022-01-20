
public class Testprogramm {
	public static void main(String[] args) {
		Fernseher f = new Fernseher();
		System.out.println(f);
		f.an();
		System.out.println(f);
		f.lauter();
		System.out.println(f);
		f.leiser();
		System.out.println(f);
		f.volume(10);
		System.out.println(f);
		f.volume(-20);
		System.out.println(f);
		f.waehleKanal(5);
		System.out.println(f);
		f.volume(150);
		f.aus();
		System.out.println(f);
		Radio r = new Radio();
		System.out.println(r);
		r.an();
		System.out.println(r);
		r.lauter();
		System.out.println(r);
		r.leiser();
		System.out.println(r);
		r.volume(10);
		System.out.println(r);
		r.volume(-20);
		System.out.println(r);
		r.waehleSender(112.5);
		System.out.println(r);
		r.aus();
		System.out.println(r);
		f.leiser();
		System.out.println(f);
	}
}
