package datastructures.collectionsframework.collectioninterface.listinterface.arraylistclass.instancemethods;

import java.util.ArrayList;

public class ArrayListClassInstanceMethods {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements for demonstration
        arrayList.add("Apple");
        arrayList.add("Ball");
        arrayList.add("Cat");
        arrayList.add("Dog");
        System.out.println("Initial List: " + arrayList);


        // 1. ensureCapacity(int minCapacity) - Ensures capacity for at least minCapacity elements
        arrayList.ensureCapacity(20);  // Not visibly affecting output but internally it allocates more capacity
        System.out.println("Ensured capacity for 20 elements.");


        // 2. trimToSize() - Trims the capacity of the ArrayList to its current size
        arrayList.trimToSize();  // Internally it reduces memory usage
        System.out.println("Trimmed capacity to the size of the list.");


        // 3. clone() - Creates a shallow copy of the ArrayList

        //ArrayList<String> clonedList = (ArrayList<String>) arrayList.clone(); // casting it directly to ArrayList<String> can potentially lead to a ClassCastException if the cast is incorrect.
        //System.out.println("Cloned List: " + clonedList);

        ArrayList<String> clonedList = new ArrayList<>(arrayList);
        System.out.println("Cloned List: " + clonedList);


        // 4. forEach(Consumer<? super E> action) - Performs an action for each element
        System.out.print("Iterating with forEach: ");
        arrayList.forEach(item -> System.out.print(item + " "));
        System.out.println();


        // 5. replaceAll(UnaryOperator<E> operator) - Replaces each element with the result of applying the operator
        arrayList.replaceAll(item -> item.toUpperCase());
        System.out.println("After replaceAll (to upper case): " + arrayList);
    }
}
