
public class Woerterbuch {
    String[] begriffe;

    Woerterbuch(int a){
        this.begriffe=new String[2 * a];
        for (int i = 0; i < this.begriffe.length; i++) {
            begriffe[i] = "";
        }
    }
    void einfuegen(String w, String u){
        for(int i = 0;i<this.begriffe.length;i = i + 2){
            if(!(this.begriffe[i].equals(w)) && this.begriffe[i].equals("")){
                this.begriffe[i] = w;
                this.begriffe[i+1] = u;
                break;
            }
        }
    }
    public void getUebersetzung(String s){
        for (int i = 0;i<this.begriffe.length;i = i+2){
            if (begriffe[i].equals(s)){
                System.out.println(begriffe[i+1]);
            }
        }
    }

    @Override
    public String toString() {
        String alles = "";
        for (int i = 0; i < this.begriffe.length; i++) {
            alles = alles + ", " + this.begriffe[i];
        }
        return "Woerterbuch{" +
                "begriffe=" + alles+
                '}';
    }
}
