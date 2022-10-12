package test;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new HashMap<Integer, String>();
        // add elements to map
        map.put(1, "Java");
        map.put(3, "C++");
        map.put(2, "PHP");
        map.put(4, "Python");
        // show map
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        System.out.println(map.get(1));
    }
}
