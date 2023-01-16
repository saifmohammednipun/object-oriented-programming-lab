/*
 Task – 4
(Palindrome number) Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to right. 

Here is a sample run of this program:
Enter a three-digit integer: 121
121 is a palindrome
Enter a three-digit integer: 123
123 is not a palindrome
 */


package labManual2;
import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter three-digit integer number:");
		int n= in.nextInt();
		
		int digit1 = n/100;
		int digit3 =n%10;
		
		if(digit1==digit3) {
			System.out.println(n+" is a palindrome.");    
			
		}
		else {
			System.out.println(n+" is a not a palindrome.");  
		}
	}

}
