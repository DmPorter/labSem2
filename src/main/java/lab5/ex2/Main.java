package lab5.ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(sumOfValues("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex1\\test.txt"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static double sumOfValues(String filename) throws IOException {
        double sum = 0;
        for(var val: lab5.ex1.Main.readValues(filename)){
            sum += val;
        }
        return sum;
    }
}
