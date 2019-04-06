import java.util.Scanner;
import java.io.*;

/** This program is a virtual vending machine where the user can purchase
 *  items and receive the correct change.
 *  - Josiah Moore
 */

public class Vend {

	public static void main(String[] args) throws IOException {
		
		//Initializes the keyboard and variables
		Scanner keyboard = new Scanner(System.in);
		
		String itemName = null;
		Double itemPrice = null;
		String again = null;
		char againChar = 'n';
		
		//Starts the do-while loop for repeated purchases
		do
		{
			//Creates the file reader
			File file = new File("stock.txt");
			Scanner inputFile = new Scanner(file);
			
			System.out.println("Welcome to the virtual vending machine. "
						            + "It serves:");
			//Reads and displays the items and prices
			for(int x=0;x<5;x++)
			{
				String str = inputFile.nextLine();
				double num = Double.parseDouble(inputFile.nextLine());
				System.out.println( (x + 1) + ". " + str + " - " + "$" + num);
			}
			
			//Calls the methods to get the money amount and selection
			double money = getMoney(keyboard);
			int select = getSelect(keyboard);
			
			//Reads the selected item's name and price
			Scanner inputFile2 = new Scanner(file);
			for(int x=1;x<=select;x++)
			{
				itemName = inputFile2.nextLine();
				itemPrice = Double.parseDouble(inputFile2.nextLine());
			}
			
			//Calls the method to calculate the change
			getChange(money,itemName,itemPrice);
			
			//Determines whether to make another purchase
			System.out.println("Would you like to make another purchase? "
						       + "(y/n)");
			keyboard.nextLine();
			again = keyboard.nextLine();
			againChar = again.charAt(0);
			
			//Closes the input files
			inputFile.close();
			inputFile2.close();

		} while (againChar == 'Y' || againChar == 'y');	
		
		//Close the keyboard
		keyboard.close();

	}
	
	/**
	 * Gets the money deposited
	 * @param keyboard reuses the keyboard
	 * @return the money amount
	 */
	
	public static double getMoney(Scanner keyboard)
	{
		System.out.print("Please enter the amount of money deposited "
					     + "(in dollars): $");
		double money = keyboard.nextDouble();
		return money;
	}
	
	/**
	 * Get the user's selection
	 * @param keyboard reuses the keyboard
	 * @return the selection
	 */
	
	public static int getSelect(Scanner keyboard)
	{
		System.out.print("Please enter your selection: ");
		int select = keyboard.nextInt();
		return select;
	}
	
	/**
	 * Calculates the change and displays it
	 * @param money amount
	 * @param itemName item's name
	 * @param itemPrice item's price
	 */
	
	public static void getChange(double money,String itemName,double itemPrice)
	{
		//Delcares variables
		int q = 0,d = 0,p = 0;
		String qStr,dStr,pStr;
		double change = 0;
		boolean returned = false;
		
		//Checks if the money is sufficent to purchase the item or not
		if (money >= itemPrice)
			change = (money - itemPrice)*100;
		else
		{
			System.out.println("You entered insufficent money to purchase the "
		                       + itemName.toLowerCase() + ".");
			change = money*100;
			returned = true;
		}
		
		//Calculates the change
		for(int x=1;change>=25;x++)
		{
			change -= 25;
			q = x;
		}
		for(int x=1;change>=10;x++)
		{
			change -= 10;
			d = x;
		}
		for(int x=1;change>=1;x++)
		{
			change -= 1;
			p = x;
		}
		
		//Determines whether to use the plural forms or not
		if (q==1)
			qStr = " quarter, ";
		else
			qStr = " quarters, ";
		if (d==1)
			dStr = " dime, ";
		else
			dStr = " dimes, ";
		if (p==1)
			pStr = " penny, ";
		else
			pStr = " pennies, ";
		
		//Displays the change to the user
		if (returned)
			System.out.println("You are returned: " + q+qStr+d+dStr+p+pStr);
		else
		{
			System.out.println("Your change is: " + q+qStr+d+dStr+p+pStr);
			System.out.println("Please take your " + itemName.toLowerCase()
			                   + " and change. \n");
		}
		
	}

}
