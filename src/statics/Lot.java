package statics;

public class Lot {

    int liczbaPasazerow;

    static int wszyscyPasazerowie;

    public void dodajPasazera() {
        liczbaPasazerow += 1;
        wszyscyPasazerowie += 1;
    }

    public static void test() {
        Math.sqrt(2);
    }

}
