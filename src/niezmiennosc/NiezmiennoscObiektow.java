package niezmiennosc;

public class NiezmiennoscObiektow {

    public static void main(String[] args) {

        Pies pies1 = new Pies("azor");
        Pies pies2 = new Pies("burek");

        Pies pies11 = new Pies("azor");

        Pies pies3 = pies1;
        Pies pies4 = pies3;
        Pies pies5 = pies4;

        System.out.println(pies3 == pies1);
        System.out.println(pies3 == pies11);
        System.out.println(pies3.equals(pies11));

        System.out.println("MAIN: a = " + pies1 + ", b = " + pies2);
        System.out.println(pies3);
        System.out.println(pies4);
        System.out.println(pies5);

        swap(pies1, pies2);

        System.out.println("MAIN: a = " + pies1 + ", b = " + pies2);
        System.out.println(pies3);
        System.out.println(pies4);
        System.out.println(pies5);




    }

    private static void swap(Pies pies1, Pies pies2) {

        String tmp = pies1.getImie();
        pies1.setImie(pies2.getImie());
        pies2.setImie(tmp);

        System.out.println("SWAP: a = " + pies1 + ", b = " + pies2);

    }
}
