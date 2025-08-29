package array;

public class Car {
	String model;
	String color;
	
	// Assign the value
	Car(String model,String color){
		this.model = model;
		this.color = color;
	}
	
	void drive() {
		System.out.println("you are driving "+ this.color + " " +this.model);
	}
}
