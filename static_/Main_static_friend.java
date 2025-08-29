package static_;

public class Main_static_friend {
	public static void main(String[] args) {
		// static : Makes a variable or method belong to the class
		//          rather than to any specific object
		//          Commonly used for utility methods or shared resources.
		// for static doesn't need object
		// just write class name to access the function or variable for static
		// object mean each have copy
		// whereas class means class share same attribute
		// it doesn't make copy of object
		
		Friend friend1 = new Friend("sharu khan");
		Friend friend2 = new Friend("ajith kumar");
		Friend friend3 = new Friend("joseph vijay");
		
		System.out.println(Friend.noOfFriends);  // while using static : don't use object use class name instead.
		Friend.show_num_friends();
		
		// Math math = new Math(); // we don't to create math object.
		// acess over class object
		Math.round(5.675); // round is a static method
	}
}
