package lab5.dop;

import lab5.dop.exceptions.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                CommandHandler.callCommand(scanner.nextLine());
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }


    }
}
