import java.util.Map;
import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMapA = new HashMap<>();
        
        // -----------------------------------------------------------------------------------------------------------------------------------
        // Methods declared in Map Interface

        /*
        put(K key, V value)
        Associates the specified value with the specified key in this map (optional operation).
         */ 
        hashMapA.put("Apple", 10);
        hashMapA.put("Ball", 20);
        hashMapA.put("Cat", 30);

        /*
        get(Object key)
        - Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
         */
        System.out.println("Number of Apples: " + hashMapA.get("Apple")); 


        // // -----------------------------------------------------------------------------------------------------------------------------------
        // Methods declared in Map Interface



    }

}