/*
 Task – 8
(Financial application: compute CD value) Suppose you put $10,000 into a CD with an annual percentage yield of 5.75%. After one month, the CD is worth
10000 + 10000 * 5.75 / 1200 = 10047.92
After two months, the CD is worth
10047.91 + 10047.91 * 5.75 / 1200 = 10096.06 After three months, the CD is worth
10096.06 + 10096.06 * 5.75 / 1200 = 10144.44 and so on.
Write a program that prompts the user to enter an amount (e.g., 10000), the annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) 
and displays a table as shown in the sample run.

Enter the initial deposit amount: 10000
Enter annual percentage yield: 5.75
Enter maturity period (number of months): 18
Month CD Value
1 10047.92
2 10096.06
...
17 10846.57
18 10898.54
 */


package labmanual3;
import java.util.*;

public class Task8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an amout, the 
		// annual percentage yield and the number of months 
		System.out.print("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double percentageYield = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();

		// Display header
		System.out.println("Month  CD Value");
		// Compute and display CD worth for the number of months
		for (int m = 1; m <= months; m++) {
			amount += amount * (percentageYield / 1200);
			System.out.printf("%-7d%.2f\n", m, amount);
		}
	}
}

	