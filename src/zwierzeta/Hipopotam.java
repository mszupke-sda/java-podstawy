package zwierzeta;

public class Hipopotam extends Zwierze {

    public Hipopotam(int glod, String terytorium, String polozenie) {
        super("hipopotam.png", "trawa", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() {
        System.out.println("Hipopotam: halasuj");
    }

    @Override
    public void jedz() {
        System.out.println("Hipopotam: jedz");
    }

    @Override
    public void wedruj() {
        System.out.println("Hipopotam: wedruj");
    }
}
