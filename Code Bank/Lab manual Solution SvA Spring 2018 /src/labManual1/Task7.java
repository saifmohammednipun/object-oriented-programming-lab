/*
(Science: calculating energy) Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperatures of the water. The formula to compute the energy is
						Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.

Here is a sample run:
Enter the amount of water in kilograms: 55.5 
Enter the initial temperature: 3.5
Enter the final temperature: 10.5
The energy needed is 1625484.0
 */

package labManual1;
import java.util.*;

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		double m = in.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double t0 = in.nextDouble();
		
		System.out.println("Enter the final tempurature ");
		double tf = in.nextDouble();
		
		double q = m *( tf-t0) * 4184;
		
		System.out.printf("The energy needed is %.1f",q);
		
	
	}

}
