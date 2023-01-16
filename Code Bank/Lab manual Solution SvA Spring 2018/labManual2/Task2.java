/*
 Task – 2
(Random month) Write a program that randomly generates an integer between 1 and 12 and displays the English month name January, February, ..., December for the number 1, 2, ..., 12, accordingly.
 */

package labManual2;
import java.util.*;
import java.lang.Math;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter (integer) minimum and maximum to generate a rondom month number in between them");
		
		System.out.print("Enter min: ");
		int min = in.nextInt();
		
		System.out.print("Enter max: ");
		int max = in.nextInt();
		
		int random = min +(int)(Math.random()*max);
		
		
		
		switch(random){
			case 1: System.out.println("Month:1. January"); break;
			case 2: System.out.println("Month:2. February"); break;
			case 3: System.out.println("Month:3. March"); break;
			case 4: System.out.println("Month:4. April"); break;
			case 5: System.out.println("Month:5. May"); break;
			case 6: System.out.println("Month:6. June"); break;
			case 7: System.out.println("Month:7. July"); break;
			case 8: System.out.println("Month:8. August"); break;
			case 9: System.out.println("Month:9. September"); break;
			case 10: System.out.println("Month:10. October"); break;
			case 11: System.out.println("Month:11. November"); break;
			case 12: System.out.println("Month:12. December"); break;
		        
		}
		
	}

}
