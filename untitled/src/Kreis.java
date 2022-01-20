import com.sun.tools.javac.Main;

public class Kreis extends Main implements Halbkreis, Ganz {
    int r;
    public Kreis(int r){
        this.r = r;
    }
    protected double umfang(){
        return 2*r*Math.PI;
    }
}
