package zwierzeta;

public class Kot extends Kotowate {

    public Kot(int glod, String terytorium, String polozenie) {
        super("kot.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException {

        if (czyZeczony()) {
            throw new ZbytDuzeZmeczenieException();
        }

        System.out.println("Kot: halasuj");
        zwiekszeZmeczenie(1);
    }

    @Override
    public void wedruj() throws ZbytDuzeZmeczenieException {

        if (czyZeczony()) {
            throw new ZbytDuzeZmeczenieException();
        }

        System.out.println("Kot: wedruj");
        zwiekszeZmeczenie(9);
    }
}
