package datastructures.collectionsframework.collectioninterface.listinterface.arraylistclass.instancemethods;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.ArrayList;

import java.util.Collection;
//import java.util.List;


public class CollectionInterfaceInstanceMethods {

    public static void main(String[] args) {
        System.out.println();

        Collection<String> arrayList = new ArrayList<>();
        //List<String> arrayList = new ArrayList<>();

        // boolean add(E e)
        arrayList.add("Apple");
        arrayList.add("Ball");
        arrayList.add("Cat");
        System.out.println("After adding elements: " + arrayList);


        // boolean addAll(Collection<? extends E> c)
        Collection<String> moreFruits = new ArrayList<>();
        moreFruits.add("Date");
        moreFruits.add("Elderberry");
        arrayList.addAll(moreFruits);
        System.out.println("After adding more elements: " + arrayList);


        // void clear()
        // Uncomment to test clearing the collection
        // arrayList.clear();
        // System.out.println("After clearing: " + arrayList);


        // boolean contains(Object o)
        System.out.println("Contains 'Apple'? " + arrayList.contains("Apple"));
        System.out.println("Contains 'Fig'? " + arrayList.contains("Fig"));


        // boolean containsAll(Collection<?> c)
        Collection<String> testList = new ArrayList<>();
        testList.add("Apple");
        testList.add("Ball");
        System.out.println("Contains all in testList? " + arrayList.containsAll(testList));


        // boolean equals(Object o)
        Collection<String> otherList = new ArrayList<>();
        otherList.add("Apple");
        otherList.add("Ball");
        otherList.add("Cat");
        otherList.add("Date");
        otherList.add("Elderberry");
        System.out.println("Equals otherList? " + arrayList.equals(otherList));


        // int hashCode()
        System.out.println("Hash code: " + arrayList.hashCode());


        // boolean isEmpty()
        System.out.println("Is empty? " + arrayList.isEmpty());


        // int size()
        System.out.println("Size of the collection: " + arrayList.size());


        // Iterator<E> iterator()
        Iterator<String> iterator = arrayList.iterator();
        System.out.print("Using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        // Stream<E> stream()
        Stream<String> stream = arrayList.stream();
        System.out.print("Using stream: ");
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();


        // boolean remove(Object o)
        arrayList.remove("Apple");
        System.out.println("After removing 'Apple': " + arrayList);


        // boolean removeAll(Collection<?> c)
        Collection<String> removeList = new ArrayList<>();
        removeList.add("Ball");
        removeList.add("Cat");
        arrayList.removeAll(removeList);
        System.out.println("After removing all in removeList: " + arrayList);


        // boolean removeIf(Predicate<? super E> filter)
        arrayList.add("Grapes");
        arrayList.add("Guava");
        arrayList.removeIf(fruit -> fruit.startsWith("G"));
        System.out.println("After removing elements that start with 'G': " + arrayList);


        // boolean retainAll(Collection<?> c)
        Collection<String> retainList = new ArrayList<>();
        retainList.add("Date");
        arrayList.retainAll(retainList);
        System.out.println("After retaining only 'Date': " + arrayList);


        // Object[] toArray()
        Object[] array = arrayList.toArray();
        System.out.println("Array version of the collection: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();


        // <T> T[] toArray(T[] a)
        String[] stringArray = arrayList.toArray(new String[0]);
        System.out.println("Typed array version of the collection: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}