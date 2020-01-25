package zwierzeta;

public abstract class Psowate extends Zwierze {

    public Psowate(String zdjecie, int glod, String terytorium, String polozenie) {
        super(zdjecie, "mięso", glod, terytorium, polozenie);
    }

    @Override
    public abstract void halasuj();

    @Override
    public final void jedz() {
        System.out.println("Psowate: jedz");
    }

    @Override
    public abstract void wedruj();
}
