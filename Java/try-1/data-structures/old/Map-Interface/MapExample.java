import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Access elements
        System.out.println("Apple's Quantity: " + map.get("Apple"));

        // Check if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is available in the map.");
        }

        // Iterate through key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Remove an element
        map.remove("Apple");

        // Print the map
        System.out.println("Map after removal: " + map);
    }
}

