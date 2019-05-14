/*
 * Tyler Shatley
 * word ladder
 * random work
 */
import java.util.Scanner;
import java.io.*;
public class MainMethod {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the word ladder." + 
		"\nEnter two words of equal length." +
				"\nEnter word one");
		key.hasNextLine();
		String one = key.next();
		System.out.println("Enter word two");
		String two = key.next();
		
		int q = 0; //integer for the word list
		
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		
		if(one.length() == two.length())
		{
			try
			{
				Scanner fileScanner = new Scanner(new File("words.txt"));
				String [] words = new String[10000];
				
				while(fileScanner.hasNextLine())
				{
					String fileLine = fileScanner.nextLine(); //establishes the array
					words[q] = fileLine;
					q++;
				}
				
				for(int i = 0; i <one.length(); i++)
				{
					for(int j = 0; j < q; j++)
					{
						for(int x = 0; x < 26; x++) // 26 characters in the alphabet
						{
							for(int y = 0; y < 10000; y++)
							{
								
							}
						}
					}
				}
				
				
				
				fileScanner.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Words are not equal in length dumbass.");
		}
		System.out.println(q);
	}
}
