
public class aufgabe2d {
    public static void main(String[] args) {
        System.out.println(statistiken());
    }

    public static double statistiken() {
        double min = 0;
        double max = 0;
        double schnitt = 0;
        double d = 0;
        if (d <= 100 && d > -100) {
            d = IO.readDouble("Geben Sie einen Wert ein. ");
            if (d == -1 || d >= 100 || d <= -100) {
                return statistiken();
            }
            min = d;
            max = d;
            schnitt = d;
            System.out.print("Minimum: " + min + "\t");
            System.out.print("Maximum: " + max + "\t");
            System.out.println("Schnitt: " + schnitt);
        }
        while (d <= 100 && d > -100) {
            d = IO.readDouble("Geben Sie einen Wert ein. ");
            if (d == -1) {
                return statistiken();
            }
            while (d >= 100 || d <= -100) {
                d = IO.readDouble("Geben Sie einen g�ltigen Wert ein: ");
            }
            if (d < min) {
                min = d;
            } else if (d > max) {
                max = d;
            }
            schnitt = (schnitt + d) / 2;
            System.out.print("Minimum: " + min + "\t");
            System.out.print("Maximum: " + max + "\t");
            System.out.println("Schnitt: " + schnitt);
        }
        return statistiken();
    }
}
