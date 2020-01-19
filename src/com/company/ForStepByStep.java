package com.company;

public class ForStepByStep {

    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 4, 5};
        int wynik = 0;

        for (int i = tablica.length - 1; i >= 0; i = i - 1) {
            wynik = wynik + tablica[i];
        }

        int i = 0;
        wynik = wynik + tablica[i];

        i = 1; //i++
        wynik = wynik + tablica[i];

        i = 2; //i++
        wynik = wynik + tablica[i];

        i = 3; //i++
        wynik = wynik + tablica[i];

        i = 4; //i++
        wynik = wynik + tablica[i];

        i = 5; //i++

        System.out.println(wynik);

    }

}
