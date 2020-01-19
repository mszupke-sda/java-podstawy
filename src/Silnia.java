public class Silnia {

    public static void main(String[] args) {

        // silnia: n! = 1 * 2 * 3 * ... * n

        int n = 6;

        // 1 * 2 * 3 * 4 * 5 * 6

        int i = 1;
        int wynik = 1;

        while (i <= n) {
            wynik = wynik * i;
            i = i + 1;
        }

        System.out.println("n! = " + wynik + " (while)");
        wynik = 1;

        for (i = 1; i <= n; i++) {
            wynik = wynik * i;
        }

        System.out.println("n! = " + wynik + " (for)");
    }
}
