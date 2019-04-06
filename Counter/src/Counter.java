import java.util.Scanner;

/** This program takes two numbers from the user, then compiles a list
 * of integers from the first number to the second number. For each
 * number that is divisible by 3, it displays "Tri", for each divisible by
 * 5, "Pente", and by 7, "Septi". Otherwise it simply displays just the number.
 * -Josiah Moore */

public class Counter {

	public static void main(String[] args) {

		
		//Declares Variables
		Scanner keyboard = new Scanner (System.in);
		int num1, num2;
		boolean divisible = false;
		
		//Gets the user's first number
		System.out.println("Please enter a number greater than 0.");
		num1 = keyboard.nextInt();
		
		//Confirms validity of the first number
		while (num1 <= 0)
		{
			System.out.println("Error, number is less than 1. " 
		    + "Please enter a number greater than 0.");
			num1 = keyboard.nextInt();
		}
		
		//Gets the user's second number
		System.out.println("Please enter another number that is " 
		+ "greater than your first plus 20.");
		num2 = keyboard.nextInt();
		
		//Confirms validity of the second number
		while (num2 < num1 + 20)
		{
			System.out.println("Error, number is not greater than " 
			+ "your first plus 20. Please enter a number than is greater "
			+ "than your first plus 20.");
			num2 = keyboard.nextInt();
		}
		
		//Loops through the numbers, and displays the correct tags for them
		for(int i=num1;i<=num2;i++)
		{
			for (int x=3;x<=7;x+=2)
			{
				if (i % x == 0)
				{
					if (x == 3)
					{
						System.out.print("Tri");
						divisible = true;
					}
					else if (x == 5)
					{
						System.out.print("Pente");
						divisible = true;
					}
					else if (x == 7)
					{
						System.out.print("Septi");
						divisible = true;
					}
				}
			}
			if (divisible == false)
			{
				System.out.println(i);
			}
			else
			{
				System.out.print("\n");
				divisible = false;
			}
		} 
			
		keyboard.close();

	}
	
}
