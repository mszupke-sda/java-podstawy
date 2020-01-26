package innerclass;

public class A {

    public double srednia(int[] tablica) {
        return 0;
    }

    private static A instance;

    private A() {

    }

    public static A init() {
        if (instance == null) {
            instance = new A();
        }

        return instance;
    }

    private int a;

    protected class B {

        public void test() {
            a = 4;
        }
    }

}
