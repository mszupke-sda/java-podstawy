package enums;

public class Program {

    public static void main(String... args) {

        Kolor kolor = Kolor.CZERWONY;

        switch (kolor) {
            case CZERWONY:
                System.out.println("kolor czerwony");
                break;
            case NIEBIESKI:
                System.out.println("kolor niebieski");
                break;
            case ZIELONY:
                System.out.println("kolor czerwony");
                break;
        }

    }
}
