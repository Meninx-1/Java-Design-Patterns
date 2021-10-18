package bridge_example;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary
 *  independently. This type of design pattern comes under structural pattern as this pattern decouples
 *   implementation class and abstract class by providing a bridge structure between them
 *   
 *   It is used when there are many inheritance levels
 *   It leads to loose coupling and more flexibility
 */
public class CanvasMain extends JPanel {

	public static void main(String[] args) {
		//creates a canvas to draw on 
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.add(new CanvasMain());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void paint(Graphics graphics) {
		Square square = new Square(new BlueColorShape());
		square.draw(graphics);
		Circle circle = new Circle(new RedColorShape());
		circle.draw(graphics);
		Triangle triangle = new Triangle(new GreenColorShape());
		triangle.draw(graphics);
	}
}
