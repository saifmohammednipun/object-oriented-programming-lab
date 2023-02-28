import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n= in.nextInt();


        int fibo[] = new int[n];

       fibo[0]=0;
       fibo[1]=1;
        System.out.print(fibo[0]+" "+ fibo[1]+" ");

       for(int i =2; i<n; i++){
           fibo[i] = fibo[i-1] + fibo[i-2];
           System.out.print(fibo[i]+ " ");
       }

    }
}
