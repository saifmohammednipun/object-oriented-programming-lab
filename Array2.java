import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n=in.nextInt();

        int[] arr = new int[n];

         arr[0]=0;
         arr[1]=1;
        System.out.print(arr[0]+ " ");
        System.out.print(arr[1]+ " ");
        for(int i =2; i<n; i++){
           arr[i]=arr[i-1]+ arr[i-2];
            System.out.print(arr[i]+ " ");
           }
        }



    }

