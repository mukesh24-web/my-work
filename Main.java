package aggregation;

public class Main {
	public static void main(String args[]) {
		// aggregation = represents a "has-a" relationship between objects.
		//                One object contains another object as part of its structure.
		//				  but those object can exist independently
		
		Book book1 = new Book("harry potter 1",423);
		Book book2 = new Book("shiva",423);
		Book book3 = new Book("harry potter 2",423);
		
		Book[] books = {book1,book2,book3}; // store object
		
		/* for(Book book:books) { // access each object data's
			System.out.println(book.displayInfo());
		} */
		
		Library library = new Library("NYC Public Library", 1897, books);
		
		library.displayInfo();
		/*
		 *  library:
		 *  	displayInfo:
		 *  		book:
		 *  			displayInfo
		 * */
	}
}
