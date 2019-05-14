/*
 * Tyler Shatley
 * csce146
 * homework00
 */
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class Showcase {
	public static final int MAX = 50; //50 spots in the text array
	public static final String DELIM = "\t"; 
	
	Prize []prizes = new Prize [MAX];
	int i = 0; 
	Prize [] p = new Prize[5]; //array for the game... 5 because thats what the game says
	
	
	
	public void randomChoice() //method that fills in the 5 prizes used for the game
	{
		Random r = new Random();
		
		int j = 0;
		
		while(j < 5)
		{
			int ran = r.nextInt(MAX)+0;
			
			if(prizes[ran] != null)
			{
				p[j] = prizes[ran];
				j++;
			}
			else
			{
				//do nothing
			}
		}
	}
	
	public int total()
	{
		int total = 0;
		
		for(int x = 0; x < 5; x++)
		{
			total += p[x].getprize();
		}
		return total;
	}
		
	
	public void print()//method that prints all of the objects
	{
		System.out.println("Your prizes are:");
		for(int q = 0; q < 5; q++)
		{
			System.out.println(p[q].getname());
		}
	}
	
	
	public void readFromFile(String fileName) //method that reads the file in and puts the objects into an array
	{
		try
		{
			Scanner fileReader = new Scanner(new File(fileName));
			
			while(fileReader.hasNextLine())
			{
				String line = fileReader.nextLine();
				String[] splitLine = line.split(DELIM);
				
				if(splitLine.length != 2)
					continue;
				String name = splitLine[0];
				int prize = Integer.parseInt(splitLine[1]);
				prizes[i] = new Prize(name,prize);
				i++;
			}			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
	
