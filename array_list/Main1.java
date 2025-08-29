package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> foods = new ArrayList<>();
		System.out.print("Enter the # of food you would like: ");
		int numOfFood = scan.nextInt();
		scan.nextLine();
		
		for(int i=1; i<=numOfFood; i++) {
			System.out.print("Enter food #"+ i +": ");
			String food = scan.nextLine();
			foods.add(food);
		}
		
		System.out.println(foods); // value come inside square bracket
		
		scan.close();
	}
}
