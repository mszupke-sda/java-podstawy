package zadania;

import java.util.Arrays;

public class Zadanie6 {

    // Napisz program, który wyznaczy najmniejszą i największą wartość w tablicy

    public static void main(String[] args) {

        int[] tablica = { 800, -1, 67, 4, 15, -88, 801, 55, 11, 0 };

        int min;
        int max;

        if (tablica.length > 0) {
            min = tablica[0];
            max = tablica[0];
        } else {
            return;
        }

        for (int val : tablica) {

            if (val > max) {
                max = val;
            }

            if (val < min) {
                min = val;
            }

        }

        System.out.print("Dla tablicy " + Arrays.toString(tablica) +
                " wartość minimalna to " + min + ", a wartość maksymalna to " + max);

    }

}
