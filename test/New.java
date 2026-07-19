package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class New {
    static void main(String[] args){
//        double meal_cost = 12.00;
//        int tip_percent = 20;
//        int tax_percent = 8;
//        double tip = (meal_cost/100) * tip_percent;
//        double tax = ((double) tax_percent /100) * meal_cost;
//        double total = meal_cost + tip + tax;
//        System.out.println(tip);
//
//        System.out.printf("%.0f",total);

        /*
        char a = '1';
        int i = a - '0';
        int j = Integer.parseInt(String.valueOf(a));
        System.out.println(i);
        System.out.println(j);
        */



        /*
        String a = "a1b10";
        char[] b = a.toCharArray(); // a 1 b 1 0
        ArrayList<Integer> arr = new ArrayList<>();
        try {
            for(char c:b)
                arr.add(c - '0');
        } catch (NumberFormatException e) {

        }
        */
        /*
        int[] arr = {16,17,4,3,5,2};
        List<Integer> list = new ArrayList<>();
        int leader = arr[arr.length-1];
        list.add(leader);
        for(int i=arr.length-1;i>=0;i--) {
            if(leader<arr[i]) {
                list.add(arr[i]);
                leader = arr[i];
            }
        }
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
        */

        int n=6;
        int[] arr = {0,1,2,3,4,6};

        int sum = 0;
        for(int value:arr) {
            sum += value;
        }

        // n*(n+1)/2
        int sum1 = 0;
        for(int i=1;i<=n;i++) {
            sum1 += i;
        }

        System.out.println(sum1 - sum);
    }
}
