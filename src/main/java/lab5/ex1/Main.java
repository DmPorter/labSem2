package lab5.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(readValues("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex1\\test1.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Double> readValues(String filename) throws IOException {

        ArrayList<Double> arr = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNext()) {
                arr.add(Double.parseDouble(sc.next()));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
            throw new IOException("Неверное имя файла");
        }catch (NumberFormatException e){
            e.printStackTrace();
            throw new IOException("Неверный тип данных");
        }


        return arr;
    }
}
