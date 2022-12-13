package lab5.dop1;

import lab5.suppressed.Exmpl;

import java.nio.file.Path;

public class Main {
    public static final Path FILENAME = Path.of("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex1\\test.txt");
    public static final Path FILENAME1 = Path.of("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex1\\test.txt");
    public static void main(String[] args) {
        try(Exmpl ex1 = new Exmpl("1");
            Exmpl ex2 = new Exmpl("2");
            Exmpl ex3 = new Exmpl("3"))
        {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
