package interface_;

public class Main {
	public static void main(String args[]) {
		
		// it can implement more interface
		// support multiple inheritance
		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		//rabbit.haunt(); //rabbit can't use haunt()
		//hawk.flee();  //eagle can't use flee()
		
	    Fish fish = new Fish();
	    fish.hunt();
	    fish.flee();
	}

}
