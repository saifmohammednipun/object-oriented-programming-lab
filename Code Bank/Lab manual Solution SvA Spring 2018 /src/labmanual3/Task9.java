/*
 * Task – 9
(Longest common prefix) Write a program that prompts the user to enter two strings and displays the largest common prefix of the two strings.

 Here are some sample runs:
Enter the first string: Welcome to C++
Enter the second string: Welcome to programming
The common prefix is Welcome to
 */



package labmanual3;
import java.util.*;

public class Task9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first string: ");
		String s1= in.nextLine();
		
		System.out.print("Enter the second string: ");
		String s2= in.nextLine();
		
		int index=0;
		String prefix="";
		
		while(s1.charAt(index)==s2.charAt(index)) {
			prefix+=s1.charAt(index);
			index++;
			
		}
		
		if(prefix.length()>0) {
			System.out.println("The common prefix is "+prefix);
			
		}
		else
		{
			System.out.println(s1+" and "+s2+" have no common prefix");
		}
		
		
	}

}
