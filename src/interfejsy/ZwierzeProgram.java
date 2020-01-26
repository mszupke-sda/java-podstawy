package interfejsy;

public class ZwierzeProgram {

    public static void main(String[] args) {

        Halasowanie halasowanie = new Ryczenie();
        Jedzenie jedzenie = new JedzenieMiesa();
        Spanie spanie = new SpanieNaPodlodze();
        Wedrowanie wedrowanie = new ChodzenieNaNogach();

        Zwierze pies = new Zwierze(halasowanie, jedzenie, spanie, wedrowanie);

        pies.spij();
        pies.jedz();
        pies.halasuj();
        pies.wedruj();

    }
}
