package wrapper_class;

public class Main {
	public static void main(String args[]) {
		
		
		int a = 10; // primitive datatype
		float b;
		
		//major of thing in java is class and object
		
		Integer c = 24;  // Integer.valueOf(24) - autoboxing / autowrapping
		Integer d = Integer.valueOf(a); // wrapping / boxing
		
		int e = d.intValue(); // unwrapping / unboxing
		int f = d; // autounwrapping / autounboxing
		
		String g = "123";
		int h = Integer.parseInt(g); // convert String to integer
		
		System.out.println(d);
		System.out.println(c);
		System.out.println(h);
		
		// autoboxing
		Integer a1 = 123;
		
		//auto unboxing
		int a2 = a1;
		
		String ab = Integer.toString(123); // convert integer to String
		String cd = Double.toString(3.14); // convert double to String
		
		int abd = Integer.parseInt("123"); // convert String to integer
	}
}
