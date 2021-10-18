package proxy_example2_end;

import java.util.ArrayList;

public class SuperstoreInventoryProxy implements Inventory {

	private Inventory inventory;
	
	@Override
	public ArrayList<Item> getInventory() {
		if(inventory == null) {
			inventory = new SuperstoreInventory();
		}
		return inventory.getInventory();
	}
}
