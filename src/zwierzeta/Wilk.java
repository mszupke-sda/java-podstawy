package zwierzeta;

public class Wilk extends Psowate {

    public Wilk(int glod, String terytorium, String polozenie) {
        super("wilk.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException {
        System.out.println("Wilk: halasuj");

        zwiekszeZmeczenie(1);
    }

    @Override
    public void wedruj() throws ZbytDuzeZmeczenieException {
        System.out.println("Wilk: wedruj");

        zwiekszeZmeczenie(1);
    }
}
