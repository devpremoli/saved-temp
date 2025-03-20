package datastructures.collectionsframework.collectioninterface.iterators.iteratorinterface;

import java.util.Iterator;
import java.util.Collection;
import java.util.NoSuchElementException;

public class CustomIteratorCustomCollection<E> implements Collection<E> {
    private E[] elements;
    private int size = 0;

    // Constructor that initializes the collection with a fixed capacity
    @SuppressWarnings("unchecked")
    public CustomIteratorCustomCollection(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    // Adds an element to the collection
    @Override
    public boolean add(E e) {
        if (size >= elements.length) {
            return false; // No more space
        }
        elements[size++] = e;
        return true;
    }

    // Returns the number of elements in the collection
    @Override
    public int size() {
        return size;
    }

    // Returns an iterator to traverse the elements sequentially
    @Override
    public Iterator<E> iterator() {
        return new CustomIterator();
    }

    // Custom iterator implementation
    private class CustomIterator implements Iterator<E> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    // Other methods required by Collection<E> are not implemented for simplicity
    // (empty stubs to make it compilable)
    @Override public boolean isEmpty() { return size == 0; }
    @Override public boolean contains(Object o) { return false; }
    @Override public Object[] toArray() { return new Object[0]; }
    @Override public <T> T[] toArray(T[] a) { return null; }
    @Override public boolean remove(Object o) { return false; }
    @Override public boolean containsAll(Collection<?> c) { return false; }
    @Override public boolean addAll(Collection<? extends E> c) { return false; }
    @Override public boolean removeAll(Collection<?> c) { return false; }
    @Override public boolean retainAll(Collection<?> c) { return false; }
    @Override public void clear() {}

    public static void main(String[] args) {
        Collection<String> customCollection = new CustomIteratorCustomCollection<>(5);
        customCollection.add("A");
        customCollection.add("B");
        customCollection.add("C");

        // Using the iterator to traverse the collection
        for (String item : customCollection) {
            System.out.println(item);
        }
    }
}
