package zadania;

import java.util.Arrays;

public class Zadanie5 {

    // Napisz program, który wykona kopię tablicy element po elemencie

    public static void main(String[] args) {

        int[] tablica = { 1, 2, 3, 4, 6, 7, 12, 78, 123, 5001 };
        int[] kopia = new int[tablica.length];

        for (int i = 0; i < tablica.length; i++) {
            kopia[i] = tablica[i];
        }

        System.out.print(Arrays.toString(kopia));

//        for (int i = 0; i < kopia.length; i++) {
//            System.out.print(kopia[i] + " ");
//        }

    }

}
