package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array,int start,int end) {
        if(end<=start) return; // why we need to swap single element

        int pivot = partition(array,start,end);
        quickSort(array,start,pivot-1);
        quickSort(array,pivot+1,end);
    }
    private static int partition(int[] array,int start,int end) {
        int pivot = array[end];
        int i = start-1; // i is last pivot position
        for(int j=start;j<end;j++) { // to avoid duplicate to get swaped j<end
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end]; // end -> pivot
        array[end] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] array = {5,4,6,7,8,2,3};
        int start = 0;
        int end = array.length-1;
        quickSort(array,start,end);
        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }
}
