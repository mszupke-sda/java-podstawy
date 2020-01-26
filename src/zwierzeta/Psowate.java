package zwierzeta;

public abstract class Psowate extends Zwierze {

    public Psowate(String zdjecie, int glod, String terytorium, String polozenie) {
        super(zdjecie, Pozywienie.MIESO, glod, terytorium, polozenie);
    }

    @Override
    public abstract void halasuj() throws ZbytDuzeZmeczenieException;

    @Override
    public final void jedz() {
        System.out.println("Psowate: jedz");

        zwiekszeZmeczenie(5);
    }

    @Override
    public abstract void wedruj() throws ZbytDuzeZmeczenieException;
}
