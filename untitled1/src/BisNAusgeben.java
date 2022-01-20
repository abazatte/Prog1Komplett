public class BisNAusgeben {
    public static void main(String[] args) {
        ausgeben(5);
    }
    public static void ausgeben(int a){
        for (int i = 0; i < a; i++) {
            if (i != a){
                System.out.print(i);
            }
        }
    }
}
