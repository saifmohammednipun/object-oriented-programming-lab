/*
Task – 1
(Count positive and negative numbers and compute the average of numbers) Write a program that reads an unspecified number of integers, 
determines how many positive and negative values have been read, and computes the total and average of the input values (not counting zeros). 
Your program ends with the input 0. Display the average as a floating-point number. 

Here is a sample run:
Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25
 */



package labmanual3;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		int numberPositive=0;
		int numberNegetive=0;
		int count=0;
		double total=0.0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int number = in.nextInt();
		
		if(number == 0) 
		{
			System.out.println("User input is 0. System is exited.");
			System.exit(0);
			
		}
		
		while(number != 0){
			
			if(number>0) {
				numberPositive++;
				
				
			}
			else if(number<0) {
				numberNegetive++;
				
			}
			total =total +number;
			count++;
			number = in.nextInt();
			
		}
		 System.out.println("The number of positives is "+numberPositive);
		 System.out.println("The number of positives is "+numberNegetive);	
		 double average = total/count;
		 System.out.println("The total is "+ total);
		 System.out.println("The average is "+average);
		
		

	}

}
