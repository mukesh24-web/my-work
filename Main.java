package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exception - an event that interrupts the normal flow of a program
		// 			   (Dividing by zero, file not found, mismatch input types)
		//			   Surround any dangeroius code with a try{} block
		//			   try{},catch{},finally{}
		
		Scanner scan = new Scanner(System.in);
		/*
		try {
			System.out.println(1/0); // dangerous code
		}
		catch(ArithmeticException e) {
		 //   error_name          name
			System.out.println("You can't divide by zero!");
		}
		*/
		/*
		try {
			System.out.print("Enter a number: ");
			int number = scan.nextInt();
			System.out.println(number);
		}
		catch(InputMismatchException e) {
			System.out.println("kindly enter a number");
		} */
		
		try {
			System.out.print("enter your salary: ");
			int salary = scan.nextInt();
			scan.next();
		}
		catch (ArithmeticException e) {
			System.out.println("arithmetric error");
		}
		catch (Exception e) {
			System.out.println("error bro find it!");
		}
		finally {  // optional
			scan.close();
			// we can close the file
			System.out.println("this always execute");
		}
	}

}
