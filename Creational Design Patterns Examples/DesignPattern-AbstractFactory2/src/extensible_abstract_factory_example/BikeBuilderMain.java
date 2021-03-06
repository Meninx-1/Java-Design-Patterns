package extensible_abstract_factory_example;

public class BikeBuilderMain {
 
	public static void main(String[] args) {
		 
		 createBikeWithAbstractFactory("road bike");
	}

	// Abstract Factory Design Pattern is Factory of Factories
	private static void createBikeWithAbstractFactory(String type) {
		BikeFactory bikeFactory = FactoryCreator.createFactory(type);
		Tire tireFront = (Tire) bikeFactory.create("tire");
		tireFront.getDescription();
		Tire tireBack = (Tire) bikeFactory.create("tire");
		tireBack.getDescription();
		Handlebar handlebar = (Handlebar) bikeFactory.create("handlebar");
		handlebar.getDescription();
		
	}
}
