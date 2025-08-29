package loop;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int age;
		do {
			//true - 2
			System.out.println("age can't be negative, Enter your age again");
			System.out.print("Enter your age:");
			age = scan.nextInt();
		} while(age < 0);
		
		//false
		System.out.println("you are "+ age +" years old");
		
		int num = 0;
		
		do {
			System.out.println("Number should be between 1 - 10");
			System.out.println("Enter a number:");
			num = scan.nextInt();
		} while(num <= 1 || num >= 10);
		
		System.out.println("your number is "+num);
		
		String name;
		
		do {
			System.out.println("What's your name:");
			name = scan.nextLine();
		}   while(name.isEmpty());
		
		System.out.println("hello Mr."+ name);
		
	}

}
