package Hasmap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//        Map<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Ronaldo", 36);
//        hashMap.put("Messi", 35);
//        hashMap.put("Rooney", 35);
//        hashMap.put("Zidane", 40);
//        System.out.println(hashMap + " ");
//
//
//        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(40,1, false);
        linkedHashMap.put("Ronaldo", 30);
        linkedHashMap.put("Messi", 35);
        linkedHashMap.put("Rooney", 35);
        linkedHashMap.put("Zidane", 40);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Ronaldo"));



    }
}
