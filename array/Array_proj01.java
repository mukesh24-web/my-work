package array;

import java.util.Scanner;

public class Array_proj01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter # of food do you want: ");
		int size = scan.nextInt();
		scan.nextLine(); // in-order to read new line character
		String[] food = new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.print("Enter a food: ");
			food[i] = scan.nextLine();
		}
		
		// Enhanced for loop
		for(String foods:food) {
			System.out.println(foods);
		}
		scan.close();
	}
}
