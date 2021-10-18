package decorator_example_new;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

// The decorator patterns allows you to alter behavior dynamically, 
// without affecting other objects of the same type
public class CanvasMain extends JPanel {

	Component circle1 = new Circle(15,15);
	Component circle2 = new Circle(75,15);
	Component circle3 = new Circle(135,15);
	
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.add(new CanvasMain());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void paint(Graphics graphics) {
		circle1.draw(graphics);
		// We changed the color of the circle2 without affecting the other circle
		circle2 = new ComponentWithRedBorder(circle2);
		circle2.draw(graphics);
		circle3.draw(graphics);
	}

}
