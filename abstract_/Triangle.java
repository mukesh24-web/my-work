package abstract_;

public class Triangle extends Shape{
	
	double base;
	double height;
	
	Triangle(double base,double height){ // constructor
		this.base = base;
		this.height = height;
	}
	
	@Override
	double area(){
		return 0.5 * base * height;
	}
}
