package toString_method;

public class ToString_method {

	public static void main(String[] args) {
		// .toString() - method inherited from the object class
		//               by default it returns a hash code
		
		
		Car car = new Car("Ford","Mustang",2025,"Red");
		System.out.println(car);
		
		// System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);

	}

}
