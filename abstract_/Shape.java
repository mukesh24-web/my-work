package abstract_;

public abstract class Shape {
	
	abstract double area(); // abstract
	
	void display() { // concrete
		System.out.println("This is shape");
	}
	
	// concerete method can be use on another class using extends
	// abstract can be declare in different class
}
