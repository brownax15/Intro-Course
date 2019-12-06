//Project Name: Final Project
//Author: Allison Brown
//Description: Making a gradebook to keep track of a class's grade stats
//Last Modified: 12.5.19
//Version: 1.0

//import to use keyboard, input file and export file
import java.util.Scanner;
import java.io.*;
//import java.util.Random;

public class Gradebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			//turn on keyboard
			Scanner keyboard = new Scanner(System.in);
			//ask for number of students and assignments
			//lose when figure out importing 
			System.out.println("How many students are are in the class? ");
			int classSize = keyboard.nextInt();
			System.out.println("How many assignments are graded? ");
			int assNum = keyboard.nextInt();


			//read from outside file
			//link to file
			File fr = new File ("C:/Users/Allison/Desktop/GradeBookEntry.txt");
			//open file for use
			Scanner inputFile = new Scanner(fr);

			//create an array 
			int [] [] grades = new int [classSize + 1] [assNum];
			
			//for loop to assign grades to students
			//not need once input file
			//for (int row=0; row<grades.length; row++) 
			{

				//for (int col=0; col<grades[0].length; col++)
				{
					//set up row to give total points of 
					//need to set up input file to give this
					//if(row==0)
					{
						//int points = 100;
						//grades [row] [col]= points;
					}
					//give random grades to students
					//get rid of when input file works
					//else
					{
						//int rndNum = 0;
						//rndNum = rndGrade();
						//grades[row][col]= rndNum;
					}
				}
			}

			//loop through the input file (grades) with while loop 
			while(inputFile.hasNextInt())
			{
				//put data (grades) from file into array
				for (int row=0; row<grades.length; row++) 
				{
					for (int col=0; col<grades[0].length; col++)
					{
						int amt = 0;
						amt = inputFile.nextInt();
						grades [row] [col]= amt;
					}
				}
			}
			
			//create variable for max total points
			int totalPoints = 0;
			
			//for loop to output grades in display
			for (int row=0; row<grades.length; row++)
			{
				int sum = 0;
				int gradePercent = 0;
				System.out.print("\nStudent " + row);
				for (int col=0; col<grades[0].length; col++)
				{	
					//since first row is the max points of assignments separate and make totalPoints variable
					if (row == 0)
					{
						System.out.print("\t" + grades [row] [col]);
						totalPoints = sum + grades[row][col];
						sum = sum + grades[row][col]; 
					}
					else
					{
						System.out.print("\t" + grades [row] [col]);
						sum = sum + grades[row][col]; 
					}
				}
				//print out the total points of all assignments for each student
				System.out.print("\tPoints = " + sum);
				//find grade (percentage) at moment and print out
				gradePercent = percent(totalPoints, sum);
				System.out.print("\tGrade Percent = " + gradePercent +"%");
				//note if student is passing or failing
				pfClass(gradePercent);	
			}
			
			//open/create output file
			FileWriter tempFile = new FileWriter("C:/Users/Allison/Desktop/GradeBookStats.txt",false);
			PrintWriter outputFile = new PrintWriter(tempFile);

			//output data to new file
			//for loop to output grades, very similar to above for outputting to display
			for (int row=0; row<grades.length; row++)
			{
				int sum = 0;
				int gradePercent = 0;
				outputFile.print("\nStudent " + row);
				for (int col=0; col<grades[0].length; col++)
				{	
					if (row == 0)
					{
						outputFile.print("\t" + grades [row] [col]);
						totalPoints = sum + grades[row][col];
						sum = sum + grades[row][col]; 
					}
					else
					{
						outputFile.print("\t" + grades [row] [col]);
						sum = sum + grades[row][col]; 
					}
				}
				outputFile.print("\tPoints = " + sum);
				gradePercent = percent(totalPoints, sum);
				outputFile.print("\tGrade Percent = " + gradePercent +"%");
				//since can't call method put in as if/else
				if(gradePercent<60)
					{
						outputFile.print("\t***Failing this course***");
					}
				else
					{
						outputFile.print("\tPassing this course");
					}		
			}

			//close the files
			inputFile.close();
			outputFile.close();

			//close keyboard
			keyboard.close();
		}

		// to catch if file does not exist and give code
		catch (FileNotFoundException e) {
			System.out.println("There seems to be no file at that specific location. ");
			System.out.println("The following error occurred: " + e.getMessage());
		}
	}
	//build random grade method	
	//not need once input file
	//public static int rndGrade() 
	{
		//int randomNum = (int) (Math.random()*100);
		//return Math.abs(randomNum);
	}
	//build percentage method
	public static int percent(int total, int points)
	{
		return ((points*100)/total);
	}
	//build pass/fail method for display
	public static void pfClass(double grade)
	{
		if(grade<60)
		{
			System.out.print("\t***Failing this course***");
		}
		else
		{
			System.out.print("\tPassing this course");
		}
	}

}
