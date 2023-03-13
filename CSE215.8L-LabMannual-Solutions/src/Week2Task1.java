/*
Task 1. Write a program that takes an integer and determines if it’s odd or even. Use switch cases to produce
result
 */

import java.util.Scanner;
public class Week2Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int n= in.nextInt();

        switch(n%2){
            case 0: System.out.println("It is Even.");break;
            case 1: System.out.println("It is odd.");break;
            default: System.out.println("Invalid Input");

        }
    }
}
