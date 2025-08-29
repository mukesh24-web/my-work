package loop;

import java.util.Scanner;

public class For_loop {
	public static void main(String[] args) throws InterruptedException {
		
		// loop means till condition get satisfy it's condition will run
		// for loop execute some code to certain amount of time
		
		/*
		
		for (int i = 1;i <=10;i++) {
			//true
			System.out.println(i);
		}
		//false
		System.out.println();
		
		for (int i = 1;i <=10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 10;i > 0;i-=3) {
			System.out.println(i);
		}
		
		for (int i = 10;i <=0;i--) {
			System.out.println(i);
		}
		
		*/
		
		// cute count down
		
		/*
		int start = 10;
		
		for(int i = start; i>0;i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("HAPPY THAIPOSOM!");
		*/
		
		// break and continue
		
		/*
		for(int i = 1;i <=10 ; i++) {
			if(i==5) {
				continue; // break;
			}
			System.out.print(i+" ");
		}
		*/
		
		// Nesting loop -- mostly used in matrix or DSA
		
		/*
		for(int i = 1;i<=3;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		
		// matrix shaped output
		
		int rows;
		int columns;
		char symbol;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the no. of rows: ");
		rows = scan.nextInt();
		
		System.out.print("Enter the no. of columns: ");
		columns = scan.nextInt();
		
		System.out.print("Enter a symbol: ");
		symbol = scan.next().charAt(0);
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
		
	}
}
