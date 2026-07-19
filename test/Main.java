package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void test01() {
        // Size is given
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void test02() {
        // Size is given
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println(list);
    }

    public static void test03() {
        // Removing comma
        String str = scan.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        String[] arr = str.split(",");
        for (String value : arr) {
            list.add(Integer.parseInt(value));
        }
        for (int value : list) {
            System.out.print(value + " ");
        }
    }

    public static void test04() {
        // remove white space
        String str = scan.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        String[] arr = str.split(" ");
        for (String value : arr) {
            list.add(Integer.parseInt(value));
        }
        for (int value : list) {
            System.out.print(value + " ");
        }
    }

    public static void test05() {
        // Remove bracket,comma if needed
        String str = scan.nextLine();
        // System.out.println(str.length());
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1); // 1 included and 2 will be not included
        }
        // System.out.println(str);
        String arr[] = str.split(",");
        ArrayList<Integer> list = new ArrayList<>();
        for (String value : arr) {
            list.add(Integer.parseInt(value));
        }
        for (int value : list) {
            System.out.print(value + " ");
        }
    }

    public static void withoutScanner() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);

        int num = Integer.parseInt(br.readLine());
        System.out.println(num);

        double num1 = Double.parseDouble(br.readLine());
        System.out.println(num1);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false; // 0 and 1 are not accepted
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        int n = scan.nextInt();
        System.out.println(sum(n));
    }
}