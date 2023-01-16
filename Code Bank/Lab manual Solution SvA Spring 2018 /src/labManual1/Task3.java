/*
 Task – 3
(Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
perimeter = 2 * radius * pi 
area = radius * radius * pi
*/

package labManual1;
import java.util.*;
import java.lang.Math;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Radious: ");
		double radious = input.nextDouble();
		
		double perimeter = 2 * radious * Math.PI; 
		double area = Math.PI * Math.pow(radious, 2);
		
		System.out.printf("Perimeter: %.2f", perimeter);
		System.out.printf("\nArea: %.2f", area);
		
		
	}

}
