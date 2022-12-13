package lab5.ex5;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = null;
        PrintWriter out = null;
        try{
            in = new Scanner(Paths.get("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex5\\test.txt"));
            out = new PrintWriter("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex5\\output.txt");
            while (in.hasNext()) out.println(in.next().toLowerCase());

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Smth wrong");
        } finally {
            close(in);
            System.out.println("in closed");
            close(out);
            System.out.println("out closed");
        }
    }

    private static void close(Closeable out) {
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}