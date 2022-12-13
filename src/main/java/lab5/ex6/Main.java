package lab5.ex6;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex5\\output.txt";
        firstVarious(filePath);
        secondVarious(filePath);
        thirdVarious(filePath);
    }

    public static void firstVarious(String filepath) {
        BufferedReader in = null;
        try {
            in = createBufferReaderForFilepath(filepath);
            System.out.println(in.readLine());
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            close(in);
        }
    }

    private static BufferedReader createBufferReaderForFilepath(String filepath) throws IOException {
        return Files.newBufferedReader(Path.of(filepath), StandardCharsets.UTF_8);
    }

    private static void close(Closeable in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void secondVarious(String filepath) {
        BufferedReader in = null;
        try {
            try {
                in = createBufferReaderForFilepath(filepath);
                System.out.println(in.readLine());
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }

    public static void thirdVarious(String filepath) {
        try (BufferedReader in = createBufferReaderForFilepath(filepath)) {
            System.out.println(in.readLine());
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }
    }
}

