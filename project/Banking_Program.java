package project;

import java.util.Scanner;

public class Banking_Program {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int choice;
		double balance = 0.0;
		boolean exit = true;
		
		while(exit == true) {
			System.out.println("***************");
			System.out.println("BANKING PROGRAM");
			System.out.println("***************");
			System.out.println("1.Show Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			System.out.println("***************");
			System.out.print("Enter your choice (1 - 4): ");
			choice = scan.nextInt();
			System.out.println("***************");
			switch(choice) {
				case 1 -> showBalance(balance);
				case 2 -> balance += addAmount();
				case 3 -> balance -= subAmount();
				case 4 -> exit = false;
				default -> System.out.println("Please enter a correct choice");
			}
		}
		
	}
	static void showBalance(double balance) {
		System.out.println("Balance amount $ "+balance);
	}
	static Double addAmount() {
		System.out.print("Amount: $");
		Double adAmount = scan.nextDouble();
		if(adAmount > 0) {
			return adAmount;
		}
		else {
			System.out.println("Negative amount will not be added");
			return null;
		}
	}
	static Double subAmount() {
		System.out.print("Amount: $");
		Double sbAmount = scan.nextDouble();
		return sbAmount;
	}
}
