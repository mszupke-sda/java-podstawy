package figury;

public class Trojkat {

    private double podstawa;
    private double wysokosc;
    private double dlugoscPierwszegoBoku;
    private double dlugoscDrugiegoBoku;

    public Trojkat(double podstawa,
                   double wysokosc,
                   double dlugoscPierwszegoBoku,
                   double dlugoscDrugiegoBoku) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;

        // sprawdzić czy taki trójkąt jest geometrycznie poprawny
    }

    public double obliczPolePowierzchni() {
        return podstawa * wysokosc / 2;
    }

    public double obliczObwod() {
        return podstawa + dlugoscPierwszegoBoku + dlugoscDrugiegoBoku;
    }
}
