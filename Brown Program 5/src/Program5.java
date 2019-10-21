//Project Name: Program 5
//Author: Allison Brown
//Description: Using methods (basic calculator)
//Last Modified: 10.15.19
//Version: 1.0

//import scanner
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//start keyboard
		Scanner keyboard = new Scanner (System.in);
		
		//declare variables
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int menuChoice;
		
		//display menu and ask for user input in do/while loop
				do
				{
					//ask for user for variables and collect user input
					System.out.println("Please choose two integers that you want to use in a calculation? ");
					System.out.println("The first number is: ");
					number1 = keyboard.nextInt();
					System.out.println("The second number is: ");
					number2 = keyboard.nextInt();
					
					//display menu and collect user input
					displayMenu();
					menuChoice = keyboard.nextInt();
					
					//behind the scenes to execute menu choices
					switch(menuChoice)
					{
					case 1:
						number3 = addition(number1, number2);
						displayNumber3(number3);
						break;
					case 2:
						number3 = subtraction(number1, number2);
						displayNumber3(number3);
						break;
					case 3:
						number3 = multiplication(number1, number2);
						displayNumber3(number3);
						break;
					case 4:
						number3 = division(number1, number2);
						displayNumber3(number3);
						System.out.println("This number is not exact, it is rounded to the integer.\n");
						break;
					case 5:
						System.out.println("Have a great day!");
						break;
					default:
						System.out.println("That is an invalid choice. Please re-enter your choice.\n");	
					}
		
				}while(menuChoice != 5);
		
		keyboard.close();		
	}
	
	//build method display menu
		public static void displayMenu()
		{
			System.out.println("\nMain Menu:");
			System.out.println("=========");
			System.out.println("1.) Add");
			System.out.println("2.) Subtract");
			System.out.println("3.) Multiply");
			System.out.println("4.) Divide");
			System.out.println("5.) Exit");
			System.out.println("\nWhat would you like to do?");
		}
	//build addition method
		public static int addition(int num1, int num2)
		{
			return(num1 + num2);
		}
	//build subtraction method
		public static int subtraction(int num1, int num2)
		{
			return(num1 - num2);
		}
	//build multiplication method
		public static int multiplication(int num1, int num2)
		{
			return(num1 * num2);
		}
	//build division method
		public static int division(int num1, int num2)
		{
			return(num1/num2);
		}
	//build display number3 method
		public static void displayNumber3(int num3)
		{
			System.out.println("Your new number is " + num3 + ".\n");
		}

}
