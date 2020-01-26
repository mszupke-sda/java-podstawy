package zwierzeta;

public class Lew extends Kotowate {

    public Lew(int glod, String terytorium, String polozenie) {
        super("lew.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException {

        if (czyZeczony()) {
            throw new ZbytDuzeZmeczenieException();
        }

        System.out.println("Lew: halasuj");
        zwiekszeZmeczenie(1);
    }

    @Override
    public void wedruj() throws ZbytDuzeZmeczenieException {

        if (czyZeczony()) {
            throw new ZbytDuzeZmeczenieException();
        }

        System.out.println("Lew: wedruj");
        zwiekszeZmeczenie(9);
    }
}
