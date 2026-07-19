package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test01 {
    static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        ArrayList<String> arr = new ArrayList<>();
//        String s;
//        while(true){
//            s = scan.nextLine();
//            arr.add(s);
//            if(s.endsWith("end-of-file.")){
//                break;
//            }
//        }
//
//        for(int i=0;i<arr.size();i++){
//            System.out.println(i+1 + " " + arr.get(i));
//        }
        /*
        ArrayList<Integer> arr = new ArrayList<>();

        int n = 1587;
        if(n%2==0){
            // int i = 0;
            while(n!=0){
                arr.add(n%2); // reminder will be added
                n /= 2; // changing the n value
                // i++;
            }
            // arr.add(1);
        } else {
            // int j = 0;
            while(n!=0){
                arr.add(n%2);
                n /= 2;
                // j++;
            }
        }
        */

        /*
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(0));
        int count = 0;
        int a;
        int b;
        for(int i=0; i<arr.size()-1; i++){ // 0-9
            a = arr.get(i);
            b = arr.get(i+1);
            if((a == b) && (a == 1)) {
                count += 2;
                i++;
            }
        }
        System.out.println(count);
         */
        /*
        int h = 100;
        int x = 20;
        int y = 5;
        int count = 0;
        int c = x-y;
        while(h>0) {
            h -= c;
            count++;
        }
        System.out.println(count);
        */

        /*
        String a = "abasbhaidb";
        boolean isSpam = false;
        for(int i=0;i<a.length()-2;i++) {
            if(a.charAt(i) == a.charAt(i+1)) {
                if(a.charAt(i) == a.charAt(i+2)) {
                    isSpam = true;
                }
            }
        }
        if(isSpam) {
            System.out.println("Spam");
        } else {
            System.out.println("Safe");
        }
        */



    }
    public static boolean isPalindrome(String s,int i,int j) {
        while(i != j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        List<String> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            for(int j=s.length()-1;j>=0;j--) {
                if(isPalindrome(s,i,j)) {
                    arr.add(s.substring(i,j+1));
                }
            }
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }

}
