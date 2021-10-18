package threadsafe_example;

public class ResourceManager {

	public static void main(String[] args) {

		PrintSpooler spooler = PrintSpooler.getInstance();
		
		
		// new Thread(Runnable target) => Runnable is a functional interface
	    //  @param  target:
	    //          the object whose {@code run} method is invoked when this thread
	    //          is started. If {@code null}, this thread's run method is invoked.
		// First Thread 
		Thread threadOne = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});
		
		// Second Thread 
		Thread threadTwo = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});
		
		threadOne.start();
		threadTwo.start();

	}

}
