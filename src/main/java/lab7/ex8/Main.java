package lab7.ex8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(wordsInFile("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab7\\ex7\\file.txt"));

    }

    public static Set<String> wordsInFile(String path){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Set<String> stringSet = new HashSet<>();
            for(var line: bufferedReader.lines().toList()){
                for(var val: line.split(" ")){
                    if(!Objects.equals(val, "")) {
                        stringSet.add(val);
                    }
                }
            }
            return stringSet;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
