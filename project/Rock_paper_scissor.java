package project;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		String playAgain = "y";
		
		do {
			String[] choice = {
					"rock", "paper", "scissor"
			};
			
			System.out.print("Enter your move(Rock, paper, scissor): ");
			String uchoice = scan.next().toLowerCase();
			
			if( !uchoice.equals("rock") && 
				!uchoice.equals("paper") && 
				!uchoice.equals("scissor")) {
				System.out.println("Invalid choice");
			}
			
			System.out.print("Computer choice: ");
			String cchoice = choice[random.nextInt(3)];
			System.out.println(cchoice);
			
			if(uchoice.equals(cchoice)) {
				System.out.println("Draw");
			}
			else if(uchoice.equals("rock") && cchoice.equals("scissor")) {
				System.out.println("You winned!");
			}
			else if(uchoice.equals("paper") && cchoice.equals("rock")) {
				System.out.println("You winned!");
			}
			else if(uchoice.equals("scissor") && cchoice.equals("paper")) {
				System.out.println("You winned!");
			}
			else {
				System.out.println("you losed!");
			}
			
			System.out.print("play again (y/n): ");
			playAgain = scan.next();
			
		} while(playAgain.equals("y"));
		
		System.out.println("Thanks for playing this game!");
		
		scan.close();
	}

}