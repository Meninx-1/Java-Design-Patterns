package singleton;

// 
//The singleton Design Pattern compromises the Single Responsibility Principle.
//"The single responsibility principle (SRP) states that every class or module in a program should"
// " have responsibility for just a single piece of that program’s functionality."
//Here the common instance will be shared by multiple classes and objects for doing multiple different operations.
public class PrintSpooler {
	
	private static PrintSpooler spooler;
	
	private static boolean initialized = false;
	
	private PrintSpooler() {}
	
	private void init() {
		// Code to initialize our print spooler goes here
	}

	// Lazy initialization
	public static PrintSpooler getInstance() {
		
		if(initialized) 
			return spooler;
		spooler = new PrintSpooler();
		spooler.init();
		initialized = true;
		return spooler;
	}
}
