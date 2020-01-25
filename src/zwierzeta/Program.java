package zwierzeta;

public class Program {

    public static void main(String[] args) {

        Zwierze pies = new Pies(1, "100x100", "3:14");
        pies.halasuj();
        pies.jedz();
        pies.spij();
        pies.wedruj();

        // Kot kot = new Kot(1, "100x100", "2:3");
    }
}
