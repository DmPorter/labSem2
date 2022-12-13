package lab7.hashMapTest;

import java.util.HashMap;

//static final int TREEIFY_THRESHOLD = 8;

public class Test {
    public static void main(String[] args) {
        HashMap<TestClass, String> hashMap = new HashMap<>();

        for(int i = 0; i < 100; i ++) {
            hashMap.put(new TestClass(i), ""+ i);
        }
        System.out.println();
    }

}
