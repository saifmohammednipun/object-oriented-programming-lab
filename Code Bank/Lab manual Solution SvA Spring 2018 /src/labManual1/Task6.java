/*
 * 
Task – 6
(Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total. Here is a sample run:

Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5

 */




package labManual1;
import java.util.*;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Subtotal: ");
		double subtotal = in.nextDouble();
		
		System.out.print("Enter Gratuity:");
		double gratuityRate = in.nextDouble();
		
		double gratuity = subtotal * (gratuityRate/100);
		
		double total =subtotal + gratuity;
		
		System.out.printf("The gratuity is $%.1f and total is %.1f",gratuity, total);
		
	
		

	}

}
