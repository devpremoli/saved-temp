package array_list;

import java.util.HashMap;

public class ArrayListExample {

    public static void main(String[] args) {
        HashMap<String, Integer> mapA = new HashMap<>();

        // Add key-value pairs to the HashMap
        mapA.put("Apple", 1);
        mapA.put("Banana", 2);
        mapA.put("Cat", 3);

        // Retrieve a value using a key
        System.out.println("Value of key Apple: " + mapA.get("Apple"));
        System.out.println("Value of not exisitng key Dog: " + mapA.getOrDefault("Dog", 0));
        


    }
    
}
