/*
Task – 2
(Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator to extract digits, and the / operator to remove the extracted digit.
For instance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until all the digits are extracted.
Write a test program that prompts the user to enter an integer and displays the sum of all its digits.
*/
import java.util.*;
public class Task2 {
    public static int  sum(int n){

       for (int i=1; i<=)
        int rem = n%10;
         n =n/10;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 3 digit integer: ");
        int n = in.nextInt();
        sum();

    }
}
