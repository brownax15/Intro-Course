	//Project Name: Program 7
	//Author: Allison Brown
	//Description: Using Array with Sport Scores
	//Last Modified: 11.03.19
	//Version: 1.0

//import keyboard
	import java.util.Scanner;
		
public class SportScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//description of sport
		System.out.println("Welcome to the Easiest Game Ever!\nIn this game you don't have to do anything but decide how many innings you want to play. The computer does the rest.");
		
		//initialize keyboard and create variables
		Scanner keyboard = new Scanner(System.in);
		int inningSize = 0;
		int total1 = 0;
		int total2 = 0;
				
		//ask for user input # of innings
		System.out.print("How many innings do you want to play? ");
		inningSize = keyboard.nextInt();
				
		//create an array with ? rows and 2 columns 
		int [] [] scores = new int [2] [inningSize];
		
		//for loop to assign random scores to teams
		for (int col=0; col<scores[0].length; col++) 
		{
			for (int row=0; row<scores.length; row++)
			{
				//collect scores for home team
				if(row==0)
					{
					int rndNum = 0;
					rndNum = rndScore();
					scores[row][col]= rndNum;
					}
				//collect scores for away team
				if(row==1)
					{
					int rndNum = 0;
					rndNum = rndScore();
					scores[row][col]= rndNum;
					}
					
			}
		}
		
		//print team headers
		System.out.println("\nTeam 1 \tTeam 2");
		System.out.println("==============");
		
		//for loop to output scores
		for (int col=0; col<scores[0].length; col++)
		{
			for (int row=0; row<scores.length; row++)
			{
				if(row==0)
				{
					System.out.print(scores [row][col]);
					total1 = total1 + scores [row] [col];
				}
				//output Team 2 scores
				if (row==1)
				{
					System.out.print("\t" + scores [row][col] + "\n");
					total2 = total2 + scores [row] [col];
				}
				
			}
		}
		
		System.out.println("--------------");
		System.out.println(total1 +"\t"+ total2);
		if(total1>total2)
		{
			System.out.println("Team 1 has won!");
		}
		if(total1<total2)
		{
			System.out.println("Team 2 has won!");
		}
		if(total1==total2)
		{
			System.out.println("The teams have tied. There is no winner.");
		}
		
		keyboard.close();
		
	}
	
//build random score method	
public static int rndScore() 
{
	
    int randomNum = (int) (Math.random()*100);
	return Math.abs(randomNum);
}

}
