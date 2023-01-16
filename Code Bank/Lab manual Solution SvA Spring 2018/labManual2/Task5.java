/*
 Task – 5
(Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws. Here are sample runs:
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw

 */

package labManual2;
import java.util.*;
import java.lang.Math;

public class Task5
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2):");
		int n = in.nextInt();
		
        int computer_random = 0+(int)(Math.random()*2);
        
        System.out.print("The computer is: ");
        
        switch(computer_random) {
        case 0: System.out.println("sissor.");break;
        case 1: System.out.println("rock.");break;
        case 2: System.out.println("paper.");break;

        }
        
        System.out.print("Your are: ");
        switch(n) {
        case 0: System.out.println("sissor "); break;
        case 1: System.out.println("rock "); break;
        case 2: System.out.println("paper ");break;
     
        }
        
        if (computer_random==n) {
        	System.out.print("too. It's a draw");
     
        }
        else if (computer_random>n)
        {
        	if(computer_random==2 && n== 0) {
        		System.out.print(" You win.");
        	}
        	else
        	{
        		System.out.print("You lose.");
        	}
        	
        }
        else if(computer_random<n) {
        	if(computer_random==0 && n== 2) {
        		System.out.print("You loose.");
        	}
        	else
        	{
        		System.out.print("You win.");
        	}
        	
        	
        	
        }
        
 
        
        
		
	}
}