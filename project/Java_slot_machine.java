package project;

import java.util.Random;
import java.util.Scanner;

public class Java_slot_machine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int balance = 100;
		double bet = 0;
		double payout;
		String[] row;
		
		
		System.out.println("  ********************");
		System.out.println("  Welcome to Java Slot\n Symbols: 🍒 🍉 🍋 🔔 🌟");
		System.out.println("  ********************");
		
		while(balance>0) {
			System.out.println("Your current balance: $"+balance);
			System.out.print("Place your bet amount: ");
			bet = scan.nextDouble();
			
			if(bet>balance) {System.out.println("INSUFFICIENT FUND");}
			else if(bet<0) {System.out.println("Betting amount should not less than 0");}
			else {balance -= bet;}
			
			System.out.println("Spinning...");

			row = spinRow(); // store row array variable element in another row array variable present in main function.
			printRow(row); 
			payout = getPayout(row,bet);
			
			if(payout > 0) {
				System.out.println("you won! $" + payout);
				balance += payout;
			}
			else {
				System.out.println("Better luck next time");
			}
			
			System.out.print("Do you want to play again? (Y/N): ");
			String playAgain = scan.next().toUpperCase();
			if(!playAgain.equals("Y")) {
				break;
			}
		
		}
		scan.close();
		System.out.println("Zero balance");
	}

	static String[] spinRow() {
		String[] symbols = {"🍒", "🍉", "🍋" ,"🔔","🌟"};
		String[] row = new String[3];
		
		Random rand = new Random();
		
		for(int i=0;i<3;i++) {
			row[i] = symbols[rand.nextInt(symbols.length)];
		}
		
		// System.out.println(row[0]);
		
		return row;
	}
	
	static void printRow(String[] row) {
			System.out.println("*************");
			System.out.println(" "+String.join(" | ", row));
			System.out.println("*************");
	}
	
	static double getPayout(String[] row, double bet) {
		if(row[0].equals(row[1]) && row[1].equals(row[2])) {
			return switch (row[0]) {
			case "🍒" -> bet * 2;
			case "🍉" -> bet * 3;
			case "🍋" -> bet * 4;
			case "🔔" -> bet * 5;
			case "🌟" -> bet * 10;
			default -> 0;
			};
		}
		else if(row[0].equals(row[1])) {
			return switch (row[0]) {
			case "🍒" -> bet + 2;
			case "🍉" -> bet + 3;
			case "🍋" -> bet + 4;
			case "🔔" -> bet + 5;
			case "🌟" -> bet + 10;
			default -> 0;
			};
		}
		else if(row[1].equals(row[2])) {
			return switch (row[1]) {
			case "🍒" -> bet + 2;
			case "🍉" -> bet + 3;
			case "🍋" -> bet + 4;
			case "🔔" -> bet + 5;
			case "🌟" -> bet + 10;
			default -> 0;
			};
		}
		return 0;
	}


}
