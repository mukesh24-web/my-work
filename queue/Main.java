package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Queue is a interface
// so queue does not have implementation
// so use ArrayDeque class which have the all queue implementation
// queue can be implemented by array,stack,linked list

public class Main {
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> s = new Stack<>();
        while(!queue.isEmpty())
            s.push(queue.remove());
        while(!s.isEmpty())
            queue.add(s.pop());
    }

    /*
    * 1. keyword buffer
    * 2. Printer Queue
    * 3. used in linked list , priority Queue, breath first search
    * */

    public static void main(String[] args) {
        // Queue is a interface
        // Queue<String> queue = new LinkedList<>();
        /*
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.offer(30); // if the queue is full, the element will not be added
        */
        // q.peek();
        // q.element();

        // System.out.println(q.remove());
        // System.out.println(q.poll()); // no exception - return special case

        // System.out.println(queue.isEmpty());
        // System.out.println(q.size());
        // System.out.println(queue.contains("HI")); // return boolean value
        // reverse(q);
        // System.out.println(q);

        /*
        ArrayQueue aq = new ArrayQueue(5);
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        aq.enqueue(40);
        aq.enqueue(50);
        // aq.enqueue(20);
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        aq.dequeue();
        System.out.println(aq.peek());
        System.out.println(aq);
        */

        StackQueue st = new StackQueue();
        st.enqueue(10);
        st.enqueue(20);
        st.enqueue(30);
        st.enqueue(40);
        st.enqueue(50);
//        st.dequeue();
//        st.dequeue();
//        st.dequeue();
//        st.dequeue();
//        st.dequeue();


        System.out.println(st);
    }


}
