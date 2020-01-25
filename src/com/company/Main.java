package com.company;

public class Main {

    public static void main(String... args) {

        byte a = 26;
        short b = 266;
        int c = 123456;
        long d = 5678654L;

        float f = 26.2f;
        double g = 0.0000000001d;

        char regularU = 'U';
        char accentedU = '\u00DA';

        boolean czyLubieJave = true;

        System.out.println(accentedU);

        int myVal = 10;

        myVal *= 1 + 2;

        myVal = myVal * (1 + 2);

        Y y = new Y();
    }

    private static class X
    {
        int m = 1111;

        {
            m = m++;

            System.out.println(m);
        }
    }

    private static class Y extends X
    {
        {
            System.out.println(methodOfY());
        }

        int methodOfY()
        {
            return m-- + --m;
        }
    }

}


