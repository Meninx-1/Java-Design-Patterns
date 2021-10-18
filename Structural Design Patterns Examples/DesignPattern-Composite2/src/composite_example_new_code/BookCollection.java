package composite_example_new_code;

import java.util.ArrayList;

//This is a composite class as it holds a collection of Department components, 
//as well as methods for adding and removing elements from the list.
public class BookCollection implements Books {
	
	private ArrayList<Books> books = new ArrayList();
	
	public void addBook(Books book) {
		books.add(book);
	}
	
	public void checkout() {
		books.forEach(Books::checkout);	
	}
	
	public void returnBook() {
		books.forEach(Books::returnBook);

	}

}