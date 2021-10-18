package flyweight_example_end;

public class Truck implements Vehicle {

	// Extrinsic Attribute: the value can change for the same class object Truck
	private int[] location = new int[2]; 
	
	public String getType() {
		return "Truck";
	}
	
	public void setLocation(int latitude, int longitude) {
		location[0] = latitude;
		location[1] = longitude;
	}
	
	public int[] getLocation() {
		return location;
	}
}
