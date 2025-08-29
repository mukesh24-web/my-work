package variable_arguments_varargs;

public class Varargs {
	public static void main(String[] args) {
		System.out.println(add(1,2,3,4,5,6));
		System.out.println(average(1,2,3,4,5,6));
		
	}
	static int add(int... numbers){ // argument will be packed into array
		int sum = 0;
		for(int num:numbers) { // Enchance for loop
			sum += num;
		}
		return sum;	
	}
	
	static double average(double... numbers) {
		double sum = 0;
		if(numbers.length == 0) {
			return 0;
		}
		for(double num:numbers){
			sum += num;
		}
		return sum/numbers.length;
	}
}
