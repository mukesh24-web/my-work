package compostion;

public class Car {
	String model;
	int year;
	Engine engine; // object
	
	Car(String model,int year,String engineType){  // Car constructor
		this.model = model;
		this.year = year;
		this.engine = new Engine(engineType);
	}
	
	void start() {
		this.engine.start();
		System.out.println("The "+this.model+" is running");
	}
}