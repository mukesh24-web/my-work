package super_class;

public class Super_main {
	public static void main(String[] args) {
		// super refer to the parent class (subclass <- superclass)
		// used in constructor and method overriding
		// calls the parent constructor to intialize attributes
		Super_person person = new Super_person("Mukesh","S");
		person.showName();
		
		Super_student student = new Super_student("harry", "potter", 7.8);
		student.showName();
		student.showGpa();
		
		Super_employee employee = new Super_employee("John", "Cena", 1000000);
		employee.showName();
		employee.showSalary();
	}
}