import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = in.nextInt();

        for(int i=1; i<=n; i++){
            for(int j =2; j<=i; j++){
                System.out.print("  ");
            }
            for(int x=1; x<=n-i; x++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
