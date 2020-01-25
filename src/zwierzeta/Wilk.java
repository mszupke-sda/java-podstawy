package zwierzeta;

public class Wilk extends Psowate {

    public Wilk(int glod, String terytorium, String polozenie) {
        super("wilk.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() {
        System.out.println("Wilk: halasuj");
    }

    @Override
    public void wedruj() {
        System.out.println("Wilk: wedruj");
    }
}
