package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection_Generic_Interface<T> {
    // Every collection are iterable
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        /*
        collection.add("a");
        collection.add("b");
        collection.add("c");
        */

        // adding multiple items in one line
        // Collections are another class
        Collections.addAll(collection, "a","b","c");

        // size of collection size
        System.out.println(collection.size());

        // remove particular element
        collection.remove("a");


        System.out.println(collection);

        // clear all the element
        collection.clear();

        // check weather that element is available or not
        boolean containA = collection.contains("a");
        System.out.println(containA);

        // we can't access the string method
        Object[] objectArray = collection.toArray();

        // we can access the string method here
        String[] stringArray = collection.toArray(new String[0]);
        // no need to specify size in above line

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other); // address are not same
        System.out.println(collection.equals(other)); // value is consider here

        for(String item: collection)
            System.out.println(item);
    }
}
