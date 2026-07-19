package Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> arr;
    private int i=0;

    public Heap(int capacity) {
        this.arr = new ArrayList<>(capacity);
    }

    public int peek() {
        if(!arr.isEmpty()) {
            return arr.getFirst();
        }
        return -1;
    }

    public void insert(int val) {
        arr.add(i,val); // add in last place
        swim(i);
        i++;
    }

    private void swim(int k) { // if it is first element no need to swap for that k>1
        while(k>0 && arr.get((k-1)/2)<arr.get(k)) { // check parent val is less than new value
            // parent is less so new val need to swap
            swap(k,(k-1)/2);
            k = (k-1)/2; // new value index now become parent value index
        }
    }

    private void swap(int a,int b){
        int temp = arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,temp);
    }

    public int remove() {
        int max = arr.getFirst();
        swap(0,arr.size()-1);

        arr.removeLast();
        i--;

        sink(0);

        return max;
    }

    private void sink(int k) {
        while((2*k)+1 < arr.size()) { // left child is existed or not
            int j = (2*k)+1;

            // choose larger child
            if(j+1<arr.size() && arr.get(j) < arr.get(j+1)) {
                j++;
            }

            // if parent is already larger, stop
            if(arr.get(k) >= arr.get(j)) { // parent >= left child -> break
                break;
            }
            swap(k,j);
            System.out.println(arr);
            k = j;
        }
    }

    public static void main(String[] args) {
        Heap mh = new Heap(5);
        mh.insert(10);
        mh.insert(20);
        mh.insert(30);
        mh.insert(40);
        System.out.println(mh.remove());
        System.out.println(mh.arr);
    }
}
