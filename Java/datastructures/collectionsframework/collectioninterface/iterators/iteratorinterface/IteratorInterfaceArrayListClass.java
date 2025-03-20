package datastructures.collectionsframework.collectioninterface.iterators.iteratorinterface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterfaceArrayListClass {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Iterator<Integer> iterator = arrayList.iterator();

        // 1. E next()
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        // System.out.println(iterator.next()); java.util.NoSuchElementException
        // iterator.remove() removes 3

        
        // 2. void remove() 
        iterator = arrayList.iterator(); // re-intilize the iterator
        // iterator.remove(); java.lang.IllegalStateException
        iterator.next();
        iterator.remove();
        // iterator.remove(); java.lang.IllegalStateException
        iterator.next();
        iterator.remove();
        System.out.println(arrayList);





    }
    
}
