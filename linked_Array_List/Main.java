package linked_Array_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<1000000;i++) {
            array.add(i);
            list.add(i);
        }

        long startTime;
        long endTime;
        long elapsedTime;

        startTime = System.nanoTime();

        list.get(0); // worst
        // list.get(500000); // worst
        // list.get(999999); // worst
        // list.remove(0); // better
        // list.remove(500000); // same
        // list.remove(999999); // worst

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("ListList: " + elapsedTime + " ns");

        startTime = System.nanoTime();

        array.get(0); // better
        // array.get(500000); // better
        // array.get(999999); // better
        // array.remove(0); // worst
        // array.remove(500000); // same
        // array.remove(999999); // better

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("ArrayList: " + elapsedTime + " ns");
    }
}
