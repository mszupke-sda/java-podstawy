package zwierzeta;

public class Program {

    public static void main(String[] args) {

        Zwierze pies = new Pies(1, "100x100", "3:14");

        try {
            pies.spij();
            pies.jedz();
            pies.halasuj();
            pies.wedruj();
            pies.jedz();
            pies.wedruj();

        } catch (ZbytDuzeZmeczenieException e) {
            System.out.println("Pies zbyt zmęczony. Czas na sen");
            e.printStackTrace();
            pies.spij();
        }

        System.out.println(pies);

        switch (pies.pozywienie) {
            case MIESO:

                break;
            case TRAWA:

                break;
        }

        // Kot kot = new Kot(1, "100x100", "2:3");
    }
}
