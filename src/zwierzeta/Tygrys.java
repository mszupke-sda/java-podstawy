package zwierzeta;

public class Tygrys extends Kotowate {

    public Tygrys(int glod, String terytorium, String polozenie) {
        super("tygrys.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() {
        System.out.println("Tygrys: halasuj");
    }

    @Override
    public void wedruj() {
        System.out.println("Tygrys: wedruj");
    }
}
