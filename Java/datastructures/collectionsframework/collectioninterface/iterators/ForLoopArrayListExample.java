package datastructures.collectionsframework.collectioninterface.iterators;
import java.util.Collection;
import java.util.ArrayList;

public class ForLoopArrayListExample {
    public static void main(String[] args) {

        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("two");
        arrayList.add("three");


        /*
         * The loop is independent of size of the arrayListA.
         * This can be considered a logical flaw if you expect the loop to process all elements, including newly added ones.
         */
        int arrayListSize = arrayList.size();

        for (int i = 0; i < arrayListSize; i++) {

            // Adding new elements inside the loop
            arrayList.add("NewElement-" + i);
            System.out.println("Iteration " + i + ": " + arrayList);
            
        }
        System.out.println("Final List: " + arrayList);


        /*
         * The loop depends on the size of the arrayListB and it is changing during iteration.
         * This leads to infinite loop.
         */

        /*
        for (int i = 0; i < arrayList.size(); i++) {

            // Adding new elements inside the loop
            arrayListB.add(i);
            System.out.println("Iteration " + i + ": " + arrayListB);

        }
         */        

    }
}
