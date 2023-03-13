/*
Task-4. Take a year as user input. Then print it check if it’s a leap year or not. Note: A leap year must satisfy any or both of the following conditions:
Divisible by 400
Divisible by 4 and not divisible by 100

Sample output:
2015: false
 */
import java.util.Scanner;
public class Week2Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter year:");
        int year= in.nextInt();

        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println(year + ": true");
        }
        else{
            System.out.println(year+ ": false");
        }

    }
}
