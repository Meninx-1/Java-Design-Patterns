package composite_example_old_code;

public class FictionBook_old {
	
	String name;
	boolean checkedOut;
	boolean isAPlay;
	
	public FictionBook_old(String name, boolean checkedOut) {
		super();
		this.name = name;
		this.checkedOut = checkedOut;
		checkedOut=false;
	}
	
	public void checkout() {
		if(!checkedOut) {
			System.out.println("Checking out " + name + "\n");
			checkedOut = true;
		} else {
			System.out.println(name + " is already checked out \n");
		}
	}
	
	public void returnBook() {
		if(checkedOut) {
			System.out.println("Returning " + name);
			checkedOut = false;
		} else {
			System.out.println(name + " is not checked out");
		}
	}
}
