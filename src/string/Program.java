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

        s1 = s2;

    }
}
