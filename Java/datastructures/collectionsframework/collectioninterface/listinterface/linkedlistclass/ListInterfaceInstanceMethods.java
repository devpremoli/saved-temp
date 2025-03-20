package datastructures.collectionsframework.collectioninterface.listinterface.linkedlistclass;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceInstanceMethods {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        // Adding elements to the list for demonstration
        linkedList.add("Apple");
        linkedList.add("Ball");
        linkedList.add("Cat");
        linkedList.add("Dog");
        System.out.println("Initial List: " + linkedList);


        // 1. void add(int index, E element) - Insert element at a specific index
        linkedList.add(1, "Bat");
        System.out.println("After adding 'Bat' at index 1: " + linkedList);


        // 2. boolean addAll(int index, Collection<? extends E> c) - Add all elements from a collection at a specific index
        List<String> additionalFruits = new LinkedList<>();
        additionalFruits.add("Elephant");
        additionalFruits.add("Frog");
        linkedList.addAll(2, additionalFruits);
        System.out.println("After adding additional elements at index 2: " + linkedList);


        // 3. E get(int index) - Get element at a specific index
        System.out.println("Element at index 3: " + linkedList.get(3));


        // 4. int indexOf(Object o) - Get index of the first occurrence of the specified element
        System.out.println("Index of 'Dog': " + linkedList.indexOf("Dog"));


        // 5. int lastIndexOf(Object o) - Get index of the last occurrence of the specified element
        linkedList.add("Dog");  // Adding another 'Dog' to demonstrate lastIndexOf
        System.out.println("Last index of 'Dog': " + linkedList.lastIndexOf("Dog"));


        // 6. E remove(int index) - Remove element at a specific index
        linkedList.remove(2);
        System.out.println("After removing element at index 2: " + linkedList);


        // 7. E set(int index, E element) - Replace element at a specific index
        linkedList.set(1, "Banana");
        System.out.println("After setting 'Banana' at index 1: " + linkedList);


        // 8. List<E> subList(int fromIndex, int toIndex) - Get a sublist from the list
        List<String> subList = linkedList.subList(1, 4);
        System.out.println("Sublist from index 1 to 4: " + subList);


        // 9. ListIterator<E> listIterator() - Get a list iterator for the list
        System.out.print("Using listIterator: ");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();


        // 10. ListIterator<E> listIterator(int index) - Get a list iterator starting from a specific index
        System.out.print("Using listIterator from index 2: ");
        ListIterator<String> listIteratorFromIndex = linkedList.listIterator(2);
        while (listIteratorFromIndex.hasNext()) {
            System.out.print(listIteratorFromIndex.next() + " ");
        }
        System.out.println();
    }
}
