import java.util.Calendar;
import java.util.GregorianCalendar;

public class aufgabe5 {
	public static void main (String[] args) {
		String i = IO.readString("Vorname: ");
		String j = IO.readString("Nachname: ");
		System.out.println("Hallo " + i + " " + j + ".");
		
		short d = IO.readShort("Geburtsdatum Tag: ");
		short m = IO.readShort("Geburtsdatum Monat: ");
		short y = IO.readShort("Geburtsdatum Jahr: ");
		Calendar cal_1 = new GregorianCalendar();
		Calendar cal_2 = Calendar.getInstance();
		cal_1.set(y, m-1, d);
		int year = cal_2.get(Calendar.YEAR);
		int month = cal_2.get(Calendar.MONTH) +1;
		int day = cal_2.get(Calendar.DATE);
		long time = cal_2.getTime().getTime() - cal_1.getTime().getTime();
		long days = Math.round((double) time / (24. * 60.*60.*1000.));
		System.out.println("Hallo " + i + ", Du bist " + days + " Tage alt.");
		}
}
