package abstract_;

public class Rectangle extends Shape{
	
	double length;
	double width;
	
	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	double area(){
		return length * width;
	}
}

/* constructor get value from main class
 * where the object is located
 * */