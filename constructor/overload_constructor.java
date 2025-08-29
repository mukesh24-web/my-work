package constructor;

public class overload_constructor {

	public static void main(String[] args) {
		
		// allow a class to have multiple constructors
		// with different parameter lists.
		// enable objects to be initialized in various ways.
		
		User user1 = new User("Mukesh");
		User user = new User();
		
		System.out.println(user1.name);
		System.out.println(user1.age);
		System.out.println(user1.email);
		
		System.out.println(user.name);
		System.out.println(user.age);
		System.out.println(user.email);
	}

}
