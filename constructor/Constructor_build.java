package constructor;

import java.util.Scanner;
import java.util.Random;

public class Constructor_build {

	public static void main(String[] args) {
		// constructor special method to initialize a object
		// You can pass argument to a constructor
		// and set up initial value
		Student_build student1 = new Student_build("patrick",34);
		Student_build student2 = new Student_build("John cena",48);
		
		System.out.println(student1.name);
		System.out.println(student1.age);
		
		System.out.println(student2.name);
		System.out.println(student2.age);
		
		student1.study();
		student2.study();
	}
}
