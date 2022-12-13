package lab7.ex7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(countSameWordsFromFile("C:\\Users\\dmitr\\IdeaProjects\\labSem2\\src\\main\\java\\lab7\\ex7\\file.txt"));
    }

    public static Map<String, Integer> countSameWordsFromFile(String path){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Map<String, Integer> treeMap = new TreeMap<>();
            for(var line: bufferedReader.lines().toList()){
                for(var val: line.split(" ")){
                    if(!Objects.equals(val, "")) {
                        treeMap.merge(val, 1, Integer::sum);
//                        if (treeMap.containsKey(val)) treeMap.put(val, treeMap.get(val) + 1);
//                        else treeMap.put(val, 1);
                    }
                }
            }
            return treeMap;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
