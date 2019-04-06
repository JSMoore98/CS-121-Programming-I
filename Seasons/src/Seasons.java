import java.util.Scanner;

/** This program reads in a month, then displays the season that it's in.
 * -Josiah Moore
 */

public class Seasons {

	public static void main(String[] args) {
		
		String month;
		Scanner keyboard = new Scanner(System.in);
		
		//Reads in the month and negates case complications
		System.out.print("Please enter a month: ");
		month = keyboard.nextLine();
		month = month.toLowerCase();
		
		//Determines the season and displays it
		switch (month)
		{
			case "january":
				System.out.println(month + " is in winter.");
			break;
			case "february":
				System.out.println(month + " is in winter.");
			break;
			case "march":
				System.out.println(month + " is in spring.");
			break;
			case "april":
				System.out.println(month + " is in spring.");
			break;
			case "may":
				System.out.println(month + " is in spring.");
			break;
			case "june":
				System.out.println(month + " is in summer.");
			break;
			case "july":
				System.out.println(month + " is in summer.");
			break;
			case "august":
				System.out.println(month + " is in summer.");
			break;
			case "september":
				System.out.println(month + " is in fall.");
			break;
			case "october":
				System.out.println(month + " is in fall.");
			break;
			case "november":
				System.out.println(month + " is in fall.");
			break;
			case "december":
				System.out.println(month + " is in winter.");
			break;

			default:
				System.out.println("Invalid Month");
				
		}
		
		keyboard.close();
	}

}
