package zwierzeta;

public class Tygrys extends Kotowate {

    public Tygrys(int glod, String terytorium, String polozenie) {
        super("tygrys.png", glod, terytorium, polozenie);
    }

    @Override
    public void halasuj() throws ZbytDuzeZmeczenieException {
        System.out.println("Tygrys: halasuj");

        zwiekszeZmeczenie(1);
    }

    @Override
    public void wedruj() throws ZbytDuzeZmeczenieException {
        System.out.println("Tygrys: wedruj");

        zwiekszeZmeczenie(1);
    }
}
