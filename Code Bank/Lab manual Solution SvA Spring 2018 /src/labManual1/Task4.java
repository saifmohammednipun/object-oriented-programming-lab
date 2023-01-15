/*Task – 4
(Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. 
Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
*/

package labManual1;
import java.util.*;


public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Distance covered in Kilometers: ");
		double s = in.nextDouble();
		
		System.out.print("Enter Time in minutes: ");
		double tm = in.nextDouble();
		
		System.out.print("Enter Time in seconds: ");
		double ts = in.nextDouble();
		
		s = s/1.6;
		double t =(tm/60 + (ts/(60*60)));
		double avgV=s/t;
		
		System.out.printf("Average speed: %.2f",avgV);
	}

}
