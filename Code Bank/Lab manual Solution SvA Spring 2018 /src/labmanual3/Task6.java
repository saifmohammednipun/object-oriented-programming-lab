/*
 Task – 6
(Display numbers in a pyramid pattern) Write a nested for loop that prints the following output:
 							   1
                           1   2   1
                       1   2   4   2   1
                   1   2   4   8   4   2   1
               1   2   4   8  16   8   4   2   1
           1   2   4   8  16  32  16   8   4   2   1
       1   2   4   8  16  32  64  32  16   8   4   2   1
   1   2   4   8  16  32  64 128  64  32  16   8   4   2   1

 */
package labmanual3;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		int startRight = 0,	// Initialize decending numbers
				 endSpace = 7;		// Initialize number of white space in row
			// Display number of rows and numbers in each row
			for (int row = 1; row <= 128; row += row) {
				// Display white space
				for (int startSpace = 0; startSpace < endSpace; startSpace++) {
					System.out.print("    ");
				}
				// Display acending numbers
				for (int l = 1; l <= row; l += l) {
					System.out.printf("%4d", (l));
				}
				// Display decending numbers
				for (int r = startRight; r > 0 ; r /= 2 ) {
					System.out.printf("%4d", (r));	
				}
				System.out.println();	// End line
				endSpace--; 				// Decrement endSpace
				startRight = row;			// Assign row to startRight
			}
		}
	}