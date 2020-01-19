package com.company;

public class Test {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        while (x < 5) {

            // początek

            // bloki kodu                       // porządane wyniki

            // opcja 1                          // opcja 1
            // y = x - y;                       // 22 46

            // opcja 2                          // opcja 2
            // y = y + x;                       // 11 34 59

            // opcja 3                          // opcja 3
            // y = y + 2;                       // 02 14 26 38
            // if (x > 4) {
            //   y = y - 1;                     // opcja 4
            // }                                // 02 14 36 48

            // opcja 4                          // opcja 5
            // x = x + 1;                       // 00 11 21 32 42
            // y = y + x;
                                                // opcja 6
            // opcja 5                          // 11 21 32 42 53
            // if (y < 5) {
            //   x = x + 1;                     // opcja 7
            //   if (y < 3) {                   // 00 11 23 36 410
            //     x = x - 1;
            //   }                              // opcja 8
            // }                                // 02 14 25 36 47
            // y = y + 2;

            //koniec

            System.out.println(x + "x" + y + " ");
        }
    }
}
