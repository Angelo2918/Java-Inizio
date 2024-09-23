package Sesion_15_CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String... args) {
        Map<String, Integer> hasMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        hasMap.put("Romania", 20000000);
        hasMap.put("Germania", 85000000);
        hasMap.put("Franta", 6600600);


        treeMap.put("Romania", 2000000);
        treeMap.put("Germania", 8500000);
        treeMap.put("Franta", 6600600);

        System.out.println("hasMap" + hasMap);
        System.out.println("treemap" + treeMap);

        //print contains
        System.out.println("Contains Romania: " + hasMap.containsKey("Romania"));
        System.out.println("Contains 2000000" + treeMap.containsValue(2000000));


        for (String key : hasMap.keySet()) {
            System.out.println("Key : " + key + " - value " + hasMap.get(key));
        }

//+ var mapentri string intiger
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - value " + entry.getValue());
        }
//update
        hasMap.put("Romania", 1980000);
        System.out.println(hasMap);

        TreeMap<String, Integer> tree = new TreeMap<>(treeMap);

        System.out.println("Prima intrare: " + tree.firstEntry());
        System.out.println("Ultima intrare: " + tree.lastEntry());
        System.out.println("Intrare inferioara Germania: " + tree.lowerEntry("Germania"));
        System.out.println("Intrare superioara Germania: " + tree.higherEntry("Germania"));


    }
}
