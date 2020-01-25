package zwierzeta;

public class Lew extends Kotowate {

    public Lew(int glod, String terytorium, String polozenie) {
        super("lew.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() {
        System.out.println("Lew: halasuj");
    }

    @Override
    public void wedruj() {
        System.out.println("Lew: wedruj");
    }
}
