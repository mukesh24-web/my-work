package Collection;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    @SuppressWarnings("unchecked")
    private final T[] items = (T[]) new Object[10]; // explicit type casting

    private int count; // initially 0

    public void add(T item) { // adding item T datatype
        items[count++] = item; // "a" - 0 and "b" - 1 now count - 2 (length)
    }

    public T get(int index) { // return type T
        return items[index]; // now we can access 0th and 1st index
    }

    // Iterable method(only one method available)
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    // Inner class
    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.count;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
