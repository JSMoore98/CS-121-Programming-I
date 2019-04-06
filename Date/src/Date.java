import javax.swing.JOptionPane;

/** This program read in the month, day, and year given by the user, 
 * then formats it after checking that it is valid. If also validates whether
 * February was during a leap year.
 *  - Josiah Moore
 */

public class Date {

	public static void main(String[] args) {
		
		//Initialize Variables
		int day;
		int month;
		int year;
		String monthStr;
		
		//Reads Input
		month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the month: "));
		day = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the day: "));
		year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the year in the format YYYY: "));

		//Determines the name of the month
		if (month == 1)
			monthStr = "January";
		else if (month == 2)
			monthStr = "February";
		else if (month == 3)
			monthStr = "March";
		else if (month == 4)
			monthStr = "April";
		else if (month == 5)
			monthStr = "May";
		else if (month == 6)
			monthStr = "June";
		else if (month == 7)
			monthStr = "July";
		else if (month == 8)
			monthStr = "August";
		else if (month == 9)
			monthStr = "September";
		else if (month == 10)
			monthStr = "October";
		else if (month == 11)
			monthStr = "November";
		else if (month == 12)
			monthStr = "December";
		else
			monthStr = "Invalid";
			
		//Checks month validation
		if ((month >= 1) & (month <= 12))
		{
			//Checks if the month has 30 days
			if (month == 4 || month == 6 || month == 9 || month == 11)
			{
				//Checks day validation
				if (day >=1 & day <= 30)
				{
					//Checks year validation
					if (year > 0 & year <= 10000)
					{
						JOptionPane.showMessageDialog(null, monthStr + " " + day + ", " + year);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Year is not valid");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Day is not valid");
				}
			}
			
			//Checks if the month has 31 days
			else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12)
			{
				//Checks day validation
				if (day >=1 & day <= 31)
				{
					//Checks year validation
					if (year > 0 & year <= 10000)
					{
						JOptionPane.showMessageDialog(null, monthStr + " " + day + ", " + year);
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Year is not valid");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Day is not valid");
				}
				
			}
			
			//Checks if the month is February
			if (month == 2)
			{
				//Checks year validation
				if (year > 0 & year <= 10000)
				{
					//Checks is that year is a leap year
					if (year % 4 == 0)
					{
						//Checks day validation for a leap year
						if (day >= 1 & day <= 29)
						{
							JOptionPane.showMessageDialog(null, monthStr + " " + day + ", " + year);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Day is not valid");
						}
					}
					else
						//Checks day validation for a non leap year
						if (day >= 1 & day <= 28)
						{
							JOptionPane.showMessageDialog(null, monthStr + " " + day + ", " + year);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Day is not valid");
						}
				}
			}	
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Month is not valid");
		}
	}
}
