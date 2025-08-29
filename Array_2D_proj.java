package _2D_Array;

import java.util.Scanner;

public class Array_2D_proj {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] questions = {
				"Which company created the programming language Java?",
				"In the Marvel Cinematic Universe, what is the name of Thor’s enchanted hammer?",
				"What is the chemical symbol for gold?",
				"Which is the largest ocean on Earth?",
				"Who wrote the famous play Romeo and Juliet?"
		};
		
		String[][] choices = {
				{"A) Microsoft","B) Apple","C) Sun Microsystems","D) Google"},
				{"A) Stormbreaker","B) Gungnir","C) Mjölnir","D) Excalibur"},
				{"A) Ag","B) Au","C) Fe","D) Pb"}, 
				{"A) Atlantic Ocean","B) Indian Ocean","C) Arctic Ocean","D) Pacific Ocean"},
				{"A) Charles Dickens","B) Mark Twain","C) William Shakespeare","D) George Orwell"}
		};
		
		int[] answers = {3,3,2,4,3};
		int score = 0;
		int guess;
		System.out.println("*****************************");
		System.out.println("Welcome to the java quiz game");
		System.out.println("*****************************");
		
		for(int i = 0; i < questions.length; i++) { // 01234
			System.out.println(questions[i]);
			for(String choice:choices[i]) {
				System.out.println(choice);
			}
			System.out.print("Your guess: ");
			guess = scan.nextInt();
			if(answers[i] == guess) {
				System.out.println("●●●●●●●");
				System.out.println("Correct");
				System.out.println("●●●●●●●");
				score++;
			}
			else {
				System.out.println("ꭗꭗꭗꭗꭗꭗ");
				System.out.println("Wrong");
				System.out.println("ꭗꭗꭗꭗꭗꭗ");
				System.out.println("Correct option "+answers[i]);
			}
			System.out.println();
		}
		
		System.out.println("your score: "+score+" / "+answers.length);
		scan.close();
	}
}
