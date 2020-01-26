package zwierzeta;

public abstract class Zwierze {

    protected final String zdjecie;         // nazwa_pliku.png
    protected final Pozywienie pozywienie;      // mięszo, trawa
    protected final int glod;               // 1 - 10
    private String terytorium;      // 400 x 400
    private String polozenie;       // x = 3, y = 5
    private int zmeczenie;          // od 1 do n

    public Zwierze(String zdjecie, Pozywienie pozywienie, int glod, String terytorium, String polozenie) {
        this.zdjecie = zdjecie;
        this.pozywienie = pozywienie;
        this.glod = glod;
        this.terytorium = terytorium;
        this.polozenie = polozenie;
    }

    public abstract void halasuj() throws ZbytDuzeZmeczenieException;

    public abstract void jedz();

    public final void spij() {
        System.out.println("Zwierze: spij");

        zmeczenie = 0;
    }

    public abstract void wedruj() throws ZbytDuzeZmeczenieException;

    public void zwiekszeZmeczenie(int wartosc) {
        zmeczenie += wartosc;
    }

    public boolean czyZeczony() {
        return zmeczenie > 10;
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%d:%s:%s", zdjecie, pozywienie, glod, terytorium, polozenie);
    }
}
