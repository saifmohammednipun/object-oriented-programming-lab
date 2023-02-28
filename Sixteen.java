import java.util.Scanner;
public class Sixteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Number");
        int n = in.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int x=1; x<=i; x++ ){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
