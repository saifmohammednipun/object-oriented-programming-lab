
import java.util.Scanner;
public class ForteenClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();

        int value=1;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(value+ " ");
                value= value*(i-j)/(j+1);


            }
            System.out.println();
        }

    }
}
