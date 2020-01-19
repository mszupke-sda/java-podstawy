package com.company;

public class Zadanie4 {

    public static void main(String[] args) {

        int[] tablica = {1, 4, 6, 7, 8, 13, 99, 124, 88 };
        int szukanaLiczba = 99;


        int indeks = znajdzLiczbe(tablica, szukanaLiczba);
        System.out.print(indeks);


    }

    private static int znajdzLiczbe(int[] tab, int szukanaLiczba) {

        for (int i = 0; i < tab.length; i++) {

            if (tab[i] == szukanaLiczba) {
                return i;
            }

        }


        return -1;

    }
}
