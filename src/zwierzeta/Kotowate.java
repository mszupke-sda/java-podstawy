package zwierzeta;

public abstract class Kotowate extends Zwierze {

    public Kotowate(String zdjecie, int glod, String terytorium, String polozenie) {
        super(zdjecie, "mięso", glod, terytorium, polozenie);
    }

    @Override
    public abstract void halasuj();

    @Override
    public final void jedz() {
        System.out.println("Kotowate: jedz");
    }

    @Override
    public abstract void wedruj();
}
