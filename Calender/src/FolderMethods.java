//Tyler Shatley
import java.util.Scanner;
import java.io.*;
public class FolderMethods {
	
	public static final String DELIM = "\t";
	private GenLL<Folder>folder;
	
	public FolderMethods()
	{
		folder = new GenLL<Folder>();
	}
	
	public void newFolder(Folder xFolder) //method that makes a new folder.
	{
		folder.insert(xFolder);
	}
	
	public String folderName()
	{
		return folder.getCurrent().getname();
	}
	
	public boolean checkName(String a)
	{
		folder.moveToHead();
		
		while(folder.hasMore())
		{
			if(a.equalsIgnoreCase(folderName()))
			{
				return true;
			}
			else
			{
				folder.gotoNext();
				return false;
			}
		}
		return false;
	}
	
	public boolean findFolder(Folder xFolder) //finds the folder by name
	{
		folder.moveToHead();; //moves current to the head.
		
		while(folder.hasMore())
		{
			if(folder.getCurrent().getname().equalsIgnoreCase(xFolder.getname()))
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
	
	public void removeFolder() //method that removes a folder from the list.
	{
		folder.deleteCurrent();
	}
	
	public void editFolder(Folder xFolder)//method that changes the name of the folder
	{
		folder.getCurrent().setname(xFolder.getname());
	}
	
	public void writeTofile(String fileName)//Putting all of the folders into a txt file.
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName));
			
			folder.moveToHead();
			
			while(folder.hasMore())
			{
				fileWriter.println(folder.getCurrent().getname());
				folder.gotoNext();
			}
			fileWriter.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void readFromFile(String fileName) //reading from the file
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String folderName = fileLine;
				Folder foldeR = new Folder();
				foldeR.setname(folderName);
				folder.insert(foldeR);
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void printFolders() //method that prints out the folders.
	{
		folder.print();
	}
}























