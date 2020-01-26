package interfejsy;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Pasazer bob = new Pasazer(1, 180);
        Pasazer jane = new Pasazer(1, 90);
        Pasazer steve = new Pasazer(2, 180);
        Pasazer lisa = new Pasazer(3, 730);

        Pasazer[] pasazerowie = { bob, jane, steve, lisa };
        Arrays.sort(pasazerowie);

    }
}
