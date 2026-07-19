package Sorting;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] array) {
        int length = array.length;
        if(length<=1) return;
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];
        int j = 0;
        for(int i=0;i<length;i++) {
            if(i<middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);
    }

    private void merge(int[] leftArray,int[] rightArray,int[] array) {
        int leftSize = array.length/2;
        int rightSize = array.length-leftSize;

        int i=0,l=0,r=0;

        while(l<leftSize && r<rightSize) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }

        while(l<leftSize) {
            array[i] = leftArray[l];
            l++;
            i++;
        }
        while(r<rightSize) {
            array[i] = rightArray[r];
            r++;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] array = {5,7,8,6,4,3};
        MergeSort sort = new MergeSort();
        sort.mergeSort(array);

        Arrays.stream(array).forEach(n -> System.out.print(n + " "));
        // Arrays.stream(array).forEach(n -> System.out.print(n + " "));
    }
}
