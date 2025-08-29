package method;

public class overloading_method {
	public static void main(String[] args) {
		System.out.println(add(5,6));
		System.out.println(selectPizza("Fresh pan","pepper barque chicken","extra cheese"));
	}
	
	static int add(int num1,int num2) {return num1 + num2;}
	static int add(int num1,int num2,int num3) {return num1 + num2 + num3;}
	static int add(int num1,int num2,int num3,int num4) {return num1 + num2 + num3 + num4;}
	
	static String selectPizza(String bread) {
		return bread+" pizza";
	}
	static String selectPizza(String bread,String topping) {
		return bread+" "+topping+" pizza";
	}
	static String selectPizza(String bread,String topping,String cheese) {
		return bread+" "+topping+" with "+cheese+" pizza";
	}
}
