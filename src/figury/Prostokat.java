package figury;

public class Prostokat {

    private double dlugoscPierwszegoBoku;
    private double dlugoscDrugiegoBoku;

    public Prostokat(double dlugoscPierwszegoBoku, double dlugoscDrugiegoBoku) {
        this.dlugoscPierwszegoBoku = dlugoscPierwszegoBoku;
        this.dlugoscDrugiegoBoku = dlugoscDrugiegoBoku;
    }

    public double obliczPolePowierzchni() {
        return dlugoscDrugiegoBoku * dlugoscPierwszegoBoku;
    }

    public double obliczObwod() {
        return dlugoscPierwszegoBoku * 2 + dlugoscDrugiegoBoku * 2;
    }
}
