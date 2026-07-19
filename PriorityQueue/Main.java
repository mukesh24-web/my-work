package PriorityQueue;

// sharing a resource amongst many consumers
// queue - operation enqueue,dequeue, peek, isEmpty all are O(1)
// import java.util.PriorityQueue;

import java.util.Collections;

public class Main {
    static void main(String[] args){

        // This queue sort the all the element that been inserted
        // implement using arrays,heap

        /*
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(5);
        pq.add(4);
        pq.add(2);
        pq.add(3);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        */

        // Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(6);
        pq.add(100);

        while(!pq.isEmpty())
            System.out.print(pq.remove() + " "); // remove high value first

        pq.isEmpty();

        System.out.println();
        System.out.println(pq);

    }
}
