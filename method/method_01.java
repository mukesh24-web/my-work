package method;

public class method_01 {
	public static void main(String[] args) {
		
		String name = "Mukesh";
		int age  = 21;
		
		// while calling the function argument are given
		helloCode(name,age);
		helloCode(name,age);
		
		square(5);  // it will show like this 25
		System.out.println(square(5));
		double result = cube(5);
		System.out.println(result);
		System.out.println(fullName("S", "Mukesh"));
		
		System.out.println(ageCheck(age));
		
		if(ageCheck(age)) {
			System.out.println("you can sign up");
		}
		else {
			System.out.println("you are underage so you can't sign up");
		}
		
	}
	
	// void is the return type
	// static 
	// method have parameter in this case it has two parameter
	static void helloCode(String Name,int age) {
		System.out.printf("hello Mister %s\n",Name);
		System.out.printf("your age was %d\n",age);
		System.out.println();
	}
	
	//for return type you to print the method in main method
	static double square(double num) {return num * num;}
	static double cube(double num) {return num * num * num;}
	static String fullName(String first,String last) {return first+" "+last;}
	static boolean ageCheck(int age) {
		if(age>18) {return true;}
		else {return false;}
	}
}