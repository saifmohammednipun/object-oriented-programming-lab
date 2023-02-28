import java.util.Scanner;
public class ThirteenClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input number of rows (half of the diamond): ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int x = 1; x <= i; x++) {
                System.out.print("* ");
            }
            for (int y = 2; y <= i; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int x = 1; x <= i; x++) {
                System.out.print("* ");
            }
            for (int y = 2; y <= i; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}