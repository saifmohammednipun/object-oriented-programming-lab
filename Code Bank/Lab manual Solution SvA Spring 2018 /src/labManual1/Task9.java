/*Task – 9

(Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

Here is a sample run:
Enter weight in pounds: 95.5
Enter height in inches: 50
BMI is 26.8573
*/

package labManual1;
import java.util.*;
import java.lang.Math;

public class Task9 {

	public static void main(String[] args) {
		Scanner in = new  Scanner(System.in);
		
		System.out.print("Enter weight in pounds:");
		double w = in.nextDouble();
		
		System.out.print("Enter height in pinches:");
		double h = in.nextDouble();
		
		
		double hf= h*0.0254 ;
		double bmi = (w*0.45359237) / Math.pow(hf, 2);
		
		System.out.printf("BMI is %.4f",bmi);

	}

}
