import java.util.Scanner;
public class Math3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the coefficient of x squared: ");
        int a = in.nextInt();
        System.out.println("Enter the coefficient of x: ");
        int b = in.nextInt();
        System.out.println("Enter the constant: ");
        int c = in.nextInt();

        double d = Math.pow(b,2)-(4*a*c);

        double roo1=(-b+Math.sqrt(d))/(2*a);
        double root2=(-b-Math.sqrt(d))/(2*a);

        System.out.println("root1: "+ roo1);
        System.out.println("root2: "+ root2);



    }
}
