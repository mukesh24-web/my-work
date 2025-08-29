package super_class;

public class Super_person {  // super class
	String first;
	String last;
	
	public Super_person(String First,String Last) {
		this.first = First;
		this.last = Last;
	}
	
	void showName() {
		System.out.println(first+" "+last);
	}
	
}
