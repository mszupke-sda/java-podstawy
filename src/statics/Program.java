package statics;

public class Program {

    public static void main(String[] args) {

        System.out.println(Lot.wszyscyPasazerowie);

        Lot lot1 = new Lot();
        Lot lot2 = new Lot();

        lot1.dodajPasazera();
        lot1.dodajPasazera();

        lot2.dodajPasazera();

        System.out.println(Lot.wszyscyPasazerowie);
    }

    public class Nested {

    }
}
