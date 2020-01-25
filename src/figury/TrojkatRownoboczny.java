package figury;

public class TrojkatRownoboczny extends Trojkat {

    private double dlugoscBoku;

    public TrojkatRownoboczny(double dlugoscBoku) {
        super(dlugoscBoku, dlugoscBoku * Math.sqrt(2) / 2, dlugoscBoku, dlugoscBoku);

        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public double obliczPolePowierzchni() {

        double bazowePole = super.obliczPolePowierzchni();
        double pole = Math.pow(dlugoscBoku, 2) * Math.sqrt(3) / 4;

        if (bazowePole == pole) {
            System.out.println("Wszystko ok");
        } else {
            System.out.println("Coś poszło nie tak :(");
        }

        return pole;
    }
}
