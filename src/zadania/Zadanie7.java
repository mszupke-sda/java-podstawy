package zadania;

import java.util.Arrays;

public class Zadanie7 {

    // Napisz program, który wykorzystując instrukcję switch sprawdzi,
    // czy podana liczba jest parzysta czy nieparzysta

    public static void main(String[] args) {

        int liczba = 4;
        switch (liczba % 2) {
            case 0:
                System.out.println("Liczba jest parzysta");
                break;
            case 1:
                System.out.println("Licba jest nieparzysta");
                break;
            default:
                System.out.println("Coś poszło nie tak");
        }

    }

}
