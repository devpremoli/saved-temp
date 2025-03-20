package datastructures.collectionsframework.collectioninterface.listinterface.listiteratorinterface;


import java.util.List;
import java.util.ListIterator;

import java.util.ArrayList;
//import java.util.LinkedList;


public class ArrayListClass {

    public static void main(String[] args) {
        
        List<String> arrayList = new ArrayList<>();
        //List<String> arrayList = new LinkedList<>();

        arrayList.add("0");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");


        ListIterator<String> listIteratorNext = arrayList.listIterator();

        // hasNext(), nextIndex(), next()
        while (listIteratorNext.hasNext()) {

            int index = listIteratorNext.nextIndex();
            System.out.println("index: " + index);

            String element = listIteratorNext.next();
            System.out.println("element: " + element);
        }

        // hasNext(), previousIndex(), previous()
        int n = arrayList.size();
        ListIterator<String> listIteratorPrevious = arrayList.listIterator(n);

        while (listIteratorPrevious.hasPrevious()) {

            int index = listIteratorNext.previousIndex();
            System.out.println("index: " + index);

            String element = listIteratorPrevious.previous();
            System.out.println("element: " + element);
        }


        System.out.println();
        // boolean add (E e), void remove()
        listIteratorNext = arrayList.listIterator();

        while (listIteratorNext.hasNext()) {

            int index = listIteratorNext.nextIndex();
            System.out.println("index: " + index);

            if (index == 1) {
                listIteratorNext.add("added 1");
                System.out.println(arrayList);
                listIteratorNext.previous();
            }

            String element = listIteratorNext.next();
            System.out.println("element: " + element);

            if (element.equals("added 11")) {
                listIteratorNext.remove();
            }
        }
        System.out.println(arrayList);
    }
    
}
