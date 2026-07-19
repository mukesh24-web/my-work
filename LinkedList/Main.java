package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void collectionLinkedList(){
        // Linked list is a class inside collection interface
        // LinkedList implement collection interface
        // store in non-consecutive memory locations

        LinkedList<Integer> list =new LinkedList<>();
        // if we doesn't specify any class as datatype <>
        LinkedList list1 = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // treat as stack
        list.push(1);
        list.push(2); // top - [2, 1]
        list.pop(); // [1]

        // treat as queue
        list.offer(1);
        list.offer(2); // [1,2]
        list.poll(); // [2]

        list.addFirst(1);
        list.add(1,5); // add at particular index - O(n)
        list.add(2); // add at last

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.peek());

        System.out.println(list.removeFirst());
        list.removeLast();
        list.remove(1);

        System.out.println(list.contains(10)); // return boolean
        System.out.println(list.indexOf(20)); // return index value
        System.out.println(list.size());

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list);
    }

    static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(20); // duplicates are allowed
        list.addLast(30);

        list.addFirst(40);
        list.addFirst(50);
        list.addFirst(60);

        list.print();

        // System.out.println(list.indexOf(20));
        // System.out.println(list.contains(70));
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();

//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();
//        list.removeLast();



        list.print();

    }
}
