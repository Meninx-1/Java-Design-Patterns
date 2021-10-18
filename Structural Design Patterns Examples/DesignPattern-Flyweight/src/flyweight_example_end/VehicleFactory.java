package flyweight_example_end;

import java.util.HashMap;

//The key concept here is the distinction between intrinsic and extrinsic state. 
//Intrinsic state is stored in the flyweight; it consists of information that’s independent of
//the flyweight’s context, thereby making it sharable. Extrinsic state depends on and varies
//with the flyweight’s context and therefore can’t be shared.
//Client objects are responsible for passing extrinsic state to the flyweight when it needs it.

//A flyweight objects essentially has two kind of attributes – intrinsic and extrinsic.
//1.An intrinsic state attribute is stored/shared in the flyweight object, and it is independent of flyweight’s 
//context. As the best practice, we should make intrinsic states immutable.
//2.An extrinsic state varies with flyweight’s context, which is why they cannot be shared.
//Client objects maintain the extrinsic state, and they need to pass this to a flyweight object
//during object creation.

// Flyweight class
public class VehicleFactory {

	HashMap<Integer, Vehicle> vehicles = new HashMap();
	
	// we create an object when it is not existed and we return it if it already exists
	public Vehicle getVehicle(int type) {
		if(vehicles.containsKey(type)) {
			return vehicles.get(type);
		} else {
			Vehicle vehicle;
			if(type == 0) {
				vehicle = new Car();
			} else {
				vehicle = new Truck();
			}
			vehicles.put(type,  vehicle);
			return vehicle;
		}
	}
}
