import java.util.Scanner;

/** This program gets two numbers from the user and tells them which is smaller
 * -Josiah Moore
 */

public class Smaller {

	public static void main(String[] args) {
		
		//Creates keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Gets the two numbers
		System.out.println("Please enter your first number: ");
		float num1 = keyboard.nextFloat();
		System.out.println("Please enter your second number: ");
		float num2 = keyboard.nextFloat();
		
		//Calls the method to find the smaller number
		float smallest = compareSmaller(num1,num2);
		
		//Outputs the smaller number to the user
		System.out.println("The smaller number is " + smallest);
		
		//Closes the keyboard
		keyboard.close();

	}

	/**
	 * This method takes the two numbers and returns the smaller number
	 * @param num1 The first number
	 * @param num2 The second number
	 * @return Returns the smaller number
	 */
	
	public static float compareSmaller(float num1, float num2)
	{
		//Compares the two numbers and returns the smaller one
		if (num1 <= num2)
			return num1;
		else
			return num2;
	}
	
}
