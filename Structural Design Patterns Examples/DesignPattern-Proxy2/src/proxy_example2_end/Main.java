package proxy_example2_end;

// Proxy pattern example of use when an application has an expensive call to a database that isn't
// needed at startup time
public class Main {

	public static void main(String[] args) {
		Inventory inventory = new SuperstoreInventoryProxy();
		Store store = new Store("Healthy Wholefoods", "Los Angeles", inventory);
		
		store.printName();
		store.printLocation();
		store.printInventory();
	}

}
