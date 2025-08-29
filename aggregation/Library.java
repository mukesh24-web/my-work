package aggregation;

public class Library {
	String name;
	int year;
	Book[] books; // new object array
	
	
	// this library consist of whole bunch of book object
	public Library(String name,int year,Book[] books) { // parameter value are given while calling constructor
		this.name = name;
		this.year = year;
		this.books = books; // books object array store in new books object array
	}
	
	void displayInfo() {
		System.out.println("The "+this.year+" "+this.name);
		System.out.println("Books available: ");
		for(Book book:books) {
			System.out.println(book.displayInfo());
		}
	}
}
