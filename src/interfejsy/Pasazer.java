package interfejsy;

public class Pasazer implements Comparable {

    private int poziom; // 3 - platinum, 2 - gold, 1 - silver
    private int dlugoscCzlonkostwa;

    public Pasazer(int poziom, int dlugoscCzlonkostwa) {
        this.poziom = poziom;
        this.dlugoscCzlonkostwa = dlugoscCzlonkostwa;
    }

    @Override
    public int compareTo(Object o) {

        Pasazer other = (Pasazer) o;

        if (poziom > other.poziom) {
            return -1;
        } else if (poziom < other.poziom) {
            return 1;
        } else {
            if (dlugoscCzlonkostwa > other.dlugoscCzlonkostwa) {
                return -1;
            } else if (dlugoscCzlonkostwa < other.dlugoscCzlonkostwa) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
