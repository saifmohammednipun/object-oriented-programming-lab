import java.util.Scanner;
public class Twenty1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter an integer");
        int n= in.nextInt();

        for(int i =1; i<=n; i++){
            if(n%n==0 && n%1==0 && n%i!=0){
                System.out.println("Prime Number");
        }
        else{
                System.out.println("not a prime number");
            }

        }
    }
}
