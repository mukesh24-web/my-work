package constructor;

public class User {
	String name;
	int age;
	String email;
	
	User() {
		this.name = "Guest";
		this.age = 0;
		this.email = "Not provided";
		
	}
	
	User(String userName) {
		this.name = userName;
		this.age = 0;
		this.email = "Not provided";
	}
	
	User(String userName,int age){
		this.name = userName;
		this.age = age;
		this.email = "Not provided";
	}
	
	User(String userName,int age,String email){
		this.name = userName;
		this.age = age;
		this.email = email;
	}
}
