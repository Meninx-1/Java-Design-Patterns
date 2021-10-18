package composite_example_new_code;

//This is the Leaf
public class FictionBook implements Books {

	String name;
	boolean checkedOut;
	boolean isAPlay;
	
	public FictionBook(String name, boolean checkedOut) {
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
