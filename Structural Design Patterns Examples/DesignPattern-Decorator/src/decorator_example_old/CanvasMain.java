package decorator_example_old;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CanvasMain extends JPanel {

	Component circle1 = new Circle(15,15);
	Component circle2 = new Circle(75,15);
	Component circle3 = new Circle(135,15);
	
// We comment the main function so cannot interfere with the other package new 
//	public static void main(String[] args) {
//
//		JFrame frame = new JFrame();
//		frame.setSize(400,400);
//		frame.add(new CanvasMain());
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
//	}
	
	public void paint(Graphics graphics) {
		circle1.draw(graphics);
		circle2.draw(graphics);
		circle3.draw(graphics);
	}

}
