package figury;

public class Kolo {

    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double obliczPolePowierzchni() {
        return Math.PI * Math.pow(promien, 2);
    }

    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}
