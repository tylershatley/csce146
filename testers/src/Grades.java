/*
 * Tyler Shatley
 * GradeTester
 */
import java.util.Scanner;
import java.io.File;
public class Grades {
	public static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Welcome to the grade calculator");
		
		int homeworkCount = 0;
		int labReportCount = 0;
		int examCount = 0;
		int labExamCount = 0;
		int labCount = 0;
		int finalCount = 0;
		
		double hwSum = 0;
		double lrSum = 0;
		double eSum = 0;
		double leSum = 0;
		double labSum = 0;
		double finalSum = 0;
		
		double hwAvg = 0;
		double lrAvg = 0;
		double eAvg = 0;
		double leAvg = 0;
		double labAvg = 0;
		double finalAvg = 0;
		
		try 
		{
			Scanner fileScanner = new Scanner(new File("grades.txt"));
	
			
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				System.out.println(fileLine);
				
				switch(fileLine)
				{
				case "LabReport":
					while(fileScanner.hasNextDouble())
					{
						labReportCount++;
						lrSum += fileScanner.nextDouble();
					}
					lrAvg = lrSum/labReportCount;
					System.out.println("Average for lab reports is " + lrAvg);
					lrAvg = lrAvg*.1;
					break;
				case "Labs":
					while(fileScanner.hasNextDouble())
					{
						labCount++;
						labSum += fileScanner.nextDouble();
					}
					labAvg = labSum/labCount;
					System.out.println("Average for labs is "  + labAvg);
					labAvg = labAvg*.2;
					break;
				case "Homework":
					while(fileScanner.hasNextDouble())
					{
						homeworkCount++;
						hwSum += fileScanner.nextDouble();
					}
					hwAvg = hwSum/homeworkCount;
					System.out.println("Average for homeworks is " + hwAvg);
					hwAvg = hwAvg*.2;
					break;
				case "Exams":
					while(fileScanner.hasNextDouble())
					{
						examCount++;
						eSum += fileScanner.nextDouble();
					}
					eAvg = eSum/examCount;
					System.out.println("Average for exams is " + eAvg);
					eAvg = eAvg*.2;
					break;
				case "LabExams":
					while(fileScanner.hasNextDouble())
					{
						labExamCount++;
						leSum += fileScanner.nextDouble();
					}
					leAvg = leSum/labExamCount;
					System.out.println("Average for lab exams is " + leAvg);
					leAvg = leAvg*.2;
					break;
				case "FinalExam": 
					while(fileScanner.hasNextDouble())
					{
						finalCount++;
						finalSum += fileScanner.nextDouble();
					}
					finalAvg = finalSum/finalCount;
					System.out.println("The average for final exam is " + finalAvg);
					finalAvg = finalAvg*.1;
					break;
				}
			}
			fileScanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
				
		System.out.println("Lab reports contribute " + lrAvg + " to your final grade");
		System.out.println("Labs contribute " + labAvg + " to your final grade");
		System.out.println("Homeworks contribute " + hwAvg + " to your final grade");
		System.out.println("Exams contribute " + eAvg + " to your final grade");
		System.out.println("LabExams contribute " + leAvg + " to your final grade");
		System.out.println("Finals contribute " + finalAvg + " to your final grade");
		double fin = (lrAvg + labAvg + hwAvg + eAvg + leAvg + finalAvg);
		System.out.println("Making your final grade " + fin);
		
	}

}
