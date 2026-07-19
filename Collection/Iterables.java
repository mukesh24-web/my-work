package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterables {
    public static void main(String args[]) {

        // The need for iterable
        /*
        GenericList<String> list = new GenericList<>();
        list.add("a");
        list.add("b");
        */

        /*
        // if we change the implementation then the code will crash
        list.items[0] = "a";
        System.out.println(list.items.length);
        */

        /*
        for(String item:list.items){ // exposing internal implementation
            System.out.println(item);
        }
        */

        // If I change the items list in future the code will broken

        GenericList<String> list = new GenericList<>();
        list.add("a");
        list.add("b");
        /*
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
        }
        */
        for(String value:list) { // iterate through for each loop
            System.out.println(value);
        }

        /*
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        for(int item:list1) {
            System.out.println(item);
        }

        Iterator<Integer> iterator = list1.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        */

    }
}
