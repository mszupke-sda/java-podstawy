package interfejsy;

public class Zwierze {

    private Halasowanie halasowanie;
    private Jedzenie jedzenie;
    private Spanie spanie;
    private Wedrowanie wedrowanie;

    public Zwierze(Halasowanie halasowanie, Jedzenie jedzenie, Spanie spanie, Wedrowanie wedrowanie) {
        this.halasowanie = halasowanie;
        this.jedzenie = jedzenie;
        this.spanie = spanie;
        this.wedrowanie = wedrowanie;
    }

    public void halasuj() {
        halasowanie.halasuj();
    }

    public void jedz() {
        jedzenie.jedz();
    }

    public void spij() {
        spanie.spij();
    }

    public void wedruj() {
        wedrowanie.wedruj();
    }

}
