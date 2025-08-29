package array;

public class Array_objects_Constructor_Car {

	public static void main(String[] args) {
		
		Car car1 = new Car("tiago","techtonic blue");
		Car car2 = new Car("mustang","red");
		Car car3 = new Car("super charge","yellow");
		
		Car[] cars = {car1,car2,car3}; // array_object contains set of objects
		
		Car[] cars1 = {new Car("tiago","techtonic blue"),
				new Car("mustang","red"),
				new Car("super charge","yellow")};
		
		// print the given data
		for(int i=0; i<cars.length; i++) { // 012
			cars[i].drive();
		}
		
		// Not working in normal for loop
		// change color value for all the object
		for(Car car:cars) {
			car.color = "black";
		}
		
		// Enhancing for loop
		// calling drive method
		for(Car car:cars) {
			car.drive();
		}
	}

}
