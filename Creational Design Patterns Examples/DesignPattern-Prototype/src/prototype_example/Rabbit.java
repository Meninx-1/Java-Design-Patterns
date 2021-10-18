package prototype_example;

/* the implements Cloneable is important to be able to use the Object.clone() method
 * it is a marker interface (interface without any body)
 * The Cloneable interface is used only if the class has only primitive fields  
 */
public class Rabbit implements Cloneable {

	public enum Breed {
		HIMALAYAN,
		AMERICAN,
		MINI_REX,
		LIONHEAD,
		DUTCH
	}
	
	// Age in months
	private int age;
	private Breed breed;
	
	public Rabbit() {
	}

	public int getAge() {
		return age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
	@Override
	public Rabbit clone() {
		try {
			// super is refering only to parent Class (never to interfaces) in this case is Object
			return (Rabbit) super.clone();		
		} catch(CloneNotSupportedException ex) {
			throw new AssertionError();
		}
	}
}
