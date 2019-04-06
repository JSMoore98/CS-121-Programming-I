import java.util.Scanner;
import javax.swing.JOptionPane;

/** This program reads your inputed name and outputs your name, 
 * the number of characters in the name, your name in all uppercase and lowercase letters, 
 * and the first and last character in your name.
 * - Josiah Moore*/

public class Name {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		String name;
		int length;
		
		//Reads the inputed name
		JOptionPane.showMessageDialog(null,"Please enter your name: ");
		name = JOptionPane.showInputDialog("Enter your name.");
		length = name.length();
		
		//Outputs name variations
		System.out.println(name);
		System.out.println(length);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(length-1));
		
		keyboard.close();
		System.exit(0);
		
	}

}
