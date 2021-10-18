package threadsafe_example;

public class PrintSpooler {
	
	// The final is important here so it cannot be modified
	private static final PrintSpooler spooler = new PrintSpooler();
	
	private static boolean initialized = false;
	
	private PrintSpooler() {}
	
	private void init() {
		// Code to initialize our print spooler goes here
	}

	/*
	 * When a thread invokes a synchronized statement, it automatically acquires the intrinsic lock
	 *  for that synchronized statement's object and releases it when the method returns.
	 *   As long as a thread owns an intrinsic lock, NO other thread can acquire the SAME lock => thread safe.
	 */
	public static synchronized PrintSpooler getInstance() {
		
		if(initialized) 
			return spooler;
		spooler.init();
		initialized = true;
		return spooler;
	}
}
