package zwierzeta;

public class Kot extends Kotowate {

    public Kot(int glod, String terytorium, String polozenie) {
        super("kot.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() {
        System.out.println("Kot: halasuj");
    }

    @Override
    public void wedruj() {
        System.out.println("Kot: wedruj");
    }
}
