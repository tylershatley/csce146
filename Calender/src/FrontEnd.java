/*
 * Tyler Shatley
 */
import java.util.Scanner;
public class FrontEnd {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to no-name project");
		int ans = 0;
		int ans1 = 0;
		int ans2 = 0;
		int ans3 = 0;
		
		//init all objects/classes
		Folder folder = new Folder();
		FolderMethods folderMethods = new FolderMethods();
		Event event = new Event();
		EventMethods eventMethods = new EventMethods();
		Sub sub = new Sub();
		SubMethods subMethods = new SubMethods();
		
		boolean yes = true;
		while(yes == true) 
		{
			System.out.println("What would you like to do?");
			System.out.println("Press 1 to view tasks." +
					"\nPress 2 for editing/removing or adding a new entry." + 
					"\nPress 3 for viewing." + 
					"\nPress 4 to quit.");
			int answer = key.nextInt();
			
			switch(answer)
			{
			case 1:
				System.out.println("Press 1 to view todays tasks." +
						"\nPress 2 to view this weeks tasks." + 
						"\nPress 3 to view this months tasks." + 
						"Press 4 to go back");
				ans = key.nextInt();
				
				switch(ans)
				{
				case 1: //to do
					break;
				case 2: //to do
					break;
				case 3: //to do
					break;
				case 4: //to do
					break;
				}
				break;
			case 2:
				System.out.println("Press 1 for editing." +
						"\nPress 2 for removing" + 
						"\nPress 3 for adding");
				ans = key.nextInt();
				
				switch(ans)
				{
				case 1: //all editing
					System.out.println("Press 1 to edit a folder name." +
							"\nPress 2 to edit a category." +
							"\nPress 3 to edit an event." +
							"\nPress 4 to go back");
					ans1 = key.nextInt();
					
					switch(ans1)
					{
					case 1: //editing the name of a folder
						System.out.println("Press 1 to edit a re-write a file name"); //to-do
						break;
					case 2: //editing a sub-category
						System.out.println("Enter the folder name of the sub-cateogry you want to edit");
						break;
					case 3: //editing an event
						System.out.println("Enter the folder name");
						break;
					case 4:
						break;
					}
					break;
				case 2: // all removing
					System.out.println("Press 1 to remove a folder." +
							"\nPress 2 to remove a category." + 
							"\nPress 3 to remove an event." + 
							"\nPress 4 to return to the home page");
					ans1 = key.nextInt();
					
					switch(ans1)
					{
					case 1: //removing a folder
						System.out.println("Enter the name of the folder you want to delete");
						break;
					case 2: //removing a category
						System.out.println("Enter the folder you want");//to-do
						break;
					case 3: //removing an event
						System.out.println("Enter the folder..."); //to-do
						break;
					case 4: //exiting
						break;
					}
					break;
				case 3: //all adding
					System.out.println("Press 1 to add a new folder" +
							"\nPress 2 to add a new sub-category." + 
							"\nPress 3 to add a new event");
					ans1 = key.nextInt();
					
					switch(ans1)
					{
					case 1://adding a new folder
						folder = new Folder();
						System.out.println("Enter the name of your new folder");
						String input = new String();
						key.next();
						input = key.nextLine();
						folder = new Folder(input);
						folderMethods.newFolder(folder);
						folderMethods.writeTofile("folders.txt");
						break;
					case 2: //adding a new sub-category
						System.out.println("Enter the folder name"); //to do
						break;
					case 3: //adding a new event
						System.out.println("Enter the..."); //to-do
						break;
					}
					break;
			}
				break;
		case 3: //viewing things
			System.out.println("What would you like to view?" + 
					"\nPress 1 for folders." + 
					"\nPress 2 for categorys" + 
					"\nPress 3 for events");
			ans1 = key.nextInt();
			
			switch(ans1)
			{
			case 1: //viewing folders
				folderMethods.readFromFile("folders.txt");
				folderMethods.printFolders();
				break;
			}
			break;
			
		case 4://quiting the program
			yes = false;
			break;
		}

	}

}
}
