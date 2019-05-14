/*
 * Tyler Shatley
 */
import java.util.Scanner;
import java.io.File;
public class Csce201 {
	
	public static Scanner key = new Scanner(System.in);
	public static String fileName = "Robgrades.txt";
	public static void main(String[] args) {
		
		int count = 0;
		double grade = 0;
		double total = 0;
		
		try {
			
			Scanner fileScanner = new Scanner(new File(fileName));
			
			while(fileScanner.hasNextLine()){
				
				String line = fileScanner.nextLine();
				System.out.println(line);
				
				switch(line) {
				
				case "Homework/Participation":
					count = 0;
					grade = 0;
					while(fileScanner.hasNextDouble()){	
						grade+= fileScanner.nextDouble();
						count++;
					}
					System.out.println("The avg of your homeworks is " + grade/count + 
							"Homeworks contribute " + (grade/count)*.2 + " to your grade");
					total += (grade/count)*.2;
					break;
				case "Exams":
					count = 0; 
					grade = 0;
					while(fileScanner.hasNextDouble()) {
						grade += fileScanner.nextDouble();
						count++;
					}
					System.out.println("The avg of your Exams is " + grade/count + 
							"Finals contribute " + (grade/count)*.8 + " to your grade");
					total += (grade/count)*.8;
					break;
				}
			}
			fileScanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
	}
		System.out.println("Your final grade is a..." + total);	
	}
		
}

