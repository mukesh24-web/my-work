package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    private int[] items;
    public int count;

    Array(int size){
        items = new int[size];
    }

    public void print(){
        for(int i = 0; i<count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        // If the array is full, resize it
        if(items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];
            // Copy all the existing items
            for(int i=0; i < count; i++) {
                newItems[i] = items[i];
            }
            // set "items" to this new array
            items = newItems;
        }
        // add the new item at end
        items[count++] = item; // 0,1,2,'3'
    }

    public int indexOf(int item){
        // If we find it, return index
        // Otherwise, return -1
        // O(n)
        for (int i = 0; i < count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index){
        // Validate the index
        if(index<0 || index >= count){
            throw new IllegalArgumentException("Out of bound");
        }
        // shift the items to the left to fill the hole
        for(int i=index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public ArrayList<Integer> intersect(int[] arr1,int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i< arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }
        return list;
    }

    public String reverse(int[] arr){
        int a = arr.length - 1;
        int temp = 0;
        int j = 0;
        for (int i = a; i<arr.length; i++){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
        return Arrays.toString(arr);
    }
}
