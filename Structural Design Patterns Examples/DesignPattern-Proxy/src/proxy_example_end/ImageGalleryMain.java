package proxy_example_end;

//The Proxy pattern allows us to create an intermediary that acts as an interface to another resource,
//while also hiding the underlying complexity of the component.
public class ImageGalleryMain {

	public static void main(String[] args) {
		
		// Changing ImageFile object by ImageProxy object
		DisplayObject image1 = new ImageProxy("./resources/image1.jpg");
		DisplayObject image2 = new ImageProxy("./resources/image2.jpg");
		DisplayObject image3 = new ImageProxy("./resources/image3.jpg");
		DisplayObject image4 = new ImageProxy("./resources/image4.jpg");
		DisplayObject image5 = new ImageProxy("./resources/image5.jpg");
		DisplayObject image6 = new ImageProxy("./resources/image6.jpg");
		DisplayObject image7 = new ImageProxy("./resources/image7.jpg");
		DisplayObject image8 = new ImageProxy("./resources/image8.jpg");
		DisplayObject image9 = new ImageProxy("./resources/image9.jpg");
		DisplayObject image10 = new ImageProxy("./resources/image10.jpg");
		
		image1.display();
		image2.display();
		image3.display();
		image4.display();
		image5.display();
		image6.display();
		image7.display();
		image8.display();
		image9.display();
		image10.display();
		
		image1.display();
		image2.display();
		image3.display();
		image4.display();
		image5.display();
		image6.display();
		image7.display();
		image8.display();
		image9.display();
		image10.display();
	}
}
