/*
 Task – 5
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
  fahrenheit = (9 / 5) * celsius + 32
  
 Here is a sample run:
Enter a degree in Celsius: 43 
43 Celsius is 109.4 Fahrenheit
 */

package labManual1;
import java.util.*;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a degree in Celsius:");
		double c = in.nextDouble();
		
		double f = 9.0/5*c+32;
		
		System.out.printf("%.2f Celsius is %.2f Fhrenheit",c,f); 
	

	}

}
