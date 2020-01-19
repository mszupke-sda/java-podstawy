public class Kalkulator2 {

    public static void main(String[] args) {

        // 3 * 2 = 2 + 2 + 2

        int x = 3;
        int y = 2;

        int wynik = 0;

        for (int i = 100; i < x + 100; i++) {
            wynik = wynik + y;
        }

        System.out.println(x + " * " + y + " = " + wynik);
    }

}
