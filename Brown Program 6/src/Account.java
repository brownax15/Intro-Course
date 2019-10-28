//Project Name: Program 6
//Author: Allison Brown
//Description: Checking Account as Class
//Last Modified: 10.28.19
//Version: 1.0

//name class
public class Account {

	//attributes
	//declare universal variables
	//public double accountBalance;
	//public double depositAmount;
	//public double withdrawlAmount;
	
	//display menu
	public void displayMenu()
	{
		System.out.println("Main Menu");
		System.out.println("=========");
		System.out.println("1.) Make Deposit");
		System.out.println("2.) Withdrawal Funds");
		System.out.println("3.) View Balance");
		System.out.println("4.) Exit");
		System.out.println("\nWhat would you like to do? ");		
	}
	
	//
	public double deposit(double balIn, double depAm)
	{
		return(balIn + depAm);
	}
	
	public double withdrawl(double balIn, double withAm)
	{
		return(balIn - withAm); 
	}
	
	public void checkBalance(double bal)
	{
		System.out.println("Your new balance is " + bal + ".\n");
	}
	
}
