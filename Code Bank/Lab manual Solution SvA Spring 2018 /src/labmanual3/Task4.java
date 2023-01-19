/*
 Task – 4
(Find the factors of an integer) Write a program that reads an integer and displays all its smallest factors in increasing order.
 For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
 */
package labmanual3;
import java.util.*;


public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = in.nextInt();
		
		
		int factor=2;
		
		while (number%factor==0)
		{
			System.out.println(factor+" ");
			number =number/factor;
				if(number%factor!=0)
				{
					factor++;
				}	
			}
		System.out.println(number);
			
			
		}
		
}
