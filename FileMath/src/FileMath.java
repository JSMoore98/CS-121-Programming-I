import java.util.Scanner;
import java.io.*;

/** This program reads in a list of arithmetic expressions from
 * a pre-created file, then writes the answers to a new file
 *  - Josiah Moore */

public class FileMath {

	public static void main(String[] args) throws IOException{
		
		//File and scanner intialization
		File myFile = new File("math.txt");
		Scanner inputFile = new Scanner(myFile);
		PrintWriter outputFile = new PrintWriter("results_math.txt");
		
		//Sum variable initializations
		int sum = 0;
		float divide = 0;
		
		//Reads in the file
		while(inputFile.hasNext())
		{

			//Reads in the integers and operator
			
			int num1 = inputFile.nextInt();
			String strOperator = inputFile.next();
			char operator = strOperator.charAt(0);
			int num2 = inputFile.nextInt();		
			float dNum1 = num1;
			float dNum2 = num2;
			
			//Determines which operator to use
			switch (operator)
			{
			    case '+':
			        sum = num1 + num2;
			    break;
			    case '-':
			    	sum = num1 - num2;
			    break;
			    case '*':
			    	sum = num1 * num2;
			    break;
			    case '%':
			    	sum = num1 % num2;
			    break;
			    case '/':
			    	divide = dNum1 / dNum2;
			    break;
			}
			
			//Determines whether to output as division or not
			if (operator == '/')
			{
				outputFile.printf(num1 + " " + operator + " " + num2
								  + " = " + "%.2f", divide);
				outputFile.println();
			}
			else
				outputFile.println(num1 +" "+ operator +" "+ num2 +" = "+ sum);
		}
		
		//Informs the user that the program has successfully run
		System.out.println("The results have been writen to the file.");
		
		//Closes the input and output files
		inputFile.close();
		outputFile.close();

	}

}
