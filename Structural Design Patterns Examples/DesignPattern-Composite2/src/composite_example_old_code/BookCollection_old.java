package composite_example_old_code;

import java.util.ArrayList;

import composite_example_new_code.FictionBook;
import composite_example_new_code.NonfictionBook;

public class BookCollection_old {
	
	private ArrayList<NonfictionBook_old> nonfictionBooks = new ArrayList();
	private ArrayList<FictionBook_old> fictionBooks = new ArrayList();
	
	public void addNonfictionBook(NonfictionBook_old nonfictionBook) {
		nonfictionBooks.add(nonfictionBook);
	}
	
	public void addFictionBook(FictionBook_old fictionBook) {
		fictionBooks.add(fictionBook);
	}
	
	public void checkout() {
		nonfictionBooks.forEach(NonfictionBook_old::checkout);
		fictionBooks.forEach(FictionBook_old::checkout);	
	}
	
	public void returnBook() {
		nonfictionBooks.forEach(NonfictionBook_old::returnBook);
		fictionBooks.forEach(FictionBook_old::returnBook);
	}

}
