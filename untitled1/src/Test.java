public class Test {
    // Stellen einer uebergebenen Zahl zurueckgeben

    public static int stellen(int zahl){
        int count = 0;
        while (zahl < 0){
            zahl = zahl / 10;
            count++;
        }
        return count;
    }

}
