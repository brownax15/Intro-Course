//Project Name: Program 3
//Author: Allison Brown
//Description: keyboard, input, do/while loop, while loop, for loop, if/else
//Last Modified: 26.9.19
//Version: 1.0

//required scanner code for keyboard
import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//start keyboard
		Scanner keyboard = new Scanner(System.in);
				
		//declare variables name and number 
		int number;
		String userName;
		
		//ask user for input name 
		System.out.print("What is your name? ");
		userName = keyboard.next();
		//System.out.print("Pick a number between 0 and 100. ");
		//number = keyboard.nextInt();		
		
		//ask user for input number 
		//while loops nested to have input bt 0 and 100
		do
		{
			System.out.print("Please pick an integer between 0 and 100. ");
			number = keyboard.nextInt();
		
			while (number < 0)
			{
				System.out.print("Please pick an integer between 0 and 100. ");
				number = keyboard.nextInt();
			}
		}while (number > 100);
		
		//thank user for input
		System.out.println("\nThank you for your input, " + userName + ".\n");
		
		//use for loop to countdown
		for(int i = number; i>=0; i--)
			{
			//if/else to decide what statement to output as countdown
			if(i>0)
				{
				System.out.println(i + ". Gotta keep counting down. You can do it!");
				}
			else 
				System.out.println(i + ". Woohoo. You are done!");
			}	
		
		//close keyboard
		keyboard.close();
						
	}
	
}
	
