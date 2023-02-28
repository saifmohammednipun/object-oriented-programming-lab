import java.util.Scanner;
public class Eighteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("_ ");
            }

            for(int x =1; x<=i ; x++){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
