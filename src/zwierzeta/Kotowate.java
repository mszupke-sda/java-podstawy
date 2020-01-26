package zwierzeta;

public abstract class Kotowate extends Zwierze {

    public Kotowate(String zdjecie, int glod, String terytorium, String polozenie) {
        super(zdjecie, Pozywienie.MIESO, glod, terytorium, polozenie);
    }

    @Override
    public abstract void halasuj() throws ZbytDuzeZmeczenieException;

    @Override
    public final void jedz() {
        System.out.println("Kotowate: jedz");

        zwiekszeZmeczenie(4);
    }

    @Override
    public abstract void wedruj() throws ZbytDuzeZmeczenieException;
}
