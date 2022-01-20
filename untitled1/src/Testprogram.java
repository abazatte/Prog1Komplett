
public class Testprogram {
    public static void main(String[] args) {
        System.out.println(stellen(32));
    }

    public static int stellen(int zahl){
        int count = 0;
        while (zahl > 0){
            zahl = zahl / 10;
            count++;
        }
        return count;
    }
}
