//Project Name: Program 2
//Author: Allison Brown
//Description: Using keyboard, menu, IF/ELSE, switch 
//Last Modified: 19.9.19
//Version: 1.0

//required scanner code for keyboard
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//start keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//declare variables
		int number1;
		int number2;
		int number3;
		int choice;
		int resultant = 0;
				
		//collect input from user
		System.out.println("Choose a number? ");
		//read integer from keyboard
		number1 = keyboard.nextInt();
		System.out.println("Choose another number? ");
		number2 = keyboard.nextInt();
		System.out.println("Choose a thrid number? ");
		number3 = keyboard.nextInt();
		
		//display input numbers
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);
		System.out.println("Number 3: " + number3);	
				
		//display menu and get user input
		System.out.println("\nMain Menu");
		System.out.println("Number 1 *menu option* Number 2");
		System.out.println("===========\n");
		System.out.println("1.) Add");
		System.out.println("2.) Subract");
		System.out.println("3.) Multiply");
		System.out.println("4.) Divide");
		System.out.println("Please make a choice? ");
		choice = keyboard.nextInt();
		
		//output content based on user input
		switch (choice)
		{
		case 1:
			resultant = (number1 + number2);
			System.out.println(number1 + " + " + number2 + " = " + resultant);
			break;
		case 2:
			resultant = (number1 - number2);
			System.out.println(number1 + " - " + number2 + " = " + resultant);
			break;
		case 3:
			resultant = (number1 * number2);
			System.out.println(number1 + " * " + number2 + " = " + resultant);
			break;
		case 4:
			resultant = (number1 / number2);
			System.out.println(number1 + " / " + number2 + " = " + resultant);
			break;
			
		default:
			//resultant = (need to figure out how not to get an if else result)
			System.out.println("You made an invalid choice.");
		}
		
		//close keyboard
		keyboard.close();
		
		//if/else statement to determine if n1n2 is greater than n3
		if (resultant > number3)
		{
			System.out.println("\n" + resultant + " is greater than " + number3 + ".");
		}
		else
		{
			System.out.println("\n" + resultant + " is not greater than " + number3 + ".'");
		}
		
	}

}
