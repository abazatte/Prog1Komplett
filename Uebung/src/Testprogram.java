public class Testprogram {
    public static void main(String[] args) {
        Woerterbuch woerterbuch = new Woerterbuch(5);
        woerterbuch.einfuegen("Hallo", "Hello");
        woerterbuch.einfuegen("Danke", "Thanks");
        woerterbuch.einfuegen("Gerne", "No Prob");
        woerterbuch.einfuegen("tanzen", "dance");
        woerterbuch.einfuegen("alter", "no way");
        woerterbuch.getUebersetzung("Danke");
        System.out.println(woerterbuch);
    }
}
