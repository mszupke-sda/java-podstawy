package klasyoslonowe;

public class Program {

    public static void main(String... args) {

        autoboxing();
        unboxing();
        stringConversion();
        members();
    }

    private static void autoboxing() {

        Integer inum = 3; // autoboxing int --> Integer
        // Integer inum = Integer.valueOf(3);

        Long lnum = 32L; // autoboxing long --> Long
        // Long lnum = Long.valueOf(32L);
    }

    private static void unboxing() {

        Integer inum = new Integer(5);
        int num = inum; // unboxing: obiekt Integer --> int
        // int num = inum.intValue();
    }

    private static void stringConversion() {

        Integer inum = 5;
        String snum = inum.toString();

        Long lnum = Long.parseLong("32");
    }

    private static void members() {

        System.out.println("Byte MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Byte MAX_VALUE = " + Byte.MAX_VALUE);

        System.out.println("Short MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short MAX_VALUE = " + Short.MAX_VALUE);

        System.out.println("Integer MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Long MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long MAX_VALUE = " + Long.MAX_VALUE);

        System.out.println("Float MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float MAX_VALUE = " + Float.MAX_VALUE);

        System.out.println("Double MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double MAX_VALUE = " + Double.MAX_VALUE);

    }

}
