package rownosc;

public class Program {

    public static void main(String... args) {

        Lot lot1 = new Lot(123, '1');
        Lot lot2 = new Lot(123, '1');

        boolean isTheSame = lot1 == lot2;
        System.out.println("lot1 == lot2 = " + isTheSame);

        boolean isEquals = lot1.equals(lot2);
        System.out.println("lot1.equals(lot2) = " + isEquals);

        Lot lot3 = lot1;
        if (lot1.equals(lot3)) {
            System.out.println("lot1.equals(lot3)");
        }

        Pies pies = new Pies();

        if (lot1.equals(pies)) {
            System.out.println("lot to pies !!!");
        }

    }
}
