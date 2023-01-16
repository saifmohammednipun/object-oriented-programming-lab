/*
 *Task – 6
(Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, display that the input is invalid. 
The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */


package labManual2;
import java.util.*;
import java.lang.Math;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter First edge of the triangle:");
		System.out.print("Enter x: ");
		double x1 = in.nextDouble(); 
		System.out.print("Enter y: ");
		double y1 = in.nextDouble(); 
		

		System.out.println("Enter Second edge of the triangle:");
		System.out.print("Enter x: ");
		double x2 = in.nextDouble(); 
		System.out.print("Enter y: ");
		double y2 = in.nextDouble(); 
		

		System.out.println("Enter Third edge of the triangle:");
		System.out.print("Enter x:");
		double x3 = in.nextDouble(); 
		System.out.print("Enter y:");
		double y3 = in.nextDouble(); 
		
		double d1 = Math.sqrt((Math.pow(x1-x2, 2)+(Math.pow(y1-y2, 2)))); 
		double d2 = Math.sqrt((Math.pow(x2-x3, 2)+(Math.pow(y2-y3, 2))));
		double d3 = Math.sqrt((Math.pow(x1-x3, 2)+(Math.pow(y1-y3, 2))));
		
		if(d1+d2>d3 && d1+d3>d2 && d2+d3>d1)
		{
			System.out.println("The input is valid.");
			double perimeter = d1+d2+d3;
			System.out.printf("Perimeter is %.2f", perimeter);
			
		}
		else
		{
			System.out.println("The input is invalid.");	
		}
		
	    

	}

}
