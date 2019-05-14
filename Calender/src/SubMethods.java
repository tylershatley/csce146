import java.util.Scanner;
import java.io.*;

//Tyler Shatley
public class SubMethods {
	public static final String DELIM = "\t";	
	private GenLL<Sub>sub;
	
	public SubMethods()
	{
		sub = new GenLL<Sub>();
	}
	
	public void newSubMethod(Sub xSub)//adding a new sub category
	{
		sub.insert(xSub);
	}
	
	public boolean findSubMethod(Sub xSub)//method that finds if there is a specific instance. t or f
	{
		sub.moveToHead();
		
		while(sub.hasMore())
		{
			if(sub.getCurrent().getcat().equalsIgnoreCase(xSub.getcat()))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	public void deleteSubMethod()//deleting a sub category. 
	{
		sub.deleteCurrent();
	}
	
	public void editSubCat(Sub xSub) //method that changes the name of a category.
	{
		sub.getCurrent().setcat(xSub.getcat());
	}
	
	public void editSubDes(Sub xSub) //method that changes the description of a sub-catergory.
	{
		sub.getCurrent().setdes(xSub.getdes());
	}
	
	public void writeToFile(String fileName) //method that writes the sub-categorys to the file.
	{
		try 
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName));
			sub.moveToHead();
			
			while(sub.hasMore())
			{
				fileWriter.println(sub.getCurrent().getname() +
						"\n" + sub.getCurrent().getcat() + 
						"\n" + sub.getCurrent().getdes());
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void readFromFile(String fileName)//method that reads sub-categorys from a file.
	{
		try
		{
			Scanner fileReader = new Scanner(new File(fileName));
			
			while(fileReader.hasNextLine())
			{
				String fileLine = fileReader.nextLine();
				String [] split = fileLine.split(DELIM);
				
				if(split.length != 3)
					continue;
				String folderName = split[0]; //folder name
				String cat = split[1]; //category
				String des = split[2]; //description 
				
				Sub subber = new Sub(); //new sub-category
				subber = new Sub(folderName, cat, des);
				sub.insert(subber);
			}
			fileReader.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
