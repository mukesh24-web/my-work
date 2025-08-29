package project;

import java.util.Random;
import java.util.Scanner;

public class Dice_program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int numOfDice;
		int rolledNum;
		int total = 0;
		
		System.out.print("Enter the # of Dice: ");
		numOfDice = scan.nextInt();
		
		
		for(int i = 0; i < numOfDice;i++) {
			rolledNum = rand.nextInt(1, 7); // 1234567
			rollDice(rolledNum); // for switch case you giving the parameter
			System.out.println("Rolled number: "+ rolledNum);
			total += rolledNum;
		}
		System.out.println(total);
	}
	
	static void rollDice(int roll) {
		String dice1 = """
			  -------
			 |       |
			 |   ●   |
			 |       | 
			  -------
				""";
		String dice2 = """
				  -------
				 | ●     |
				 |       |
				 |     ● | 
				  -------
					""";
		String dice3 = """
				  -------
				 | ●     |
				 |   ●   |
				 |     ● | 
				  -------
					""";
		String dice4 = """
				  -------
				 | ●   ● |
				 |       |
				 | ●   ● | 
				  -------
					""";
		String dice5 = """
				  -------
				 | ●   ● |
				 |   ●   |
				 | ●   ● | 
				  -------
					""";
		String dice6 = """
				  -------
				 | ●   ● |
				 | ●   ● |
				 | ●   ● | 
				  -------
					""";
		
		switch(roll) {
		case 1 -> System.out.println(dice1);
		case 2 -> System.out.println(dice2);
		case 3 -> System.out.println(dice3);
		case 4 -> System.out.println(dice4);
		case 5 -> System.out.println(dice5);
		case 6 -> System.out.println(dice6);
		default -> System.out.println("Invalid number");
		}
	}
}
