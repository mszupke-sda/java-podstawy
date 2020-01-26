package zwierzeta;

public class Pies extends Psowate {

    public Pies(int glod, String terytorium, String polozenie) {
        super("pies.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException {

        if (czyZeczony()) {
            throw new ZbytDuzeZmeczenieException();
        }

        System.out.println("Pies: halasuj");
        zwiekszeZmeczenie(1);
    }

    @Override
    public void wedruj() throws ZbytDuzeZmeczenieException {

        if (czyZeczony()) {
            throw new ZbytDuzeZmeczenieException();
        }

        System.out.println("Pies: wedruj");
        zwiekszeZmeczenie(9);
    }
}
