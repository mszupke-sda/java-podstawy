package figury;

public class Program {

    Kolo k;

    public static void main(String[] args) {

        obliczTrojkat();
        obliczKwadrat();
        obliczProstokat();
        obliczKolo();

        // Math.PI;
        System.out.println(Math.pow(5, 2));
    }

    private static void obliczTrojkat() {
        Trojkat trojkat = new Trojkat(5,
                7,
                5,
                5);

        double obwodTrojkata = trojkat.obliczObwod();
        double poleTrojkata = trojkat.obliczPolePowierzchni();

        System.out.println("Obwód trójkąta: " + obwodTrojkata);
        System.out.println("Pole powierzchni trójkąta " + poleTrojkata);
    }

    private static void obliczKwadrat() {
        Kwadrat kwadrat = new Kwadrat(5);


        double obwodKwadratu = kwadrat.obliczObwod();
        double poleKwadratu = kwadrat.obliczPolePowierzchni();

        System.out.println("Obwód kwadratu: " + obwodKwadratu);
        System.out.println("Pole powierzchni kwadratu " + poleKwadratu);
    }

    private static void obliczProstokat() {
        Prostokat prostokat = new Prostokat(5, 10);

        double poleProstokatu = prostokat.obliczPolePowierzchni();
        double obwodProstokatu = prostokat.obliczObwod();

        System.out.println("Obwód prostokąta: " + obwodProstokatu);
        System.out.println("Pole powierzchni prostokąta " + poleProstokatu);
    }

    private static void obliczKolo() {
        Kolo kolo = new Kolo(19);

        double poleKola = kolo.obliczPolePowierzchni();
        double obwodKola = kolo.obliczObwod();

        System.out.println("Obwód koła: " + obwodKola);
        System.out.println("Pole powierzchni koła " + poleKola);
    }

}
