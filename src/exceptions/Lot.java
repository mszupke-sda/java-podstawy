package exceptions;

import com.company.Pasazer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lot {

    int liczbaPasazerow;

    public void dodajPasazerow(String filename) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                liczbaPasazerow += Integer.valueOf(parts[0]);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
