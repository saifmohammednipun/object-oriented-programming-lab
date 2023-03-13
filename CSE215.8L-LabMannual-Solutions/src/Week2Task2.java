/*
 Task-2. Write a program that takes an integer and determines if it’s prime or not. A number is prime if it is divisible by 1 and itself only, i.e. 2, 3, 11, 37 etc.

 */
import java.util.Scanner;
public class Week2Task2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int n = in.nextInt();

        int i,m=0,flag=0;

        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }
        else{
            for(i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not prime number");
                        flag=1;
                         break;
                }
            }
            if(flag==0)
            {
                System.out.println(n+" is prime number");
            }
        }
    }
}