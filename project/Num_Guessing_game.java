package project;

import java.util.Random;
import java.util.Scanner;

public class Num_Guessing_game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int guess;
		int attempt = 0;
		int min = 0;
		int max = 100;
		
		// To generate random number
		int randomNumber = random.nextInt(min, max+1);
		
		System.out.println("Number guessing game");
		System.out.printf("Guess a number between %d - %d!\n",min,max);
		
		do {
			System.out.print("Enter a num: ");
			guess = scan.nextInt();
			attempt++;
			if(guess > randomNumber) {
				System.out.println("high");
			}
			else if(guess < randomNumber){
				System.out.println("low");
			}
			else {
				System.out.println("you guessed the number");
				System.out.println("number is " + randomNumber);
			}
		} while(guess != randomNumber);
		
		
		scan.close();
	}

}
