/*
 Task – 1
(Algebra: solve quadratic equations) The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained using the following formula:

b2-4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots. Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots”.
 */



package labManual2;
import java.util.*;
import java.lang.Math;

public class task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a=");
		double a = in.nextDouble();
		
		System.out.print("Enter b=");
		double b = in.nextDouble();
		
		System.out.print("Enter c=");
		double c = in.nextDouble();
		
		double d = (Math.pow(b, 2)) - (4*a*c);
		
		if(d>0) {
			System.out.println("The Equation has two real roots");
			double r1 = (-b +Math.sqrt(d))/(2*a);
			double r2 = (-b -Math.sqrt(d))/(2*a);
			
			System.out.print("Two roots are: "+r1+","+r2);
			
		}
		
		else if(d==0) {
			System.out.println("The Equation has one root");
			double r1 = (-b +Math.sqrt(d))/(2*a);
			
			System.out.print("The root is: "+r1);
			
			
		}
		
		else {
			System.out.print("The Equation has no real roots");
		}
		
	
		

	}

}
