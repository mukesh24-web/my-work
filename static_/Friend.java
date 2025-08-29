package static_;

public class Friend {
	static int noOfFriends;
	String name;
	
	Friend(String name){
		this.name = name;
		noOfFriends++;
	}
	
	static void show_num_friends() {
		System.out.println("you have "+ noOfFriends +" friends");
	}
}
