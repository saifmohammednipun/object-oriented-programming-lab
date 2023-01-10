/*
 Task – 8
(Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v, you can compute the minimum runway length needed for an airplane to take off using the following formula:
Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second squared (m/s2), and displays the minimum runway length.

Here is a sample run:
Enter speed and acceleration: 60 3.5
The minimum runway length for this airplane is 514.286
 */


package labManual1;
import java.util.*;
import java.lang.Math;

public class Task8 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter Speed:");
		double v = in.nextDouble();
		
		System.out.print("Enter Accelaration:");
		double a = in.nextDouble();
		
		double l = Math.pow(v, 2) / (2 *a);
		
		System.out.printf("The minimum runway for this airplane is %.3f",l);
		

	}

}
