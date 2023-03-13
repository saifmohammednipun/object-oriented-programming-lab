/*
Task-3. Consider the given BMI ranges
If your BMI is:
below 18.5 – you're “underweight” between
18.5 and 24.9 – you're “healthy” between
25 and 29.9 – you're “overweight” between
30 and 39.9 – you're “obese”
Write a program that takes a decimal value as input from the user. Then print the quoted words above based on the range.
(a) Use if-else if-else
(b) Use ternary operator
 */

import java.util.Scanner;
public class Week2Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your BMI: ");
        double BMI =in.nextDouble();

        if(BMI<18.5){
            System.out.println("underweight");
        }
        else if(BMI>=18.9 || BMI<=24.9){
            System.out.println("healthy");
        }
        else if(BMI>=25|| BMI<=29.9){
            System.out.println("overweight");
        }
        else if(BMI>=30|| BMI<=39.9){
            System.out.println("obese");
        }

    }
}
