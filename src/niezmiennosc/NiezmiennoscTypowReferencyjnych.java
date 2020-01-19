package niezmiennosc;

public class NiezmiennoscTypowReferencyjnych {

    public static void main(String[] args) {

        Pies pies1 = new Pies("azor");
        Pies pies2 = new Pies("burek");

        System.out.println("MAIN: a = " + pies1 + ", b = " + pies2);

        swap(pies1, pies2);

        System.out.println("MAIN: a = " + pies1 + ", b = " + pies2);

    }

    private static void swap(Pies pies1, Pies pies2) {

        Pies tmp = pies1;
        pies1 = pies2;
        pies2 = tmp;

        System.out.println("SWAP: a = " + pies1 + ", b = " + pies2);

    }
}
