package getter_setter;

public class Main {
	public static void main(String args[]) {
		// getter - readable
		// setter - writtable
		
		Car car = new Car("tiago","blue",500000);
		
		// car.model = "Corvette ";
		// error occur
		// System.out.println(car.model+" "+car.color+" "+car.price);
		
		// car.setModel("suziki");
		car.setColor("white");
		car.setPrice(450000); 
		
		System.out.println(car.getModel()+" "+car.getColor()+" "+car.getPrice());
	}
}
 