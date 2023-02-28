import java.util.Scanner;
public class Method4 {
    public static void printFactorial(int number){
        int factorial=1;
       for(int i=number; number>=1; i--) {
           factorial = factorial*i;
       }

        System.out.println(factorial);
return;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int number = in.nextInt();
         printFactorial(number);


    }

}
