package queue;

import java.util.Stack;

public class StackQueue {
     Stack<Integer> s1 = new Stack<>();
     Stack<Integer> s2 = new Stack<>();

     public void enqueue(int val) {
         s1.push(val); // 10,20,30,40

     }

     // O(n)
     public int dequeue() {
         if(isEmpty()){
             throw new IllegalStateException("Null");
         }
         moveS1toS2();

         return s2.pop();
     }

     // O(n)
     public int peek() {
            if(isEmpty()){
                throw new IllegalStateException("Null");
            }
         moveS1toS2();
         return s2.peek();
     }

    private void moveS1toS2() {
        if(s2.isEmpty())
            while(!s1.isEmpty())
                s2.push(s1.pop());
    }

    public boolean isEmpty(){
         return s1.isEmpty() && s2.isEmpty();
     }



     @Override
     public String toString() {
         System.out.println(s2.toString());
         return s1.toString();
     }
}
