package PriorityQueue;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items = new int[5];
    private int count;

    public void add(int item) {
        if(isFull()) { // 5 == 5
            throw new IllegalStateException("out of bound");
        }
        // shifting elements
        int i = getI(item); // get the index position

        // -1 + 1 = 0
        items[i] = item; // (0 index handle here) [1, 2]
        count++;
    }

    private int getI(int item) {
        int i;
        for(i=count-1; i>=0; i--) { // 43210
            if(items[i] > item) // [1,2,3,4,5] > 3 [2] > 1
                items[i + 1] = items[i]; // [2, 2]
            else
                break;
        }
        return i + 1;
    }

    public int remove() {
        if(isEmpty())
            throw new IllegalStateException("Null");

        return items[--count]; // 5 -> --count -> 4
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
