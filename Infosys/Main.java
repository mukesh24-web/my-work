package Infosys;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Map<Integer,Integer> odd = new HashMap<>();
        Map<Integer,Integer> even = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] != arr[j]) {
                    sum = Math.abs(arr[i] - arr[j]);
                    if (sum % 2 != 0) {
                        odd.put(sum, odd.getOrDefault(sum, 0) + 1);
                    } else {
                        even.put(sum, even.getOrDefault(sum, 0) + 1);
                    }
                }
            }
        }

        System.out.println(odd);
        System.out.println(even);


        int m = 0;
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> map:odd.entrySet()) {
            if(map.getKey()<min) {
                min = map.getKey();
                m = map.getValue();
            }
        }
        int m1 = 0;
        int min1 = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> map:even.entrySet()) {
            if(map.getKey()<min1) {
                min1 = map.getKey();
                m1 = map.getValue();
            }
        }


        int sum1 = 0;
        int c = m;
        while(c>0) {
            sum1 += min;
            c--;
        }
        int sum2 = 0;
        int c1 = m1;
        while(c1>0) {
            sum2 += min1;
            c1--;
        }
        if(m>m1) {
            System.out.println(sum2);
        } else {
            System.out.println(sum1);
        }

    }
}