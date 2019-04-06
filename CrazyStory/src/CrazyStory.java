import java.util.Scanner;

 /** This program asks the user a series of questions 
  * and then reads in the inputs to those questions.
  * It then inserts the answers into the story.
  * - Josiah Moore */

public class CrazyStory {

	public static void main(String[] args) {
		
		//Creates the scanner class and string variables
		Scanner keyboard = new Scanner (System.in);
		String name,city,adj,state,age,college,prof,dollars,animal,pet,verb;
		
		//Asks the user questions and collects the answers
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Enter your city: ");
		city = keyboard.nextLine();
		System.out.print("Enter an adjective: ");
		adj = keyboard.nextLine();
		System.out.print("Enter your state: ");
		state = keyboard.nextLine();
		System.out.print("Enter your age: ");
		age = keyboard.nextLine();
		System.out.print("Enter your college: ");
		college = keyboard.nextLine();
		System.out.print("Enter your profession: ");
		prof = keyboard.nextLine();
		System.out.print("Enter a dollar amount: ");
		dollars = keyboard.nextLine();
		System.out.print("Enter an animal: ");
		animal = keyboard.nextLine();
		System.out.print("Enter your pet's name: ");
		pet = keyboard.nextLine();
		System.out.print("Enter a verb: ");
		verb = keyboard.nextLine();
		
		//Outputs the story while incorporating the user's responses
		System.out.println("Once upon a time someone named " + name + " lived in " + city 
				+ " in the " + adj + " state of " + state + "." + '\n' + "When " + age + " years old, " 
				+ name + " went to school at " + college + "."  + '\n' + name + " graduated and went to work as a " 
				+ prof + " where earning $" + dollars + " an hour."  + '\n' +  "Then, " + name + " adopted a(n) " 
				+ animal + " named " + pet + "."  + '\n' +  "They " + verb + " happily ever after!");
		
		keyboard.close();
		
	}

}
