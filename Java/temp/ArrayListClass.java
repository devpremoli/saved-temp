package temp;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListClass {



    public static void main(String[] args) {


        System.out.println();


        // 1. Instance Methods inherited from Collection<E> inteface to List<E> interface
        
        System.out.println("1. collectionArrayList\n");
        Collection<String> collectionArrayList = new ArrayList<>();
        
        
        // 1.a boolean add(E e)
        System.out.println("1.a boolean add(E e)");

        boolean isAppleAdded = collectionArrayList.add("Apple");
        collectionArrayList.add("Ball");
        collectionArrayList.add("Cat");
        System.out.println("isAppleAdded: " + isAppleAdded + "\n");

        
        // 1.b boolean contains(Object o)
        System.out.println("1.b boolean contains(Object o)");

        boolean containsApple = collectionArrayList.contains("Apple");
        System.out.println("containsApple: " + containsApple);
        System.out.println("collectionArrayList: " + collectionArrayList + "\n");
        // boolean containsInt = collectionArrayList.contains(1); warning, not error
        //System.out.println("containsInt: " + containsInt);


        // 1.c boolean isEmpty()
        System.out.println("1.c boolean isEmpty()");

        System.out.println(collectionArrayList.isEmpty() + "\n");


        // 1.d boolean equals(Object o)
        System.out.println("1.d boolean equals(Object o)");

        Collection<String> compareArrayList = new ArrayList<>();
        compareArrayList.add("Apple");
        compareArrayList.add("Ball");
        compareArrayList.add("Cat");

        ArrayList<String> anotherCompareArrayList = new ArrayList<>();
        anotherCompareArrayList.add("Cat");
        anotherCompareArrayList.add("Ball");
        anotherCompareArrayList.add("Apple");

        System.out.println("compareArrayList: " + compareArrayList);
        System.out.println("collectionArrayList.equals(compareArrayList): " + collectionArrayList.equals(compareArrayList));
        System.out.println("anotherCompareArrayList: " + anotherCompareArrayList);
        System.out.println("collectionArrayList.equals(anotherCompareArrayList): " + collectionArrayList.equals(anotherCompareArrayList) + "\n");
        

        // 1.e Iterator<E> iterator()
        System.out.println("1.e Iterator<E> iterator() specified in Iterable<E>");

        Iterator<String> iterator = collectionArrayList.iterator();
        System.out.println("Iterator over collectionArrayList: ");

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element + " ");
        }
        System.out.println();


        // 1.f boolean remove(Object 0)
        System.out.println("1.f boolean remove(Object 0)");

        collectionArrayList.add("Apple");
        System.out.println("collectionArrayList: " + collectionArrayList);
        boolean isAppleRemoved = collectionArrayList.remove("Apple");
        boolean isDogRemoved = collectionArrayList.remove("Dog");
        System.out.println("isAppleRemoved: " + isAppleRemoved);
        System.out.println("isDogRemoved: " + isDogRemoved);
        System.out.println("collectionArrayList: " + collectionArrayList + "\n");


        // 1.g int Size()
        System.out.println("1.g int Size()");

        System.out.println("collectionArrayList.size(): " + collectionArrayList.size() + "\n");


        // 1.h Object[] toArray()
        System.out.println("1.h Object[] toArray()");

        Object[] arraylistArray = collectionArrayList.toArray();
        System.out.println("Elements in collectionArrayList as array:");
        for (Object obj : arraylistArray) {
            System.out.print(obj + " ");
        }
        System.out.println("\n" + "\n");



        // 2. listArrayList
        System.out.println("2. listArrayList\n");       
        List<String> listArrayList = new ArrayList<>();
        

        // 2.a void addFirst(E e)
        System.out.println("2.a void addFirst(E e)");

        listArrayList.addFirst("ball");
        listArrayList.addFirst("apple");
        System.out.println("listArrayList: " + listArrayList + "\n");


        // 2.b void addLast(E e)
        System.out.println("2.b void addLast(E e)");

        listArrayList.addLast("cat");
        System.out.println("listArrayList: " + listArrayList + "\n");


        // 2.c E get(int index)
        System.out.println("2.c E get(int index)");

        System.out.println(listArrayList.get(0) + "\n");


        // 2.d default E getFirst()
        System.out.println("2.d default E getFirst()");

        System.out.println(listArrayList.getFirst() + "\n");


        // 2.e default E getlast()
        System.out.println("2.e default E getlast()");
        
        System.out.println(listArrayList.getLast() + "\n");


        System.out.println("listiterator()");
        System.out.println(listArrayList);

        ListIterator<String> listIterator = listArrayList.listIterator();



        // Adding after apple
        while (listIterator.hasNext()) {

            String apple = listIterator.next();
            
            if (apple.equals("apple")) {
                listIterator.add("aeroplane");
            }

            if (listIterator.nextIndex() == listArrayList.size()) {
                listIterator.add("cow");
            }
        }
        System.out.println(listArrayList);


        ListIterator<String> listIteratorIndex = listArrayList.listIterator(1);

        while (listIteratorIndex.hasNext()) {

            System.out.println(listIteratorIndex.nextIndex());
            listIteratorIndex.next();
            
        }

    }
    
}
