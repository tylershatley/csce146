/*
 * Tyler Shatley
 */
import java.util.Scanner;
public class test1 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter how many people you want to test");
		int size = key.nextInt();
		String[] poop = new String[size];
		
		for(int i = 0; i < size; i++)
		{
			System.out.println("Enter the name of the person to test if they are poop.");
			poop[i] = key.next();
		}
		
		for(int i = 0; i < size; i++)
		{
			if(poop[i].equalsIgnoreCase("Tyler"))
			{
				System.out.println(poop[i] + " is def not poop.");
			}
			else
			{
				System.out.println(poop[i] + " is def a gross smelly poop");
			}
		}
		
		
		
		
		

	}

}
