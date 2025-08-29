package abstract_;

public class Main {
	public static void main(String args[]) {
		// abstract - used to define abstract classes and methods.
		//            is the process of hiding details and showing essential features
		
		// we can't create a object because shape is abstract class
		// Shape shape = new Shape(); // error
		Circle circle = new Circle(2);
		Triangle triangle = new Triangle(5,6);
		Rectangle rectangle = new Rectangle(5,4);
		
		System.out.println(circle.area());
		System.out.println(triangle.area());
		System.out.println(rectangle.area());
		
		circle.display();
		triangle.display();
		rectangle.display();
	}
}
