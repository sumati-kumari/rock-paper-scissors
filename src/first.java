import java.util.*;
 import java.util.Scanner;
import java.util.Random;

public class first 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random Rand = new Random();
		int compScore = 0;
		int userScore = 0;
		int counter = 0;
		
		System.out.println("Hello... what is your name");
		String name=sc.nextLine();
		System.out.println("Hello " + name + " Enter 1 for ROCK, 2 for PAPER, 3 for SECISSORS");
		
		while(counter == 0)
		{
			int compChoice = 1 + Rand.nextInt(3);
			
			int playerChoice = sc.nextInt();
			
			
			if(playerChoice == compChoice)
			{
				System.out.println("it is a tie, no points will be awarded");
			}
			
			else if(playerChoice == 1)
			{
				if(compChoice ==2)
				{
					System.out.println("Computer Selected Paper");
					System.out.println("Sorry" + name + "you lost this round");
					compScore++;
					System.out.println("compScore :" + compScore);
					System.out.println("userScore" + userScore);
				}
				
				else if(compScore == 3)
				{
					System.out.println("Computer Selected Scissors");
					System.out.println("congrats!" + name + "you won this round!");
					userScore++;
					System.out.println("computer :" + compScore);
					System.out.println(name + ":" + userScore);
				}
			}
			
			else if(playerChoice == 2)
			{
				if(compChoice == 1)
				{
					System.out.println("Computer Selected Rock");
					System.out.println("congrats!" + name + "you won this round!");
					userScore++;
					System.out.println("computer :" + compScore);
					System.out.println(name + ":" + userScore);
				}
				else if(compChoice == 3)
				{
					System.out.println("Computer Selected Scissors");
					System.out.println("congrats!" + name + "you won this round!");
					userScore++;
					System.out.println("computer :" + compScore);
					System.out.println(name + ":" + userScore);
				}
			}
			
			else if(playerChoice == 3)
			{
				if(compChoice == 1)
				{
					System.out.println("Computer selected rock");
					System.out.println("sorry" + name + "you lost this round");
					compScore++;
					System.out.println("Computer:" + compScore);
					System.out.println(name + ":" + userScore);
				}
				
				else if(compChoice == 2)
				{
					System.out.println("computer selected paper");
					System.out.println("congrats!!" + name + "you won this round");
					userScore++;
					System.out.println("computer" + compScore);
					System.out.println(name + ":" + userScore);
					
				}
			}
				
				if(userScore == 5)
				{
					System.out.println("YOU WON THE GAME!! CONGRATS!");
					counter++;
				}
				if(compScore == 5)
				{
					System.out.println(" I AM SORRY, BUT YOU HAVE BEEN DEFEATED !!");
					counter++;
				}
			
		}
			
	}

}

