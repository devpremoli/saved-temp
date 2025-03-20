package datastructures.collectionsframework.abstractcollectionclass;


import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class UnmodifiableCollection<E> extends AbstractCollection<E> {
    private final E[] elements;

    public UnmodifiableCollection(E[] elements) {
        this.elements = elements;
    }

    // Implement the iterator method
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < elements.length;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return elements[index++];
            }
        };
    }

    // Implement the size method
    @Override
    public int size() {
        return elements.length;
    }

    
    public static void main(String[] args) {
        String[] data = {"A", "B", "C"};
        UnmodifiableCollection<String> collection = new UnmodifiableCollection<>(data);

        // Iterating over the collection
        for (String element : collection) {
            System.out.println(element);
        }

        // This will throw UnsupportedOperationException as it's unmodifiable
        // collection.add("D");  // Uncommenting this line will throw an exception

        System.out.println(collection.size());
    }
}