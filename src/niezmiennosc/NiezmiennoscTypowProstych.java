package niezmiennosc;

public class NiezmiennoscTypowProstych {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("MAIN: a = " + a + ", b = " + b);

        swap(a, b);

        System.out.println("MAIN: a = " + a + ", b = " + b);

    }

    private static void swap(int a, int b) {

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("SWAP: a = " + a + ", b = " + b);

    }

}
