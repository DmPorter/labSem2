package lab5.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Suppressed {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream("Hello");
        } catch (FileNotFoundException e) {
            throw new IOException(e);
        } finally {
            fileIn.close();
        }
    }
}
