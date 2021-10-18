package decorator_example_new;

import java.awt.Color;
import java.awt.Graphics;

// This is the decorator class
public class ComponentWithRedBorder implements Component {
	
	Component decoratedComponent;

	public ComponentWithRedBorder(Component component) {
		this.decoratedComponent = component;
	}
	
	public void draw(Graphics graphics) {
		graphics.setColor(Color.RED);
		decoratedComponent.draw(graphics);
		graphics.setColor(Color.BLACK);
	}
	
}
