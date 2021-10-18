package collections_example;

import java.util.Collections;
import java.util.List;

public class ResourceManager {
	
	public ResourceManager() {	
	}

	public static void main(String[] args) {
		PrintSpooler spooler = new PrintSpooler();
		
		// singletonList is an immutable list which once constructed it cannot be modified
		// it contains only 1 object
		List<PrintSpooler> spoolers = Collections.singletonList(spooler);
		
		processResources(spoolers);
		
		// as the singletonList is immutable we will get an error when adding a new object to it
		PrintSpooler spooler2 = new PrintSpooler();
		spoolers.add(spooler2);
	}
	
	/**
	 * A method that takes a list of printers as a parameter
	 */
	public static <Type> void processResources(List<Type> list) {
		for(Type p: list) {
			// code to process resources
		}
	}
}
