package string;

public class Program {

    public static void main(String[] args) {

        String s1 = "I Love";
        s1 += " Java";

        String s2 = "I";
        s2 += " Love Java";

        if (s1 == s2) {
            System.out.println("s1 == s2");
        }

        if (s1.equals(s2)) {
            System.out.println(s1.equals(s2));
        }

        String a = String.valueOf(34);

        System.out.println(String.format("Lubię javę %d razy", 10));

        System.out.printf("Lubię javę %d razy", 10);

        System.out.println("Lubię javę " + 10 + " razy");
        System.out.println("Lubię javę " + String.valueOf(10) + " razy");

    }
}
