package com.company;

public class Lot {

    private int liczbaPasazerow;
    private int numerLotu;
    private int iloscSiedzen = 150;
    private char klasa;
    private boolean[] czyMiejsceJestDostepne;

    public Lot() {
        czyMiejsceJestDostepne = new boolean[iloscSiedzen];
        for (int i = 0; i < iloscSiedzen; i++) {
            czyMiejsceJestDostepne[i] = true;
        }
    }

    public Lot(int numerLotu) {
        this();
        this.numerLotu = numerLotu;
    }

    public Lot(char klasa) {
        this();
        this.klasa = klasa;
    }
}
