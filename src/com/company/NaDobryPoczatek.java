//package com.company;
//
//import java.io.FileNotFoundException;
//
//public class NaDobryPoczatek {
//
//    public static void main(String[] args) {
//
//        /**
//         *
//         * Deklaruje zmienną całkowitą o nazwie "wielkosc" i przypisuje jej wartość 27
//         */
//        int wielkosc = 27;
//
//        /**
//         *
//         * Deklaruje zmienną łańcuchową o nazwie "imię" i przypisuje jej wartość "Azorek"
//         */
//        String imie = "Azorek";
//
//        /**
//         *
//         * Deklaruje zmienną typu Pies o nazwie "mojPies" i tworzy nowy obiekt klasy
//         * Pies, używając przy tym zmiennych "imie" i "wielkosc"
//         */
//        Pies mojPies = new Pies(imie, wielkosc);
//
//        /**
//         *
//         * Odejmuje liczbę 5 od 27 (wartości zmiennej "wielkosc") i wynik zapisuje
//         * w zmiennej "x"
//         */
//        int x = wielkosc - 5;
//
//        /**
//         *
//         * Jeśli wartość zmiennej x (czyli 22) jest mniejsza od 15, to każe psu
//         * zaszczekać 8 razy
//         */
//        if (x < 15)
//            mojPies.poszczekaj(8);
//            mojPies.poszczekaj(8);
//
//        /**
//         *
//         * wykonuje pętlę tak długo, jak długo wartość zmiennej x jest większa od 3...
//         */
//        while (x < 3 || y > 4) {
//            /**
//             *
//             * każe psu bawić się (cokolwiek to dla niego znaczy...)
//             */
//            mojPies.zabawa();
//            /**
//             *
//             * to wygląda na koniec pętli - cały kod umieszczony pomiędzy nawiasami {} jest
//             * wykonywany w pętli
//              */
//        }
//
//        /**
//         *
//         * Deklaruje zmienną "listaNum", którs będzie zawierać liczby całkowite
//         * i zapisuje w sniej liczby 2, 4, 6 i 8
//         */
//        int[] listaNum = { 2, 4, 6, 8 };
//
//        /**
//         *
//         * Wyświetla słowo "Witamy"... najprawdopodobniej w wierszu poleceń
//         */
//        System.out.println("Witamy");
//
//        /**
//         *
//         * Wyświetla tekst "Pies: Azorek" (zmienna "imie" ma wartość "Azorek")
//         * w wierszu poleceń
//         */
//        System.out.println("Pies: " + imie);
//
//        /**
//         *
//         * Deklaruje zmienną łańcuchową o nazwie "liczba" i zapisuje w niej znak "8"
//         */
//        String liczba = "8";
//
//        /**
//         *
//         * Konwertuje łańcuch zawierający znak "8" na liczbę o wartości 8
//         */
//        int z = Integer.parseInt(liczba);
//
//        /**
//         *
//         * Próbuje coś zrobić... jednak wcale nie ma gwarancji, że wykonanie operacji się
//         * powiedzie...
//         */
//        try {
//            /**
//             *
//             * odczytuje plik tekstowy o nazwie "mojPlik.txt" (a przynajmniej próbuje to zrobić...)
//             */
//            czytajPlik("mojPlik.txt");
//            /**
//             *
//             * ta próba kiedyś musi się skończyć, choć można by spróbować zrobić także inne
//             * rzeczy...
//             */
//        }
//        /**
//         *
//         * to chyba tu dowiadujemy się, czy nasza próba zakończyła się powodzeniem
//         */
//        catch (FileNotFoundException e) {
//            /**
//             *
//             * jeśli nie udało się wykonać zamierzonej operacji, w wierszu poleceń
//             * wyświetlany jest komunikat "Nie znaleziono pliku"
//             */
//            System.out.println("Nie znaleziono pliku");
//            /**
//             *
//             * wygląda na to, że wszystko, co umieszczono pomiędzy nawiasami {}, ma być
//             * wykonane w razie niepowodzenia operacji z bloku "try"...
//             */
//        }
//        catch (Exception ex) {
//
//        }
//    }
//}
