
/*
Task ā 1
(Math: pentagonal numbers) A pentagonal number is defined as n(3nā1)/2 for n = 1, 2, . . ., and so on.
Therefore, the first few numbers are 1, 5, 12, 22, . . . . Write a method with the following header that returns a pentagonal number:

public static int getPentagonalNumber(int n)
 Write a test program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.
 */
import java.util.*;
public class Task1 {
    public static int getPentagonalNumber(int n)
    {
        return (n*((3*n)-1))/2;
    }
    public static void main(String[] args)
    {
        System.out.println("The first 100 pentagonal numbers with 10 numbers on each line: ");
        for (int i =1; i<=100; i++)
        {
            System.out.print(getPentagonalNumber(i)+", ");
            if(i%10==0){
                System.out.println();
            }
        }
    }
}
