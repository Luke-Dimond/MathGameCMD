/**
 * Program Name: MathGame.java
 * Purpose: Creating a math game.
 * Coder: Luke Dimond
 * Date: Jan 24, 2025
 */

import java.util.Scanner;
import java.util.Random;

public class MathGame
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int score = 0;
		System.out.println("Hello, welcome to the CMD Math Game. You will need to combine 2 numbers between 50 and 5000.\nPut that calculator away and see how many you can get in a row.");

		while (true) 
		{

		
		
		// Intro
		
		
		
		// create two random numbers between 50 and 4000
		
		int numOne = rand.nextInt(50, 4000);
		int numTwo = rand.nextInt(50, 4000);
		
		// Prompt for answer, loop if not int
		
		
		int answer = 0;
		System.out.print("What is " + numOne + " + " + numTwo + "?: ");
		
		while (true) 
		{
		
		if (input.hasNextInt()) 
		{
			answer = input.nextInt();
			input.nextLine();
			break;
		}
		else 
		{
			System.out.print("You know that is not a number right? Please try again: ");
			input.nextLine();
			continue;
		}
		
		}
		
		if (answer != numOne + numTwo) 
		{
			System.out.println("\nAh, tough luck. You gave me the wrong answer and now I have to take a point from you.");
			if (score != 0) 
			{
				score--;
				System.out.println("Your score is now: " + score +"\nWould you like to play again?\nYes  No: ");
				String yesNo = input.nextLine();
				if(yesNo.equalsIgnoreCase("yes"))
				{
					System.out.print("\n");
					continue;
				}
				else 
				{
					input.close();
					System.exit(0);
				}
			}
			else 
			{
				System.out.print("Huh, seems you alredy got 0 points.\nWould you like to try again?\nYes  No: ");
				String yesNo = input.nextLine();
				
				if(yesNo.equalsIgnoreCase("yes")) 
				{
					System.out.print("\n");
					continue;
				}
				else
				{
					input.close();
					System.exit(0);
					
				}
			
			}
		}
		else 
		{
				score++;
				System.out.println("\nNice! Here's a point\nScore: " + score + "\nWould you like to play again? ");
				System.out.print("\nYes  No: ");
				String yesNo = input.next();
				if(yesNo.equalsIgnoreCase("yes")) 
				{
					System.out.print("\n");
					continue;
				}
				else
				{
					input.close();
					System.exit(0);
					
				}
		}//end of outer if-else
		
		}//end of while
		
		}//end of first while
		
	}
	// end main

 //end class
