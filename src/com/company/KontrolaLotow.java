package com.company;

public class KontrolaLotow {

    public static void main(String[] args) {

        Lot lot = new Lot();

        Pasazer ania = new Pasazer("Ania", "Kowalska");
        Pasazer piotr = new Pasazer("Piotr", "Nowak");
        Pasazer roman = new Pasazer("Roman", "Grzgorczyk");

        Pasazer[] pasazerowie = { ania, piotr, roman};

        lot.dodajPasazerow(ania, piotr, roman);

    }
}
