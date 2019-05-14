/*
 * Tyler Shatley
 * csce 146
 * homework00
 */
import java.util.*;
import java.io.*;
public class ShowcaseGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		Prize prize = new Prize();
		Showcase show = new Showcase();
		
		
		show.readFromFile("prizelist.txt");
		
		String yes = "true";
		
		while(yes == "true")
		{
			System.out.println("Welcome to the showcase show down!");
			show.randomChoice();
			show.print();
			
			System.out.println("You must guess the total cost of all without going over"
					+ "\nEnter your guess");
			int guess = key.nextInt();
			show.total();
			
			System.out.println("You guessed " + guess + " this actual guess is " + show.total());
			if(guess >= show.total() -2000)
			{
				System.out.println("You guessed within $2000.. you win!");
			}
			else
			{
				System.out.println("That was a bad guess...sorry");
			}
			
			key.nextLine();
			System.out.println("Would you like to play again? (Yes or no)");
			String answer = key.nextLine();
			
			if(answer.equalsIgnoreCase("yes"))
			{
				yes = "true";
			}
			else
			{
				yes = "false";
			}
		}
		
		System.out.println("Thank you for playing");

	}

}
