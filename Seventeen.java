import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();

        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int x=i; x>=1; x--){
                System.out.print(x+ " ");
            }
            for(int y=2;y<=i; y++){
                System.out.print(y+ " ");
            }
            System.out.println();

        }
    }
}