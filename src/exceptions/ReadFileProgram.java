package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileProgram {

    public static void main (String[] args) {

        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("src/exceptions/Numbers.txt"));

            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.parseInt(line);
            }

            System.out.printf("Total = %d", total);

            metoda();

        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (NumberFormatException e) {

        } catch (MojWlasnyWyjatekException e) {

        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }

        }

        try {
            String eee = "eee";
            Integer.parseInt(eee);
        } catch (Exception e) {

        }



//        try {
//
//            reader = new BufferedReader(new FileReader("src/exceptions/Numbers.txt"));
//
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                total += Integer.parseInt(line);
//            }
//
//            System.out.printf("Total = %d", total);
//
//        } catch (Exception e) {
//            System.out.println(e.getLocalizedMessage());
//        } finally {
//
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (Exception e) {
//                System.out.println(e.getLocalizedMessage());
//            }
//
//        }

    }

    private static void metoda() throws MojWlasnyWyjatekException {
        if (true) {
            throw new MojWlasnyWyjatekException();
        } else {
            // nic nie rób
        }
    }
}
