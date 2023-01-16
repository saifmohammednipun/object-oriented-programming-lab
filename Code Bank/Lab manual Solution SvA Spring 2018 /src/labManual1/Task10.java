/*
(Print a table) Write a program that displays the following table. Cast floating point numbers into integers.

a   b   pow(a, b) 
1   2   1 
2   3   8
3   4   81 
4   5   1024
5   6   15625
 
 */

package labManual1;
import java.lang.Math;

public class Task10 {

	public static void main(String[] args) {
		int a=1,b=2;
		
		System.out.printf("a  b  pow(a, b)");
		System.out.printf("\n"+a   +  "  " + b  +   "  " + "%.0f",Math.pow(a, b));
		System.out.printf("\n"+a++ +  "  " + b++  + "  " + "%.0f",Math.pow(a, b));
		System.out.printf("\n"+a++ +  "  " + b++  + "  " + "%.0f",Math.pow(a, b));
		System.out.printf("\n"+a++ +  "  " + b++  + "  " + "%.0f",Math.pow(a, b));
		System.out.printf("\n"+a++ +  "  " + b++  + "  " + "%.0f",Math.pow(a, b));	

	}

}
