package complex_builder_example;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

// Director
public class ArchitectMain {

	public static void main(String[] args) {
		Bedroom room = new BedroomBuilder().setDimensions(new Dimension(200,100)).setCeilingHeight(3).setFloorNumber(2).setWallColor(Color.WHITE)
				.setNumberOfWindows(2).setNumberOfDoors(1).setIsDouble(true).setHasEnsuite(false).createBedroom();
		
		Bedroom room2 = new BedroomBuilder().setDimensions(new Dimension(200,100)).createBedroom();
		
	}

}


// The builder desing pattern is used when you want you have complex constructors