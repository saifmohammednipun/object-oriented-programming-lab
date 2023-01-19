/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:

Enter the number of lines: 7
            1 
          2 1 2 
        3 2 1 2 3 
      4 3 2 1 2 3 4 
    5 4 3 2 1 2 3 4 5 
  6 5 4 3 2 1 2 3 4 5 6 
7 6 5 4 3 2 1 2 3 4 5 6 7 

 */



package labmanual3;
import java.util.*;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int number = in.nextInt();
		
		
		for(int row=1;row<=number;row++) {
			for(int whitespace=(number-row); whitespace>0 ;whitespace--) // Whitespace triangle 
			{
				System.out.print("  ");
			}
			for(int triangle2=row; triangle2>0; triangle2--)//triangle 2
			{
				System.out.print(triangle2+ " ");
			}
			for(int triangle3=2; triangle3<=row; triangle3++)//triangle3
			{
				System.out.print(triangle3+" ");
			}
			System.out.println();
			
		}

	}

}
