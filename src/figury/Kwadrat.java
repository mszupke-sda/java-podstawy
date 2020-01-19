package figury;

public class Kwadrat extends Prostokat {

    private double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        super(dlugoscBoku, dlugoscBoku);
        this.dlugoscBoku = dlugoscBoku;
    }

//    public double obliczObwod() {
//        return dlugoscBoku * 4;
//    }
}
