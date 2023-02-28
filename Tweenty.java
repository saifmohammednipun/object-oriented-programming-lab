import java.util.Scanner;
public class Tweenty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = in.nextInt();

        System.out.println("Divisors are: ");
        for(int i=1; i<=n; i++ ){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }

    }
}
