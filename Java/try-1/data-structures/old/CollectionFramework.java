import java.util.*;

class CollectionInterface {

    public static void printCollection(Collection<?> collection) {
        for (Object element : collection) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // ArrayList
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("ball");
        boolean isContain = arrayList.contains("apple");
        System.out.println(isContain);
        int arraySize = arrayList.size();
        System.out.println(arraySize);
        Object[] myArray = arrayList.toArray();
        System.out.println(myArray[0]);
        // 
    }
}