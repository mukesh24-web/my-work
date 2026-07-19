package SetAndHashSet;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Set<String> names = new HashSet<>();

        names.add("Mike");
        names.add("Walter");
        names.add("Ichigo");
        // names.add("Walter"); // don't allow duplicate

        names.remove("Walter"); // can't remove with index
        // names.remove(0); // It will not work

        // names.clear();

        System.out.println(names.size());
        System.out.println(names.contains("Ichigo"));
        System.out.println(names.isEmpty());
        System.out.println(names); // no order

        for(String name: names) {
            System.out.print(name + " ");
        }

        System.out.println();

        names.forEach(System.out::println);

        System.out.println();
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.print(namesIterator.next()+" ");
        }

        System.out.println();

        // remove duplicate

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<6;i++)
            list.add(i);
        list.add(1);

        System.out.println(list);

        Set<Integer> list1 = new HashSet<>();
        list1.addAll(list);

        System.out.println(list1);


    }
}
