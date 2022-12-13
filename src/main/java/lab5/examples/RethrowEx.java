package lab5.examples;

import java.io.IOException;

public class RethrowEx {
    public static void main(String[] args) throws IOException {
        String name = null;
        try {
            name.equals("Dima");
        } catch (Exception e) {
            //log
            throw e;
        }
    }
}
