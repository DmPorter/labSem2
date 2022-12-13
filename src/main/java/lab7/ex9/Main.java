package lab7.ex9;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);
        Integer key = 1;

        System.out.println(map);

        if(map.containsKey(key)){
            map.put(key, map.get(key) + 1);
        }else{
            map.put(key, 1);
        }

        System.out.println(map);

        if(map.get(key) != null){
            map.put(key, map.get(key) + 1);
        }else{
            map.put(key, 1);
        }

        System.out.println(map);

        map.getOrDefault(key, 0);
        map.put(key, map.get(key) + 1);

        System.out.println(map);

        map.putIfAbsent(key, 0);
        map.put(key, map.get(key) + 1);

        System.out.println(map);
    }


}
