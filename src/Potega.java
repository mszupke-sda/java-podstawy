public class Potega {

    public static void main(String[] args) {

        int podstawa = 2;
        int potega = 5;

        // 2^5 = 2 * 2 * 2 * 2 * 2

        int i = 0;
        int wynik = 1;

        while (i < potega) {
            wynik = wynik * podstawa;
            i++;
        }

        System.out.println(podstawa + " do potęgi " + potega + " = " + wynik + " (while)");
        wynik = 1;

        for (i = 0; i < potega; i++) {
            wynik = wynik * podstawa;
        }

        System.out.println(podstawa + " do potęgi " + potega + " = " + wynik + " (for)");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
