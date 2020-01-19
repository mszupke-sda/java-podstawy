package com.company;

public class Lot {

    private int liczbaPasazerow;
    private int numerLotu;
    private int iloscSiedzen = 150;
    private char klasa;
    private boolean[] czyMiejsceJestDostepne;
    private Pasazer[] pasazerowie;

    {
        czyMiejsceJestDostepne = new boolean[iloscSiedzen];
        for (int i = 0; i < iloscSiedzen; i++) {
            czyMiejsceJestDostepne[i] = true;
        }
    }

    {
        numerLotu = 11;
    }

    {
        liczbaPasazerow = 11;
    }

    public Lot() {

    }

    public Lot(int numerLotu) {
        this.numerLotu = numerLotu;
    }

    public Lot(char klasa) {
        this.klasa = klasa;
    }

    public void dodajPasazerow(Pasazer... pasazerowie) {
        this.pasazerowie = pasazerowie;

        for (Pasazer pasazer: pasazerowie) {
            System.out.println(pasazer);
        }
    }
}
