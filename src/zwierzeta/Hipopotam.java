package zwierzeta;

public class Hipopotam extends Zwierze {

    public Hipopotam(int glod, String terytorium, String polozenie) {
        super("hipopotam.png", Pozywienie.TRAWA, glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException {

        if (czyZeczony()) {
            throw new ZbytDuzeZmeczenieException();
        }

        System.out.println("Hipopotam: halasuj");
        zwiekszeZmeczenie(5);
    }

    @Override
    public void jedz() {
        System.out.println("Hipopotam: jedz");

        zwiekszeZmeczenie(7);
    }

    @Override
    public void wedruj() throws ZbytDuzeZmeczenieException {

        if (czyZeczony()) {
            throw new ZbytDuzeZmeczenieException();
        }

        System.out.println("Hipopotam: wedruj");
        zwiekszeZmeczenie(10);
    }
}
