package datastructures.collectionsframework.mapinterface.hashmapclass;

import java.util.Map;
import java.util.HashMap;

public class MapInterfaceInstanceMethods {

    public static void main(String[] args) {
        
        Map<Integer, String> hashMap = new HashMap<>();

        /*
         ***************************************************************
         * Method: V put(K key, V value)
         * 
         * Description:
         * Associates the specified value with the specified key in this map (optional operation).
         * If the map previously contained a mapping for the key, the old value is replaced by the specified value.
         * 
         * Returns:
         * - the previous value associated with key, or null if there was no mapping for key.
         ***************************************************************
         */
        System.out.println();
        System.out.println("Method: V put(K key, V value)");

        String nullValue = hashMap.put(1, "One");
        System.out.println(nullValue);
        
        String prevValue = hashMap.put(1, "one");
        System.out.println(prevValue);

        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");

        System.out.println(hashMap);



        /*
         ***************************************************************
         * Method: V get(Object key)
         * 
         * Returns:
         *   - the value to which the specified key is mapped, or null if this map contains no mapping for the key.
         ***************************************************************
         */
        System.out.println();
        System.out.println("Method: V get(Object key)");
        
        String noKey = hashMap.get(6);
        System.out.println(noKey);

        String valueof1Key = hashMap.get(1);
        System.out.println(valueof1Key);



        /*
         ***************************************************************
         * Method: default V getOrDefault(Object key, V defaultValue)
         * 
         * Returns:
         *   - the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
         ***************************************************************
         */
        System.out.println();
        System.out.println("default V getOrDefault(Object key, V defaultValue)");

        System.out.println(hashMap.getOrDefault(6, "No mapping of 6 key"));
        System.out.println(hashMap.getOrDefault(1, "No mapping of 1 Key"));



        /*
         ***************************************************************
         * Method: V remove(Object key)
         * 
         * Description:
         * - Removes the entry for the specified key only if it is currently mapped to the specified value
         * - optional operation
         * 
         * Returns:
         * - the previous value associated with key, or null if there was no mapping for key.
         ***************************************************************
         */
        System.out.println();
        System.out.println("Method: V remove(Object key)");

        System.out.println(hashMap.remove(6));

        System.out.println(hashMap.put(6, "six"));
        System.out.println(hashMap.remove(6));






        /*
         ***************************************************************
         * Method: default boolean remove(Object key, Object value)
         * 
         * Description:
         * - Removes the entry for the specified key only if it is currently mapped to the specified value
         * - optional operation
         * 
         * Returns:
         * - true if the value was removed
         ***************************************************************
         */
        System.out.println();
        System.out.println("Method: default boolean remove(Object key, Object value)");

        boolean isRemoved = hashMap.remove(1, "One");
        System.out.println(isRemoved);
        System.out.println(hashMap);

        isRemoved = hashMap.remove(1, "one");
        System.out.println(isRemoved);
        System.out.println(hashMap);



        // int size()
        System.out.println();
        System.out.println("Method: int size()");
        System.out.println(hashMap.size());

        // 
        /*
         ***************************************************************
         * Method: void clear()
         * 
         * Description:
         * - Removes all of the mappings from this map (optional operation)
         * 
         * Throws:
         * - UnsupportedOperationException if the clear operation is not supported by this map
         ***************************************************************
         */
        System.out.println();
        System.out.println("Method: void clear()");

        //hashMap.clear();
        System.out.println(hashMap);


        /*
        ***************************************************************
        * Method: void putAll(Map<? extends K, ? extends V> m)
        * 
        * Description:
        * - Copies all of the mappings from the specified map to this map.
        * - These mappings will replace any mappings that this map had for any of the keys currently in the specified map.
        ***************************************************************
        */
        System.out.println();
        System.out.println("Method: void putAll(Map<? extends K, ? extends V> m)");

        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(1, "ONE");
        anotherMap.put(2, "TWO");
        anotherMap.put(6, "SIX");

        hashMap.putAll(anotherMap);
        System.out.println(hashMap);     







    }





    
}
