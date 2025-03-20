package datastructures.collectionsframework.mapinterface.hashmapclass.views;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class EntrySetMethod {

    public static void main(String[] args) {
        
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "one");
        hashMap.put(2, "TWO");
        hashMap.put(4, "three");


        // Adding
        Set<Map.Entry<Integer, String>> newEntries = new HashSet<>();

        for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            if (entry.getKey() == 4) {
                newEntries.add(Map.entry(4, "four"));
            }

        }
    }
    
}
