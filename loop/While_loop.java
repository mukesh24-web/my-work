package loop;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// It will run till the condition get false
		
		Scanner scan = new Scanner(System.in);
		
		/*
		String response = "";
		while(!response.equals("Q")) { // !(hi != Q) -> !(false) -> !false -> true
			// true
			System.out.println("Bankai");
			System.out.println("Press Q to Quit:");
			response = scan.next().toUpperCase();
		}
		
		// false
		System.out.println("You quit the battle");
		
		int age;
		System.out.println("Enter your age:");
		age = scan.nextInt();
		
		while(age < 0) {
			//true
			System.out.println("age can't be negative, Enter your age again");
			System.out.println("Enter your age:");
			age = scan.nextInt();
		}
		//false
		System.out.println("you are "+ age +" years old");
		
		
		*/
		int num = 0;
		
		while(num < 1 || num > 10) { // 0<1 true so it goes to the statement like this you need see that code.
			System.out.println("Number should be between (1 - 10)");
			num = scan.nextInt();
		}
		System.out.println("your number: "+ num);
	}

}
