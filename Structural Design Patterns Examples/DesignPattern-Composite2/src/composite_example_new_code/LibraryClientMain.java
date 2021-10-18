package composite_example_new_code;

public class LibraryClientMain {
	
	private static String name = "Madeup City Local Library";

	public static void main(String[] args) {

		NonfictionBook nonfictionBook = new NonfictionBook("A brief history of Time ");
		FictionBook fictionBookOne = new FictionBook("Hamlet", true);
		FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);
		
		BookCollection bookCollection = new BookCollection();
		bookCollection.addBook(nonfictionBook);
		bookCollection.addBook(fictionBookOne);
		bookCollection.addBook(fictionBookTwo);
		
		checkoutBook(nonfictionBook);
		checkoutBook(fictionBookOne);
		checkoutBook(bookCollection);
		
		returnBook(nonfictionBook);
		returnBook(fictionBookOne);
		returnBook(bookCollection);

	}
	
	private static void checkoutBook(Books books) {
		System.out.println("Checking out from " + name + "...");
		books.checkout();
		
	}

	private static void returnBook(Books books) {
		System.out.println("Returning to " + name + "...");
		books.checkout();
		
	}

}
