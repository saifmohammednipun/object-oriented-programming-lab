import java.util.Scanner;
public class New2 {
    public static boolean isPalindrome(String arg) {
        String rev = "";

        for (int i = arg.length() - 1; i >= 0; i--) {
            rev = rev + arg.charAt(i);

        }
        System.out.println(rev);
        for (int i = 0; i < arg.length(); i++) {
            {
                if (arg.charAt(i) != rev.charAt(i))
                {
                   return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String arg= in.next();

        boolean b= isPalindrome(arg);
        System.out.println(b);

    }
}
