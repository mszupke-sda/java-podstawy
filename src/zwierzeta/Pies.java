package zwierzeta;

public class Pies extends Psowate {

    public Pies(int glod, String terytorium, String polozenie) {
        super("pies.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() {
        System.out.println("Pies: halasuj");
    }

    @Override
    public void wedruj() {
        System.out.println("Pies: wedruj");
    }
}
