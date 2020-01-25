package rownosc;

public class Lot {

    private int numerLotu;
    private char klasa;

    public Lot(int numerLotu, char klasa) {
        this.numerLotu = numerLotu;
        this.klasa = klasa;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Lot)) {
            return false;
        }

        if (super.equals(o)) {
            return true;
        }

        Lot other = (Lot) o;

        if (this.numerLotu != other.numerLotu) {
            return false;
        }

        if (this.klasa != other.klasa) {
            return false;
        }

        return true;
    }

}
