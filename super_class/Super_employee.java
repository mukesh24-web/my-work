package super_class;

public class Super_employee extends Super_person{
	int salary;
	
	public Super_employee(String First,String Last,int salary) {
		
		// access super_person class functionality and variable
		super(First,Last); // go to person class and apply it
		this.salary = salary;
	}
	
	void showSalary() {
		System.out.println(first + " salary is: $" + salary);
	}
	
}
