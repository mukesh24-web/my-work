package super_class;

public class Super_student extends Super_person{
	double gpa;
	
	public Super_student(String First,String Last,double Gpa) {
	  //Super_person instead of super - think like that
		super(First,Last); // i think name will be over written on value
		this.gpa = Gpa;
	}
	
	void showGpa(){
		System.out.println(first+" gpa is: "+gpa);
	}
}
