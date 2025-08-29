package varibale_scope;

public class variable_scope {
	
	// java use there local variable first
	
	static int x = 10; // class variable
	
	public static void main(String[] args) {
		int x = 0;   // LOCAL
		doSomeThing();
		
		System.out.println(x);
	}
	static void doSomeThing() {
		int y = 1;  // LOCAL
		System.out.println(y);
	}
}
