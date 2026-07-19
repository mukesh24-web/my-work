package queue;

import java.util.Arrays;

// Circular array

public class ArrayQueue {
     private int[] arr;
     private int rear;
     private int front;
     private int count;

     public ArrayQueue(int capacity) {
         arr = new int[capacity];
     }

     public void enqueue(int val){
         if(count == arr.length) // 5 == 5
             throw new IllegalStateException("out of bound");

         arr[rear] = val; // 0
         rear = (rear + 1) % arr.length; // 1, 2, 3, 4
         count++; // 12345
     }

     public int dequeue() {
         if(isEmpty()){
             throw new IllegalStateException("null");
         }
         int item = arr[front]; // storefront element
         arr[front] = 0; // replace front element with zero
         front = (front + 1) % arr.length;
         return item; // return the front element
     }

     public boolean isEmpty() {
         return arr[front] == 0;
     }

     public int peek(){
         return arr[front];
     }

     @Override
     public String toString(){
         return Arrays.toString(arr);
     }




}
