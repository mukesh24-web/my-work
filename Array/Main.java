package Array;

import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        /*
        Array num = new Array(3);
        num.insert(10);
        num.insert(20);
        num.insert(30);
        num.insert(40);
        // num.insert(50);
        num.removeAt(1);
        System.out.println(num.indexOf(100));
        num.print();
        System.out.println(num.count);
        */
        // Vector: 100% - synchronized (single thread)

        // grow 50% when the array get full
        /*
        ArrayList<Integer> list = new ArrayList<>(); // int
        list.add(10);
        list.add(20);
        list.add(20);
        // list.remove(0);
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));
        System.out.println(list.contains(20));
        System.out.println(list.size());
        System.out.println(list.toArray()); // convert to regular array
        System.out.println(list);
        */

        Array array = new Array(3);
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,2,3};
        System.out.println(array.intersect(arr1,arr2));
        System.out.println(Arrays.toString(arr1));
        // System.out.println(array.reverse(arr1));

        /*
        * lookup index O(1)
        * lookup value O(n)
        * insert O(n)
        * delete O(n)
        * */
    }
}
