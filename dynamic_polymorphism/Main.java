package dynamic_polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// dynamic / runtime polymorphism
		// when the method that gets executed is decided
		// at runtime based on the actual type of the object
		
		Scanner scanner = new Scanner(System.in);
		
		Animal animal;
		
		System.out.println("Would you like dog or cat? dog-1,cat-2");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else {
			animal = new Cat();
			animal.speak();
		}
	}

}
