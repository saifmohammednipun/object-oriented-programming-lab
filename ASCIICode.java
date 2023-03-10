import java.util.Scanner;
public class ASCIICode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an ASCII Code for integer 0-127: ");
        int asciiValue= in.nextInt();

        System.out.println((char)asciiValue);

        System.out.println("Enter an character: ");
        String s= in.next();

        int a=s.charAt(0);
        System.out.println(a);


        int number = 65 + (int) (Math.random()*(91-65));
        System.out.println((char)number);





    }
}
