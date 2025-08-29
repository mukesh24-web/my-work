package constructor;

public class Student_build {
	
	String name;
	int age;

	public Student_build(String name, int age) {
		this.name = name;  		// we can access object from the other class
		this.age = age;			// like student1 = name; student1 = age; the value only assign to the
								// particular object.
		// System.out.println(name);
		// System.out.println(age);
	}
	void study() {
		System.out.println(this.name + " is studying!");
	}
	
}
