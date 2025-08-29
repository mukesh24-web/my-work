package inheritance_0;

public class Inheritance_class {
	public static void main(String[] args) {
		
		//inheritance -- One class inherit the attributes and method form another class.
		// Organism -> Animal -> Cat * Dog
		// Grandparent -> parent -> child
		
		Cat65 cat = new Cat65();
		Dog65 dog = new Dog65();
		Plant65 plant = new Plant65();
		
		System.out.println(cat.isAlive);
		System.out.println(dog.isAlive);
		
		cat.eat();
		System.out.println(cat.lives);
		System.out.println(dog.lives);
		
		cat.speak();
		dog.speak();
		plant.photosynthesis();
	}
}
