//Project Name: Program 9
//Author: Allison Brown
//Description: importing grades, making statistics, exporting data and try statement/exceptions
//Last Modified: 18.11.19
//Version: 1.0

//import to open and export file
import java.io.*;
import java.util.Scanner;

public class GradeStatistics2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			// create variables
			int numGrades = 0;
			double totalGrades = 0.0;
			double avgGrades = 0.0;

			// read from outside file
			// link to file
			File fr = new File("C:/Users/Allison/Desktop/grades.txt");
			// open file for use
			Scanner inputFile = new Scanner(fr);

			// loop through the input file (grades) with while loop
			while (inputFile.hasNext())
			{
				totalGrades = inputFile.nextDouble() + totalGrades;
				numGrades = numGrades + 1;
			}

			// output total grades, number of grades and average
			System.out.println("Grade Statistics");
			System.out.println("================");
			System.out.println("Total: " + totalGrades);
			System.out.println("Number of Grades: " + numGrades);
			avgGrades = totalGrades / numGrades;
			System.out.printf("Average:\t%.1f", avgGrades);
			System.out.println("%");

			// close the input file
			inputFile.close();

			// open/create output file
			FileWriter tempFile = new FileWriter("C:/Users/Allison/Desktop/GradeStatistics.txt");
			PrintWriter outputFile = new PrintWriter(tempFile);

			// output data to new file
			outputFile.println("Grade Statistics");
			outputFile.println("================");
			outputFile.println("Total: " + totalGrades);
			outputFile.println("Number of Grades: " + numGrades);
			outputFile.printf("Average:\t%.1f", avgGrades);
			outputFile.println("%");

			// close output file
			outputFile.close();
		}

		// to catch if file does not exist and give code
		catch (FileNotFoundException e) 
		{
			System.out.println("There seems to be no file at that specific location. ");
			System.out.println("The following error occurred: " + e.getMessage());
		}

		// to catch if file unexpectedly ended
		catch (EOFException e) 
		{
			System.out.println(
					"There seems to be an issue with the file. The end of the file has been unexpectedly reached. ");
			System.out.println("The following error occurred: " + e.getMessage());
		}

		//always executed to say ran through exceptions
		finally 
		{
			System.out.println("The program has been tested for exceptions.");
		}
	}

}
