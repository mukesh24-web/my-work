package object;

public class Car_area_51 {
	String make = "Tata";
	String model = "Tiago";
	int year = 2025;
	double price = 750000.0;
	boolean isRunning = false;
	
	void start() {
		isRunning = true;
		System.out.println("You started the car");
	}
	void stop() {
		isRunning = false;
		System.out.println("You stoped the car");
	}
	
	void drive() {
		System.out.println("you driving "+ model);
	}
	
	void brake() {
		System.out.println("you brake "+ model);
	}
}
