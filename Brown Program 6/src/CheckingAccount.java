//Project Name: Program 6
//Author: Allison Brown
//Description: Checking Account as Class
//Last Modified: 10.28.19
//Version: 1.0

//import scanner
import java.util.Scanner;

public class CheckingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//initialize keyboard, assign variables
		Scanner keyboard = new Scanner(System.in);
		int menuChoice = 0;
		double accountBalance = 0.00;
		double depositAmount = 0.00;
		double withdrawalAmount = 0.00;
		
		
		//initialize an instance of the class Account
		Account accountOne = new Account();
		
		//display menu, ask for user input and execute user choice in do/while loop
		do
		{
			//display menu and collect user input
			accountOne.displayMenu();
			menuChoice = keyboard.nextInt();
		
			switch(menuChoice)
			{
			case 1:
				//ask for amount to deposit and give new balance with depositincluded
				System.out.println("How much would you like to deposit? ");	
				depositAmount = keyboard.nextDouble();
				accountBalance = accountOne.deposit(accountBalance, depositAmount);
				accountOne.checkBalance(accountBalance);
				break;
			case 2:
				//ask for amount to withdraw
				System.out.println("How much would you like to withdraw? ");	
				withdrawalAmount = keyboard.nextDouble();
				//if/else statement to either show new balance with withdrawal included if have enough or say don't have enough
				if(accountBalance>=withdrawalAmount)
				{
					accountBalance = accountOne.withdrawl(accountBalance, withdrawalAmount);
					accountOne.checkBalance(accountBalance);
				}
				else 
				{
					System.out.println("You do not currently have enough money in this account to withdraw " + withdrawalAmount + ". You currently have " + accountBalance + " in this account. Please begin again.\n");
				}
				break;
			case 3:
				//give account balance
				accountOne.checkBalance(accountBalance);
				break;
			case 4:
				//exit statement
				System.out.println("Thank you! Have a great day.");
				break;
			default:
				//invalid menu choice response
				System.out.println("Please enter a valid choice.\n");
			}
		
		}while (menuChoice !=4);
		
		//close keyboard
		keyboard.close();
		
	}

}
