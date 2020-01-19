package com.company;

public class Zadanie1 {

    public static void main(String[] args) {

        // 12345 -> 54321

        int liczba = 12345;

        while(liczba > 0) {
            System.out.print(liczba % 10);
            // liczba /= 10;
            liczba = liczba / 10;
        }

    }
}
