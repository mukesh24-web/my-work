package object;

public class Object_area_51 {


	public static void main(String[] args) {
		// Object = An entity that holds data(attributes)
		//			and can perform action (method)
		//			It is Reference data type
		// store data for object in heap
		
		Car_area_51 car1 = new Car_area_51();
		Car_area_51 car2 = new Car_area_51();
		// System.out.println(car); // object is reference data type like array so it will return memory address
		
		/*
		System.out.println(car1.isRunning);
		
		car.start();
		System.out.println(car1.isRunning);
		car.stop();
		
		System.out.println(car1.isRunning); */
		
		car1.drive();
		car1.brake();
		
		// Two car object
		System.out.println(car1.make+" "+car1.model);
		System.out.println(car2.make+" "+car2.model);
	}
}
