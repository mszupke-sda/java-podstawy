package zwierzeta;

public abstract class Zwierze {

    private String zdjecie;         // nazwa_pliku.png
    private String pozywienie;      // mięszo, trawa
    private int glod;               // 1 - 10
    private String terytorium;      // 400 x 400
    private String polozenie;       // x = 3, y = 5

    public Zwierze(String zdjecie, String pozywienie, int glod, String terytorium, String polozenie) {
        this.zdjecie = zdjecie;
        this.pozywienie = pozywienie;
        this.glod = glod;
        this.terytorium = terytorium;
        this.polozenie = polozenie;
    }

    public abstract void halasuj();

    public abstract void jedz();

    public final void spij() {
        System.out.println("Zwierze: spij");
    }

    public abstract void wedruj();
}
