/*
 Task – 3
(Find future dates) Write a program that prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also prompt the user to enter the number of days after today for a future day and display the future day of the week. 

Here is a sample run:
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday

 */

package labManual2;
import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter today's date: ");
		int date = in.nextInt();
		
		System.out.print("Enter the number of days after today:");
		 int datef=in.nextInt();
		 
		 String dayofWeek ="";
		 
		 switch(date) {
		 case 0: dayofWeek= "Sunday";break;
		 case 1: dayofWeek= "Monday";break;
		 case 2: dayofWeek= "Tuesday";break;
		 case 3: dayofWeek= "Wednesday";break;
		 case 4: dayofWeek= "Thursday";break;
		 case 5: dayofWeek= "Friday";break;
		 case 6: dayofWeek= "Saturday";break;
		 
		 }
		 
		 int date_future = (date+datef)	%7;
		 
		 if(date_future==0) {
			 System.out.printf("Today is %s and the future day is Sunday",dayofWeek);
			 
		 }
		 else if(date_future==1) {
			 System.out.printf("Today is %s and the future day is Monday",dayofWeek);
		 }
		 else if(date_future==2) {
			 System.out.printf("Today is %s and the future day is Tuesday",dayofWeek);
		 }
		 else if(date_future==3) {
			 System.out.printf("Today is %s and the future day is Wednesday",dayofWeek);
		 }
		 else if(date_future==4) {
			 System.out.printf("Today is %s and the future day is Thursday",dayofWeek);
		 }
		 else if(date_future==5) {
			 System.out.printf("Today is %s and the future day is Friday",dayofWeek);
		 }
		 else if(date_future==6) {
			 System.out.printf("Today is %s and the future day is Saturday",dayofWeek);
		 }
		 

	}

}
