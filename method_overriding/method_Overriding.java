package method_overriding;

public class method_Overriding {

	public static void main(String[] args) {
		// Method overriding = when sub class provides its own
		//					   implementation of a method that is already defined
		//					   Allows for code reusability and give specific implementations.
		
		
		Dog01 dog = new Dog01();
		cat01 cat = new cat01();
		fish01 fish = new fish01();
		
		dog.move();
		cat.move();
		fish.move();

	}

}
