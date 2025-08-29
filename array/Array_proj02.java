package array;

import java.util.Scanner;

public class Array_proj02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] fruits = {"apple","banana","orange"};
		boolean isFound = false;
		
		System.out.print("Enter the element to search: ");
		String target = scan.next().toLowerCase();
		
		// target == fruits[i] check two memory address are same.
		
		for(int i=0; i<fruits.length; i++) {  //(0, 3, ++)
			if(fruits[i].equals(target)) { // for string use equals method
				System.out.println("Element found at index: "+ i);
				isFound = true;
				break;
			}
		}
		if(!isFound) {
			System.out.println("Element is not founded");
		}
		else {
			System.out.println("Element is founded");
		}
		scan.close();
	}
}
