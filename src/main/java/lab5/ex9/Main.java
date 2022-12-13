package lab5.ex9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Именно по этому, если происходят ошибки, то программа останавливается, а пользователю выводится stackTrace.
//Но пользователю не нужно даже задумываться об этом, если он все сделал правильно.

//Может лишить смысла, потому что если есть ошибка, то она вылетит и отобазится в консоли

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex9\\file1.txt"));
//        while(true){
//            sc.nextLine();
//        }
        PrintWriter printWriter = new PrintWriter("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab5\\ex9\\file1.txt");
        printWriter.println();

    }
}
