package lab5.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        System.out.println(readValues("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex1\\test.txt", arr));
        System.out.println(arr);

        Double res = 0.0;

        System.out.println(sumOfValues("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex1\\test.txt", res));
        System.out.println(res);

    }

    public static int readValues(String filename, ArrayList<Double> arr) {

        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNext()) {
                arr.add(Double.parseDouble(sc.next()));
            }
        }catch (FileNotFoundException e) {
            return 1;
        }catch (NumberFormatException e){
            return -1;
        }

        return 0;
    }

    public static int sumOfValues(String filename, Double res) {
        ArrayList<Double> arr = new ArrayList<>();
        int er = readValues(filename, arr);
        if (er != 0) return er;
        for(var val : arr){
            res += val;
        }

        return 0;
    }

}
