package datastructures.collectionsframework.collectioninterface.listinterface.linkedlistclass;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.LinkedList;

import java.util.Collection;
//import java.util.List;


public class CollectionInterfaceInstanceMethods {

    public static void main(String[] args) {
        System.out.println();

        Collection<String> linkedList = new LinkedList<>();
        //List<String> linkedList = new LinkedList<>();

        // boolean add(E e)
        linkedList.add("Apple");
        linkedList.add("Ball");
        linkedList.add("Cat");
        System.out.println("After adding elements: " + linkedList);


        // boolean addAll(Collection<? extends E> c)
        Collection<String> moreFruits = new LinkedList<>();
        moreFruits.add("Date");
        moreFruits.add("Elderberry");
        linkedList.addAll(moreFruits);
        System.out.println("After adding more elements: " + linkedList);


        // void clear()
        // Uncomment to test clearing the collection
        // linkedList.clear();
        // System.out.println("After clearing: " + linkedList);


        // boolean contains(Object o)
        System.out.println("Contains 'Apple'? " + linkedList.contains("Apple"));
        System.out.println("Contains 'Fig'? " + linkedList.contains("Fig"));


        // boolean containsAll(Collection<?> c)
        Collection<String> testList = new LinkedList<>();
        testList.add("Apple");
        testList.add("Ball");
        System.out.println("Contains all in testList? " + linkedList.containsAll(testList));


        // boolean equals(Object o)
        Collection<String> otherList = new LinkedList<>();
        otherList.add("Apple");
        otherList.add("Ball");
        otherList.add("Cat");
        otherList.add("Date");
        otherList.add("Elderberry");
        System.out.println("Equals otherList? " + linkedList.equals(otherList));


        // int hashCode()
        System.out.println("Hash code: " + linkedList.hashCode());


        // boolean isEmpty()
        System.out.println("Is empty? " + linkedList.isEmpty());


        // int size()
        System.out.println("Size of the collection: " + linkedList.size());


        // Iterator<E> iterator()
        Iterator<String> iterator = linkedList.iterator();
        System.out.print("Using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        // Stream<E> stream()
        Stream<String> stream = linkedList.stream();
        System.out.print("Using stream: ");
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();


        // boolean remove(Object o)
        linkedList.remove("Apple");
        System.out.println("After removing 'Apple': " + linkedList);


        // boolean removeAll(Collection<?> c)
        Collection<String> removeList = new LinkedList<>();
        removeList.add("Ball");
        removeList.add("Cat");
        linkedList.removeAll(removeList);
        System.out.println("After removing all in removeList: " + linkedList);


        // boolean removeIf(Predicate<? super E> filter)
        linkedList.add("Grapes");
        linkedList.add("Guava");
        linkedList.removeIf(fruit -> fruit.startsWith("G"));
        System.out.println("After removing elements that start with 'G': " + linkedList);


        // boolean retainAll(Collection<?> c)
        Collection<String> retainList = new LinkedList<>();
        retainList.add("Date");
        linkedList.retainAll(retainList);
        System.out.println("After retaining only 'Date': " + linkedList);


        // Object[] toArray()
        Object[] array = linkedList.toArray();
        System.out.println("Array version of the collection: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();


        // <T> T[] toArray(T[] a)
        String[] stringArray = linkedList.toArray(new String[0]);
        System.out.println("Typed array version of the collection: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
