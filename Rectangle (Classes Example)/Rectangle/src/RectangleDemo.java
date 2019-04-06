import java.util.Scanner;

public class RectangleDemo {

	public static void main(String[] args) {
		{
			Scanner keyboard = new Scanner(System.in);

			int length;
			int width;
			
			System.out.println("Enter the length");
			length = keyboard.nextInt();
			System.out.println("Enter the width");
			width = keyboard.nextInt();
			
			//Parameter Constructor Box
			Rectangle rect = new Rectangle(length,width);
			
			//rect.setLength(4);
			//rect.setWidth(5);
			System.out.println("Length is: " + rect.getLength());
			System.out.println("Width is: " + rect.getWidth());
			System.out.println("The area of the rectangle is: " + rect.getArea());
			
			//Default Constructor Box
			Rectangle box = new Rectangle();
			System.out.println(box.getArea());
			
			keyboard.close();
		}
	}
}
