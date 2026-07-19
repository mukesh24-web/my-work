package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// if you're working with index mean list interface is best
// where collection doesn't support indexing
public class List_Interface {
    public static void show() {
        List<String> list = new ArrayList<>();
        /*
        list.add("a");
        list.add("b");
        list.add(0,"!"); // add as a first item
        */
        Collections.addAll(list,"a","b","c");
        list.remove(0);
        System.out.println(list.indexOf("a")); // index (found) : -1 (not found)
        System.out.println(list.lastIndexOf("a")); // a,d,c,a -> 3
        System.out.println(list.subList(0,2)); // From inclusive and to exclusive
        System.out.println(list);
    }
}
