/*
 Task – 7
(Display the first days of each month) Write a program that prompts the user to enter the year and first day of the year, 
and displays the first day of each month in the year.

For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, 
your program should display the following output:
January 1, 2013 is Tuesday ...
December 1, 2013 is Sunday

 */



package labmanual3;
import java.util.*;


public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the year:");
		int year = in.nextInt();
		
		System.out.println("Enter the first day of the year:");
		int day = in.nextInt();
		
		
		int numberOfDaysInMonth = 0;

        String firstDayString = "";
        // Display calendar for each month
        for (int month = 1; month <= 12; month++) {
            // Display Calendar title
            int firstDay=0;
			switch (month) {

                case 1: System.out.print("January 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;
                case 2: System.out.print("February 1, " + year + " is ");
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        numberOfDaysInMonth = 29;
                    else
                        numberOfDaysInMonth = 28;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);
                    break;
                case 3: System.out.print("March 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
                case 4: System.out.print("April 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
                case 5: System.out.print("May 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
                case 6: System.out.print("June 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
                case 7: System.out.print("July 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
                case 8: System.out.print("August 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
                case 9: System.out.print("September 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
                case 10: System.out.print("October 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
                case 11: System.out.print("November 1, " + year + " is ");
                    numberOfDaysInMonth = 30;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
                case 12: System.out.print("December 1, " + year + " is ");
                    numberOfDaysInMonth = 31;
                    firstDayString = firstDay(firstDay);
                    System.out.println(firstDayString);

                    break;
            }



            // Get the start day for the next month
            firstDay = (firstDay + numberOfDaysInMonth) % 7;
        }
    }

    public static String firstDay(int firstDay) {

        String firstDayString = "";

        switch (firstDay) {
            case 0: firstDayString = "Sunday"; break;
            case 1: firstDayString = "Monday"; break;
            case 2: firstDayString = "Tuesday"; break;
            case 3: firstDayString = "Wednesday"; break;
            case 4: firstDayString = "Thursday"; break;
            case 5: firstDayString = "Friday"; break;
            case 6: firstDayString = "Saturday"; break;
        }

        return firstDayString;
    }
}
	
		
